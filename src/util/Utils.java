package util;

import javax.swing.*;
import java.awt.*;

public class Utils {
    public static void showImageWindow (Image image){
        showImageWindow(image, 1000, 720);
    }

    public static void showImageWindow(Image image, int width, int height) {
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel picLable = new JLabel(new ImageIcon(image));

        BorderLayout borderLayout = new BorderLayout();
        frame.getContentPane().setLayout(borderLayout);
        frame.getContentPane().add(picLable, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
