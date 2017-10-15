import java.util.Scanner;

abstract class Employee
{
	int emp_id;
	String emp_name;
	int total_leaves;
	double total_salary;
	Scanner sc=new Scanner(System.in);
	int num_of_leaves;
	char type_of_leaves;
	abstract public void caluculate_balance_leaves();
	abstract public boolean avail_leave(int num_of_leaves,char type_of_leaves);
	abstract public void calculate_salary();
}
class PermanentEmp extends Employee
{	int num_of_leaves;
	char type_of_leaves;
	int paid_leave, sick_leave, casual_leave;
	double basic, hra,pfa;	
	public void get() {
		System.out.println("enter the employee name");
		emp_name=sc.nextLine();
		System.out.println("enter the employee id");
		emp_id=sc.nextInt();
		System.out.println("enter the employee paid leaves");
		paid_leave=sc.nextInt();
		System.out.println("enter the employee sick leaves");
		sick_leave=sc.nextInt();
		System.out.println("enter the employee casual leaves");
		casual_leave=sc.nextInt();
		System.out.println("enter the employee basic salary");
		basic=sc.nextDouble();




	}
	public void caluculate_balance_leaves()
	{
		total_leaves=paid_leave+sick_leave+casual_leave;
		int balance_leaves=10-total_leaves;
		//System.out.printf("\n the balace of the employee leaves :"+balance_leaves);
		System.out.println("enter the type of leave wanted for employee if not want submint none");
		char c = sc.next().charAt(0);
		boolean result;
		if(c!='n')
		{
			result=avail_leave(balance_leaves,c);
			if(result)
			{
				 System.out.printf("employee is eligible for leave availiable leave is :"+balance_leaves);

			}
			else
				System.out.println("employee is not eligible for leaves");

		}
		
		

	}
	public boolean avail_leave(int num_of_leaves,char type_of_leaves)
	{	
		this.num_of_leaves=num_of_leaves;
		this.type_of_leaves=type_of_leaves;
		if(num_of_leaves>0)
		{	
			return true;
		}
		else
			return false;
		
		
	}
	public void calculate_salary()
	{
		pfa=.12*basic;
		hra=.5*basic;
		total_salary=basic+hra-pfa;
		System.out.println(" total salry of employee is:"+total_salary);

		
	}
}
class TemporaryEmp extends Employee
{	
	int paid_leave, sick_leave, casual_leave;
	double basic, hra,pfa;
	public void gett() {
		System.out.println("enter the employee name");
		emp_name=sc.nextLine();
		System.out.println("enter the employee id");
		emp_id=sc.nextInt();
		System.out.println("enter the employee paid leaves");
		paid_leave=sc.nextInt();
		System.out.println("enter the employee sick leaves");
		sick_leave=sc.nextInt();
		System.out.println("enter the employee casual leaves");
		casual_leave=sc.nextInt();
		System.out.println("enter the employee basic salary");
		basic=sc.nextDouble();
	}
	public void caluculate_balance_leaves()
	{
		total_leaves=paid_leave+sick_leave+casual_leave;
		int balance_leaves=10-total_leaves;
		//System.out.printf("\n the balace of the employee leaves :"+balance_leaves);
		System.out.println("enter the type of leave wanted for employee if not want submint none");
		char c = sc.next().charAt(0);
		boolean result;
		if(c!='n')
		{
			result=avail_leave(balance_leaves,c);
			if(result)
			{
				 System.out.printf("employee is eligible for leave availiable leave is :"+balance_leaves);

			}
			else
				System.out.println("employee is not eligible for leaves");

		}
			

	}
	public boolean avail_leave(int num_of_leaves,char type_of_leaves)
	{
		this.num_of_leaves=num_of_leaves;
		this.type_of_leaves=type_of_leaves;
		if(num_of_leaves>0)
		{	
			return true;
		}
		else
			return false;
		
	}
	public void calculate_salary()
	{
		pfa=.12*basic;
		hra=.5*basic;
		total_salary=basic+hra-pfa;
		System.out.println(" total salry of employee is:"+total_salary);

		
	}
}
public class Myclass {
	public static void main(String args[])
	{
		System.out.println("details of permenent employee");
		PermanentEmp obj1=new PermanentEmp();
		obj1.get();
		obj1.caluculate_balance_leaves();
		obj1.calculate_salary();
		System.out.println("====================");
		System.out.println(" details of temporary employee");
		TemporaryEmp obj2=new TemporaryEmp();
		obj2.gett();
		obj2.caluculate_balance_leaves();
		obj2.calculate_salary();
	}

}
