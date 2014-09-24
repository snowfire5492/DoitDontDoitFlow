package doit_dontdoit_flowchart;

/**
 *Lab:"Do it/Dont Do it" Flowchart
 *
 *@author Eric Schenck
 * 
 *09 - 24 - 2012
 *
 *
 *Problem Statement:Write a program that simulates the "Do it"/"Don't do it"
 *Flowchart.
 *
 *
 *Plan:
 *1.import JOptionPane to use for input and output
 *2.begin with the message "start"
 *3.ask the user to input yes or no "Do i want to do this?"
 *4.using a if/else statement, if the user selects no print a message
 *saying "Dont do it", if the user selects yes, then ask another question.
 *5.ask the user "will it likely end in disaster?"
 *6. using a if/else statement, if the user selects no print a message saying 
 *"Do it", if the user selcts yes then ask another question.
 *7. ask the user "Will it make a good story anyway?"
 *8. using a if/else statement, if the user selects no print a message saying 
 *"Don't do it", if the user selects yes then print a message saying "Do it"
 *9. End with a message saying goodbye
 *
 *
 *
 */
import javax.swing.JOptionPane;

public class DoIt_DontDoIt_FlowChart {
    
    public static final String DOIT = "Do it";
    public static final String DONT = "Don't do it";
    
    
    public static void main(String[] args) {
    
    JOptionPane.showMessageDialog(null, "Start");
    
    String firstInput = JOptionPane.showInputDialog(null, "Do i want to "
     + "do this?");
     
    if(firstInput.equalsIgnoreCase("yes"))
    {
     String secondInput = JOptionPane.showInputDialog(null, "Will it "
       + "likely end in disaster?");
     
     if(secondInput.equalsIgnoreCase("yes"))
     {
      String thirdInput = JOptionPane.showInputDialog(null, "Will it "
       + "make a good story anyway?");
      
      if(thirdInput.equalsIgnoreCase("yes"))
      {
       JOptionPane.showMessageDialog(null, DOIT);
      }
      else
      {
       JOptionPane.showMessageDialog(null, DONT);
      }
     }
     else
     {
      JOptionPane.showMessageDialog(null, DOIT);
     }
      
    }
    else
    {
        JOptionPane.showMessageDialog(null, DONT);
    }
    
    
    
    }// end of main
}//end of class DoIt_DontDoIt_FlowChart
