import java.util.Scanner;
import java.util.ArrayList;
class manageLibrary{
      Scanner inputs = new Scanner(System.in);
      char choice='y';



void add_book(){
        //reading details about books
        System.out.println("Enter book details:");
        
        ArrayList<book> books=new ArrayList<>();
        choice = 'y';

        while(choice == 'y'){
            int book_id;
    String book_title;
    String author;
    int publication_year;
    int available_copies;

            System.out.print("Book Id:");
            book_id = inputs.nextInt();
            inputs.nextLine();
            System.out.print("Book title:");
            book_title = inputs.nextLine();
            System.out.print("Book author:");
            author = inputs.nextLine();
            System.out.print("Publication Year:");
            publication_year = inputs.nextInt();
            inputs.nextLine();
            System.out.print("Available copies:");
            available_copies = inputs.nextInt();
            inputs.nextLine();
            books.add(new book(book_id,book_title,author,publication_year,available_copies));


            System.out.print("Do you want to add other book [y/n]: ");
            choice = inputs.next().charAt(0);
        }
    }

void add_member(){
        // reading details about mebers
        System.out.println("Enter Members Details");
        ArrayList<member> members=new ArrayList<>();
        choice = 'y';
        while(choice == 'y'){
             int memberId;
             String memberName;
             String memberEmail;
             int memberAge;
             String membershipType;

              System.out.print("Member Id:");
            memberId = inputs.nextInt();
            inputs.nextLine();
            System.out.print("Member Name:");
            memberName = inputs.nextLine();
            System.out.print("Member Email:");
            memberEmail = inputs.nextLine();
            System.out.print("Member Age:");
            memberAge = inputs.nextInt();
            inputs.nextLine();
            System.out.print("Membership Type:");
            membershipType = inputs.nextLine();

            members.add(new member(memberId,memberName, memberEmail,memberAge, membershipType));

            
            System.out.print("Do you want to add Member [y/n]: ");
            choice = inputs.next().charAt(0);

        }

    }

    void add_librarian(){
//details about librarians
        System.out.println("Enter Librarians Details;");
        ArrayList<librarian> librarians=new ArrayList<>();
        choice = 'y';
        while(choice == 'y'){
               int librarianId;
              String librarianName;
              String librarianEmail;
              int    yearsOfExperience;
              String librarySection;


              System.out.print("Librarian Id:");
            librarianId = inputs.nextInt();
            inputs.nextLine();
            System.out.print("librarian Name:");
            librarianName = inputs.nextLine();
            System.out.print("Librarian Email:");
            librarianEmail = inputs.nextLine();
            System.out.print("Years of Experience:");
            yearsOfExperience = inputs.nextInt();
            inputs.nextLine();
            System.out.print("Library Section:");
            librarySection = inputs.nextLine();

            librarians.add(new librarian(librarianId,librarianName,librarianEmail,yearsOfExperience,librarySection));

            
            System.out.print("Do you want to add other Librarian [y/n]: ");
            choice = inputs.next().charAt(0);

        }
    }



}
// main class
public class library_management_system{
    public static void main(String[] args){
      
manageLibrary manage= new manageLibrary();



    }
}