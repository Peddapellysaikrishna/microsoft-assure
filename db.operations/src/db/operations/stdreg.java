package db.operations;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class stdreg {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stdreg window = new stdreg();
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
	public stdreg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 394, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tb1 = new JTextField();
		tb1.setBounds(178, 99, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(178, 147, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(178, 238, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("STUDENT REGISTRATION");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(66, 16, 245, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "ECE", "EEE", "CSE", "IT", "MECH"}));
		cb1.setBounds(181, 193, 83, 22);
		frame.getContentPane().add(cb1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rno=tb1.getText();
				int rollno=Integer.parseInt(rno);
				String name=tb2.getText();
				String branch=(tring) cb1.getSelectedItem();
				String m=tb3.getText();
				int marks=Integer.parseInt(m);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		btnNewButton.setBounds(106, 291, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ROLL NO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		btnNewButton_1.setBounds(39, 97, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("NAME");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBounds(39, 145, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("BRANCH");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		btnNewButton_4.setBounds(39, 192, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("MARKS");
		btnNewButton_5.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		btnNewButton_5.setBounds(39, 236, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel tb3 = new JLabel("");
		tb3.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\MREC"));
		tb3.setBounds(39, 47, 238, 233);
		frame.getContentPane().add(tb3);
	}
}
