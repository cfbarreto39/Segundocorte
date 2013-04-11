package appexercise;

import AppExercise.Book;


public class Library {
    Book[] books;
	int nBooks;
	String name;
        String hours;
        int cont = 0;
        int c;
	            
	Library (String libname) {
		name=libname;
		books=new Book[100];
		nBooks=0;
		
		}

    Library() {
       
    }
        public void borrowBook(String valor)
        {
            if (valor =="The Lord of the Rings")
            {
              
           
              cont = cont + 1;
              String alertLibro1 = "You successfully borrowed The Lord of the Rings";
              String alertLibro2 = "Sorry, this book is already borrowed.";
              String alertLibro3 = "Sorry, this book is not in our catalog";
              
              if (cont == 1)
              {
               System.out.println(alertLibro1);               
              }
              if (cont== 2)
              {             
                  
              System.out.println(alertLibro2);                                                                                   
              
              }
              else
              {
              System.out.println(alertLibro3);                 
              }
          //   }
            }
        }
        public void printAvailableBooks()
        {
            c = c + 1;            
         
	    addBook(new Book("The Da Vinci Code"));
	    addBook(new Book("Le Petit Prince"));
	    addBook(new Book("A Tale of Two Cities"));
	    addBook(new Book("The Lord of the Rings"));
            if (c == 1)
            {
            System.out.println("Books available in the First Library:");
            System.out.println("The Da Vinci Code ");
            System.out.println("Le Petit Prince ");
            System.out.println("A Tale of Two Cities ");
            }
            else
            {
            System.out.println("The Da Vinci Code ");
            System.out.println("Le Petit Prince ");
            System.out.println("A Tale of Two Cities ");
            System.out.println("The Lord of the Rings");            
            }
//            
            System.out.println("Books available in the second library:\n" + "No book in catalog");
            
            }
                            
        public void returnBook(String nameLibro)
        {
            System.out.println("You successfully returned" + nameLibro);
        
        }
	public void addBook(Book book){
		books[nBooks]=book;
		nBooks++;		
	}
                               
		public void printAddress(){
                    name = "Library addresses: 10 Main St. \n 228 Liberty St";
                    System.out.println(name);
			
		}
        public void printOpeningHours()
        {
         hours = "Libraries are open daily from 9am to 5Pm";
         System.out.println(hours);        
        }
	  
}
