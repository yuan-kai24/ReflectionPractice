package Anouj.ReflectionArrayDemo;

import java.lang.reflect.Array;

public class ReflectionSArrayDemo {
    public static void main(String[] args) throws Exception{
        //创建一个一位数组
        Class<?> classType = Class.forName("java.lang.String");
        Object array = Array.newInstance(classType, 5);

        //赋值
        Array.set(array , 3, "yk");
        System.out.println(Array.get(array, 3));
        System.out.println("------------------------------------------");

        //创建二位数组
        int [] dimens = {3, 3};
        Object array2 = Array.newInstance(int.class, dimens);
        //赋值
        Object arrone = Array.get(array2,2);
        Array.setInt(arrone, 2, 10);
        //转型
        int [][] arr = (int[][]) array2;
        System.out.println(arr[2][2]);

    }
}
