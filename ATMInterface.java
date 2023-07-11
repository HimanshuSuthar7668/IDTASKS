package Project1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Interface extends JFrame implements ActionListener{
	JPanel p; 
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2,b3,b4,b5,b6,b7;
	Font f1,f2;

	Interface(){
		p = new JPanel();
		p.setBounds(65,40,300,350);
		p.setLayout(null);
		add(p);

		f1=new Font("Elephant", Font.PLAIN, 20);

		l1=new JLabel("Money Transfer");
		l1.setBounds(10,60,250,40);
		l1.setFont(f1);
		p.add(l1);

		l2=new JLabel("Cash Withdrawal");
		l2.setBounds(113,105,250,40);
		l2.setFont(f1);
		p.add(l2);

		l3=new JLabel("Balance Inquiry");
		l3.setBounds(10,150,250,40);
		l3.setFont(f1);
		p.add(l3); 

		l4=new JLabel("Set Language");
		l4.setBounds(152,200,250,40);
		l4.setFont(f1);
		p.add(l4);

		l5=new JLabel("Change Pin");
		l5.setBounds(10,245,250,40);
		l5.setFont(f1);
		p.add(l5);

		l6=new JLabel("Cancel");
		l6.setBounds(220,285,250,40);
		l6.setFont(f1);
		p.add(l6); 

		l7=new JLabel("-: Please Choose Services :-");
		l7.setBounds(25,2,250,40);
		l7.setFont(new Font("Arial", Font.ITALIC+Font.BOLD, 18));
		p.add(l7);
		
		l8=new JLabel("XYZ Bank ATM");
		l8.setBounds(75,390,300,80);
		l8.setFont(new Font("Algerian", Font.BOLD, 38));
		add(l8);

		b1=new JButton(">");
		b1.setBounds(5, 100, 55, 40);
		add(b1);

		b2=new JButton(">");
		b2.setBounds(5, 190, 55, 40);
		add(b2);

		b3=new JButton(">");
		b3.setBounds(5, 285, 55, 40);
		add(b3);

		b4=new JButton("<");
		b4.setBounds(370, 145, 55, 40);
		add(b4);

		b5=new JButton("<");
		b5.setBounds(370, 240, 55, 40);
		add(b5);

		b6=new JButton("<");
		b6.setBounds(370, 325, 55, 40);
		add(b6);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});

		setSize(445, 500);
		getContentPane().setBackground(Color.lightGray);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			moneyTransfer();
		}
		if(e.getSource()==b2){
			balanceInquiry();
		}
		if(e.getSource()==b3){
			changePIN();
		}
		if(e.getSource()==b4){
			cashWithdrawal();
		}
		if(e.getSource()==b5){
			JOptionPane.showMessageDialog(this, "There is only default language to select.", "Language", JOptionPane.ERROR_MESSAGE);
		}
	}
	private void moneyTransfer(){
		JDialog f=new JDialog(this, "Money Transfer");
		f.setSize(445, 300);
		f.setLayout(null);
		f.setLocationRelativeTo(null);

		JLabel l11=new JLabel("Receiver's Name");
		l11.setBounds(30,50,150,40);
		f.add(l11);

		JLabel l12=new JLabel("Amount");
		l12.setBounds(30,100,150,40);
		f.add(l12);

		JTextField t1=new JTextField();
		t1.setBounds(140,50,200,40);
		f.add(t1);

		JTextField t2=new JTextField();
		t2.setBounds(140,100,200,40);
		f.add(t2);

		JButton send=new JButton("Send");
		send.setBounds(230,200,100,50);
		f.add(send);

		JButton cancel=new JButton("Cancel");
		cancel.setBounds(50,200,100,50);
		f.add(cancel);

		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String s1=t1.getText();
				String s2=t2.getText();
				if(s1.length()==0 || s2.length()==0){
					if(s1.length()==0){
						t1.setText("Please Enter Name");
					}else if(s2.length()==0){
						t2.setText("Please Enter Amout");
					}
				}else{
					JPasswordField pwd=new JPasswordField(4);
					int pass=JOptionPane.showConfirmDialog(f, pwd, "Enter PIN Code", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
					if(pass==JOptionPane.OK_OPTION){
						JOptionPane.showMessageDialog(f, "Your Money has been transfered to "+s1+", Thank you !", "Money Transfer", JOptionPane.INFORMATION_MESSAGE);
						f.dispose();
					}
					else if(pass==JOptionPane.CANCEL_OPTION){
						JOptionPane.showMessageDialog(f, "Please Enter PIN Code", "Alert !", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});

		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.exit(0);	
			}
		});

		f.setVisible(true);
	}

	private void cashWithdrawal(){
		JDialog f=new JDialog(this, "Cash Withdrawal");
		f.setSize(445, 300);
		f.setLayout(null);
		f.setLocationRelativeTo(null);

		JLabel l11=new JLabel("Cash Amount");
		l11.setBounds(30,50,150,40);
		f.add(l11);

		JLabel l12=new JLabel("PIN Code");
		l12.setBounds(30,100,150,40);
		f.add(l12);

		JTextField t1=new JTextField();
		t1.setBounds(130,50,200,40);
		f.add(t1);

		JPasswordField t2=new JPasswordField();
		t2.setBounds(130,100,200,40);
		f.add(t2);

		JButton submit=new JButton("Submit");
		submit.setBounds(230,200,100,50);
		f.add(submit);

		JButton cancel=new JButton("Cancel");
		cancel.setBounds(50,200,100,50);
		f.add(cancel);

		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String s1=t1.getText();
				char[] s2=t2.getPassword();
				if(s1.length()==0 || s2.length==0){
					if(s1.length()==0){
						t1.setText("Please Enter Amount");
					}else if(s2.length==0){
						t2.setText("Please Enter PIN Code");
					}
				}else{
					JOptionPane.showMessageDialog(f, "Your Transaction has been completed, Thank You !", "Withdrawal", JOptionPane.PLAIN_MESSAGE);
					f.dispose();
				}
			}
		});

		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.exit(0);	
			}
		});
		
		f.setVisible(true);
	}
	private void changePIN(){
		JDialog f=new JDialog(this, "Change PIN");
		f.setSize(445, 300);
		f.setLayout(null);
		f.setLocationRelativeTo(null);

		JLabel l11=new JLabel("Current PIN");
		l11.setBounds(30,40,150,40);
		f.add(l11);

		JLabel l12=new JLabel("New PIN");
		l12.setBounds(30,90,150,40);
		f.add(l12);

		JLabel l13=new JLabel("Confirm PIN");
		l13.setBounds(30,140,150,40);
		f.add(l13);

		JTextField t1=new JTextField();
		t1.setBounds(140,40,200,40);
		f.add(t1);

		JTextField t2=new JTextField();
		t2.setBounds(140,90,200,40);
		f.add(t2);

		JTextField t3=new JTextField();
		t3.setBounds(140,140,200,40);
		f.add(t3);

		JButton submit=new JButton("Submit");
		submit.setBounds(230,200,100,50);
		f.add(submit);

		JButton cancel=new JButton("Cancel");
		cancel.setBounds(50,200,100,50);
		f.add(cancel);

		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=t3.getText();
				if(s1.length()==0){
					t1.setText("Please Enter PIN");
				}else if(s2.length()==0 || s3.length()==0){
					if(s2.length()==0){
						t2.setText("Please Enter Nem PIN");
					}else if(s3.length()==0){
						t3.setText("Please Confirm New PIN");
					}
				}
				else{
					JOptionPane.showMessageDialog(f, "Your PIN Code has been Updated, Thank You !", "Change PIN", JOptionPane.INFORMATION_MESSAGE);
					f.dispose();
				}
			}
		});

		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.exit(0);	
			}
		});
		
		f.setVisible(true);
	}
	private void balanceInquiry(){
		JPasswordField pwd =new JPasswordField(4);
		int op=JOptionPane.showConfirmDialog(this,pwd, "Enter PIN Code",JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(op==JOptionPane.OK_OPTION){
			JOptionPane.showMessageDialog(this,"Something went wrong in machine, Please try again later !", "Balance Inquiry", JOptionPane.ERROR_MESSAGE);
		}else if(op==JOptionPane.CANCEL_OPTION){
			dispose();
		}
	}

}

public class ATMInterface {
	public static void main(String[] args) {
		new Interface().setVisible(true);		
	}
}
