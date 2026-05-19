package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle, tfCategory, tfDirector, tfLength, tfCost;

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
    }

    @Override
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(6, 2, 5, 5));

        center.add(new JLabel("Title: "));
        tfTitle = new JTextField(10);
        center.add(tfTitle);

        center.add(new JLabel("Category: "));
        tfCategory = new JTextField(10);
        center.add(tfCategory);

        center.add(new JLabel("Director: "));
        tfDirector = new JTextField(10);
        center.add(tfDirector);

        center.add(new JLabel("Length: "));
        tfLength = new JTextField(10);
        center.add(tfLength);

        center.add(new JLabel("Cost: "));
        tfCost = new JTextField(10);
        center.add(tfCost);

        JButton btnAdd = new JButton("Add DVD");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DigitalVideoDisc dvd = new DigitalVideoDisc(tfTitle.getText(), tfCategory.getText(), tfDirector.getText(), Integer.parseInt(tfLength.getText()), Float.parseFloat(tfCost.getText()));
                store.addMedia(dvd);
                JOptionPane.showMessageDialog(null, "DVD added successfully!");
            }
        });
        center.add(btnAdd);

        return center;
    }
}