package �ϰ�.day18_day19.four_runtime;

import java.io.IOException;

public class RunTimeDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            public static Runtime getRuntime() ��ǰϵͳ�����л�������
            public void exit(int status) ֹͣ�����
            public int availableProcessors() ���CPU���߳���
            public long maxMemory() JVM�ܴ�ϵͳ�л�ȡ���ڴ��С(��λbyte)
            public long totalMemory() JVM�Ѿ���ϵͳ�л�ȡ���ڴ��С(��λbyte)
            public long freeMemory() JVMʣ���ڴ��С(��λbyte)
            public Process exec(string command) ����cmd����
        */

        //1.��ȡRuntime�Ķ���
        //Runtime r1 =Runtime.getRuntime();

        //2.exit ֹͣ�����
        //Runtime.getRuntime().exit(0);
        //System.out.println("������ִ������?");


        //3.���CPU���߳���
        System.out.println(Runtime.getRuntime().availableProcessors());//8
        //4.���ڴ��С,��λbyte�ֽ�
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);//4064
        //5.�Ѿ���ȡ�����ڴ��С,��λbyte�ֽ�
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);//254
        //6.ʣ���ڴ��С
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);//251

        //7.����cmd����
        //shutdown :�ػ�
        //���ϲ�������ִ��
        //-s :Ĭ����1����֮��ػ�
        //-s -t ָ��ʱ�� : ָ���ػ�ʱ��
        //-a :ȡ���ػ�����
        //-r: �ػ�������
        Runtime.getRuntime().exec("shutdown -s -t 3600");


    }
}
