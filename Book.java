package assignment1;

public class Book {
	String BookName;
	String ISBNnumber;
	String AuthorName;
	String Publisher;
	public Book(String BN,String ISBN,String AN,String Pub) {
		BookName=BN;
		ISBNnumber=ISBN;
		AuthorName=AN;
		Publisher=Pub;
	}
	
	void setBookName(String BN )
	{
		BookName=BN;
	}
	void setISBNnumber(String ISBN )
	{
		ISBNnumber=ISBN;
	}
	void setAuthorName(String AN )
	{
		AuthorName=AN;
	}
	void setPublisher(String Pub )
	{
		Publisher=Pub;
	}
	String getBookName()
	{
		return BookName;
	}
	String getISBNnumber()
	{
		return ISBNnumber;
	}
	String getAuthorName()
	{
		return AuthorName;
	}
	String getPublisher()
	{
		return Publisher;
	}
    void getBookInfo()
	{
		System.out.println("Book Info: "+'\n'
	            +"Book Name:"+getBookName()+'\n'
			    +"ISBN Number:"+getISBNnumber()+'\n'
			    +"Author Name:"+getAuthorName()+'\n'
			    +"Publisher:"+getPublisher());

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book B[] = new Book[30];
		B[0] = new Book("Abc","1234","XYZ","PQR");
		B[1] = new Book("MNO","345","MAN","KLM");
		B[0].getBookInfo();	
		B[1].getBookInfo();
	}

}
