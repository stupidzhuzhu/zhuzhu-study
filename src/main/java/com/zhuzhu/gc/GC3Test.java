package com.zhuzhu.gc;

/**
 * @program: study
 * @description: Long - lived objects move into the tenured generation
 * @author: zhuzhu
 * @create: 2021-06-05 11:55
 **/
public class GC3Test {
	/**
	 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
	 */
	private final static int SIZE_1K = 1024;
	private final static int SIZE_1M = 1024 * 1024;

	public static void main(String[] args) {
		byte[] array1 = new byte[1 * SIZE_1M];
		byte[] array2 = new byte[6 * SIZE_1M];
		// 发生Minor GC, array1和array2都被移至老年代，然后在Eden区为array3分配内存
		byte[] array3 = new byte[2 * SIZE_1M];
	}

	/**
	 * MaxTenuringThreshold 对象晋升老年代的年龄阈值，默认值为15
	 */
}
