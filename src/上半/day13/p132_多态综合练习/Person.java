package �ϰ�.day13.p132_��̬�ۺ���ϰ;
public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keepPet(Dog dog, String something){
        System.out.println("����Ϊ"+age+"���"+name+"����һֻ"
                +dog.getColor()+"��ɫ��"+dog.getAge()+"��Ĺ�");
        dog.eat(something);

    }
    public void keepPet(Cat cat , String something){
        System.out.println("����Ϊ"+age+"���"+name+"����һֻ"
                +cat.getColor()+"��ɫ��"+cat.getAge()+"���è");
        cat.eat(something);
    }
    //��Ҫһ�����������Խ������еĶ���
    //�������вΣ�����д��Щ�ĸ���
    public void keepPet(Animal a,String something){
        //�Դ��ݹ����Ķ�������ж�
        if (a instanceof Dog d){
            System.out.println("����Ϊ"+age+"���"+name+"����һֻ"
                    +d.getColor()+"��ɫ��"+d.getAge()+"��Ĺ�");
            d.eat(something);
        }else if (a instanceof Cat c){
            System.out.println("����Ϊ"+age+"���"+name+"����һֻ"
                    +c.getColor()+"��ɫ��"+c.getAge()+"��Ĺ�");
            c.eat(something);
        }else {
            System.out.println("û�����ֶ���");
        }
    }
}
