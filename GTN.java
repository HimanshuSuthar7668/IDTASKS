package GuessTheNum;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class GameWindow extends JFrame implements ActionListener{
	private JLabel l1,l2,l3,l4,l5;
	private JTextField t1;
	private JButton b1,b2,b3;
	private int g;//Taking input as User's guessing Number 
	int a=0;// Show as the attemted number of right guessing 
	Random r=new Random();
	private int n=r.nextInt(30)+1;

	GameWindow(){
		JPanel p=new JPanel();
		p.setBounds(12,32,360,300);
		p.setBackground(Color.GRAY);
		p.setLayout(null);
		add(p);

		l1 =new JLabel("The Number Guessing Game");
		l1.setBounds(75,0,300,40);
		l1.setFont(new Font("Arial", Font.BOLD, 18));
		l1.setForeground(Color.WHITE);
		add(l1);
		
		Font f=new Font("Arial", Font.BOLD, 15);

		l2 =new JLabel("Can you guess the number, try it...");
		l2.setBounds(20,15,300,40);
		l2.setFont(f);
		p.add(l2);

		l3 =new JLabel("Enter Your Num between 1 to 30:-");
		l3.setBounds(20,65,300,40);
		l3.setFont(f);
		p.add(l3);

		t1=new JTextField();
		t1.setBounds(80, 105, 70, 40);
		p.add(t1);

		b1 =new JButton("Guess it");
		b1.setBounds(160, 105, 100, 40);
		p.add(b1);
		b1.addActionListener(this);

		b2 =new JButton("Exit");
		b2.setBounds(240, 230, 80, 40);
		p.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev){
				dispose();
			}
		});

		b3 =new JButton("Reset");
		b3.setBounds(40, 230, 80, 40);
		p.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev){
				reset();
			}
		});

		l4 =new JLabel();
		l4.setBounds(20,160,300,40);
		l4.setFont(f);
		p.add(l4);

		l5 =new JLabel();
		l5.setBounds(20,180,300,40);
		l5.setFont(f);
		p.add(l5);
		
		setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		setBounds(0,0,400,380);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			g=Integer.parseInt(t1.getText());
			try{
				do{	
					g=Integer.parseInt(t1.getText());
					a++;
					
					if(g < n){
						l4.setText("too low , try again");
						t1.setText("");
					}
					if(g > n){
						l4.setText("too High , try again");	
						t1.setText("");
					}
				}while(g !=n);
				l4.setText("Congratulations ! it's right number");
				l5.setText("Score :- "+a);
			}catch(Exception ex){
				System.out.println("");
			}
		}
	}
	private void reset(){
		t1.setText("");
		l4.setText("");
		l5.setText("");
		a=0;
		n=r.nextInt(30)+1;
	}
}
public class GTN {
	public static void main(String[] args) {
		new GameWindow().setVisible(true);
	}
}
