package BSMS.utils;

import java.util.ArrayList;

public class BooksDatabase {

	public ArrayList<BooksInformation> myBooks = new ArrayList<BooksInformation>();

	public void bookInfo() {

		myBooks.add(new BooksInformation("Chanukya In You", 10920, "RadhaKrishna", "Indian"));
		myBooks.add(new BooksInformation("The Romance in Lift", 10941, "Gopi", "Romantic Publisher"));
		myBooks.add(new BooksInformation("The Stone Circle", 10942, "Ellygriffiths", "Ruth Galloway"));
		myBooks.add(new BooksInformation("Connections in Death", 10943, "JD Roa", "Indeath"));
		myBooks.add(new BooksInformation("The Sting", 10944, "Kimberly", "Chambers"));
		myBooks.add(new BooksInformation("Say Your Sorry", 10945, "By Charan Rows", "Sukramento"));
		myBooks.add(new BooksInformation("Death Memories", 10946, "DM Kimstone", "Sukramento"));
	}

}
