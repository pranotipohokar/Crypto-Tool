import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import algo.Subs_Cypher;

class MyWindowAdapter extends WindowAdapter 
{
	public void windowClosing(WindowEvent e) 
	{
		Window w = e.getWindow();
		w.dispose();
	}
}

class AppDesk extends JFrame implements ActionListener 
{
	private String payload="";
	private String carrier="";
	private String object="";
	private String decoded="";

	public AppDesk() 
	{
		//Headng for the tool
		super("Cryptography Tool");

		MyWindowAdapter wa = new MyWindowAdapter();
		super.addWindowListener(wa);
		super.setSize(600, 500);
		super.setVisible(true);
		super.setBackground(Color.ORANGE);
		super.setLayout(null);

		this.setFont(new Font("Calibri", Font.BOLD, 22));

		//label for the option CHoose Algorithm
		Label lbl = new Label("Choose Algorithm :");
		lbl.setBounds(20,20,300,100);
		lbl.setFont(new Font("Britannic",Font.BOLD,20));
		this.add(lbl);

		//Button for Encryption Option
		Button b1 = new Button("Encrypt");
		b1.setBounds(130, 120, 120, 50);
		b1.setFont(new Font("Arial",Font.BOLD,18));
		this.add(b1);
		b1.addActionListener(this);

		//Button for Decryption Option
		Button b2 = new Button("Decrypt");
		b2.setBounds(300, 120, 120, 50);
		b2.setFont(new Font("Arial",Font.BOLD,18));
		this.add(b2);
		b2.addActionListener(this);
		
		//MenuBar for Selecting Operations
		MenuBar mb = new MenuBar();
		this.setMenuBar(mb);
		
		Menu m1=new Menu("Operation");
		mb.add(m1);
		
		//Items in the Operations Menu
		String arr[] = {"Encrypt","Decrypt"};
		for(int i=0;i<arr.length;i++)
		{
			MenuItem mi = new MenuItem(arr[i]);
			m1.add(mi);
			mi.addActionListener(this);
		}

	}

	public void actionPerformed(ActionEvent e) 
	{
		//Code to get Operation Command
		String cap = e.getActionCommand();
		do
		{	
			//code to call Encryption Process
			if(cap.equals("Encrypt"))
			{
				Subs_Cypher.Encrypt();
				continue;
			}	
			
			//code to call Decryption Process
			if(cap.equals("Decrypt"))
			{
				Subs_Cypher.Decrypt();
				continue;
			}
		}while(true);
	}
}

class Crypto_Tool 
{
	public static void main(String[] args) 
	{
		//Initializing the Constructor for starting the tool.
		AppDesk a = new AppDesk();
	}
}