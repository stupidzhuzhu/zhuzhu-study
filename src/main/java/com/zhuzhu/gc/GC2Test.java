package com.zhuzhu.gc;

/**
 * @program: study
 * @description: Large objects go straight into the tenured generation
 * @author: zhuzhu
 * @create: 2021-06-05 11:32
 **/
public class GC2Test {
	/**
	 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * -XX:PretenureSizeThreshold=3145728
	 */
	private static final int SIZE_1K = 1024;
	private static final int SIZE_1M = 1024 * 1024;

	public static void main(String[] args) {
		byte[] array = new byte[3 * SIZE_1M];

//		byte[] array1 = new byte[3145704];
	}

	/**
	 * -XX:+UserConcMarkSweepGC 使用ParNew + CMS + Serial 的组合进行垃圾收集
	 * -XX:PretenureSizeThreshold=3145728 超过3MB的对象直接在老年代进行分配，此参数只对 Serial 和 ParNew 有效，
	 * Parallel Scavenge 收集器不认识这个参数
	 */
}
