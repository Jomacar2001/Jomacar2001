package midterm_activities;
import javax.swing.JOptionPane;
public class Activity_3 {

	public static void main(String[] args) {
	int number = 18;
	JOptionPane.showMessageDialog(null,
			"Is " + number + 
			"\n devisible by 2 and 3? " + 
			(number % 2 == 0 && number % 3 == 0)
			+ "\n divisible by 2 or 3? " + 
			(number % 2 == 0 || number % 3 == 0) +
			"\n divisible by 2 or 3, but not both?  " 
			+ (number % 2 == 0 ^ number % 3 == 0)); 
	}
}
