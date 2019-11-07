package com.zzyu.zzyushiroredis.jvmdemo;

/**
 * @Package: com.zzyu.zzyushiroredis.jvmdemo
 * @ClassName: StackDemo
 * @Author: zeyu.zhang
 * @Description:
 * @Date: 2019/11/7 22:18
 * @Version: 1.0
 */
public class StackDemo {
    public static void test(){
        System.out.println("方法执行了");
        test();
    }

    /**
     * 递归调用导致栈内存溢出
     * @param args
     */
    public static void main(String[] args) {
        test();
    }
}
