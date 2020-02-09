import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cal {

	private JFrame frame;
	private JTextField textField;
	Double fstnum;
	Double secnum;
	String answer;
	String operation;
	Double result;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
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
	public Cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 312, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 258, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn9.getText();
				textField.setText(Entername);
			}
		});
		btn9.setBounds(11, 56, 50, 58);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn8.getText();
				textField.setText(Entername);
			}
		});
		btn8.setBounds(77, 62, 48, 52);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn7.getText();
				textField.setText(Entername);
			}
		});
		btn7.setBounds(138, 59, 50, 61);
		frame.getContentPane().add(btn7);
		
		JButton btnclr = new JButton("C");
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclr.setBounds(209, 58, 50, 61);
		frame.getContentPane().add(btnclr);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn6.getText();
				textField.setText(Entername);
			}
		});
		btn6.setBounds(13, 124, 50, 58);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn5.getText();
				textField.setText(Entername);
			}
		});
		btn5.setBounds(72, 123, 50, 61);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn4.getText();
				textField.setText(Entername);
			}
		});
		btn4.setBounds(142, 126, 50, 61);
		frame.getContentPane().add(btn4);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnplus.setBounds(211, 129, 45, 54);
		frame.getContentPane().add(btnplus);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn3.getText();
				textField.setText(Entername);
			}
		});
		btn3.setBounds(12, 188, 50, 58);
		frame.getContentPane().add(btn3);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn1.getText();
				textField.setText(Entername);
			}
		});
		btn1.setBounds(72, 190, 50, 61);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn0.getText();
				textField.setText(Entername);
			}
		});
		btn0.setBounds(139, 192, 45, 53);
		frame.getContentPane().add(btn0);
		
		JButton btnmis = new JButton("-");
		btnmis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnmis.setBounds(210, 195, 45, 54);
		frame.getContentPane().add(btnmis);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn2.getText();
				textField.setText(Entername);
			}
		});
		btn2.setBounds(10, 256, 50, 58);
		frame.getContentPane().add(btn2);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv.setBounds(67, 258, 50, 61);
		frame.getContentPane().add(btndiv);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secnum=Double.parseDouble(textField.getText());
				if (operation=="+") {
					result=fstnum+secnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
				}
				else if (operation=="-") {
					result=fstnum-secnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
					
				}
				else if (operation=="*") {
					result=fstnum*secnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
					
				}
				else if (operation=="/") {
					result=fstnum/secnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
					
				}
			}
		});
		btnequal.setBounds(139, 257, 50, 61);
		frame.getContentPane().add(btnequal);
		
		JButton btninto = new JButton("*");
		btninto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btninto.setBounds(209, 259, 50, 61);
		frame.getContentPane().add(btninto);
	}
}
