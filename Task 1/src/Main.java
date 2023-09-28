import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double costBook = inputCostBook();
            addBook(name);
            System.out.println();
            addBook(name, pageCount);
            System.out.println();
            addBook(name,pageCount,costBook);
            System.out.println();
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }
    static double inputCostBook(){
        System.out.println("Введите цену книги: ");
        return new Scanner(System.in).nextDouble();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        addBook(bookName,pageCount,0);
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }
    static void addBook(String name, int pageCount, double costBook){
        booksInfo=booksInfo+ name+", "+pageCount+" стр. "+(costBook>0 ? ","+costBook:",N/A")+" руб.\n";
    }

}
