package oluwa;

public class loops {
	public static void main (String[] args) {
		
		int i =1;
		while(i<=10) 
		//{
			//System.out.println(i);
			//i++;
		//};
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		for(i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
