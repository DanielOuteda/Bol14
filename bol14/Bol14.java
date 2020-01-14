/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol14;

import java.util.Scanner;

/**
 *
 * @author doutedasolla
 */
public class Bol14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorTemperaturas obx = new ConversorTemperaturas();
        System.out.println("Escribe la temperatura");
        float gCentigrados = sc.nextFloat();
        try {
            obx.centigradosAFharenheit(gCentigrados);
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println("Error1 " + ex.toString());
        }
        try {
            obx.centígradosAReamur(gCentigrados);
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println("Error2 " + ex.toString());
        }
    }

}
