package edu.elon.accessories;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * GUI for the calculator, passes operations to the server, displays results
 * @author chayes10
 *
 */
public class CalculatorClient extends JFrame {
  
  private static final long serialVersionUID = 1L;
  
  private JFrame frame;
  private JTextField result;
  private JPanel panel;
  private JButton button;
  
  private Double storedNum;
  private Double currentNum;
  private String op;
  private boolean newNumber = true;
  private boolean hasDecimal = false;
  
  private final String URL = "rmi://localhost/";
  private Calculator calc;
  
  public static void main(String[] args) {
    new CalculatorClient();
  }
  
  
  public CalculatorClient() {
    frame = new JFrame();
    drawGUI();
    
    frame.setTitle("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.pack();
    frame.setVisible(true);
    
    try {
      Context namingContext = new InitialContext();
      calc = (Calculator) namingContext.lookup(URL + "calc");
    } catch (NamingException e) {
      e.printStackTrace();
    }
  }
   
  
   private void drawGUI() {
     // result field
     result = new JTextField("0");
     frame.add(result, BorderLayout.NORTH);
     
     // button grid
     panel = new JPanel();
     panel.setPreferredSize(new Dimension(200,200));
     panel.setLayout(new GridLayout(4,4));
     
     String[] buttons = {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
     for (String b : buttons) {
       button = new JButton(b);
       button.addActionListener(e -> handleButton(b));
       panel.add(button);
     }
     frame.add(panel, BorderLayout.CENTER);
   }
   
   
   public void handleButton(String s) {
     try {
       Integer.parseInt(s);
       if (newNumber) {
         result.setText(s);
         newNumber = false;
       } else {
         result.setText(result.getText() + s);
       }
     } catch (NumberFormatException | NullPointerException e) {
       String lastChar = result.getText().substring(result.getText().length()-1);
       if (s.equals(".") && !lastChar.equals(".") && !hasDecimal) {
         result.setText(result.getText() + ".");
         hasDecimal = true;
       } else {
         if (storedNum == null) {
           storedNum = Double.parseDouble(result.getText());
         }
         if (op != null) {
           currentNum = Double.parseDouble(result.getText());
           storedNum = operate();          
           result.setText(storedNum.toString());
         } 
         op = s;
         
         hasDecimal = false;
         newNumber = true;
       }
     }
   }
   
   
   public Double operate() {
     try {
       return calc.operate(op, storedNum, currentNum);
     } catch (Exception e) {
       e.printStackTrace();
       return null;
     }
   }
}
