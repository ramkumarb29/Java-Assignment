package assignment1;

public class Car {
	private int speed; 
	private double regularPrice; 
    private String color; 
	public Car(int s,double r,String c)
	{
		speed=s;
		regularPrice=r;
		color=c;
	} 
	public double getsalePrice()
	{
		return regularPrice;
	}
	public class Truck extends Car
	{
			private int weight;
			public Truck(int s,double r,String c,int w) {
				super(speed,regularPrice,color);
				weight=w;
			}
			public double getsalePrice() {
			if(weight>2000)
				{
				return super.getsalePrice()-(0.10*super.getsalePrice());
				}
			else
			{
				return super.getsalePrice()-(0.20*super.getsalePrice());
			}
		}
	}
	
	public class Ford extends Car
	{
		private int year; 
		private int manufacturerDiscount;
		public Ford(int s,double r,String c,int y,int m) {
			super(speed,regularPrice,color);
			year=y;
			manufacturerDiscount=m;
		}
		public double getsalePrice()
		{
			return (super.getsalePrice() - manufacturerDiscount);
		}
	}
	
	public class Sedan extends Car
	{
		private int length;
		public Sedan(int s,double r,String c,int l) {
			super(speed,regularPrice,color);
			length=l;
		}
		public double getsalePrice() {
			if(length>20)
				{
				return super.getsalePrice()-(0.05*super.getsalePrice());
				}
			else
			{
				return super.getsalePrice()-(0.10*super.getsalePrice());
			}
		}
	}
	 
			public static void main(String[] args) { 
				// TODO Auto-generated method stub
			Car C = new Car(4,55000.00,"Red");
			Sedan S = C.new Sedan(1,20000.00,"Black",20); 
			Ford F1 = C.new Ford(2,45000.00,"Black",2005, 10); 
			Ford F2 = C.new Ford(3,50000.00,"Pink",2000, 5); 
			
			System.out.println("Sedan Price:"+S.getsalePrice()); 
			System.out.println("Ford1 Price:"+F1.getsalePrice()); 
			System.out.println("Ford2 Price:"+F2.getsalePrice()); 
			System.out.println("Car Price:"+C.getsalePrice()); 
			} 
	}


