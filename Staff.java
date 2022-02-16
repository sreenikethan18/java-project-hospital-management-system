package hospital;

public class Staff {
	String name; int age; String gender; int id; String designation; double
	 salary; String attendence ;
	 public static int StaffCount = 1 ;
	}
	class takedetails extends Staff{
	 public takedetails( String name, int age, String gender, int id, String
	 designation, double salary, String attendence)
	 {
	 this.name=name; this.age=age; this.gender=gender; this.id=id;
	 this.designation=designation; this.salary=salary;
	 this.attendence=attendence;
	 }
	 public void StaffDetailsDisplay()
	 {
	 System.out.println("------------------------------------------------------------");
	 System.out.println("-------->>GIVEN DETAILS ARE SHOWN BELOW--------->>");
	 System.out.println(" STAFF NAME------"+name);
	 System.out.println(" STAFF AGE------------"+age);
	 System.out.println(" STAFF GENDER----------"+gender);
	 System.out.println(" STAFF ID---------------"+id);
	 System.out.println("STAFF DESIGNATION----------"+designation);
	 System.out.println("STAFF SALARY ------------------"+salary);
	 System.out.println("CURRENT STAFF ATTENDANCE---------"+attendence);
	 System.out.println("TOTAL COUNT OF STAFF -------------------"+StaffCount++);
	 System.out.println("----------->>THANK YOU------------->>");
	 System.out.println("------------------------------------------------------------");
	 } 

}
