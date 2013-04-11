
 
package appexercise;
import AppExercise.Book;


public class AppExercise {

    
    public static void main(String[] args) {
   
        
                Library objLibrary = new Library();
                System.out.println("Library Hours: ");
                objLibrary.printOpeningHours();
                Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");                                                                                                                                                                                                             
		objLibrary.printAddress();
                
                System.out.println("Borrowing The Lord of the Rings:");               
		System.out.println();				
                objLibrary.borrowBook("The Lord of the Rings");               
                
                System.out.println("-------------------------");
                firstLibrary.printAvailableBooks();
                firstLibrary.returnBook("The Lord of the Rings");
                System.out.println("-------------------------");
		firstLibrary.printAvailableBooks();
                
                

    }

    
}
