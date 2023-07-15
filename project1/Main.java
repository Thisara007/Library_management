public class Main{
	public static void main(String args[]){
		Book B1 = new Book("The Catcher in the Rye","B001",true,"J.D. Salinger",240);
		Book B2 = new Book("To Kill a Mockingbird","B002",true,"J.D. Salinger",240);
		Book B3 = new Book("1984","B003",true,"J.D. Salinger",240);
		Book B4 = new Book("Pride and Prejudice","B004",true,"J.D. Salinger",240);
		Book B5 = new Book("The Hobbit ","B005",true,"J.D. Salinger",240);
	
		Magazine M1= new Magazine("National Geographic","M001 ",true,"August 2023","National Geographic Societ");
		Magazine M2= new Magazine("Time ","M002 ",true,"September 2023 ","Time USA, LLC");
		Magazine M3= new Magazine("Forbes","M003 ",true,"June 2023 ","Forbes Media");
		Magazine M4= new Magazine("Vogue ","M004 ",true,"July 2023","Condé Nast");
		Magazine M5= new Magazine("Sports Illustrated","M005 ",true,"July 2023 ","Maven Coalition");
		
		LibraryMember LM1= new LibraryMember("L001"," John Doe");
		LibraryMember LM2= new LibraryMember("L002"," Jane Smith");
		LibraryMember LM3= new LibraryMember("L003"," David Johnson");
		LibraryMember LM4= new LibraryMember("L004"," Sarah Williams");
		LibraryMember LM5= new LibraryMember("L005"," Michael Brown");
	
		M5.chekOut();
		B4.chekIn();
		
		LM1.displayMemberetails();
		LM2.displayMemberetails();
		LM3.displayMemberetails();
		LM4.displayMemberetails();
		LM5.displayMemberetails();
		
		M1.displayItem();
		M3.displayItem();
		M2.displayItem();
		M4.displayItem();
		M5.displayItem();
		
		B1.displayItem();
		B3.displayItem();
		B2.displayItem();
		B4.displayItem();
		B5.displayItem();
	}
	
}