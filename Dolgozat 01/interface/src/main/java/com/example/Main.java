// Krizsicskó Márk
// https://github.com/krizsicskomark
// SZOFT II/1/N 
// 2024.10.08
// Main.java

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hálózati kapcsolatot szimuláló program");
        System.out.println("Krizsicskó Márk, II/1/N");

        Network network = new Network();

        network.connectToNetwork("Internet");
        network.disconnectFromNetwork();
    }
}