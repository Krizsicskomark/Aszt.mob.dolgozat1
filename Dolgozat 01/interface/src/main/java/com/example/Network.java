// Krizsicskó Márk
// https://github.com/krizsicskomark
// SZOFT II/1/N 
// 2024.10.08
// Network.java

package com.example;

public class Network implements Connect {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Kapcsolódott ehhez a hálózathoz: "+ networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Megszakadt a kapcsolat a hálózattal");
    }
    
}

