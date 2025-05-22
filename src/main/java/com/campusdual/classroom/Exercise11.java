package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println("MANDO ROJO");
        redRemote.turnOn();
        redRemote.channelUp();
        System.out.println("Estas en el canal: " + redRemote.channel);
        redRemote.channelDown();
        System.out.println("Estas en el canal: " + redRemote.channel);
        redRemote.channel = 0;
        redRemote.channelDown();
        System.out.println("Estas en el canal: " + redRemote.channel);
        redRemote.volumeUp();
        System.out.println("Estas en el volumen: " + redRemote.volume);
        redRemote.volumeDown();
        System.out.println("Estas en el volumen: " + redRemote.volume);
        redRemote.volume = 0;
        System.out.println("Estas en el volumen: " + redRemote.volume);
        System.out.println("El color del mando es: " + redRemote.getColor());
        System.out.println("MANDO NEGRO");
        blackRemote.turnOn();
        blackRemote.channelUp();
        System.out.println("Estas en el canal: " + blackRemote.channel);
        blackRemote.channelDown();
        System.out.println("Estas en el canal: " + blackRemote.channel);
        blackRemote.channel = 0;
        blackRemote.channelDown();
        System.out.println("Estas en el canal: " + blackRemote.channel);
        blackRemote.volumeUp();
        System.out.println("Estas en el volumen: " + blackRemote.volume);
        blackRemote.volumeDown();
        System.out.println("Estas en el volumen: " + blackRemote.volume);
        blackRemote.volume = 0;
        blackRemote.volumeDown();
        System.out.println("Estas en el volumen: " + blackRemote.volume);
        System.out.println("El color del mando es: " + blackRemote.getColor());
    }
}