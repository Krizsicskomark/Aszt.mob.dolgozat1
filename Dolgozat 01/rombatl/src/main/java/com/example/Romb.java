// Krizsicskó Márk
// https://github.com/krizsicskomark
// SZOFT II/1/N
// 2024.10.08
// Romb.java

package com.example;

import java.util.Scanner;

public class Romb {
    public void calcRomb() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("e átló értéke: ");
            Double e = sc.nextDouble();
            
            System.out.print("f átló értéke:");
            Double f = sc.nextDouble();
            
            double terulet = (e*f)/2;
            System.out.println("A rombusz területe: " + terulet);
        }
        
    }
}