/*
Jemma Tiongson
#16301
Application: Utilities
Purpose: Demonstrating proper usage of Java Classes and Packages - String, Scanner, JOptionPane, Math
 */

//packages are imported before class - here on top
import javax.swing.JOptionPane;
import java.util.Scanner;
class Utilities{
   public static void main (String [] args){

   // String Class Section: used .length, .concat, .toUpperCase String Functions
   JOptionPane pane = new JOptionPane();
   String str = "\"Hi my name is ";
   int strLength = str.length();

   String str2 = "Jemma.\"";
   int str2Length = str2.length();
   String combined = str.concat(str2);
   String upperCase = combined.toUpperCase();

   JOptionPane.showMessageDialog(null, "The length of str is " +strLength+ ". And the length of str2 is " +str2Length);
   JOptionPane.showMessageDialog(null, "str and str2 uppercased and concatinated is " +upperCase);

   //Math Class Section: used Math.sqrt(), Math.pow(), Math.abs() functions
   double root = Math.sqrt(4);
   int newRoot = (int)root;
   double power = Math.pow(2,6);
   int newPower = (int) power;

   int absolute = -24;

   JOptionPane.showMessageDialog(null, "Square root of 4 is " +newRoot+ ". Absolute value of -24 is " +Math.abs(absolute)+ ". And 2 to the power of 6 is " +newPower+ ".");

   //Scanner/Swing/JOption Class Section: used showMessageDialog, showInputDialog, showConfirmDialog. Input types: int, boolean, and string.
   Scanner scan = new Scanner (System.in); //creating Scanner object
      
   int input;// initializing user input storage
   double decimal;
   boolean confirm;
   
   JOptionPane.showInputDialog(null, "Please enter number from 1-10."); //prompting user to enter number. Req #1 - Input (JOption)
      input = Integer.parseInt(scan.nextLine());
      JOptionPane.showConfirmDialog(null, "Is the number you inputted " +input+ "?"); //confirms if input is correct and user can choose yes, no, or cancel Req #2 - Confirm (JOption)
      JOptionPane.showMessageDialog(null, "Your number was " +input); //confirms if input is correct and user can choose yes, no, or cancel | Int Primitive
  
   JOptionPane.showInputDialog(null, "Please enter decimal."); //prompting user to enter decimal, Double Primitive, input answer in terminal also
      decimal = scan.nextDouble();
      JOptionPane.showMessageDialog(null, "Your decimal was " +decimal); //confirms if input is correct and user can choose yes, no, or cancel, input answer in terminal also
   
   JOptionPane.showInputDialog(null, "True or False?"); //prompting user to enter Boolean, Boolean Primitive, input answer in terminal also
      confirm = scan.nextBoolean();
   
   JOptionPane.showInputDialog(null, "Say hello!"); //prompting user to enter string
      JOptionPane.showMessageDialog(null, "Hello to you too!");
   scan.close();
      
   }
}