package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginForm extends JFrame {
	JLabel la1,la2,la3;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2,b3;
	
	public LoginForm() {
		la1=new JLabel("LOGIN",JLabel.CENTER);
		la2=new JLabel("ID", JLabel.CENTER);
		la3=new JLabel("PW",JLabel.CENTER);
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("회원가입");
		b3=new JButton("취소");
		
		// 배치
		setLayout(null);
		
		la1.setBounds(130,20,50,30);
		
		la2.setBounds(10,65,80,30);
		tf.setBounds(85,65,170,30);
		
		la3.setBounds(10,100,80,30);
		pf.setBounds(85,100,170,30);
		
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);p.add(b3);
		p.setBounds(10,140,285,35);
		
		add(la1);
		add(la2);add(tf);
		add(la3);add(pf);
		add(p);
		
		setBounds(700,500,320,210);
		setVisible(true);
	}
}