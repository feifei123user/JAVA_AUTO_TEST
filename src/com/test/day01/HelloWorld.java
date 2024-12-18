package com.test.day01;

public class HelloWorld {
    public static void main(String []args){
        // 1-布尔类型
        boolean a = true;
         System.out.println(a);

        // 2- 整数类型-字节型
        byte b = 100;
        System.out.println(b);

        // 3-整数类型-短整型
        short c = 200;
        System.out.println(c);

        // 4-整数类型-整型int
        int d = 300;
        System.out.println(d);

        // 5-整数类型-长整型
        long e = 30000;
        System.out.println(e);

        // 6- 字符型- char
        char f = 'f';
        System.out.println(f);

        // 7- 浮点型-float
        // 注意：小数默认是double类型的
        // float g = 1.2;                  // 默认是double类型的
        float g = 1.234f;
        System.out.println(g);

        // 8-浮点型-double，不会丢失精度
        double l = 12.353453;
        System.out.println(l);

        // 9-引用数据类型
        // 字符串，双引号包裹起来的，都是字符串；单引号包裹起来的是，字符型
        String arar = "hello world";
        System.out.println(arar);
        System.out.println(arar + d);        // 字符串可以与其他不同类型数据拼


    }
}
