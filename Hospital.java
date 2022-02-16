package hospital;
import java.util.Scanner;

public class Hospital {
	public static void main(String[] args) {
		 Scanner object = new Scanner(System.in);
		 int choice; int t=1;
		 System.out.println("---------------------------------------------------------");
		 System.out.println("     --->>WELCOME TO SREE HOSPITAL MANAGEMENT --->>      ");
		 System.out.println("---------------------------------------------------------");
		 do {
		 System.out.println("---------CHOOSE YOUR SPECIFIC OPERATION--------");
		 System.out.println("1.) TO ACCESS THE PATIENT ZONE-------");
		 System.out.println("2.) TO ACCESS THE STAFF ZONE-------");
		 System.out.println("3.) CHECK FACILITIES------------");
		 System.out.println("4.) BOOK AMBULANCE-------------");
		 choice = object.nextInt();
		 switch (choice)
		 { 
		 case 1:
			 Details d1 = new 

Details("GAYATHRI",25,10001,"FEVER","DR.KALAI",5258.32,"11-FEB-2022");
 Details d2 = new
 Details("RAGUL",30,10020,"ACCIDENT","DR.VIJAYAKUMAR",20500.95,"14-FEB-2022");
 d1.display();
 d2.display();
 break;
 case 2:
 takedetails t1 = new takedetails("MR.VIJAYAKUMAR",45,"MALE",12345,"MBBS,MD", + 70000.20,"PRESENT");
 takedetails t2 = new
takedetails("MRS.KALAI",38,"FEMALE",12349,"MBBS",55000.20,"PRESENT");
 t1.StaffDetailsDisplay();
 t2.StaffDetailsDisplay();
 break;
 case 3:
 Facility f1 = new Facility("TRANSPORT",2000.00);
 f1.display();
 
 Facility f2 = new Facility("CANTEEN",1000.00);
 f2.display();
 
 Facility f3 = new Facility("LABORATORY",3000.00);
 f3.display();
 break;
 case 4:
 AmblenceBooking a1 = new AmblenceBooking();
 a1.TakeDetails();
 a1.PrintDetails();
 break; 
 default:
	 System.out.println("------BYE-----");
	 }
	 System.out.println("-----DO YOU WANT TO CONTINUE PRESS 1 FOR YES ANDOTHER KEY FOR NO------");
	 t = object.nextInt();
	 } while (t==1);
	 }
	} 

