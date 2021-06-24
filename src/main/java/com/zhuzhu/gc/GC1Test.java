package com.zhuzhu.gc;

/**
 * @program: study
 * @description: Object priority is allocated in Eden
 * @author: zhuzhu
 * @create: 2021-06-05 10:50
 **/
public class GC1Test {
	/**
	 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 */
	private static final int SIZE_1K = 1024;
	private static final int SIZE_1M = 1024 * 1024;

	public static void main(String[] args) {
		byte[] array1 = new byte[2 * SIZE_1M];
		byte[] array2 = new byte[2 * SIZE_1M];
		byte[] array3 = new byte[2 * SIZE_1M];

		byte[] array4 = new byte[3 * SIZE_1M];

//		// array5 + array6 约为 4.9MB
//		byte[] array5 = new byte[4 * SIZE_1M];
//		byte[] array6 = new byte[900 * SIZE_1K];
//
//		// array7 约为 3.2MB
//		byte[] array7 = new byte[3 * SIZE_1M + 200 * SIZE_1K];

	}

	/**
	 * Full GC (Ergonomics) :
	 * 如果晋升到老年代的平均大小大于老年代的剩余大小，则认为要进行一次full gc
	 * bool result = padded_average_promoted_in_bytes() > (float) old_free_in_bytes;
	 */
}
