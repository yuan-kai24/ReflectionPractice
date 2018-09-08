package Anouj.Anouj.ReflectionDemo;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        System.out.println("有参构造方法！");
        this.name = name;
        this.age = age;
    }

    public Employee() {
        System.out.println("无参构造方法！");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
