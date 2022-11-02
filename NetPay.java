package midterm_activities;
import java.text.DecimalFormat;
import java.util.*;
public class Activity_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat ("#.##");
		System.out.print("Enter employee's name : ");
		String name=input.nextLine();
		System.out.print("Enter number of hours worked in a week : ");
		String hours_per_week=input.nextLine();
		System.out.print("Enter hourly pay rate : ");
		String hourly_pay=input.nextLine();
		System.out.print("Enter federal tax withholding rate : ");
		String federal_tax=input.nextLine();
		System.out.print("Enter state tax withholding rate : ");
		String state_tax=input.nextLine();
		System.out.println("Employee name: "+ name + "\n");
		System.out.println("Hours Worked: "+ Float.valueOf(hours_per_week));	
		System.out.println("Pay Rate : $"+ Float.valueOf(hourly_pay));
		float gross_pay = Float.valueOf(hours_per_week) * Float.valueOf(hourly_pay);
		System.out.println("Gross Pay: $"+ gross_pay);
		System.out.println("Deductions:");
		float fw=Float.valueOf(federal_tax) * Float.valueOf(gross_pay);
		System.out.println("\tFederal Withholding (" + Float.valueOf(federal_tax) * 100 +"%): $" + df.format(fw));
		float sw=Float.valueOf(state_tax)*Float.valueOf(gross_pay); 
		System.out.println("\tState Withholding ("+Float.valueOf(state_tax) * 100+"%): $"+df.format(sw));
		float total_deduction = fw + sw;
		System.out.println("\tTotal Deduction: $"+ df.format(total_deduction));
		float net_pay = gross_pay - total_deduction;
		System.out.println("Net Pay: $"+ df.format(net_pay));
	}
}
