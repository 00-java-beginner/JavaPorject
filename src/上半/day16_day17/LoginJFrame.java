package �ϰ�.day16_day17;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    /*
    LoginJFrame ��ʾ��¼����
    �Ժ����¼��صĴ��붼д������
    */
    //����һ�����ϣ������洢�û���������
    static ArrayList<User> allUsers = new ArrayList<>();
    static {
      allUsers.add(new User("zhangsan","123456"));
      allUsers.add(new User("lisi","123456"));
    }
    JButton login = new JButton();
    JButton register = new JButton();
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JTextField code = new JTextField();
    //��ȷ����֤��
    JLabel rightCode = new JLabel();
    String path = "E:\\java\\Programming-novice\\JavaProject\\src\\�ϰ�.image\\login\\";

    public LoginJFrame() {
      //��ʼ������
      initJFrame();
      //�����������Ӷ���
      initView();
      //�ý���չʾ����
      this.setVisible(true);
    }

    public void initJFrame() {
      this.setSize(488, 430);
      //���ý���ı���
      this.setTitle("ƴͼ ��¼");
      //���ùرշ���
      this.setDefaultCloseOperation(3);
      //���ý������
      this.setLocationRelativeTo(null);
      //���ý����ö�
      this.setAlwaysOnTop(true);
      //ȡ���ڲ�Ĭ�ϲ���
      this.setLayout(null);
    };
    public void initView() {
      //1.����û�����ͼƬ
      JLabel usernameTest = new JLabel(new ImageIcon(path + "�û���.png"));
      usernameTest.setBounds(116, 135, 47, 17);
      this.getContentPane().add(usernameTest);
      //����û����������
      username.setBounds(195, 134, 200, 30);
      this.getContentPane().add(username);

      //2.��������ͼƬ
      JLabel passwordTest = new JLabel(new ImageIcon(path + "����.png"));
      passwordTest.setBounds(130, 195, 32, 16);
      this.getContentPane().add(passwordTest);
      //�������������
      password.setBounds(195, 195, 200, 30);
      this.getContentPane().add(password);

      //3.�����֤���ͼƬ
      JLabel codeText = new JLabel(new ImageIcon(path + "��֤��.png"));
      codeText.setBounds(133, 256, 50, 30);
      this.getContentPane().add(codeText);
      //�����֤��������
      code.setBounds(195, 256, 100, 30);
      this.getContentPane().add(code);
      //��ȡ��֤������
      String codeStr = CodeUtil.getCode();
      //����ȡ������֤����д���
      rightCode.setText(codeStr);
      //������¼�
      rightCode.addMouseListener(this);
      //����λ�úͿ��
      rightCode.setBounds(300, 256, 50, 30);
      //��ӵ�������
      this.getContentPane().add(rightCode);

      //4.��ӵ�¼��ͼƬ
      login.setBounds(123, 310, 128, 47);
      login.setIcon(new ImageIcon(path + "��¼��ť.png"));
      //ȥ����ť�ı߿�
      login.setBorderPainted(false);
      //ȥ����ť�ı���
      login.setContentAreaFilled(false);
      //����¼������ʱ��
      login.addMouseListener(this);
      //��ӵ�������
      this.getContentPane().add(login);

      //5.���ע���ͼƬ
      register.setBounds(256, 310, 128, 47);
      register.setIcon(new ImageIcon(path + "ע�ᰴť.png"));
      //ȥ����ť�ı߿�
      register.setBorderPainted(false);
      //ȥ����ť�ı���
      register.setContentAreaFilled(false);
      //��ע��������ʱ��
      register.addMouseListener(this);
      //��ӵ�������
      this.getContentPane().add(register);

      //6.��ӱ���ͼƬ
      JLabel background = new JLabel(new ImageIcon(path + "background.png"));
      background.setBounds(0,0,470,390);
      this.getContentPane().add(background);
    };
    //���
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login){
            //1.��ȡ
            //��ȡ��ǰ������û���
            String usernameInput = username.getText();
            //��ȡ��ǰ���������
            String passwordInput = password.getText();
            //��ȡ��ǰ�������֤��
            String codeInput = code.getText();
            //���������¼������û��������룬���ں����ж�
            User userInfo = new User(usernameInput,passwordInput);
            //2.�ж�
            //����֤������ж�
            if (codeInput.isEmpty()){
              showJDialog("��֤�벻��Ϊ��");
            }else if (usernameInput.isEmpty() || passwordInput.isEmpty()){
              showJDialog("�û���������Ϊ��");
            //�ж���֤���Ƿ���ȷ(equalsIgnoreCase���ں��Դ�Сд)
            }else if (!codeInput.equalsIgnoreCase(rightCode.getText())){
              showJDialog("��֤�����");
            //�ж��û����������Ƿ���ȷ
            }else if (contains(userInfo)){
              System.out.println("��¼�ɹ�");
              //��Ҫ�رյ�ǰ��¼ҳ��
              this.setVisible(false);
              //��ת����Ϸ����
              new GameJFrame();
            }else {
              showJDialog("�û������������");
            }
        }else if (e.getSource() == register){
          System.out.println("�����ע�ᰴť");
        }else if (e.getSource() == rightCode){
            String code = CodeUtil.getCode();
            rightCode.setText(code);
        }
    }
    //��ס����
    @Override
    public void mousePressed(MouseEvent e) {
      if (e.getSource() == login){
        login.setIcon(new ImageIcon(path + "��¼����.png"));
      }else if (e.getSource() == register){
        register.setIcon(new ImageIcon(path + "ע�ᰴ��.png"));
      }
    }
    //�ɿ���ť
    @Override
    public void mouseReleased(MouseEvent e) {
      if (e.getSource() == login){
        login.setIcon(new ImageIcon(path + "��¼��ť.png"));
      }else if (e.getSource() == register){
        register.setIcon(new ImageIcon(path + "ע�ᰴť.png"));
      }
    }
    //��껬��
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    //��껬��
    @Override
    public void mouseExited(MouseEvent e) {
  }

    //����һ�������������ж��û����������Ƿ����
    public boolean contains(User userInput){
      //����ѭ����ȡ����ǰ���������ȫ������
      for (int i = 0; i < allUsers.size(); i++) {
          //����������Ĳ�����ֵ��һ���µı���
          User rightUser = allUsers.get(i);
          //�õ�ǰ���ݵĲ������±�������Ĳ������бȽ�
          if (userInput.getUsername().equals(rightUser.getUsername())
            && userInput.getPassword().equals(rightUser.getPassword()) ){
              //���һ������true
              return true;
          }
      }
      //�����һ������false
      return false;
    }

    //����һ�����������ڵ�����ʾ
    public void showJDialog(String content){
      //����һ���������
      JDialog jDialog = new JDialog();
      //���������ô�С
      jDialog.setSize(200, 150);
      //�õ����ö�
      jDialog.setAlwaysOnTop(true);
      //�õ������
      jDialog.setLocationRelativeTo(null);
      //���򲻹ر���Զ�޷���������Ľ���
      jDialog.setModal(true);

      //����Jlabel����������ֲ���ӵ�������
      JLabel warning = new JLabel(content);
      warning.setBounds(0, 0, 200, 150);
      jDialog.getContentPane().add(warning);

      //�õ���չʾ����
      jDialog.setVisible(true);

    }
}
