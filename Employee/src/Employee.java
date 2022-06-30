

class Department extends Office

{
	
}

  class Office extends Employee
{
	int num1, num2, num3, num4;
	
	static
	{
		//System.out.println("I'm here in static block of xxx");
		}
	}



public class Employee {

	int salary, id;
	String name, dept;
	static String ceo;
	
	
	
	static  
	{
		System.out.println("I'm here in static block of employee");
	    ceo = "TIM";
	}
	static
	{
		System.out.println("I'm here in static block of office");
		}

	
public void showDetails()
{
System.out.println("name: "+ name + ", Salary: "+ salary+ ", id: "+ id + ", ceo: " +ceo + ", dept: " + dept);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int []storage = {5,6,7};
		
		Department RON = new Department();
		
		Office TIM = new Office();
		Office KIM = new Office();
		Office JIM = new Office();
		
		RON.name = "RON";
		RON.dept = "Manager";
		RON.id= 1000;
		RON.salary= 50550;
		RON.showDetails();
		
		KIM.name = "KIM";
		KIM.id= 10;
		KIM.salary= 500;
		KIM.showDetails();

		
		TIM.num1 = 111;
		KIM.num1 = 222;
		JIM.num1 = 333;
		Office AIMY[] = {TIM,KIM,JIM};
	
		 
		
		
		Employee RAM = new Employee();
		Employee SAM = new Employee();
		
		RAM.name = "RAM";
		RAM.id= 10;
		RAM.salary= 500;
		//Employee.ceo= "JOHN";
		SAM.name = "SAM";
		SAM.id= 120;
		SAM.salary= 2300;
		//ceo= "MIKE";
		RAM.showDetails();
		SAM.showDetails();

	}

}
