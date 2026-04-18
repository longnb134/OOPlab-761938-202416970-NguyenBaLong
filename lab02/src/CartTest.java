package lab02.src;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        Book book1 = new Book();
        book1.setTitle("Harry Potter");
        book1.setCategory("Fantasy");
        book1.setCost(15.99f);

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(book1);

        cart.print();
        
        System.out.println("\n--- Search Results ---");
        cart.searchByTitle("Harry");
    }
}