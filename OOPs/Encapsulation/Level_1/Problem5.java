public class Problem5 {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[] {
            new Book(1,"Effective Java","Joshua Bloch"),
            new Magazine(2,"Time","Various"),
            new DVD(3,"Inception","Christopher Nolan")
        };
        for (LibraryItem it : items) {
            System.out.println(it.getItemDetails() + " LoanDuration: " + it.getLoanDuration() + " days");
            if (it instanceof Reservable) {
                ((Reservable)it).reserveItem("Gaurav");
                System.out.println("Availability: " + ((Reservable)it).checkAvailability());
            }
            System.out.println("----");
        }
    }
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    public LibraryItem(int id, String title, String author) { this.itemId=id; this.title=title; this.author=author; }
    public int getItemId(){return itemId;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getItemDetails(){ return "["+itemId+"] "+title+" by "+author; }
    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private String reservedBy;
    public Book(int id,String title,String author){ super(id,title,author); }
    @Override
    public int getLoanDuration(){ return 21; }
    @Override
    public void reserveItem(String borrower){ this.reservedBy = borrower; }
    @Override
    public boolean checkAvailability(){ return reservedBy == null; }
}

class Magazine extends LibraryItem {
    public Magazine(int id,String title,String author){ super(id,title,author); }
    @Override
    public int getLoanDuration(){ return 7; }
}

class DVD extends LibraryItem implements Reservable {
    private String reservedBy;
    public DVD(int id,String title,String author){ super(id,title,author); }
    @Override
    public int getLoanDuration(){ return 5; }
    @Override
    public void reserveItem(String borrower){ this.reservedBy = borrower; }
    @Override
    public boolean checkAvailability(){ return reservedBy == null; }
}
