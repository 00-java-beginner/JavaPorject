package �ϰ�.day18_day19.three_System;

public class Test5 {
  public static void main(String[] args) {
    //��������
    //int [] arr1 = {1,2,3,4,5};
    //int [] arr2 = new int[5];
    //����һ:����Դ,Ҫ���������ݴ��ĸ��������
    //������:������Դ�����еĵڼ���������ʼ����
    //������:Ŀ�ĵ�,��Ҫ�����ݿ������ĸ�������
    //������:Ŀ�ĵ������������
    //������:�����ĸ���
    //System.arraycopy(arr1,0,arr2,0,5);
//    for (int i = 0; i < arr2.length; i++) {
//        System.out.println(arr2[i]);
//    }
    //ϸ�ڣ�
    //1.�������Դ�����Ŀ�ĵ����鶼�ǻ�����������,��ô�����ߵ����ͱ��뱣��һ��,����ᱨ��
    /*int [] arr1 = {1,2,3,4,5};
    double [] arr2 = new double[5];
    System.arraycopy(arr1,0,arr2,0,5);
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }*/

    //2.�ڿ�����ʱ����Ҫ��������ĳ���,���������ΧҲ�ᱨ��
    /*int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
    int [] arr2 = new int[5];
    System.arraycopy(arr1,0,arr2,0,10);*/

    //3.�������Դ�����Ŀ�ĵ����鶼��������������,��ô�������Ϳ��Ը�ֵ����������
    Student s1 = new Student("zhangsan", 20);
    Student s2 = new Student("lisi", 22);
    Student s3 = new Student("wangwu", 24);

    Student[] arr1 = {s1, s2, s3};
    Student[] arr2 = new Student[3];

    System.arraycopy(arr1, 0, arr2, 0, 3);
    for (Student stu : arr2) {
          System.out.println(stu);
    }
  }
}
class Student extends Person {
  public Student() {
  }

  public Student(String name, int age) {
    super(name, age);
  }
}
class Person {
  private String name;
  private int age;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    return "Person{name = " + name + ", age = " + age + "}";
  }
}
