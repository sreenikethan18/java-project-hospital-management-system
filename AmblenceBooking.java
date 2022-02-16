package hospital;
import java.util.Scanner;

public class AmblenceBooking {
	Scanner input = new Scanner(System.in);
	 String Name ;
	 long PhoneNumber;
	 int count = 1;
	 public void TakeDetails()
	 {
	 System.out.println("ENTER YOUR FULL NAME------");
	 Name = input.nextLine();
	 System.out.println("ENTER YOUR MOBILE NUMBER-------");
	 PhoneNumber = input.nextLong();
	 System.out.println("----BOOKING SUCCESSFUL-----"+count++);
	 }
	 public void PrintDetails()
	 {
	 System.out.println("------DETAILS ARE-------");
	 System.out.println("FULL NAME IS-------"+Name);
	 System.out.println("MOBILE NUMBER IS---------"+PhoneNumber);
	 System.out.println("------THANKS-------");
	 }
	} 



