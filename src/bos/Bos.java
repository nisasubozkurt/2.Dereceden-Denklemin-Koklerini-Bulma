/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bos;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Bos {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Kullanıcı tarafından girilen a , b ve c değerlerini giriniz ");

        double a = giris.nextDouble();
        double b = giris.nextDouble();
        double c = giris.nextDouble();
        double delta = (b * b - 4 * a * c);
        double x;
        if (delta > 0) {
            System.out.println("iki değeri vardır ");
        }

        if (delta == 0) {
            System.out.println("Çift katlı bir kökü mevcuttur");
            x = -b + 2 * a;

        }
        if (delta < 0) {
            System.out.println("Denklemin reel kökü yoktur");
        }

    }
}
