package week1.day1.assignments;

public class Prime {

	public static void main(String[] args) {
	int num=13;
	boolean flag=false;
	for(int iter=2;iter<=(num/2);iter++){
		if (num%iter == 0) {
		   flag=true;
		   break;
		   	}
	}
if (flag==true) {
	System.out.println("number is not prime");
}
else
{
	System.out.println("number is prime");
}
	}
}


