package project.uas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textUnem;
	private JTextField textpassword;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(193, 238, 92, 27);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookTableGUI booktable = new BookTableGUI();
				booktable.setVisible(true);
				dispose();
			}
			});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(43, 126, 87, 27);
		contentPane.add(lblUsername);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(43, 173, 92, 27);
		contentPane.add(lblNewLabel_3);
		
		textUnem = new JTextField();
		textUnem.setBounds(140, 126, 219, 27);
		contentPane.add(textUnem);
		textUnem.setColumns(10);
		
		textpassword = new JTextField();
		textpassword.setBounds(140, 173, 219, 27);
		contentPane.add(textpassword);
		textpassword.setColumns(10);
		
		lblNewLabel_4 = new JLabel("WELCOME");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(193, 48, 129, 27);
		contentPane.add(lblNewLabel_4);
		}
}
			
//		};
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//			gl_contentPane.createParallelGroup(Alignment.LEADING)
//				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
//					.addContainerGap(254, Short.MAX_VALUE)
//					.addComponent(btnNewButton)
//					.addGap(166))
//				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
//					.addGap(30)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
//						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
//					.addGap(18)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
//						.addComponent(textField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
//						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
//					.addContainerGap())
//				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
//					.addContainerGap(203, Short.MAX_VALUE)
//					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
//					.addGap(144))
//				
//				
//		);
//		gl_contentPane.setVerticalGroup(
//			gl_contentPane.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addGap(82)
//					.addComponent(lblNewLabel)
//					.addGap(49)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
//						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addGap(18)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//						.addComponent(lblNewLabel_2)
//						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addGap(35)
//					.addComponent(btnNewButton)
//					.addContainerGap(94, Short.MAX_VALUE))
//		);
//		contentPane.setLayout(gl_contentPane);
//	}

