package �ϰ�.day18_day19.five_object;

import java.util.StringJoiner;



//Cloneable
//���һ���ӿ�����û�г��󷽷�
//��ʾ��ǰ�Ľӿ���һ������Խӿ�
//����Cloneable��ʾһ��ʵ���ˣ���ô��ǰ��Ķ���Ϳ��Ա��˽�
//���û��ʵ�֣���ǰ��Ķ���Ͳ��ܿ�¡
public class User implements Cloneable {
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;




    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * ��ȡ
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * ����
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * ��ȡ
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * ����
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ
     *
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * ����
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * ��ȡ
     *
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * ����
     *
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "��ɫ���Ϊ��" + id + "���û���Ϊ��" + username + "����Ϊ��" + password + ", ��ϷͼƬΪ:" + path + ", ����:" + arrToString();
    }


    public String arrToString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //���ø����е�clone����
        //�൱����Java�����ǿ�¡һ�����󣬲��ѿ�¡֮��Ķ��󷵻س�ȥ��

        //�Ȱѱ���¡�����е������ȡ����
        int[] data = this.data;
        //�����µ�����
        int[] newData =new int[data.length];
        //���������е�����
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        //���ø����еķ�����¡����
            User u=(User)super.clone();
        //��Ϊ�����еĿ�¡������ǳ��¡���滻��¡���������е������ֵַ
        u.data =newData;
        return u;
    }
}
