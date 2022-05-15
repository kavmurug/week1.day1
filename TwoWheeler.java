package week1.day1;

public class TwoWheeler {
	int noOfWheels=4;
	short noOfMirrors=3;
	long chasisNumber=5678935l;
	boolean isPunctured=false;
	String bikeName="Honda";
	double runningKM=45.896;
	
public static void main(String[] args) {
	TwoWheeler wheel=new TwoWheeler();
	System.out.println(wheel.noOfWheels);
	System.out.println(wheel.noOfMirrors);
	System.out.println(wheel.chasisNumber);
	System.out.println(wheel.isPunctured);
	System.out.println(wheel.bikeName);
	System.out.println(wheel.runningKM);

	}

}
