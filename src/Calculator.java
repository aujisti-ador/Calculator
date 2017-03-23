import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;

public class Calculator extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TextField;
	private JLabel label;
	private JRadioButton rdbtnOn;
	private JRadioButton rdbtnOff ;
	private JButton btnC;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	double number,answer;
	int calculation;
	
	public void arithmetic_operation()
	{
		switch (calculation)
		{
		case '+':
			answer = number+ Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
			break;
			
		case '-':
			answer = number- Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
			break;
			
		case '*':
			answer = number* Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
			break;
			
			
		case '/':
			answer = number/ Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
			break;
		}
	}
	
	public void off()
	{
		TextField.setEnabled(false);
		button_1.setEnabled(false);
		button_2.setEnabled(false);
		button_3.setEnabled(false);
		button_4.setEnabled(false);
		button_5.setEnabled(false);
		button_6.setEnabled(false);
		button_7.setEnabled(false);
		button_8.setEnabled(false);
		button_9.setEnabled(false);
		button_10.setEnabled(false);
		button_11.setEnabled(false);
		button_12.setEnabled(false);
		button_13.setEnabled(false);
		button_14.setEnabled(false);
		button_15.setEnabled(false);
		button_16.setEnabled(false);
		button_17.setEnabled(false);
		btnC.setEnabled(false);
		rdbtnOff.setEnabled(false);
		rdbtnOn.setEnabled(true);
	}
	
	public void on()
	{
		TextField.setEnabled(true);
		button_1.setEnabled(true);
		button_2.setEnabled(true);
		button_3.setEnabled(true);
		button_4.setEnabled(true);
		button_5.setEnabled(true);
		button_6.setEnabled(true);
		button_7.setEnabled(true);
		button_8.setEnabled(true);
		button_9.setEnabled(true);
		button_10.setEnabled(true);
		button_11.setEnabled(true);
		button_12.setEnabled(true);
		button_13.setEnabled(true);
		button_14.setEnabled(true);
		button_15.setEnabled(true);
		button_16.setEnabled(true);
		button_17.setEnabled(true);
		btnC.setEnabled(true);
		rdbtnOn.setEnabled(false);
		rdbtnOff.setEnabled(true);
		
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setBackground(new Color(30, 144, 255));
		setType(Type.UTILITY);
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField = new JTextField();
		TextField.setHorizontalAlignment(SwingConstants.RIGHT);
		TextField.setFont(new Font("Tahoma", Font.BOLD, 15));
		TextField.setBounds(10, 26, 263, 46);
		contentPane.add(TextField);
		TextField.setColumns(10);
		
		button_17 = new JButton("8");
		button_17.setForeground(SystemColor.text);
		button_17.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_17.setBackground(new Color(0, 0, 0));
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"8");
			}
		});
		button_17.setBounds(72, 129, 52, 39);
		contentPane.add(button_17);
		
		button_1 = new JButton("9");
		button_1.setForeground(SystemColor.text);
		button_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_1.setBackground(new Color(0, 0, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"9");
			}
		});
		button_1.setBounds(134, 129, 52, 39);
		contentPane.add(button_1);
		
		button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				calculation = '+';
				TextField.setText("");
				label.setText(number + "+");
				
			}
		});
		button_2.setForeground(SystemColor.text);
		button_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_2.setBackground(new Color(0, 0, 0));
		button_2.setBounds(221, 128, 52, 41);
		contentPane.add(button_2);
		
		button_3 = new JButton("4");
		button_3.setForeground(SystemColor.text);
		button_3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_3.setBackground(new Color(0, 0, 0));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"4");
			}
		});
		button_3.setBounds(10, 179, 52, 39);
		contentPane.add(button_3);
		
		button_4 = new JButton("5");
		button_4.setForeground(SystemColor.text);
		button_4.setBackground(new Color(0,0,0));
		button_4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"5");
			}
		});
		button_4.setBounds(72, 179, 52, 39);
		contentPane.add(button_4);
		
		button_5 = new JButton("6");
		button_5.setForeground(SystemColor.text);
		button_5.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_5.setBackground(new Color(0, 0, 0));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"6");
			}
		});
		button_5.setBounds(134, 179, 52, 39);
		contentPane.add(button_5);
		
		button_6 = new JButton("1");
		button_6.setForeground(SystemColor.text);
		button_6.setBackground(new Color(0, 0, 0));
		button_6.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TextField.setText(TextField.getText()+"1");
			}
		});
		button_6.setBounds(10, 229, 52, 39);
		contentPane.add(button_6);
		
		button_7 = new JButton("2");
		button_7.setForeground(SystemColor.text);
		button_7.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_7.setBackground(new Color(0, 0, 0));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"2");
			}
		});
		button_7.setBounds(72, 229, 52, 39);
		contentPane.add(button_7);
		
		button_8 = new JButton("3");
		button_8.setForeground(SystemColor.text);
		button_8.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_8.setBackground(new Color(0, 0, 0));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"3");
			}
		});
		button_8.setBounds(134, 229, 52, 39);
		contentPane.add(button_8);
		
		button_9 = new JButton("0");
		button_9.setForeground(SystemColor.text);
		button_9.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_9.setBackground(new Color(0, 0, 0));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"0");
			}
		});
		button_16 = new JButton("7");
		button_16.setForeground(SystemColor.text);
		button_16.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_16.setBackground(new Color(0, 0, 0));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"7");
			}
		});
		button_16.setBounds(10, 129, 52, 39);
		contentPane.add(button_16);
		
		button_9.setBounds(10, 279, 52, 39);
		contentPane.add(button_9);
		
		button_10 = new JButton(".");
		button_10.setForeground(SystemColor.text);
		button_10.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_10.setBackground(new Color(0, 0, 0));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+".");
			}
		});
		button_10.setBounds(72, 279, 52, 39);
		contentPane.add(button_10);
		
		button_11 = new JButton("=");
		button_11.setForeground(SystemColor.text);
		button_11.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_11.setBackground(new Color(0, 0, 0));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
			}
		});
		button_11.setBounds(134, 279, 77, 39);
		contentPane.add(button_11);
		
		button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				calculation = '-';
				TextField.setText("");
				label.setText(number + "-");
			}
		});
		button_12.setForeground(SystemColor.text);
		button_12.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_12.setBackground(new Color(0, 0, 0));
		button_12.setBounds(221, 179, 52, 41);
		contentPane.add(button_12);
		
		button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				calculation = '*';
				TextField.setText("");
				label.setText(number + "*");
			}
		});
		button_13.setForeground(SystemColor.text);
		button_13.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_13.setBackground(new Color(0, 0, 0));
		button_13.setBounds(221, 229, 52, 41);
		contentPane.add(button_13);
		
		button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				calculation = '/';
				TextField.setText("");
				label.setText(number + "/");
			}
		});
		button_14.setForeground(SystemColor.text);
		button_14.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_14.setBackground(new Color(0, 0, 0));
		button_14.setBounds(221, 279, 52, 41);
		contentPane.add(button_14);
		
		btnC = new JButton("C");
		btnC.setForeground(SystemColor.text);
		btnC.setBackground(new Color(0, 0, 0));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText("");
				label.setText("");
			}
		});
		btnC.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnC.setBounds(221, 92, 52, 25);
		contentPane.add(btnC);
		
		button_15 = new JButton("<-");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int length = TextField.getText().length();
				int number = length-1;

				String store;
				
				if (length > 0) {
					StringBuilder back = new StringBuilder(TextField.getText());
					back.deleteCharAt(number);
					store = back.toString();
					TextField.setText(store);
				}
			}
		});
		button_15.setForeground(SystemColor.text);
		button_15.setBackground(new Color(0, 0, 0));
		button_15.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_15.setBounds(134, 93, 52, 25);
		contentPane.add(button_15);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(new Color(255, 250, 250));
		label.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		label.setBounds(207, 11, 66, 14);
		contentPane.add(label);
		
		rdbtnOn = new JRadioButton("ON");
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				on();
			}
		});
		rdbtnOn.setForeground(new Color(255, 250, 250));
		rdbtnOn.setBackground(new Color(30, 144, 255));
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setBounds(10, 80, 52, 23);
		contentPane.add(rdbtnOn);
		
		rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				off();
			}
		});
		rdbtnOff.setForeground(new Color(255, 250, 250));
		rdbtnOff.setBackground(new Color(30, 144, 255));
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBounds(10, 99, 66, 23);
		contentPane.add(rdbtnOff);
		
		TextField.setEnabled(false);
		button_1.setEnabled(false);
		button_2.setEnabled(false);
		button_3.setEnabled(false);
		button_4.setEnabled(false);
		button_5.setEnabled(false);
		button_6.setEnabled(false);
		button_7.setEnabled(false);
		button_8.setEnabled(false);
		button_9.setEnabled(false);
		button_10.setEnabled(false);
		button_11.setEnabled(false);
		button_12.setEnabled(false);
		button_13.setEnabled(false);
		button_14.setEnabled(false);
		button_15.setEnabled(false);
		button_16.setEnabled(false);
		button_17.setEnabled(false);
		btnC.setEnabled(false);
		rdbtnOff.setEnabled(false);
		
		
	}
}
