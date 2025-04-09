/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.espoch.edu.vectores;

import java.util.Scanner;

/**
 *
 * @author KARLA
 */
public class Vectores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = new int[10];
        int contRegular = 0;
        int contBueno = 0;
        int contExcelente = 0;
        int i = 0;

        System.out.println("Ingrese las notas de los estudiantes (0-10):");
        while (i < 10) {
            notas[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < 10) {
            if (notas[i] > 0 && notas[i] <= 6) {
                contRegular++;
            } else if (notas[i] > 6 && notas[i] <= 8) {
                contBueno++;
            } else if (notas[i] > 8 && notas[i] <= 10) {
                contExcelente++;

            }
            i++;
        }

        System.out.println("Existen " + contRegular + " estudiantes con una calificación regular.");
        System.out.println("Existen " + contBueno + " estudiantes con una calificación buena.");
        System.out.println("Existen " + contExcelente + " estudiantes con una calificación excelente.");
    }
}


