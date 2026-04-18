package lab02.src;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book();
        book.setTitle("Harry Potter");
        book.setCategory("Fantasy");
        book.setCost(15.99f);
        
        CompactDisc cd = new CompactDisc("Thriller", "Pop", "Michael Jackson", "Quincy Jones", 20.00f);

        store.addMedia(dvd);
        store.addMedia(book);
        store.addMedia(cd);

        store.print();

        System.out.println("\n--- Xóa thử sách Harry Potter ---");
        store.removeMedia(book);
        store.print();
    }
}