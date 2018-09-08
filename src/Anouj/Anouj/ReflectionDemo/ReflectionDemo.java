package Anouj.Anouj.ReflectionDemo;

public class ReflectionDemo {
    public static void main(String[] args) {
        //获取employee关联对象
        try {
            Class<?> classType = Class.forName("Anouj.Anouj.ReflectionDemo.Employee");

            //通过反射机制构建来构造一个Employee的实列对象

            Employee employee = (Employee)classType.newInstance();

            System.out.println(employee.getClass());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }catch (IllegalAccessException e)
        {
            e.getStackTrace();
        }
    }
}
