package midterm_activities;
import java.util.Scanner;
public class Activity_2 {
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter minutes : ");
		String entered_minutes=input.nextLine();
		int days = Integer.valueOf(entered_minutes) / 1440;
		System.out.println("Day/s : " + days);
		int hours = Integer.valueOf(entered_minutes) % 1440 / 60 ;
		System.out.println("Hour/s : " + hours);
		int minutes = Integer.valueOf(entered_minutes) % 60;
		System.out.println("Minute/s: " + minutes);
		}
}
