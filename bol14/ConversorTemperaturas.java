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
public class ConversorTemperaturas {

    Scanner sc = new Scanner(System.in);
    public int tMinima = 80;
    private float gFharanheit;

    public ConversorTemperaturas() {
    }

    public ConversorTemperaturas(float gCentigrados, float gFharanheit, float gReamur) {
        this.gFharanheit = gFharanheit;
    }

    public float centigradosAFharenheit(float gCentigrados) throws TemperaturaErradaExcepcion {
        if (tMinima > gCentigrados) {
            throw new TemperaturaErradaExcepcion("Non pode ser menor de 80 grados");
        }
        System.out.println("Grados Fahrenheit = " + (gCentigrados * 9 / 5) + 32.4);

        return gFharanheit;
    }

    public void centígradosAReamur(float gCentigrados) throws TemperaturaErradaExcepcion {
        if (tMinima > gCentigrados) {
            throw new TemperaturaErradaExcepcion("Non pode ser menor de 80 grados");
        }
        System.out.println("Grados Reamur = " + (gCentigrados * 4 / 5));
    }

}
