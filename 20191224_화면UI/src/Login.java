import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 *  JFrame
 * 	JPanel => 화면을 바꿀때 사용함
 * 	JWindow
 * 	JDialog => 방만들기 할때 사용많이 함
 * 	
 * 
 * 	extends => 상속(자바에서는 하나밖에 상속 못받음 단일상속)
 */
import java.awt.*; // window와 관련된 클래스 

public class Login extends JPanel{
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	
	Image back; // 초기화 블럭 (호출을 안해도 자동으로 호출해준다)
	// Login login = new Login()
	Login(){	
		setLayout(null);
		back = Toolkit.getDefaultToolkit().getImage("c:\\image\\background2.jpg");
		
		la1 = new JLabel("ID",JLabel.RIGHT);
		la1.setForeground(Color.white); //글자 색 바꾸기
		la2 = new JLabel("Password",JLabel.RIGHT);
		la2.setForeground(Color.white);
		
		tf = new JTextField();
		pf = new JPasswordField();
		
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		
		// 배치
		la1.setBounds(390,330,80,30);
		tf.setBounds(475,330,150,30);
		
		la2.setBounds(390,365,80,30);
		pf.setBounds(475,365,150,30);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(390,405,230,35);
		
		p.setOpaque(false); //태두리 안보이게 해줌
		
		add(la1);
		add(tf);
		add(la2);
		add(pf);
		add(p);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this); // 넣을이미지, 시작 x좌표, 시작 y좌표, 윈도우창의 넓이, 높이(get을쓰면 그림의 크기에 맞게 설정), 어디다가 이미지 넣을지  this는 나자신
	}
	

}
