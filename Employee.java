package assignment1;

public class Employee {
	 String firstName;
	 String lastName;
	 double monthlySalary;
	 double yearlysalary;
	 double raisesalary; 
	public Employee(String fName,String lName,double monSalary) {
		firstName=fName;
		lastName=lName;
		monthlySalary=monSalary;
	}
	   void setFirName(String fName)
		{
			firstName=fName;
		}
	   void setLaName(String lName)
		{
			lastName=lName;
		}
		void setMonthSalary(double monSalary)
		{
			monthlySalary=monSalary;
		}
		
		public String getFirName()
		{
			return firstName;
		}
		public String getLaName()
		{
			return lastName;
		}
		public double getMonthSalary()
		{
			return monthlySalary;
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e1=new Employee("Ram","Kumar",25000.00);
    Employee e2=new Employee("Viswanath","Siva",30000.00);
    
    System.out.println("Employee 1:"+'\n'+"First name:"+e1.getFirName()+'\n'+"Last name:"
    +e1.getLaName()+'\n'+"Monthly Salary:"+e1.getMonthSalary()+'\n'+"Yearly salary:"+
    e1.getMonthSalary()*12+'\n'+"Raised yearly salary:"+e1.getMonthSalary()*1.10*12);
    
    System.out.println("Employee 2:"+'\n'+"First name:"+e2.getFirName()+'\n'+"Last name:"
    +e2.getLaName()+'\n'+"Monthly Salary:"+e2.getMonthSalary()+'\n'+"Yearly salary:"
    +e2.getMonthSalary()*12+'\n'+"Raised yearly salary:"+e2.getMonthSalary()*1.10*12);
    
	}

}

