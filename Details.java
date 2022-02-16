package hospital;

import java.util.Scanner;
import java.util.*;

public class Details {
	String name, disease, dname, date ,gender;
	 int age, registrationid;
	 double fees; public static int count = 1 ;
	 public Details(String name,int age,int registrationid,String disease,String dname,double fees,String date)
	 {
	 this.name = name; this.age=age; this.registrationid=registrationid;
	 this.disease=disease; this.dname=dname;
	 this.fees=fees; this.date=date;
	 }
	 public void display()
	 {
	 System.out.println("------------------------------------------------------------");
	 System.out.println("-------->>GIVEN DETAILS ARE SHOWN BELOW--------->>");
	 System.out.println(" PATIENT NAME--------"+name);
	 System.out.println(" PATIENT AGE--------"+age);
	 System.out.println(" STAFF GENDER----------"+gender);
	 System.out.println("REGISTRATION ID --------"+registrationid);
	 System.out.println("DISEASE TO PATIENT --------"+disease);
	 System.out.println("DOCTOR APPOINT TO PATIENT --------"+dname);
	 System.out.println("TOTAL FEES OF PATIENT --------"+fees);
	 System.out.println("DATE OF ADMISSION --------"+date);
	 System.out.println("TOTAL PATIENT COUNT ------->>"+count++);
	 System.out.println("------>>YOU'RE WELCOME------->>");
	 System.out.println("------------------------------------------------------------");
	 }
	} 


