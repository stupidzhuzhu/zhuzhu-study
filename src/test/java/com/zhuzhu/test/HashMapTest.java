package com.zhuzhu.test;

import junit.framework.TestCase;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class HashMapTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("set up");
        System.out.println();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("tear down");
    }

    public void testHashMapPut1() throws Exception{
        // default constructor  default capacity:16 load factor:0.75 threshold:12
        HashMap<String, String> map = new HashMap<>();
        mapInfoPrint(map);

        // 初始化table
        map.put("1", "a");
        mapInfoPrint(map);

        // 替换元素
        map.put("1", "b");
        mapInfoPrint(map);

        map.put("2", "c");
        map.put("3", "d");
        map.put("4", "e");
        map.put("5", "f");
        map.put("6", "g");
        map.put("7", "h");
        map.put("8", "i");
        map.put("9", "j");
        map.put("10", "k");
        map.put("11", "l");
        map.put("12", "m");
        mapInfoPrint(map);

        // 第13次put后，生成新table，扩容
        map.put("13", "n");
        mapInfoPrint(map);
    }

    public void testHashMapPut2() throws Exception{
        // custom capacity and loadFactor capacity:8 load factor:0.2 threshold:1
        HashMap<String, String> map = new HashMap<>(7, 0.2f);
        mapInfoPrint(map);

        // 初始化table，重新赋值threshold
        map.put("1", "a");
        mapInfoPrint(map);

        // 生成新table，扩容
        map.put("2", "b");
        mapInfoPrint(map);
    }

    private void mapInfoPrint(Map map) throws Exception{
        Class clazz = map.getClass();

        Field loadFactor = clazz.getDeclaredField("loadFactor");
        loadFactor.setAccessible(true);
        Field threshold = clazz.getDeclaredField("threshold");
        threshold.setAccessible(true);
        Field table = clazz.getDeclaredField("table");
        table.setAccessible(true);
        Method capacity = clazz.getDeclaredMethod("capacity", null);
        capacity.setAccessible(true);
        Field size = clazz.getDeclaredField("size");
        size.setAccessible(true);
        System.out.println("map capacity:" + capacity.invoke(map, null));
        System.out.println("map loadFactor:" + loadFactor.get(map));
        System.out.println("map threshold:" + threshold.get(map));
        System.out.println("map table:" + table.get(map));
        System.out.println("map size:" + size.get(map));
        System.out.println();

    }
}
