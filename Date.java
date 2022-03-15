package assignment1;

public class Date {
	int month;
	int day;
	int year;
	
	public Date(int m,int d,int y) {
		month=m;
		day=d;
		year=y;
	}
		
		void setmon(int m)
		{
			month=m;
		}
		void setday(int d)
		{
			day=d;
		}
		void setyear(int y)
		{
			year=y;
		}
		public int getmon()
		{
			return month;
		}
		public int getday()
		{
			return day;
		}
		public int getyear()
		{
			return year;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Date d=new Date(25,12,2002);
    
	System.out.println("Date: "+d.getmon()+'/'+d.getday()+'/'+d.getyear());
	}

}
