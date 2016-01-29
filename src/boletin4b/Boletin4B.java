package boletin4b;

import javax.swing.JOptionPane;

public class Boletin4B {

    public static void main(String[] args) {
        Consumo coche = new Consumo();
        int c = Integer.parseInt(JOptionPane.showInputDialog("teclea kms "));
        coche.setKm(c);
        int k = Integer.parseInt(JOptionPane.showInputDialog("teclea consumo "));
        coche.setLitros(k);

        int q = Integer.parseInt(JOptionPane.showInputDialog("precio gasolina?"));
        coche.setpGas(q);
        int r = Integer.parseInt(JOptionPane.showInputDialog("a cuanto vas?"));
        coche.setvMedia(r);
        coche.consumoEuros();
        coche.consumoMedio();
        coche.getTempo();
    }
}
