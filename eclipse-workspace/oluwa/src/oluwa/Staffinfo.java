package oluwa;

public class Staffinfo {
	String staffname;
	int staffid;
	int staffSalary;
	String staffPosition;
	
	
	/*public static void main(String[] args) {
		Staffinfo staff1=new Staffinfo();
		staff1.staffname="damilola";
		staff1.staffid =1001; 
		staff1.staffPosition = "manaager";
		staff1.staffSalary=100001;
		staff1.display();
	}*/
	/*Staffinfo(String name,int id,int Salary,String position){
		staffname=name;
		staffid=id;
		staffSalary=Salary;
		staffPosition=position;
	}*/
	/*public static void main(String[] args) {
		Staffinfo staff1=new Staffinfo("dammy",1001,800000,"manager");
		staff1.display(); 
	}*/
	void setdata( String name,int id,int Salary,String position) {
		staffname=name;
		staffid=id;
		staffSalary=Salary;
		staffPosition=position;
	}
	 
	
	void display(){
		System.out.println(staffname);
		System.out.println(staffid);
		System.out.println(staffPosition);
		System.out.println(staffSalary);
	}
  
}
