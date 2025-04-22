package module7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Reigister {

	public Reigister() {
		JFrame jF = new JFrame();
		jF.setVisible(true);
		jF.setLayout(null);
		jF.setSize(500, 500);
		jF.setTitle("Registration");
				
		JLabel name = new JLabel("Name: ");
		JLabel email = new JLabel("Email: ");
		JLabel pass = new JLabel("Password: ");
		JLabel cPass = new JLabel("Confirm Password: ");
		
		jF.add(name);
		jF.add(email);
		jF.add(pass);
		jF.add(cPass);
		name.setBounds(25, 10 , 300, 30);
		email.setBounds(25, 90 , 300, 30);
		pass.setBounds(25, 170 , 300, 30);
		cPass.setBounds(25, 250 , 300, 30);
		
		JButton submit = new JButton("Submit");
		JButton clear = new JButton("Clear");
		
		submit.setBounds(100, 370, 100, 40);
		clear.setBounds(300, 370, 100, 40);
		jF.add(submit);
		jF.add(clear);
		
		JTextField nField = new JTextField();
		JTextField eField = new JTextField();
		JTextField pField= new JTextField();
		JTextField cpField = new JTextField();
		JTextField JSpace = new JTextField();
		
		nField.setBounds(10, 50, 300, 30);
		eField.setBounds(10, 130 , 300, 30);
		pField.setBounds(10, 210, 300,  30);
		cpField.setBounds(10, 290 , 300, 30);
		jF.add(nField);
		jF.add(eField);
		jF.add(pField);
		jF.add(cpField);
		
		
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((nField.getText().isEmpty()) || (eField.getText().isEmpty()) || (pField.getText().isEmpty()) || (cpField.getText().isEmpty())) {
					JOptionPane.showMessageDialog(jF, "Registration Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(jF, ("Registration Success\nName: "+nField.getText()+"\nEmail: "+eField.getText()+"\nPassword: "+pField.getText()), "Submition", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nField.setText(null);
				eField.setText(null);
				pField.setText(null);
				cpField.setText(null);
							
			}
		});		
		
		jF.addWindowListener(new WindowAdapter(){
	    	  public void windowClosing(WindowEvent we) {
	    		  System.exit(0);
	    	  }
	      });

	}
	/*
	public static boolean checkText(JTextField j) {
		if (j.getText() == null) {
			return false;
			
			
		}
		else if (!(j.getText() == null)){
			return true;
		}
		else {
			return false;
		}
	}
	*/
	public static void main(String [] args) {
		Reigister r = new Reigister();
	}

}
