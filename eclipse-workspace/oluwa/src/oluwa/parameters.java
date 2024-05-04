package oluwa;

public class parameters {
	int a;
	int b;
	
	public static void main(String[] args) {
		
		
		parameters cal=new parameters();{
		/*	cal.a=100;
			cal.b=200;
			cal.sum();*/
			
			//cal.sum(100,2000);
			cal.a=100;
			cal.b=1000;
			int r=cal.sum();
			System.out.println(r);
			
			
			
		}
		
	}
	// 1 method not taking parameters
	/*void sum() {
		System.out.println(a+b);
	}*/
	
	// 2 method taking parameters
	
	/* void sum(int x, int y) {
		a=x;
		b=y;
		System.out.println(a+b);
		
	}*/
	// 3 method returns value
	int sum() 
	{
		return(a+b);
	}
	

}
