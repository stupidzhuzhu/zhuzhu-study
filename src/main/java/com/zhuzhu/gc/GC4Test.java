package com.zhuzhu.gc;

/**
 * @program: study
 * @description: Dynamic age determination of objects
 * @author: zhuzhu
 * @create: 2021-06-05 17:03
 **/
public class GC4Test {
	/**
	 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC / -XX:+UseParNewGC
	 */
	private final static int SIZE_1K = 1024;
	private final static int SIZE_1M = 1024 * 1024;

	public static void main(String[] args) {
		byte[] array = new byte[520 * SIZE_1K];
		byte[] array1 = new byte[4 * SIZE_1M];
		byte[] array2 = new byte[2 * SIZE_1M];
		array1 = null;
		array2 = null;
		byte[] array3 = new byte[1 * SIZE_1M];
		byte[] array4 = new byte[6 * SIZE_1M];
		array3 = null;
		array4 = null;
		byte[] array5 = new byte[1 * SIZE_1M];
	}
	/**
	 * 动态对象年龄判定机制，经测试发现，Serial / ParNew是有效的，但是Parallel Scavenge是不生效的
	 */
}
