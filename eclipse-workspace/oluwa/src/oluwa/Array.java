package oluwa;

public class Array {
	public static void main(String[] args) {
		int a[]=new int[5];
		String s[]=new String[3];
		s[0]="Oluwadamilola";
		s[1]="you will";
		s[2]="make it";
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		for(int i=0;i<=4;i++) {
			System.out.println(s[0]+" "+s[1]+" "+s[2]);
		}
		int array[]= {20,40,60,80,70};
		int sum=0;
		for (int i:array) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println(sum);
	}

}
