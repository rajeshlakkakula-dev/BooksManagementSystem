package BSMS.BooksDetails;

import java.util.Scanner;

import BSMS.BooksSearch.SearchBooks;

public class ConsumerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 0;
		System.out.println("Welcome to Library Management System");
		System.out.println("Select any number from Following:");
		System.out.println("1.Search by BookName");
		System.out.println("2. Search by BookID");
		System.out.println("3. Search By BookAuthor");
		System.out.println("4.search by publisher");

		/**
		 * Objects Creation
		 */
		SearchBooks sb = new SearchBooks();
		Scanner sc = new Scanner(System.in);

		value = sc.nextInt();

		switch (value) {

		case 1:
			System.out.println("Search by BookName:");
			String bn = sc.next();
			System.out.println(sb.getBooksByAuthor(bn));
			
			break;
		case 2:
			System.out.println("Search by BookID");
			break;
		case 3:
			System.out.println("Search by BookAuthor");
			break;
		case 4:
			System.out.println("Search by publisher");
			break;
		default:
			System.out.println("Invalid Selection");

		}
		
		sc.close();

	}

}
