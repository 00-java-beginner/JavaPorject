package �ϰ�.day8.�������1_10_p81_90;

public class standard_javaBean {
    public static void main(String[] args) {
        /*
        1.������Ҫ����֮��
        2.��Ա����ʹ��private����
        3�������ṩ�������췽�����޲κʹ�ȫ��������
        4.�ṩÿһ����Ա������Ӧ��set��get�������������Ϊ��ҲҪ����
        5.PTG������JavaBean���ٲ��
        */
    }
    //����javabean��ϰ
    //1.����
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;
    //2.�������췽��
    //��ݼ�alt + insert��ѡ��constructor
    //�ղ�
    public standard_javaBean(){}
    //��ȫ�������Ĺ���
    public standard_javaBean(String username,String password,String email,String gender,int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    //�ṩÿһ����Ա������Ӧ��set��get
    //��ݼ�alt + insert,ѡ��getter and setter
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
