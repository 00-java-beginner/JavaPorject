package �ϰ�.day16_day17;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    /*  JFrame  ����,����
        ������?Ҳ��ʾ����,����
        �涨:GameJFrame��������ʾ�ľ�����Ϸ��������
        �Ժ����Ϸ��ص������߼���д���������
*/
    Random r = new Random();
    //����һ����ά����
    //Ŀ�ģ������������ݣ�����ͼƬ��ʱ�����ݶ�ά�����е����ݼ���
    int [][] data = new int[4][4];
    //��������������¼0�����ڶ�ά�����е�����
    int x = 0;
    int y = 0;
    //����һ��������¼·����Windows��
    String path = "E:\\java\\Programming-novice\\JavaProject\\src\\�ϰ�.image\\animal\\animal3\\";
    //mac·��
    //String path = "/Users/bytedance/IdeaProjects/Programming-novice/JavaProject/src/�ϰ�.image/animal/animal3/";

    //����һ����ά�����¼��ȷ��ֵ
    int[][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    //����һ��������¼����
    int step = 0;

    //����ѡ���������Ŀ����
    JMenuItem replayItem = new JMenuItem("������Ϸ");
    JMenuItem reLoginItem = new JMenuItem("���µ�¼");
    JMenuItem closeItem = new JMenuItem("�ر���Ϸ");
    JMenuItem accountItem = new JMenuItem("�տ���");
    JMenuItem girl = new JMenuItem("��Ů");
    JMenuItem animal = new JMenuItem("����");
    JMenuItem sport = new JMenuItem("�˶�");
    public GameJFrame(){
        //1.��ʼ������
        initJFrame();

        //2.��ʼ���˵�
        initJMnuBar();

        //��ʼ������(����ͼƬ)
        initDate();

        //3.��ʼ��ͼƬ
        initImage();

        //�ý�����ʾ����������д�����
        this.setVisible(true);

    }

    private void initDate() {
        //1.����һ��һά���飬������˳��
        int [] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //2.ѭ�������õ�ÿһ��Ԫ��
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //����һ����ʱ������¼�����ֵ
            int temp = tempArr[i];
            int index = r.nextInt(tempArr.length);
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        /*for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();*/

        //4.����ά�����������
        //�ⷨһ
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0){
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }

        /*�ⷨ��
        //������ά���飬�������ÿһ�����ݸ�ֵ(��������˼��)
        //��ѭ������ά����
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            //��ѭ��data��i����ʾһά����
            for (int j = 0; j < data[i].length; j++) {
                if (tempArr[i] == 0){
                    x = i / 4;
                    y = i % 4;
                }else {
                    //�Ⱥ���ߡ�i����j�����α�ʾ��ά�����е�ÿһ��λ��
                    //�Ⱥ��ұ߱�ʾȡֵ����������һά������������������ȡֵ��
                    data[i][j] = tempArr[index];
                    //ÿ�θ�ֵ��index����һ��
                    index++;
                }

            }
        }*/
        //5.��ӡ��ά����
        /*for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }*/
    }

    private void initImage() {
        //���ͼƬ
        this.getContentPane().removeAll();
        //�Խ�������жϣ�������Ϊtrue��ʾ�������������ֵ��ͬ�������ʤ����ͼƬ
        if (victory()){
            //windows
            JLabel winJLabel = new JLabel(new ImageIcon("E:\\java\\Programming-novice\\JavaProject\\src\\�ϰ�.image\\win.png"));
            //mac
            //JLabel winJLabel = new JLabel(new ImageIcon("/Users/bytedance/IdeaProjects/Programming-novice/JavaProject/src/�ϰ�.image/win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }
        //��������ӵ�������
        JLabel setpCount = new JLabel("������" + step);
        setpCount.setBounds(50,30,100,20);
        this.getContentPane().add(setpCount);
        //3.��ʼ��ͼƬ
        //3.1����һ��ͼƬImageIcon�Ķ���
        //ImageIcon icon = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\JavaTest\\�ϰ�.image\\animal\\animal3\\3.jpg");
        //����һ����������¼ÿ��ѭ�����ֵ����ʾ���ν���ͬ��ͼƬ��ӵ�������
        //int number = 1;
        //��ѭ�� --- ��ʾ����ѭ��ִ�����ĴΣ��Ⱥ������ͼƬ
        for (int i = 0; i < 4; i++) {
            //��ѭ�� --- ��ʾ��һ�����������ͼƬ
            for (int j = 0; j < 4; j++) {
                //��ȡ��ά��������ݲ���ֵ
                int num = data[i][j];
                //3.2����һ��JLabel�Ķ��󣨹���������
                JLabel jLabel = new JLabel(new ImageIcon(path +num+".jpg"));
                //3.3����ͼƬ������
                jLabel.setBounds(105 * j + 83,105 * i + 134,105,105);

                //��ͼƬ��ӱ߿�
                //0:͹��   1:����
                jLabel.setBorder(new BevelBorder(0));

                //3.�ѹ���������ӵ�������
                //ע�⣺��Ҫ��ȡ�������������ܽ������
                //this.add(jLabel);
                this.getContentPane().add(jLabel);

                //ע�⣺ÿ�������ɺ���Ҫ������number����һ�Σ�����ͼƬ���ᷢ���仯
                //number++;
            }
        }
        //ϸ�ڣ��ȼ��ص�ͼƬ���Ϸ�������ص�ͼƬ���·������Ա���Ҫ������
        //��ӱ���ͼƬ
        //Windows
        JLabel background = new JLabel(new ImageIcon("E:\\java\\Programming-novice\\JavaProject\\src\\�ϰ�.image\\background.png"));
        //mac
        //JLabel background = new JLabel(new ImageIcon("/Users/bytedance/IdeaProjects/Programming-novice/JavaProject/src/�ϰ�.image/background.png"));

        //���ñ�����λ��
        background.setBounds(40,40,508,560);

        //�ѱ�����ӵ�������
        this.getContentPane().add(background);

        //ˢ��һ�½���
        this.getContentPane().repaint();
    }

    private void initJMnuBar() {
        //2.��ʼ���˵�
        //2.1���������˵��Ķ���
        JMenuBar jMenuBar = new JMenuBar();

        //2.2�����˵����������ѡ��Ķ��󣨹��ܣ��������ǣ�
        JMenu functionJMenu = new JMenu("����");
        JMenu aboutJMenu = new JMenu("����һ��");
        //2.3��������ͼƬ
        JMenu changeImage = new JMenu("����ͼƬ");
        //2.4��ÿһ��ѡ���������Ŀ��ӵ�ѡ���
        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        //����Ŀ����¼�
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        //2.5����Ŀ���������ѡ����ӵ��˵�����
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //2.6������ҳ�����ò˵�
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //1.��ʼ������
        //1.1���ý���Ŀ��
        this.setSize(603,680);
        //1.2���ý���ı���
        this.setTitle("ƴͼ������ v1.0");
        //1.3���ý����ö�
        this.setAlwaysOnTop(true);
        //1.4���ý������
        this.setLocationRelativeTo(null);
        //1.5���ùرշ���
        this.setDefaultCloseOperation(3);
        //1.6ȡ��Ĭ�Ͼ��з��ã�ֻ��ȡ���˲Żᰴ��xy�����ʽ������
        this.setLayout(null);
        //1.7������������Ӽ��̼���
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65){
            //ɾ��ȫ��ͼƬ
            this.getContentPane().removeAll();
            //���ͼƬ
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //��ӱ���ͼƬ
            JLabel background = new JLabel(new ImageIcon("E:\\java\\Programming-novice\\JavaProject\\src\\�ϰ�.image\\background.png"));
            //mac
            //JLabel background = new JLabel(new ImageIcon("/Users/bytedance/IdeaProjects/Programming-novice/JavaProject/src/�ϰ�.image/background.png"));
            //���ñ�����λ��
            background.setBounds(40,40,508,560);
            //�ѱ�����ӵ�������
            this.getContentPane().add(background);
            //ˢ��һ�½���
            this.getContentPane().repaint();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        //�ж���Ϸ�Ƿ�ʤ�������ʤ�� ����Ĵ��벻��Ҫִ��
        if (victory()){
            return;
        }
        //���������ҽ����ж�
        //��37  �ϣ�38  �ң�39  �£�40
        if (code == 37){
            System.out.println("�����ƶ�");
            if (y == 3){
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y++;
            //ÿ��һ�μ��̲�������һ��
            step++;
            //���÷����������µ����ּ���ͼƬ
            initImage();

        }else if (code == 38){
            System.out.println("�����ƶ�");
            if (x == 3){
                return;
            }
            //�߼����ѿհ׷����·������������ƶ�
            //x��y��ʾ�հ׷��飬x+1��y��ʾ�հ׷����·�������
            //���հ׷����·������ָ�ֵ���հ׷���
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            x++;
            //ÿ��һ�μ��̲�������һ��
            step++;
            //���÷����������µ����ּ���ͼƬ
            initImage();

        }else if (code == 39){
            System.out.println("�����ƶ�");
            if (y == 0){
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            y--;
            //ÿ��һ�μ��̲�������һ��
            step++;
            //���÷����������µ����ּ���ͼƬ
            initImage();

        }else if (code == 40){
            System.out.println("�����ƶ�");
            if (x == 0){
                return;
            }
            data[x][y] = data[x-1][y];
            data[x-1][y] = 0;
            x--;
            //ÿ��һ�μ��̲�������һ��
            step++;
            //���÷����������µ����ּ���ͼƬ
            initImage();
        }else if (code == 65){
            initImage();
        }else if (code == 87){
            data= new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }
    }

    //����һ�������������ж϶�ά�����е����������win�е������Ƿ���ͬ
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem){
            //�Ʋ�������
            step++;
            //�ٴδ��Ҷ�ά�����е�����
            initDate();
            //���¼���ͼƬ
            initImage();

        }else if (obj == reLoginItem){
            System.out.println("���µ�¼");
            //�رյ�ǰҳ��
            this.setVisible(false);
            //�򿪵�¼ҳ��
            new LoginJFrame();
        }else if (obj == closeItem){
            System.exit(0);
        }else if (obj == accountItem){
            System.out.println("����һ��");
            //����һ����������
            JDialog jDialog = new JDialog();
            //����һ������ͼƬ����������jlaval
            JLabel jLabel = new JLabel(new ImageIcon("E:\\java\\Programming-novice\\JavaProject\\src\\�ϰ�.image\\money.png"));
            //mac
            //JLabel jLabel = new JLabel(new ImageIcon("/Users/bytedance/IdeaProjects/Programming-novice/JavaProject/src/�ϰ�.image/money.png"));
            //����λ�úͿ��
            jLabel.setBounds(0,0,794,819);
            //��ͼƬ��ӵ���������
            jDialog.getContentPane().add(jLabel);
            //���������ô�С
            jDialog.setSize(800,820);
            //�õ����ö�
            jDialog.setAlwaysOnTop(true);
            //�õ������
            jDialog.setLocationRelativeTo(null);
            //���򲻹رյ�������޷���������Ľ���
            jDialog.setModal(true);
            //�õ�����ʾ����
            jDialog.setVisible(true);
        }else if (obj == girl) {
          int index = r.nextInt(13) + 1;
          path = "E:\\java\\Programming-novice\\JavaProject\\src\\�ϰ�.image\\girl\\girl" + index +"\\";
          step = 0;
          initDate();
          initImage();
        }else if (obj == animal){
          int index = r.nextInt(8) + 1;
          path = "E:\\java\\Programming-novice\\JavaProject\\src\\�ϰ�.image\\animal\\animal" + index +"\\";
          step = 0;
          initDate();
          initImage();
        }else if (obj == sport){
          int index = r.nextInt(10) + 1;
          path = "E:\\java\\Programming-novice\\JavaProject\\src\\�ϰ�.image\\sport\\sport" + index +"\\";
          step = 0;
          initDate();
          initImage();
        }
    }
}
