public class Book extends LibraryItem{
	private String author;
	private int numPages;
	public String OutA[];
	
	Book(String title,String itemID,boolean chek,String author,int numPages){
		super(title,itemID,chek);
		this.author=author;
		this.numPages=numPages;
	}
	
	public String getAuthor(){
		return author;
	}
	public int getnumPages(){
		return numPages;
	}
	
	public void chekOut(){
		chek = false;
	}
	public void chekIn(){
		chek = true;
	}
	
	
	public void displayItem(){
		System.out.println("Item ID : "+super.getItemId());
		System.out.println("Item Title : "+super.getTitle());
		System.out.println("Item availabilty : "+super.getChek());
		System.out.println("Author : "+getAuthor());
		System.out.println("page numbersm : "+getnumPages());
	}
	
}