package edu.elon.template.applet;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("deprecation")
public class CalculatorApplet extends JApplet {

  private static final long serialVersionUID = 1L;
  
  private Container container;
  private JTextField result;
  private JPanel panel;
  private JButton button;
  
  private Double storedNum;
  private String op;
  private boolean newNumber = true;
  private boolean hasDecimal = false;

  public void init() {
    container = getContentPane();
    
    drawTextField();
    drawButtons();
  }
  
  private void drawTextField() {
   result = new JTextField("0");
   container.add(result, BorderLayout.NORTH);
  }
  
  private void drawButtons() {
    panel = new JPanel();
    panel.setLayout(new GridLayout(4,4));
    
    String[] buttons = {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
    for (String b : buttons) {
      button = new JButton(b);
      button.addActionListener(e -> handleButton(b));
      panel.add(button);
    }
    container.add(panel, BorderLayout.CENTER);
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
      if (s.equals(".")) {
        if (!hasDecimal) {
          if (newNumber) {
            result.setText("0");
            newNumber = false;
          }
          result.setText(result.getText() + ".");
          hasDecimal = true;
        }
      } else {
        if (storedNum == null) {
          storedNum = Double.parseDouble(result.getText());
        }
        if (op != null) {
          storedNum = operate(Double.parseDouble(result.getText()));          
          result.setText(storedNum.toString());
        } 
        op = s;
        
        hasDecimal = false;
        newNumber = true;
      }
    }
  }
  
  public Double operate(Double currentNum) {
    System.out.println("Performing operation: " + storedNum + " " + op + " " + currentNum);
    switch (op) {
    case "+":
      return storedNum + currentNum;
    case "-":
      return storedNum - currentNum;
    case "*":
      return storedNum * currentNum;
    case "/":
      return storedNum / currentNum;
    }
    return currentNum;
  }
  
}
