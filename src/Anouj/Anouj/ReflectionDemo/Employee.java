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

    private void work()
    {
        System.out.println(name + "在" + age + "岁时" + "正在工作！");
    }

    protected void ptd()
    {
        System.out.println("。。。。");
    }

    void defalut()
    {
        System.out.println("默认修饰符");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
