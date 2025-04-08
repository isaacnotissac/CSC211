package module6;

import java.awt.*;
import java.awt.event.*;

public class EmployeeInfoForm extends Frame{
	

	public EmployeeInfoForm() {
		Frame f = new Frame();
		Button b = new Button("Submit");
		TextField tF1 = new TextField();
		TextField tF2 = new TextField();
		TextField tF3 = new TextField();
		Label label1 = new Label("Name:");
		Label label2 = new Label("Employee ID:");
		Label label3 = new Label("Department:");
		
		
		f.setLayout(null);
		f.setTitle("Employee Information");
		f.setSize(800,600);
		f.setVisible(true);
		
		label1.setBounds(120,120,100,50);
		tF1.setBounds(150, 150, 80, 30);
		
		label2.setBounds(120,220,100,50);
		tF2.setBounds(150, 250, 80, 30);
		
		label3.setBounds(120,320,100,50);
		tF3.setBounds(150, 350, 80, 30);
		
		b.setBounds(280,210, 50, 30);
		
		f.add(tF1);
		f.add(tF2);
		f.add(tF3);
		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(b);
		
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text1 = tF1.getText();
				String text2 = tF2.getText();
				String text3 = tF3.getText();
				String textRes = "Name: "+text1+", Employee Id: "+text2+" Department: "+text3;
				Label text = new Label(textRes);
				text.setBounds(220, 400, 250, 30);
				f.add(text);
				
			}
		});
		
		
		f.addWindowListener(new WindowAdapter(){
	    	  public void windowClosing(WindowEvent we) {
	    		  System.exit(0);
	    	  }
	      });
		
	}

	public static void main(String[] args) {
		EmployeeInfoForm infoForm = new EmployeeInfoForm();
		System.out.println("one");
	}
}