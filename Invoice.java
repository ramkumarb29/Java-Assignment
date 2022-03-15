package assignment1;

public class Invoice {
		String partNumber;
		String partDescription;
		int quantity;
		double price;
		public Invoice(String pNum, String pDesc, int qty, double prc) {
			partNumber=pNum;
			partDescription=pDesc;
			quantity=qty;
			price=prc;
		}

		void setPartNum(String pNum)
		{
			partNumber=pNum;
		}
		void setPartDesc(String pDesc)
		{
			partDescription=pDesc;
		}
		void setQuantity(int qty)
		{
			quantity=qty;
		}
		void setPrice(double prc)
		{
			price=prc;
		}
		public String getPartNum()
		{
		return partNumber;
		}

		public String getPartDesc()
		{
		return partDescription;
		}

		public int getQuantity()
		{
		return quantity;
		}

		public double getPrice()
		{
		return price;
		}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice1=new Invoice ("A001", "Book1", 100, 250.00);

		System.out.println("Invoice 1:"+'\n'+"Part number:"+invoice1.getPartNum()+'\n'+"Part description:"+
		invoice1.getPartDesc()+'\n'+"Quantity:"+ invoice1.getQuantity()+'\n'+"Price per item:"+ invoice1.getPrice()+
		'\n'+"Invoice Amount:"+invoice1.getQuantity()*invoice1.getPrice());
		
		}
	}

	
	
