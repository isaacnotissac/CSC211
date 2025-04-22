package module8;
import javax.swing.JOptionPane;
/**
   This program demonstrates the GradedActivity 
   class.
*/

public class GradeDemo
{
   public static void main(String[] args)
   {
      String input;        // To hold input
      int questions;
      int missed;
      double mps;
      
      // Create a GradedActivity object.
      //GradedActivity grade = new GradedActivity();
      
      // Get a test score.
//      input = JOptionPane.showInputDialog("Enter " +
//                           "a numeric test score.");
//      testScore = Double.parseDouble(input);
      
   // Get a test score.
      input = JOptionPane.showInputDialog("Enter " +
                           "a numeric test score.");
      questions = Integer.parseInt(input);
      
   // Get a test score.
      input = JOptionPane.showInputDialog("Enter " +
                           "a numeric test score.");
      missed = Integer.parseInt(input);
      
      mps = questions*.65;

      PassFailExam exam = new PassFailExam(questions, missed, mps);
      
      // Store the score in the grade object.
      exam.setScore(((questions-missed)/questions));
      
      // Display the letter grade for the score.
      JOptionPane.showMessageDialog(null,
                    "The grade for that test is " +
                    exam.getGrade());

      System.exit(0);
   }
}