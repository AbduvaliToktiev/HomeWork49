public class Car {
    private int salary;
    private String name;
    private int age;

    public Car() {

    }

    public Car(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Car{" + "salary=" + salary + ", name='" + name + '\'' + ", age=" + age + '}' + "\n";
    }
}
