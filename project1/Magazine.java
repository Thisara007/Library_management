public class Magazine extends LibraryItem{
	private String issueate;
	private String publisher;
	
	Magazine(String title,String itemID,boolean chek,String issueate,String publisher){
		super(title,itemID,chek);
		this.issueate=issueate;
		this.publisher=publisher;
	}
	
	public String getissuate(){
		return issueate;
	}
	public String getpublisher(){
		return publisher;
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
		System.out.println("Issue ate: "+getissuate());
		System.out.println("publisher : "+getpublisher());
	}
}