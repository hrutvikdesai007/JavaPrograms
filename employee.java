abstract class Salaryaccount
{
	abstract void bank_name(String bname);
	void status_employee()
	{
		System.out.println("No employee");
	}
}

class PermEmployee extends Salaryaccount
{
	String empname;
	String empid,bankname;
	double empsal;
	
	PermEmployee()
	{
	}
	PermEmployee(String name, String id)
	{
		empname=name;
		empid=id;
	}
	PermEmployee(String name, String id, double salary)
	{
		empname=name;
		empid=id;
		empsal=salary;
	}
	
	void bank_name(String bname)
	{
		bankname=bname;
		System.out.println("Bank name : " + bankname);
	}
	
	void status_employee()
	{
		System.out.println("This is a permanent employee");
	}
	
	void display()
	{
		System.out.println("Employee name : " + empname);
		System.out.println("Employee id : " + empid);
		System.out.println("Employee salary : " + empsal);
	}
}

class Tempemployee extends Salaryaccount
{
	String empname;
	String empid,bankname;
	double empsal;
	
	Tempemployee(String name, String id, double salary)
	{
		empname=name;
		empid=id;
		empsal=salary;
	}
	
	void bank_name(String bname)
	{
		bankname=bname;
		System.out.println("Bank name : " + bankname);
	}
	void status_employee()
	{
		System.out.println("This is a temporary employee");
	}
	
	void display()
	{
		System.out.println("Employee name : " + empname);
		System.out.println("Employee id : " + empid);
		System.out.println("Employee salary : " + empsal);
	}
}

class employee
{
	public static void main(String args[])
	{
		String a="Hrutvik";
		String b="1821001";
		double c=572000.57;
		String d="Jimil";
		String e="1821002";
		double f=385000.72;
		
		Salaryaccount sa;
		PermEmployee p = new PermEmployee(a,b,c);
		Tempemployee t = new Tempemployee(d,e,f);
		
		sa=p;
		sa.bank_name("HDFC Bank");
		sa.status_employee();
		p.display();
		sa=t;
		sa.bank_name("Citi Bank");
		sa.status_employee();
		t.display();
		
	}
}