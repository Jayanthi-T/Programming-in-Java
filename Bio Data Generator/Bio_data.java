import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.io.*;

public class Bio_data extends JFrame {

 JFrame f;
 JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
 JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,td,t11,t12,t13;
 JButton b1,b2,b3;
 JRadioButton rb1,rb2;
 ButtonGroup bg1;
 JCheckBox ch1,ch2,ch3;

 TableColumn sc,tc;
 DefaultTableModel model,dtm; 

 public Bio_data() {
  f=new JFrame("BIODATA");
  l=new JLabel("BioData");
  l.setFont(new Font("Algerian",Font.BOLD,40));
  l1=new JLabel("Name                             :-");
  l2=new JLabel("Address                         :-");
  l3=new JLabel("Contact Number            :-");
  l4=new JLabel("E-Mail Address              :-");
  l5=new JLabel("Date OF Birth	                :-");
  l7=new JLabel("Gender                           :-");
  l8=new JLabel("Nationality                      :-");
  l9=new JLabel("Known Language           :-");
  l10=new JLabel("Qualification                  :-");
  t1=new JTextField(20);
  t2=new JTextField(20);
  t3=new JTextField(20);
  t4=new JTextField(20);
  t5=new JTextField(20);
  rb1=new JRadioButton("Male");
  rb2=new JRadioButton("Female");
  bg1=new ButtonGroup();
  bg1.add(rb1);
  bg1.add(rb2);
  t6=new JTextField(20);
  ch1=new JCheckBox("Tamil");
  ch2=new JCheckBox("English");
  ch3=new JCheckBox("others");
  t7=new JTextField(20);
  t8= new JTextField(20);
  b3=new JButton("Upload Image");
  b1=new JButton("Submit");
  b2=new JButton("Cancel");
  JPanel p=new JPanel();
  p.setLayout(null);

  l.setBounds(200,30,200,50);
  l1.setBounds(80,80,150,30);
  l2.setBounds(80,130,150,30);
  l3.setBounds(80,180,150,30);
  l4.setBounds(80,220,150,30);
  l5.setBounds(80,260,150,30);
  l7.setBounds(80,300,150,30);
  l8.setBounds(80,340,150,30);
  l9.setBounds(80,380,150,30);
  l10.setBounds(80,420,150,30);

  t1.setBounds(250,80,200,25);
  t2.setBounds(250,130,200,25);
  t3.setBounds(250,180,200,25);
  t4.setBounds(250,220,200,25);
  t5.setBounds(250,260,200,25);
  rb1.setBounds(250,300,100,25);
  rb2.setBounds(350,300,200,25);
  t6.setBounds(250,340,200,25);
  ch1.setBounds(250,380,80,20);
  ch2.setBounds(330,380,60,20);
  ch3.setBounds(400,380,80,20);
  t7.setBounds(250,420,200,25);
   t8.setBounds(500,380,150,30);
  b3.setBounds(350,460,150,30);
  b1.setBounds(200,500,100,30);
  b2.setBounds(350,500,100,30);
  
  p.add(l);
  p.add(l1);p.add(l2);
  p.add(l3);p.add(l4);
  p.add(l5);
  p.add(l7);p.add(l8);
  p.add(l9);p.add(l10);
p.add(t1);p.add(t2);
 p.add(t3);
  p.add(t4);p.add(t5);
p.add(rb1);
  p.add(rb2);p.add(t6);
  p.add(ch1);p.add(ch2);
  p.add(ch3);p.add(t7);p.add(t8);

  p.add(b1);p.add(b2);p.add(b3);

  f.add(p,BorderLayout.CENTER);
  f.add(p);
  
  f.setSize(650,780);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  

   b1.addActionListener(new ActionListener()
 {

              public void actionPerformed(ActionEvent e)
   { 
           String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11="";
               s1 = t1.getText();        
               s2 = t2.getText();
               s3 = t3.getText();
               s4 = t4.getText();
               s5 = t5.getText();
               s6 = t6.getText();
               s7 = t7.getText();
               s10= (rb1.isSelected())?rb1.getText():rb2.getText();
              
              if(ch1.isSelected())
                 s11 = s11+ch1.getText();
              if(ch2.isSelected())
                 s11 = s11+ch2.getText();
              if(ch3.isSelected())
                 s11 = s11+ch3.getText();    
              if(e.getSource() == b1){
                 try {
                   FileWriter w = new FileWriter("file.txt",true);
                   w.write("Name:		"+" "+s1 + "\n");
                   w.write("Address:		" +" "+s2 + "\n");
                   w.write("Contact number:	" +" "+s3 + "\n");
                   w.write("Email Address:	" +" "+s4 + "\n");
                   w.write("Date of Birth:	" +" "+s5 + "\n");
                   w.write("Gender:		"+" "+s10 + "\n");
                   w.write("Nationality:	"+" "+s6 + "\n");
                   w.write("known language:	"+" "+s11 + "\n");
                   w.write("Qualification:	"+" "+s7 + "\n");
                   w.close();
                }
                 catch( Exception ae) 
                  {
                      System.out.println(ae);
                  }
             }
              JOptionPane.showMessageDialog(null, "Data added Successfully ");

              }
        });

  }
  public static void main(String args[]){
   Bio_data b=new Bio_data(); 
 }
}


