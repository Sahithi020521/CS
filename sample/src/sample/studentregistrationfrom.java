package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentregistrationfrom {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentregistrationfrom window = new studentregistrationfrom();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentregistrationfrom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Student = new JLabel("STUDENT REGISTRATION FROM");
		Student.setFont(new Font("Tahoma", Font.BOLD, 11));
		Student.setBounds(87, 11, 178, 14);
		frame.getContentPane().add(Student);
		
		tb1 = new JTextField();
		tb1.setBounds(155, 49, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NAME:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(67, 79, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel cbt1 = new JLabel("BRANCH:");
		cbt1.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbt1.setBounds(67, 104, 46, 14);
		frame.getContentPane().add(cbt1);
		
		tb2 = new JTextField();
		tb2.setBounds(155, 76, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(67, 129, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cbt = new JComboBox();
		cbt.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IT", "CS", "ECE", "MECH", "IOT"}));
		cbt.setBounds(155, 100, 74, 22);
		frame.getContentPane().add(cbt);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBounds(132, 125, 74, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBounds(224, 125, 74, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_1 = new JLabel("PROG LANGS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(49, 165, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox c1 = new JCheckBox("JAVA");
		c1.setBounds(128, 161, 74, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("C");
		c2.setBounds(217, 161, 64, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setBounds(287, 161, 86, 23);
		frame.getContentPane().add(c3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				
				String roll=tb1.getText();
				String name=tb2.getText();
				String branch = (String) cbt.getSelectedItem();
				String gender=" ";
				String langs = " ";	
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{		
					gender="female";
			    }
				 if(c1.isSelected())
				 {
					 langs=langs+"c";
				 }
				 if(c2.isSelected())
				 {
					 langs=langs+"java";
				 }
				 if(c3.isSelected())
				 {
					 langs=langs+"python";
				 }
				 JOptionPane.showMessageDialog(btnNewButton,"ROLL:"+roll+"\nNAME:"+name+"\nBRANCH:"+branch+"\nGENDER:"+gender+"\nPROG LANGS:"+langs);
				 
			}
				
			
		});
		btnNewButton.setBounds(128, 204, 86, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ROLL NO:");
		lblNewLabel.setBounds(67, 52, 55, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
