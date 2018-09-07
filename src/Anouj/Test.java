package Anouj;

import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        //getclass方式
        Employee employee = new Employee(1, "yuankai");
        Class<?> aClass = employee.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getSuperclass().getName());

        System.out.println("---------------------------------");

        //.class方式
        Class<Employee> employeeClass = Employee.class;
        System.out.println(employeeClass.getName());
        System.out.println(employeeClass.getSuperclass().getName());

        System.out.println("---------------------------------");

        //Class.forName方式
        try {
            Class<?> aClass1 = Class.forName("Anouj.Employee");
            System.out.println(aClass1.getName());
            System.out.println(aClass1.getSuperclass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //获取基本数据类型对象
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass.getName());
        //没有父类，所以输出为null或者NullPointException
        System.out.println(integerClass.getSuperclass());

    }
}
