package Ex2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        classeoperadora cl = new classeoperadora();

        String text = JOptionPane.showInputDialog("Insira um texto: ");
        cl.concatenaString(text);
    }
}
