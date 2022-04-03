class  Library{

    static String bookName2;
    static int bookId;
    static  String issueDate;
    static int totalBookIssued;
    static String returnBookDate;

    void add(){
       java.util.Scanner obj1 = new java.util.Scanner(System.in);
        System.out.println("Enter book name: ");
        String bookName = obj1.nextLine();
        System.out.println("Enter book price");
        float price = obj1.nextFloat();
        System.out.println("Enter book no # ");
        int bookNo = obj1.nextInt();
        System.out.println("Your book name: "+bookName );
	System.out.println("Book Price: "+ price);
	System.out.println("Book Number: "+bookNo);
    }

    void issue(){
        java.util.Scanner obj2 = new java.util.Scanner(System.in);
        System.out.println("Book name: ");
        bookName2 = obj2.nextLine();
        System.out.println("Book Id: ");
        bookId = obj2.nextInt();
        obj2.nextLine();
        System.out.println("Book issue date: ");
        issueDate = obj2.nextLine();
        System.out.println("Total number of book issued: ");
        totalBookIssued = obj2.nextInt();
        obj2.nextLine();
        System.out.println("Return book date: ");
        returnBookDate  = obj2.nextLine();
    }
    int getId(){
        return bookId;
    }

    void returnBook(){
        java.util.Scanner obj3 = new java.util.Scanner(System.in);
        System.out.println("Enter student name: ");
        String studentName = obj3.nextLine();
        System.out.println("Enter book Id: ");
        int bookIdStu = obj3.nextInt();
        if (bookId == bookIdStu){
            System.out.println("Total Details!");
            System.out.println("Book Name: "+Library.bookName2);
            System.out.println("Book Id: "+Library.bookId);
            System.out.println("Issue Date: "+Library.issueDate);
            System.out.println("Total number of book issued: "+Library.totalBookIssued);
            System.out.println("Return date of book: "+Library.returnBookDate);
        }
        else {
            System.out.println("WRONG ID! please enter correct id");
        }
    }

    void issueDetails(){
        System.out.println("Book Name: "+Library.bookName2);
        System.out.println("Book Id: "+ Library.bookId);
        System.out.println("Issue Date: "+Library.issueDate);
        System.out.println("Total number of book issued: "+Library.totalBookIssued);
        System.out.println("Return date of book: "+Library.returnBookDate);

    }

    void exit(){
        System.exit(0);
    }
}




 class LibraryManagement {
    public static void main(String[] args) {
   System.out.println("***** welcome To Our Library *****");
       System.out.println("Hey how are you?");
	char yes_no;
	do  {   
        java.util.Scanner obj = new java.util.Scanner(System.in);
	String greetings = obj.nextLine();
        System.out.println("Press 1 to add Book");
        System.out.println("Press 2 to issue a book");
        System.out.println("press 3 to return a book");
        System.out.println("Press 4 to print complete issue detail");
        System.out.println("Press 5 to exit");

        System.out.println("Enter any number: ");
        int enter = obj.nextInt();

        switch (enter){
            case 1:
                Library addMethodObject = new Library();
                addMethodObject .add();
                break;
            case 2:
                Library issueMethodObject = new Library();
                issueMethodObject.issue();
                break;
            case 3:
                Library returnMethodObject = new Library();
                returnMethodObject.returnBook();
                break;
            case 4:
                Library detailMethodObject = new Library();
                detailMethodObject.issueDetails();
                break;
            case 5:
                Library exitMethodObject = new Library();
                exitMethodObject.exit();
                break;
            default:
                System.out.println("Invalid number! ");

        }
	System.out.print("press 'Y' to exit \n press 'N'  for continue " );
	  yes_no =  obj.next().charAt(0);
}
	while (yes_no == 'y'   ||   yes_no == 'Y');
	if (yes_no == 'n'   ||   yes_no == 'N'){
	Library out = new Library();
	out.exit();
}
}
}