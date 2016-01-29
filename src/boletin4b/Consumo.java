/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4b;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Consumo {

    //declaracion de atributos
    private double km;
    private double litros;
    private double vMed;
    private double pGas;

    //contructores
    public Consumo() {
    }

    ;
    public Consumo(double km, double litros, double vMed, double pGas) {
        this.km = km;
        this.litros = litros;
        this.pGas = pGas;
        this.vMed = vMed;

    }

    //Métodos
    public void getTempo() {
        JOptionPane.showMessageDialog(null, "tardarás: " + (km / vMed));
    }

    public void consumoMedio() {
        JOptionPane.showMessageDialog(null, "consumo: " + (litros * km / 100)+"menos que el c3, fijo");
    }

    public void consumoEuros() {
        JOptionPane.showMessageDialog(null, "precio" + (pGas * litros * km)+", puto c3");
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setpGas(float pGas) {
        this.pGas = pGas;
    }

    public void setvMedia(float vMed) {
        this.vMed = vMed;
    }
}
