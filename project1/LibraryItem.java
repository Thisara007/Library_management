public abstract class LibraryItem{
	private String title;
	private String itemID;
	public boolean chek= true;
	
	LibraryItem(String title,String itemID,boolean chek){
		this.title=title;
		this.itemID=itemID;
		this.chek=chek;
	}
	
	public String getTitle(){
		return title;
	}
	public String getItemId(){
		return itemID;
	}
	
	public String getChek(){
		if (chek){
			return "Available";
		}else{
			return "Not Available";
		}
	}
	
	abstract public void chekOut();
	abstract public void chekIn();
	abstract public void displayItem();
		
}