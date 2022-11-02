package midterm_activities;
import javax.swing.JOptionPane;
import java.util.*;
import java.text.DecimalFormat;
public class Boolean {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.####");
		final double Pi = 3.1416;
		String radius = JOptionPane.showInputDialog("Enter radius : "); 
		System.out.print(radius);
		try{
			if (Double.valueOf(radius) >= 0 ) {
			double area = (Double.valueOf(radius) * Double.valueOf(radius) * Pi);
			JOptionPane.showMessageDialog(null, "Area = (radius * radius * Pi)" +"\nradius =  " + radius +"\nPi = " + Pi + "\nArea = ("+ radius + " * " + radius+" * " + Pi +")" + 
			"\nThe area for the circle of radius " + radius + " is " + df.format(area));
			}
			else {
			JOptionPane.showMessageDialog(null, "You Entered a Negative Integer, Please Enter Positive Integer Only!");
			}
			}
		catch(Exception string) {
		JOptionPane.showMessageDialog(null, "You Entered a String, Please Enter Positive Integer Only! ");
		}
	}
}
