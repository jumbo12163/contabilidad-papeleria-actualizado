
package com.example.contabilidadpapeleria;

import javax.swing.*;

public class ContabilidadPapeleria {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MenuContabilidad().setVisible(true);
        });
    }
}

