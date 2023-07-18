
package bank.management.system;


import javax.swing.*;
import java.util.*;
import java.awt.*;

import java.awt.event.*;
import java.sql.*;


public class SignupTwo extends JFrame implements ActionListener {
    
    
    JTextField aadharTextField,panTextField;
    JButton next;
    JRadioButton syes,sno,other,eyes,eno;
    JComboBox Religion,Category,Income,educations,occupations;
    String formno;
    
    SignupTwo( String formno){
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM :PAGE 2" );
        
        
       
        
        JLabel additionalDetails=new JLabel("Page 2:Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion=new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,22));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        Religion=new JComboBox(valReligion);
        Religion.setBackground(Color.LIGHT_GRAY);
        Religion.setBounds(300,140,400,30);
        add(Religion);
        
        
        
        
        JLabel category=new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,22));
        category.setBounds(100,190,200,30);
        add(category);
        
        
        String valCategory[]={"General","OBC","SC","ST","Other"};
         Category=new JComboBox(valCategory);
        Category.setBackground(Color.LIGHT_GRAY);
        Category.setBounds(300,190,400,30);
        add(Category);
        
        
        
        
        
        JLabel income=new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,22));
        income.setBounds(100,240,200,30);
        add(income);
        
        
        String incomeCategory[]={"Null","<15,00,00","<25,00,00","<50,00,00","upto 10,00,000"};
        Income=new JComboBox(incomeCategory);
        Income.setBackground(Color.LIGHT_GRAY);
        Income.setBounds(300,240,400,30);
        add(Income);
    
    
    
       
        
        
        
        
        JLabel education=new JLabel("Educational");
        education.setFont(new Font("Raleway",Font.BOLD,22));
        education.setBounds(100,290,200,30);
        add(education);
        
        
        
        
        
        JLabel qualification=new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,22));
        qualification.setBounds(100,310,200,30);
        add(qualification);
        
        
         String educationvalues[]={"Non-Graduate","Graduate","Post Graduate","<Doctorate","other"};
        educations=new JComboBox(educationvalues);
        educations.setBackground(Color.LIGHT_GRAY);
        educations.setBounds(300,315,400,30);
        add(educations);
    
    
        
        
        
        JLabel occupation=new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,22));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
        String occupationvalues[]={"Salaried","Employed","Student","Retired","others"};
         occupations=new JComboBox(occupationvalues);
        occupations.setBackground(Color.LIGHT_GRAY);
        occupations.setBounds(300,390,400,30);
        add(occupations);
    
        
        
        
        
        
        
        
        JLabel panno=new JLabel("PAN Number:");
        panno.setFont(new Font("Raleway",Font.BOLD,22));
        panno.setBounds(100,440,200,30);
        add(panno);
        
        panTextField=new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        panTextField.setBackground(Color.LIGHT_GRAY);
        add(panTextField);
        
        JLabel aadharno=new JLabel("Aadhar Number:");
        aadharno.setFont(new Font("Raleway",Font.BOLD,22));
        aadharno.setBounds(100,490,200,30);
        
        add(aadharno);
        
        aadharTextField=new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,490,400,30);
        aadharTextField.setBackground(Color.LIGHT_GRAY);
        add(aadharTextField);
        
        JLabel senior=new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway",Font.BOLD,22));
        senior.setBounds(100,540,200,30);
        add(senior);
        
        
        
         syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.LIGHT_GRAY);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.LIGHT_GRAY);
        add(sno);
        
        
        
         ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
        JLabel existing=new JLabel("Existing Account:");
        existing.setFont(new Font("Raleway",Font.BOLD,22));
        existing.setBounds(100,590,200,30);
        add(existing);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.LIGHT_GRAY);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.LIGHT_GRAY);
        add(eno);
        
        
        
         ButtonGroup emaritalgroup=new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
        
        
        
        
        
        
        
        JButton next=new JButton("Next");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(620,660,80,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        
        
        
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(800,850);
        setLocation(350,10);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        String sreligion=(String) Religion.getSelectedItem();
        
        String scategory=(String) Category.getSelectedItem();
        String sincome=(String) Income.getSelectedItem();
        
        String seducation=(String)educations.getSelectedItem();
        
        String soccupation=(String) occupations.getSelectedItem();
        
        
        
                String seniorcitizen=null;
                if(syes.isSelected()){
                    seniorcitizen="Yes";
                    
                }
                else if(sno.isSelected()){
                    seniorcitizen="No";
                }
                
                String existingaccount=null;
                if(eyes.isSelected()){
                    existingaccount="Yes";
                    
                }
                else if(eno.isSelected()){
                    existingaccount="No";
                }
                
                String span=panTextField.getText();
                String saadhar=aadharTextField.getText();
                
                
                try{
                    
                        Conn c=new Conn();
                        String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                        c.s.executeUpdate(query);
                    
                    
                //Signup3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
    }
                catch(Exception e){
                    System.out.println(e);
                }
                
                
        
    }
    public static void main(String args[]){
        new SignupTwo("");
        
    }
    
}


