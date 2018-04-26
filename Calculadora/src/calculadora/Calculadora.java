package calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/*@author joce */
public class Calculadora extends JFrame implements MouseListener, ActionListener {
    JTextField jtf1;
    double resultado;
    String opc;
    JButton jb7,jb8,jb9,jbDiv;
    JButton jb4,jb5,jb6,jbPor;
    JButton jb1,jb2,jb3,jbMe;
    JButton jb0,jbP,jbMa,jbIg;
    
    public Calculadora(){
        setLayout(new BorderLayout());
        
        Panel cua1 = new Panel(new GridLayout(2,2));
        Panel n1 = new Panel(); 
        Panel n2 =new Panel();
        
        jtf1= new JTextField("0",10); //cajita de texto
        cua1.add(jtf1);
        
        jb7 = new JButton("7");
        jb7.addMouseListener(this);
        n1.add(jb7);
        
        
        jb8 = new JButton("8");
        jb8.addMouseListener(this);
        n1.add(jb8);
        
        
        jb9 = new JButton("9");
        jb9.addMouseListener(this);
        n1.add(jb9);
       
        jbDiv = new JButton("/");
        jbDiv.addMouseListener(this);
        n1.add(jbDiv);
        //-------------------------------
        
        jb4 = new JButton("4");
        jb4.addMouseListener(this);
        n1.add(jb4);
        
        
        jb5 = new JButton("5");
        jb5.addMouseListener(this);
        n1.add(jb5);
        
        
        jb6 = new JButton("6");
        jb6.addMouseListener(this);
        n1.add(jb6);
        
        jbPor = new JButton("*");
        jbPor.addMouseListener(this);
        n1.add(jbPor);
        
        //----------------------------------
        jb1 = new JButton("1");
        jb1.addMouseListener(this);
        n1.add(jb1);
       
        
        jb2 = new JButton("2");
        jb2.addMouseListener(this);
        n1.add(jb2);
        
        
        jb3 = new JButton("3");
        jb3.addMouseListener(this);
        n1.add(jb3);
        
        
        jbMe = new JButton("-");
        jbMe.addMouseListener(this);
        n1.add(jbMe);
        
      
        jb0 = new JButton("0");
        jb0.addMouseListener(this);
        n1.add(jb0);
        
        jbP = new JButton(".");
        jbP.addMouseListener(this);
        n1.add(jbP);
        
        
        jbMa = new JButton("+");
        jbMa.addMouseListener(this);
        n1.add(jbMa);
        
        jbIg = new JButton("=");
        jbIg.addMouseListener(this);
        n1.add(jbIg);
       
        
        
        
        add(cua1,BorderLayout.NORTH);
        add(n1,BorderLayout.CENTER);
        add(n2,BorderLayout.EAST);
        
        setVisible(true);
        setSize(245,245);
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
      
    }
    @Override
    public void mousePressed(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
    @Override
    public void mouseClicked(MouseEvent e){
        
    }
    public void mouseEntered(MouseEvent e){
        
    }
    @Override
    public void mouseExited(MouseEvent e){
       
    }
    
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
    }
     
}
