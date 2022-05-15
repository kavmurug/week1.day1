package week1.day1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=13;
		int flag=1;
		for(int i=2;i<number;i++) {
			if(number==2)
			System.out.println("Prime number");
			else if(number%i==0)
			{
				flag++;
			}
			}
		if(flag==1)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
}
	
}
