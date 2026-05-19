package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.Book;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle, tfCategory, tfCost;

    public AddBookToStoreScreen(Store store) {
        super(store);
    }

    @Override
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4, 2, 5, 5));

        center.add(new JLabel("Title: "));
        tfTitle = new JTextField(10);
        center.add(tfTitle);

        center.add(new JLabel("Category: "));
        tfCategory = new JTextField(10);
        center.add(tfCategory);

        center.add(new JLabel("Cost: "));
        tfCost = new JTextField(10);
        center.add(tfCost);

        JButton btnAdd = new JButton("Add Book");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Book book = new Book();
                book.setTitle(tfTitle.getText());
                book.setCategory(tfCategory.getText());
                book.setCost(Float.parseFloat(tfCost.getText()));
                store.addMedia(book);
                JOptionPane.showMessageDialog(null, "Book added successfully!");
            }
        });
        center.add(btnAdd);

        return center;
    }
}