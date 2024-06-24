package �ϰ�.day20.jdk8;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneIDDemo1 {
    public static void main(String[] args) {
        /*
        static Set<string> getAvailableZoneIds() ��ȡJava��֧�ֵ�����ʱ��
        static ZoneId systemDefault() ��ȡϵͳĬ��ʱ��
        static Zoneld of(string zoneld) ��ȡһ��ָ��ʱ��
        */

        //1.��ȡ���е�ʱ������
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());//600
        System.out.println(zoneIds);// Asia/Shanghai

        //2.��ȡ��ǰϵͳ��Ĭ��ʱ��
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai

        //3.��ȡָ����ʱ��
        ZoneId zoneId1 = ZoneId.of("Asia/Pontianak");
        System.out.println(zoneId1);//Asia/Pontianak
    }
}
