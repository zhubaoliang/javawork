package javawork;

import java.awt.*;

import javax.swing.*;


public class test  extends JFrame{
	private JButton button1 = new JButton("button1");
	private JButton button2 = new JButton("button2");
	
	public test(String title)
	{
		super(title);
		this.setBounds(50, 50, 200, 150);
		
		Container contentPane = this.getContentPane();
		
		contentPane.setLayout(new FlowLayout(5));
		contentPane.add(button1);
		contentPane.add(button2);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args)
	{
		new test("≤‚ ‘");
		
	}

}
