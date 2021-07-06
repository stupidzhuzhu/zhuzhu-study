package com.zhuzhu.jdk;

/**
 * @program: jdk
 * @author: zhuzhu
 * @create: 2021-06-24 17:24
 **/
public class HashCode {
	public static void main(String[] args) {
		String s1 = "a";
		// hash code = 97
		System.out.println(s1.hashCode());

		String s2 = "aaaaaa";
		// hash code = -1425372064
		System.out.println(s2.hashCode());

		/**
		 * 下面是String的hashCode方法，遍历字符串的每一个字符，根据字符对应的ascii码去计算
		 * h = 31 * h + val[i]
		 * 比如 "a".hashCode() --> h = 31 * h + 97 --> h = 97
		 *
		 *     public int hashCode() {
		 *         int h = hash;
		 *         if (h == 0 && value.length > 0) {
		 *             char val[] = value;
		 *
		 *             for (int i = 0; i < value.length; i++) {
		 *                 h = 31 * h + val[i];
		 *             }
		 *             hash = h;
		 *         }
		 *         return h;
		 *     }
		 *
		 * 那为什么hashCode会有负数呢，两个大于0的int类型的数做加法会出现负数吗？为什么？
		 * 这得从int类型的范围说起，int类型的数占32位，范围为：-2147483648~2147483647 [-2^31~2^31-1]，也就是最大值为21亿多
		 * 如果两个int类型的数做运算后，范围超过了int类型最大值呢？比如下面的数
		 */

		int i = 300000000; // 3亿
		System.out.println(i * 100); // 输出300亿？  程序运行输出的数为-64771072

		/**
		 * 原理：
		 * jvm底层在int类型的数计算时超出范围的时候，会使用long来存储中间结果
		 * 比如这个30000000000超出了int的范围，所以使用long来存储，而计算机底层存数据都是用的补码(这里不探究为什么用补码，感兴趣的自己去研究)，
		 * 30000000000是正数，原码=反码=补码，其补码为0b 00000110 11111100 00100011 10101100 00000000
		 * 由于int类型的数只有32bit，所以最终结果会截取后面32位为 0b 11111100 00100011 10101100 00000000
		 * 这个数的首位是1，所以是负数，其反码为 0b 11111100 00100011 10101011 11111111
		 * 其原码为0b 10000011 11011100 01010100 00000000 --> -64771072
		 * 所以最终结果的int值为-64771072
		 */
	}

}
