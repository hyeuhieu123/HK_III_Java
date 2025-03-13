package oop_practice;

import java.util.Scanner;
import java.util.regex.Pattern;

class Book{
	private String bookId;
	private String bookName;
	private double importPrice;
	private double exportPrice;
	private String title;
	private String author;
	private double interest;
	private int year;
	public Book() {
	}
	
	public Book(String bookId, String bookName, double importPrice, double exportPrice, String title, String author,
			double interest, int year) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.importPrice = importPrice;
		this.exportPrice = exportPrice;
		this.title = title;
		this.author = author;
		this.interest = interest;
		this.year = year;
	
	}
	/////	
	public String getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public double getImportPrice() {
		return importPrice;
	}
	public double getExportPrice() {
		return exportPrice;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getInterest() {
		return interest;
	}
	public int getYear() {
		return year;
	}
	/////

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setImportPrice(double importPrice) {
		this.importPrice = importPrice;
	}

	public void setExportPrice(double exportPrice) {
		this.exportPrice = exportPrice;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setInterest() {
		this.interest = this.exportPrice -this.importPrice;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void inputData(Scanner sc){
		System.out.println("nhap ma sach");
		
		do {
			String idRegex = "B.{4}";
			this.bookId=sc.nextLine();
			if(Pattern.matches(idRegex,this.bookId )) break;
			else System.out.println("nhap lai");
		} while (true);
		System.out.println("nhap ten sach");

		do {
		
			this.bookName=sc.nextLine();
			if(this.bookName.length()>6 && this.bookName.length()<100) break;
			else System.out.println("nhap lai");
		} while (true);

		System.out.println("gia nhap");
		do {
			this.importPrice = Double.parseDouble(sc.nextLine());
			if(this.importPrice >0 )break;
			else System.out.println("nhap > 0");
		} while (true);
		System.out.println("gia ban");
		do {
			this.exportPrice = Double.parseDouble(sc.nextLine());
			if(this.exportPrice >importPrice && this.exportPrice >= this.importPrice +(this.importPrice/10) )break;
			else System.out.println("nhap lai");
		} while (true);
		System.out.println("tieu de sach ");
		do {
			this.title = sc.nextLine();
			if(this.title.isEmpty() )System.out.println("nhap lai");
			else break;
		} while (true);
		System.out.println("tac gia");
		do {
			this.author = sc.nextLine();
			if(this.author.isEmpty() )System.out.println("nhap lai");
			else break;
		} while (true);


		setInterest();
		System.out.println("nam xuat ban");
		do {
			this.year = Integer.parseInt(sc.nextLine());
			if(this.year >1970) break;
			else System.out.println("nhap nam sau 1970");
		} while (true);

	}

	public void dispalyData(){
		System.out.println("id "+this.bookId);
		System.out.println("ten sach "+this.bookName);
		System.out.println("gia nhap "+this.importPrice);
		System.out.println("gia ban "+this.exportPrice);
		System.out.println("tieu de "+this.title);
		System.out.println("tac gia "+this.author);
		System.out.println("loi nhuan "+ this.interest);
		System.out.println("nam xuat ban "+this.year);
		System.out.println("**************************");
	}
	
}
public class BookManagement {	
	static Book[] Books = new Book[100];
    static int currentIndex = 0;
	// static 	double sum;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//
		
		do {
			System.out.println("**************Menu************");
			System.out.println("1. danh sach sach");
			System.out.println("2. them sach");
			System.out.println("3. tinh loi nhuan sach");
			System.out.println("4. cap nhat sach");
			System.out.println("5. xoa sach");
			System.out.println("6. sap xep theo loi nhuan tang dan");
			System.out.println("7. tim kiem theo ten tac gia");
	
			System.out.println("10. thoat");
			int choice =Integer.parseInt(sc.nextLine());
			switch(choice){
				case 1:
				printBooks();
				break;
				case 2:
				addBook(sc);
				break;
				case 3:
				System.out.println("loi nhuan sach "+sumInterest());
				break;
				case 4:
				upDateBook(sc);
				break;
				case 5:
				deleteBook(sc);
				break;
				case 6:
				sortBookByInterest();
				break;	
				case 7:
				findBookByAuthor(sc);
				case 8:
				findByPrice(sc);
				case 9:
				compileBookByAuthor();
				case 10: 
				System.exit(0);
			}
		} while (true);
		
	}

	///
	public static void printBooks(){
		for(int i =0;i<currentIndex;i++){
			Books[i].dispalyData();
		}
	}
	///
	/// 
	//
	public static void addBook(Scanner sc){
		Books[currentIndex] =new Book();
		Books[currentIndex].inputData(sc);
		currentIndex++;

		}

		//
		public static int findBookId (String BookId){
			for(int i = 0 ; i<currentIndex;i++){
				if(Books[i].getBookId().equals(BookId)){
				return i;
				}
			}
			return -1;
		}
		// update book
		public static void upDateBook(Scanner sc ){
			System.out.println("nhap ma sach can cap nhat ");
			int idexUpdate = findBookId(sc.nextLine());
			if(idexUpdate != -1){
				boolean isExit = true;
do {
    System.out.println("1. cap nhat ten sach");
    System.out.println("2. cap nhat gia nhap");
    System.out.println("3. cap nhat gia ban");
    System.out.println("4. cap nhat tieu de sach");
    System.out.println("5. cap nhat ten tac gia");
    System.out.println("6. cap nhat nam xuat ban");
    System.out.println("7. thoat");
    
    int choice = Integer.parseInt(sc.nextLine());
    switch (choice) {
        case 1:
            System.out.println("nhap ten sach moi: ");
            Books[idexUpdate].setBookName(sc.nextLine());
            break;
        case 2:
            System.out.println("nhap gia nhap moi: ");
            Books[idexUpdate].setImportPrice(Double.parseDouble(sc.nextLine()));
            break;
        case 3:
            System.out.println("nhap gia ban moi: ");
            Books[idexUpdate].setExportPrice(Double.parseDouble(sc.nextLine()));
            Books[idexUpdate].setInterest(); 
            break;
        case 4:
            System.out.println("nhap tieu de moi: ");
            Books[idexUpdate].setTitle(sc.nextLine());
            break;
        case 5:
            System.out.println("nhap ten tac gia moi: ");
            Books[idexUpdate].setAuthor(sc.nextLine());
            break;
        case 6:
            System.out.println("nhap nam xuat ban moi: ");
            Books[idexUpdate].setYear(Integer.parseInt(sc.nextLine()));
            break;
        case 7:
            isExit = false;
            break;
        default:
            System.out.println("nhap lai");
            break;
    }
} while (isExit);
			}else{
				System.out.println("ko tim thay sach");
			}
		}
		

		//
		public static void deleteBook(Scanner sc ){
			System.out.println("nhap ma can xoa ");
			int index = findBookId(sc.nextLine());
			if(index == -1){
				System.out.println("ko tim thay Book");
			}else{
				for(int i =index;i<currentIndex;i++){
					Books[index] =Books[index+1];
					currentIndex--;
				}
			}

		}
		//
public static double sumInterest(){
			double sum = 0;
			for(int i =0;i<currentIndex;i++){
				sum+=Books[i].getInterest();
			}
			return sum;
		}
		///
		public static void sortBookByInterest(){
			for(int i = 0 ; i<currentIndex-1;i++){
				for(int j = 0;j<currentIndex-1-i;j++){
					if(Books[j].getInterest()>Books[j+1].getInterest()){
						System.out.println(Books[i].getInterest());
						System.out.println(Books[j].getInterest());
						Book temp  = Books[j];
						Books[j] = Books[j+1];
						Books[j+1]=temp;
					}
				}
			}
			System.out.println("danh sách sách theo lợi nhuận ");
			printBooks();
		}

		public static void findBookByAuthor(Scanner sc ){
			System.out.println("nhap ten tac gia ");
			String findName = sc.nextLine();
			for(int i = 0 ; i <currentIndex;i++){
				if(Books[i].getAuthor().equals(findName)){
					Books[i].dispalyData();
				}
			}

		}
		
		public static void findByPrice(Scanner sc) {
			System.out.print("nhap khoang gia ban tu: ");
			double minPrice = sc.nextDouble();
			System.out.print("nhap khoang gia ban den: ");
			double maxPrice = sc.nextDouble();
			sc.nextLine();
			
			for (int i = 0; i < currentIndex; i++) {
				if (Books[i].getExportPrice() >= minPrice && Books[i].getExportPrice() <= maxPrice) {
					Books[i].dispalyData();
				}
			}
		}
		
		public static void compileBookByAuthor() {
			System.out.println("thong ke so luong sach theo moi tac gia:");
		
			for (int i = 0; i < currentIndex; i++) {  
				String author = Books[i].getAuthor();
				boolean alreadyCounted = false;
		
				for (int k = 0; k < i; k++) {  
					if (Books[k].getAuthor().equals(author)) {
						alreadyCounted = true; 
						break;
					}
				}
		
				if (!alreadyCounted) { 
					int bookCount = 0;
					for (int j = 0; j < currentIndex; j++) { 
						if (Books[j].getAuthor().equals(author)) {
							bookCount++;
						}
					}
					System.out.println(author.toLowerCase() + ": " + bookCount + " quyen sach");
				}
			}
		}
	
}
