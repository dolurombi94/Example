package oluwa;

public class dimensional {
	public static void main(String[] args) {
		  int a[][]= new int[3][2];
		  
		  a[0][0]=10;
		  a[0][1]=20;
		  
		  a[1][0]=30;
		  a[1][1]=40;
		  
		  a[2][0]=50;
		  a[2][1]=60;
		  for(int i=0;i<=2;i++) {
			  for (int j= 0;j<=1;j++) {
				  System.out.println(a[i][j]);
			  }
			 
		  }
		  int dimention[][]= new int[3][2];
		  
		  dimention[0][0]=1;
		  dimention[0][1]=10;
		  
		  dimention[1][0]=30;
		  dimention[1][1]=40;
		  
		  dimention[2][0]=50;
		  dimention[2][1]=60;
		  
		  for(int i[]:dimention) {
			  for(int j:i) {
				  System.out.print(j);
			  }
		  }
		  int dimention2[][]= {{10,11,12,},{13,14,15},{16,17,18}};
		  
		  for(int i[]:dimention2) {
			  {
				  for(int j:i) {
					  System.out.println(j);
				  }
			  }
		  }
		  
	}
}
