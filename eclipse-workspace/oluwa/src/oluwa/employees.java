package oluwa;

public class employees {
	int empid;
	String empname;
	int salary;
	int deptno;
	
	employees(int id,String name,int sal,int dno){
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}
	
	/*public static void main(String[] args) {
		employees emp1=new employees();
		emp1.empid=1;
		emp1.empname="sammy";
		emp1.salary=200000;
		emp1.deptno=10; 
		emp1.display();
		
		employees emp2=new employees();
		
		emp2.empid=2;
		emp2.empname="tobi";
		emp2.salary=250000;
		emp2.deptno=11;
		emp2.display();
		 
	}*/
	public static void main(String[] args) {
		employees emp1 = new employees(100,"dammy",2000,12);
		employees emp2 = new employees(101,"shewa",3000,14);
		
		emp2.display();
	}
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
}