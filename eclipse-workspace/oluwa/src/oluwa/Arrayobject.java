package oluwa;

public class Arrayobject {
	public static void main(String[] args) {
		Object a[]= new Object[5];
		
		a[0]=10;
		a[1]="welcome";
		a[2]='A';
		
		for(Object i:a) {
			System.out.println(i);
		}
		Object b[]= {"welcome",12,'C',"move"};
		for(Object i:b) {
			System.out.println(i);
		}
	}

}
