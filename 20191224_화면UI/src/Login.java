import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 *  JFrame
 * 	JPanel => ȭ���� �ٲܶ� �����
 * 	JWindow
 * 	JDialog => �游��� �Ҷ� ��븹�� ��
 * 	
 * 
 * 	extends => ���(�ڹٿ����� �ϳ��ۿ� ��� ������ ���ϻ��)
 */
import java.awt.*; // window�� ���õ� Ŭ���� 

public class Login extends JPanel{
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	
	Image back; // �ʱ�ȭ �� (ȣ���� ���ص� �ڵ����� ȣ�����ش�)
	// Login login = new Login()
	Login(){	
		setLayout(null);
		back = Toolkit.getDefaultToolkit().getImage("c:\\image\\background2.jpg");
		
		la1 = new JLabel("ID",JLabel.RIGHT);
		la1.setForeground(Color.white); //���� �� �ٲٱ�
		la2 = new JLabel("Password",JLabel.RIGHT);
		la2.setForeground(Color.white);
		
		tf = new JTextField();
		pf = new JPasswordField();
		
		b1 = new JButton("�α���");
		b2 = new JButton("���");
		
		// ��ġ
		la1.setBounds(390,330,80,30);
		tf.setBounds(475,330,150,30);
		
		la2.setBounds(390,365,80,30);
		pf.setBounds(475,365,150,30);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(390,405,230,35);
		
		p.setOpaque(false); //�µθ� �Ⱥ��̰� ����
		
		add(la1);
		add(tf);
		add(la2);
		add(pf);
		add(p);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this); // �����̹���, ���� x��ǥ, ���� y��ǥ, ������â�� ����, ����(get������ �׸��� ũ�⿡ �°� ����), ���ٰ� �̹��� ������  this�� ���ڽ�
	}
	

}
