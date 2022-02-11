package assignment2;

public class Patient {
	String name;
	double height;
	double weight;
	Patient(String name,double h,double w) {
		name=name;
		height=h;weight=w;
	}
	double bmi() {
		return(weight/(height*height)*703);
	}
	
	public static void main(String args[]) {
		Patient p=new Patient("Sowmika",40,30);
		System.out.println("BMI:"+p.bmi());
	}

}
