package �ϰ�.day13.p128�̳еĹ��췽����this��super�ؼ���;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * ��ȡ
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * ����
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * ����
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", salary = " + salary + "}";
    }
    public void work(){
        System.out.println("Ա���ڸɻ�");
    }
    public void eat(){
        System.out.println("�Է�");
    }
}
