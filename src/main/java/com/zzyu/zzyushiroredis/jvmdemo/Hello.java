package com.zzyu.zzyushiroredis.jvmdemo;

/**
 * @Package: com.zzyu.zzyushiroredis.jvmdemo
 * @ClassName: Hello
 * @Author: zeyu.zhang
 * @Description:
 * @Date: 2019/11/7 21:52
 * @Version: 1.0
 */
public class Hello {
    /**
     * 内存区域-程序计数器(指定线程指向的行号)，属于独占内存区 比如线面方法17行
     */

    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println("a+b="+a+b);
    }

    /**
     *
     */
    public void zhanneicun(){
        System.out.println("111111");
    }
}
