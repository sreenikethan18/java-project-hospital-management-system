package hospital;

public class Facility {
	String fname;
	 double charges;
	 public Facility(String fname, double charges) {
	 this.fname = fname;
	 this.charges = charges;
	 }
	 public void display() {
	 System.out.println("-------------------------------");
	 System.out.println("Name of facility    "   + fname);
	 System.out.println("Charges available------" + charges);
	 System.out.println("-------------------------------");
	 }
	}

