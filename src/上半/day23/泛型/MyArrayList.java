package �ϰ�.day23.����;


import java.util.Arrays;

/*
*       �����ڱ�дһ�����ʱ�������ȷ�����ͣ���ô�����Ϳ��Զ���Ϊ�����ࡣ
* */
public class MyArrayList<E> {

    Object[] obj = new Object[10];
    int size;

    /*
    E : ��ʾ�ǲ�ȷ�������͡������������������Ѿ�������ˡ�
    e���βε����֣�������
    * */
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }


    public E get(int index){
        return (E)obj[index];
    }


    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
