public class LibraryMember{
	private String memberID;
	private String name;
	
	LibraryMember(String memberID,String name){
		this.memberID=memberID;
		this.name=name;
	}
	
	public String getname(){
		return name;
	}
	public String getmemberID(){
		return memberID;
	}
	public void displayMemberetails(){
		System.out.println("Member id is : "+getmemberID());
		System.out.println("Member name is : "+getname());
	}
}