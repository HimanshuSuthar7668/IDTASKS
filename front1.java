import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Buttons extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    JTextField tf1,tf3;
    double num1,num2,num3,check;
    JWindow w;
    JProgressBar pb;
    Timer t;
    JLabel l,l1,l2,l3,l4;
    Buttons(){
        displayWelcomeScreen();
        //Panel work
        JPanel p1=new JPanel();
        p1.setBounds(50,50,700,500);
        p1.setBackground(Color.gray);
        
        //Font
        Font f1=new Font("ARIAL",Font.BOLD,20);
        Font f2=new Font("Arial Rounded MT Bold",Font.BOLD,40);

        l1=new JLabel("Enter First Value ");
        l1.setBounds(100,70,270,30);
        l1.setFont(f1);
        add(l1);

        l2=new JLabel("Result =");
        l2.setBounds(420,70,170,30);
        l2.setFont(f1);
        add(l2);

        l3=new JLabel();
        l3.setBounds(70,110,50,30);
        l3.setFont(f1);
        add(l3);

        l4=new JLabel("");
        l4.setBounds(390,110,50,30);
        l4.setFont(f1);
        add(l4);

        //Text Field work
        tf1=new JTextField();
        tf1.setBounds(100,100,270,50);
        tf1.setFont(f1);
        tf1.setEditable(false);
        add(tf1);
        
        tf3=new JTextField();
        tf3.setBounds(420,100,270,50);
        tf3.setFont(f1);
        tf3.setEditable(false);
        add(tf3);

        // Buttons work
        b1=new JButton("7");
        b1.setBounds(100,200,110,70);
        b1.setFont(f2);
        add(b1);
        
        b2=new JButton("8");
        b2.setBounds(220,200,110,70);
        b2.setFont(f2);
        add(b2);
        
        b3=new JButton("9");
        b3.setBounds(340,200,110,70);
        b3.setFont(f2);
        add(b3);
        
        b4=new JButton("Back");
        b4.setBounds(460,200,110,70);
        b4.setFont(new Font("Arial", Font.BOLD, 24));
        add(b4);
        
        b5=new JButton("%");
        b5.setBounds(580,200,110,70);
        b5.setFont(f2);
        add(b5);
        
        b6=new JButton("4");
        b6.setBounds(100,280,110,70);
        b6.setFont(f2);
        add(b6);
        
        b7=new JButton("5");
        b7.setBounds(220,280,110,70);
        b7.setFont(f2);
        add(b7);
        
        b8=new JButton("6");
        b8.setBounds(340,280,110,70);
        b8.setFont(f2);
        add(b8);
        
        b9=new JButton("/");
        b9.setBounds(460,280,110,70);
        b9.setFont(f2);
        add(b9);
        
        b10=new JButton("*");
        b10.setBounds(580,280,110,70);
        b10.setFont(f2);
        add(b10);

        b11=new JButton("1");
        b11.setBounds(100,360,110,70);
        b11.setFont(f2);
        add(b11);
        
        b12=new JButton("2");
        b12.setBounds(220,360,110,70);
        b12.setFont(f2);
        add(b12);
        
        b13=new JButton("3");
        b13.setBounds(340,360,110,70);
        b13.setFont(f2);
        add(b13);
        
        b14=new JButton("+");
        b14.setBounds(460,360,110,70);
        b14.setFont(f2);
        add(b14);
        
        b15=new JButton("-");
        b15.setBounds(580,360,110,70);
        b15.setFont(f2);
        add(b15);
        
        b16=new JButton("+/-");
        b16.setBounds(100,440,110,70);
        b16.setFont(f2);
        add(b16);

        b17=new JButton("0");
        b17.setBounds(220,440,110,70);
        b17.setFont(f2);
        add(b17);

        b18=new JButton(".");
        b18.setBounds(340,440,110,70);
        b18.setFont(f2);
        add(b18);

        b19=new JButton("=");
        b19.setBounds(460,440,110,70);
        b19.setFont(f2);
        add(b19);
        
        b20=new JButton("C");
        b20.setBounds(580,440,110,70);
        b20.setFont(f2);
        add(b20);

        //Action add to button
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);


        //Frame work
        add(p1);
        setTitle("Calculator");
        setLayout(null);
        setBounds(30,40,800,650);

    }
    public void actionPerformed(java.awt.event.ActionEvent e){
        int x=pb.getValue();
        if(x==100){
            w.dispose();
            Buttons.this.setVisible(true);
        }
        else{
            pb.setValue(x+5);
        }
        String s,d;
        try{
                if(e.getSource()==b11){
                    s=tf1.getText();
                    d=s+"1";
                    tf1.setText(d);
                }  
                if(e.getSource()==b12){
                    s=tf1.getText();
                    d=s+"2";
                    tf1.setText(d);
                }
                if(e.getSource()==b13){
                    s=tf1.getText();
                    d=s+"3";
                    tf1.setText(d);
                }  
                if(e.getSource()==b6){
                    s=tf1.getText();
                    d=s+"4";
                    tf1.setText(d);
                }
                if(e.getSource()==b7){
                    s=tf1.getText();
                    d=s+"5";
                    tf1.setText(d);
                }  
                if(e.getSource()==b8){
                    s=tf1.getText();
                    d=s+"6";
                    tf1.setText(d);
                }
                if(e.getSource()==b1){
                    s=tf1.getText();
                    d=s+"7";
                    tf1.setText(d);
                }  
                if(e.getSource()==b2){
                    s=tf1.getText();
                    d=s+"8";
                    tf1.setText(d);
                }
                if(e.getSource()==b3){
                    s=tf1.getText();
                    d=s+"9";
                    tf1.setText(d);
                }  
                if(e.getSource()==b17){
                    s=tf1.getText();
                    d=s+"0";
                    tf1.setText(d);
                }
                if(e.getSource()==b16){
                    s=tf1.getText();
                    d="-"+s;
                    tf1.setText(d);
                }
                if(e.getSource()==b18){
                    s=tf1.getText();
                    d=s+".";
                    tf1.setText(d);
                }
        }
        catch(Exception ex11){
            tf3.setText("Type something");
        }
        if(e.getSource()==b4){
            try{
                s=tf1.getText();
                d=s.substring(0,s.length()-1);
                tf1.setText(d);
            }
            catch(Exception ex){
                l2.setText("Error");
            }
        }
        if(e.getSource()==b14){
            try{
                num1=Double.parseDouble(tf1.getText());
                l1.setText("Enter Second Value");
                l3.setText("+");
            }
            catch(NumberFormatException ex1){
                tf1.setText("Invailid");
                return;
            }
            d="";
            tf1.setText(d);
            check=1;
        }
        if(e.getSource()==b15){
            try{
                num1=Double.parseDouble(tf1.getText());
                l1.setText("Enter Second Value");
                l3.setText("-");
            }
            catch(NumberFormatException ex1){
                tf1.setText("Invailid");
                return;
            }
            d="";
            tf1.setText(d);
            check=2;
        }
        if(e.getSource()==b9){
            try{
                num1=Double.parseDouble(tf1.getText());
                l1.setText("Enter Second Value");
                l3.setText("/");
            }
            catch(NumberFormatException ex1){
                tf1.setText("Invailid");
                return;
            }
            d="";
            tf1.setText(d);
            check=3;
        }
        if(e.getSource()==b10){
            try{
                num1=Double.parseDouble(tf1.getText());
                l1.setText("Enter Second Value");
                l3.setText("*");
            }
            catch(NumberFormatException ex1){
                tf1.setText("Invailid");
                return;
            }
            d="";
            tf1.setText(d);
            check=4;
        }
        if(e.getSource()==b5){
            try{
                num1=Double.parseDouble(tf1.getText());
                l1.setText("Enter Second Value");
                l3.setText("%");
            }
            catch(NumberFormatException ex1){
                tf1.setText("Invailid");
                return;
            }
            d="";
            tf1.setText(d);
            check=5;
        }
        if(e.getSource()==b19){
            try{
                num2=Double.parseDouble(tf1.getText());
                l4.setText("=");
            }
            catch(Exception ex2){
                tf1.setText("Enter any Num. First");
                return;
            }
            if(check==1){
                num3=num1+num2;
            }
            if(check==2){
                num3=num1-num2;
            }
            if(check==3){
                num3=num1/num2;
            }
            if(check==4){
                num3=num1*num2;
            }
            if(check==5){
                num3=num1%num2;
            }
            tf3.setText(String.valueOf(num3));
        }
        if(e.getSource()==b20){
            num1=0;
            num2=0;
            num3=0;
            check=0;
            d="";
            tf1.setText(d);
            tf3.setText(d);
            l1.setText("Enter First Value ");
            l3.setText(" ");
            l4.setText(" ");
        }
    }
    private void displayWelcomeScreen(){
        w=new JWindow(this);
        w.setBounds(600,100,500,350);
        w.setVisible(true);
        JPanel pn=new JPanel();
        pn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        w.add(pn);

        l=new JLabel("Please Wait...");
        l.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,40));
        pn.add(l);
        
        pb=new JProgressBar(0,100);
        w.add(BorderLayout.PAGE_END,pb);
        w.revalidate();
        //w.add(pb);
        t=new Timer(50,this);
        t.start();
    }
}
public class front1{
    public static void main(String[] args) {
        Buttons b=new Buttons();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}