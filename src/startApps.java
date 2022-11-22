import javax.swing.*;
import org.mfarhanz1.project.features.gui.numeric_system_converter;

public class startApps {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Numeric System Converter");
        jframe.setContentPane(new numeric_system_converter().getRoot());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setSize(500,200);
        jframe.setVisible(true);
    }
}
