package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.CompactDisc;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle, tfCategory, tfArtist, tfDirector, tfCost;

    public AddCompactDiscToStoreScreen(Store store) {
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

        center.add(new JLabel("Artist: "));
        tfArtist = new JTextField(10);
        center.add(tfArtist);

        center.add(new JLabel("Director: "));
        tfDirector = new JTextField(10);
        center.add(tfDirector);

        center.add(new JLabel("Cost: "));
        tfCost = new JTextField(10);
        center.add(tfCost);

        JButton btnAdd = new JButton("Add CD");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CompactDisc cd = new CompactDisc(tfTitle.getText(), tfCategory.getText(), tfArtist.getText(), tfDirector.getText(), Float.parseFloat(tfCost.getText()));
                store.addMedia(cd);
                JOptionPane.showMessageDialog(null, "CD added successfully!");
            }
        });
        center.add(btnAdd);

        return center;
    }
}