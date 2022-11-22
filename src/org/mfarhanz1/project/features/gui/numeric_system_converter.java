package org.mfarhanz1.project.features.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numeric_system_converter {

    private JTextField fromBase;
    private JTextField inputNumeric;
    private JPanel root;
    private JTextField toBase;
    private JButton startConvertingButton;
    private JLabel OutputConvert;

    public numeric_system_converter() {
        startConvertingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String result = null;

                int getFromBase = Integer.parseInt(fromBase.getText());
                int getToBase = Integer.parseInt(toBase.getText());

                String getInputNumeric = inputNumeric.getText();

                if(getFromBase == 2 || getFromBase == 8 || getFromBase == 10 || getFromBase == 16) {

                    switch (getToBase) {
                        case 2:
                            result = Long.toBinaryString(Long.parseLong(getInputNumeric, getFromBase));
                            break;
                        case 8:
                            result = Long.toOctalString(Long.parseLong(getInputNumeric, getFromBase));
                            break;
                        case 10:
                            result = Long.toString(Long.parseLong(getInputNumeric, getFromBase));
                            break;
                        case 16:
                            result = Long.toHexString(Long.parseLong(getInputNumeric, getFromBase));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Maaf Periksa Kembali Tujuan Pengubahan Basis Anda!");
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"Maaf Periksa Kembali Tipe Basis Input Anda!");
                }
                OutputConvert.setText("Output : " + result);
            }
        });
    }

    public JPanel getRoot() {
        return root;
    }

}
