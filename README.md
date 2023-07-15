# project_1
#1. LibraryItem (abstract class)
• Properties:
• title (String): the title of the library item.
• itemID (String): a unique identifier for the library item.
• Methods:
• checkOut(): marks the library item as checked out.
• checkIn(): marks the library item as checked in.
• displayItemDetails(): displays the details of the library item.

2. Book (subclass of LibraryItem)
• Additional Properties:
• author (String): the author of the book.
• numPages (int): the number of pages in the book.

4. Magazine (subclass of LibraryItem)
• Additional Properties:
• issueDate (String): the issue date of the magazine.
• publisher (String): the publisher of the magazine.

6. LibraryMember
• Properties:
• memberID (String): a unique identifier for the library member.
• name (String): the name of the library member.
• Methods:
• displayMemberDetails(): displays the details of the library member.
•


Implement the above classes and write the necessary code to demonstrate the following functionality:
1. Create 5 objects of the Book class, each representing a different book in the library.
2. Create 5 objects of the Magazine class, each representing a different magazine in the library.
3. Create 5 objects of the LibraryMember class, each representing a different member of the 
library.
4. Set the properties of the objects using appropriate setter methods.
5. Call the checkOut() and checkIn() methods on one of the library items.
6. Display the details of all the library items and library members.
