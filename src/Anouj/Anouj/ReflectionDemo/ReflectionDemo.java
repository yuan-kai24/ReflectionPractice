package Anouj.Anouj.ReflectionDemo;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) {
        //获取employee关联对象
        try {
            Class<?> classType = Class.forName("Anouj.Anouj.ReflectionDemo.Employee");

            //通过反射机制构建来构造一个无参Employee的实列对象
            Employee employee = (Employee)classType.newInstance();
            System.out.println(employee);
            System.out.println("------------------------------------------");

            //调用指定的构造方法来构造对象(无参)
            Constructor<?> constructor = classType.getConstructor(new Class[]{});
            Employee employee2 = (Employee)constructor.newInstance(new Override[]{});
            System.out.println(employee);
            System.out.println("------------------------------------------");

            //调用指定的构造方法来构造对象(有参)
            Constructor<?> constructor1 = classType.getConstructor(new Class[]{String.class, int.class});
            Employee em3 = (Employee) constructor1.newInstance(new Object[]{"哈哈", 20});
            System.out.println(em3);
            System.out.println("------------------------------------------");

            //获取class对象多制定的方法，包括私有的
            Method method = classType.getDeclaredMethod("toString", new Class[]{});
            System.out.println(method.getName());
            System.out.println("------------------------------------------");

            //获取所有的方法，包括私有
            Method [] methods = classType.getDeclaredMethods();
            for (Method method1:methods)
            {
                System.out.println(method1.getModifiers()+ " " + method1.getReturnType() + " " + method1.getName());
            }
            System.out.println("------------------------------------------");

            //方法的调用
            String tos = (String) method.invoke(em3, new Object[]{});
            System.out.println(tos);
            System.out.println("------------------------------------------");

            //调用私有方法
            Method method1 = classType.getDeclaredMethod("work", new Class[]{});
            System.out.println(method1.getName() + "的调用");
            method1.setAccessible(true);
            method1.invoke(em3, new Object[]{});
            System.out.println("------------------------------------------");

            //获取所有属性---并更改私有属性
            Field field = classType.getDeclaredField("name");
            field.setAccessible(true);
            field.set(em3, "嘿嘿");
            System.out.println(field.getName()+ "更改为" + field.get(em3));
            method1.invoke(em3 , new Object[]{});
            System.out.println("------------------------------------------");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e)
        {
            e.getStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        }catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
