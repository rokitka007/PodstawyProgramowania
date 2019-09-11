package com.company;

import java.util.Date;

public class Samochod {

    private String typ;
    public String marka;
    public String model;
    public Integer przebieg;
    public Boolean stan;
    private Integer predkosc;


    public Samochod(String marka, String model){
        this.marka = marka;
        this.model = model;
        this.predkosc = 0;
        this.przebieg = 0;
        this.typ = "osobowy";
    }

    //setter
    public void ustawPrzebieg(Integer przebieg){
        this.przebieg = przebieg;
    }

    public String getInfo(){
        String info = "Marka samochodu: " + this.marka + "\n";
        info += "Model samochodu: " + this.model;
        return info;
    }

    //setter
    public void setPredkosc(Integer predkosc){
        this.predkosc = predkosc;
    }

    public void przyspiesz(Integer przyspieszenie){
        this.predkosc += przyspieszenie;
    }

    //getter
    public Integer getPredkosc(){
        return this.predkosc;
    }

    private void sprawdzStan(){
        //Instrukcja warunkowa
        //Jeśli (warunek) {kod wykonywany jeśli warunek jest spełniony}
        //else, tj. w innym wypadku, jeśli warunek nie jest spełniony, { wykonaj kod}
        if(this.przebieg > 50){
            this.stan = true;
        } else{
            this.stan = false;
        }
    }

    public String getStan() {
        String info;
        this.sprawdzStan();
        if(this.stan) {
            info = "Auto jest zużyte";
            System.out.println("Not intersted");
        }
        else
            info = "Auto jest całkiem nowe";

        return info;
    }
}
