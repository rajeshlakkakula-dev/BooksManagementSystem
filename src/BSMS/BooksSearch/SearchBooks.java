package BSMS.BooksSearch;

import java.util.List;

import BSMS.utils.BooksDatabase;
import BSMS.utils.BooksInformation;

public class SearchBooks {

	public BooksInformation getBooksByAuthor(String Author) {

		BooksDatabase bd = new BooksDatabase();
		bd.bookInfo();
		for (int i = 0; i <= bd.myBooks.size() - 1; i++) {

			if (Author.equals(bd.myBooks.get(i).getBookAuthor())) {
				return bd.myBooks.get(i);
			} else {
				System.out.println("No Results Found");
			}

		}

		return null;
	}
	
	  public BooksInformation getBooksByName(String bookName) { 
		  
		  
		  
		  return null;
		  }
	  
	  
	  
	 

}
