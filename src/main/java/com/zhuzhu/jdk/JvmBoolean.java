package com.zhuzhu.jdk;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @program: jvm
 * @author: zhuzhu
 * @create: 2021-06-24 17:39
 **/
public class JvmBoolean {
	public static void main(String[] args) {
		try {
			Field field = Unsafe.class.getDeclaredField("theUnsafe");
			field.setAccessible(true);
			Unsafe unsafe = (Unsafe) field.get(null);
			User user = new User();
			user.setGender(true);
			System.out.println("①" + user.isGender());

			Field flagField = User.class.getDeclaredField("gender");
			unsafe.putInt(user, unsafe.objectFieldOffset(flagField), 2);
			System.out.println("②" + user.isGender());

			if (user.isGender()) {
				System.out.println("isGender(): 2");
			}

			if (user.isGender() == true) {
				System.out.println("isGender() == true: 2");
			}

			unsafe.putInt(user, unsafe.objectFieldOffset(flagField), 3);
			System.out.println("③" + user.isGender());

			if (user.isGender()) {
				System.out.println("isGender(): 3");
			}

			if (user.isGender() == true) {
				System.out.println("isGender() == true: 3");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private static class User{
		private boolean gender;

		public boolean isGender() {
			return gender;
		}

		public void setGender(boolean gender) {
			this.gender = gender;
		}
	}
}

/**
 * 在JVM中，boolean是用int类型来存的，即JVM中没有boolean类型，所以此端代码中的boolean gender可以看成int gender,值域为[0,1]
 * 并且JVM对堆中的boolean类型会做掩码操作，即只取最后一个比特位。但是如果对于栈中的boolean进行这种操作，是不会发生掩码操作的，
 * 所以将栈中的boolean改为2/3将会有意向不到的效果，由于Unsafe无法直接操作栈中的boolean，只能通过修改字节码文件，这里就不演示了。
 * 堆中对boolean的掩码操作:
 * 2 --> 0b00000010 --> 0 --> false
 * 3 --> 0b00000011 --> 1 --> true
 */
