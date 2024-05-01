package week1.homeassignment;

public class FibonacciSeries {
	public static void main(String[] args) {
	int range=8;
	int a=0,b=1;
	System.out.println(a);
	System.out.println(b);
	for (int i=2;i<range;i++) {
		int c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	}
	}

}
