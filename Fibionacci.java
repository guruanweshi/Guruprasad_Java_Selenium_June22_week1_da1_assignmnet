package week1.day1.assignments;

public class Fibionacci {

	public static void main(String[] args) {
int a=0;int b=1;int sum;
System.out.println(a);
for (int i=0; i<10;i++) {
	sum=a+b;
	System.out.println(sum);
	b=a;
	a=sum;
}

	}

}
