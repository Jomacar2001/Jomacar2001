package midtermActivitiies;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
class Activity_6 {
	public static void main(String[] args) {
		double tax;
		DecimalFormat df=new DecimalFormat ("#.00");
		String filingStatus = JOptionPane.showInputDialog("[0] = Single Filer \n[1] = Married Jointly \n[2] = Married Separately \n[3] = Head of Household\nEnter filing status: ");
		String taxableIncome = JOptionPane.showInputDialog("Enter Taxable Income : ");
		Double TI = Double.valueOf(taxableIncome);
		Double SF10 = 600.00,SF15 = 3292.50,SF27 = 10732.50,SF30 = 22065.00,SF35 = 58030.00;
		Double MJ10 = 1200.00,MJ15 = 6105.00,MJ27 = 22923.00,MJ30 = 31275.00,MJ35 = 58030.00;
		Double MS10 = 600.00,MS15 = 2602.50,MS27 = 7688.25,MS30 = 5482.50,MS35 = 4296.25;
		Double HH10 = 1000.00,HH15 = 4717.50,HH27 = 18562.50,HH30 = 26670.00,HH35 = 58030.00;
		if(Integer.valueOf(filingStatus) == 0) {
			if(TI <= 6000) {
				tax = TI * 0.10;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 27950) {
				tax = ((TI - 6000) * 0.15)+SF10 ;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 67700) {
				tax = ((TI-27950) * 0.27)+ SF10 + SF15;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 141250) {
				tax = ((TI-67700) * 0.30)+ SF10 + SF15 + SF27;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 307050) {
				tax = ((TI-141250) * 0.35)+ SF10 + SF15 + SF27 + SF30;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI > 307050) {
				tax = ((TI-307050) * 0.386)+ SF10 + SF15 + SF27 + SF30 + SF35;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			}
		else if(Integer.valueOf(filingStatus) == 1) {
			if(TI <= 12000) {
				tax = TI * 0.10;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			
			else if (TI <= 46700) {
				tax = ((TI - 6000) * 0.15)+ MJ10;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 112850) {
				tax = ((TI-27950) * 0.27)+ MJ10 + MJ15;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 171950) {
				tax = ((TI-67700) * 0.30)+ MJ10 + MJ15 + MJ27;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 307050) {
				tax = ((TI-141250) * 0.35)+ MJ10 + MJ15 + MJ27 + MJ30;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI > 307050) {
				tax = ((TI-307050) * 0.386)+ MJ10 + MJ15 + MJ27 + MJ30 +MJ35;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
		}
		else if(Integer.valueOf(filingStatus) == 2) {
			if(TI <= 6000) {
				tax = TI * 0.10;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 23350) {
				tax = ((TI - 6000) * 0.15)+MS10 ;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 56425) {
				tax = ((TI-27950) * 0.27)+ MS10 + MS15;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 85975) {
				tax = ((TI-67700) * 0.30)+ MS10 + MS15 + MS27;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 153525) {
				tax = ((TI-141250) * 0.35)+ MS10 + MS15 + MS27 + MS30;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI > 153525) {
				tax = ((TI-307050) * 0.386)+ MS10 + MS15 + MS27 + MS30 + MS35;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
		}
		else if(Integer.valueOf(filingStatus) == 3) {
			if(TI <= 10000) {
				tax = TI * 0.10;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 37450) {
				tax = ((TI - 6000) * 0.15)+ HH10 ;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 96700) {
				tax = ((TI-27950) * 0.27)+ HH10 + HH15;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 156600) {
				tax = ((TI-67700) * 0.30)+ HH10 + HH15 + HH27;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI <= 307050) {
				tax = ((TI-141250) * 0.35)+ HH10 + HH15 + HH27 + HH30;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
			else if (TI > 307050) {
				tax = ((TI-307050) * 0.386)+ HH10 + HH15 + HH27 + HH30 + HH35;
				JOptionPane.showMessageDialog(null, "Tax is " + df.format(tax));
			}
		}
		
	}
}
