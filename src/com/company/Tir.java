package com.company;

public class Tir extends Samochod {

    private Integer maxWaga;

    public Tir(String marka, String model, Integer maxWaga){
        super(marka, model);
        this.maxWaga = maxWaga;
    }

    public void przekrecLicznik(Integer przebieg){
        this.ustawPrzebieg(przebieg);
        if(this.przebieg > 150)
            this.przebieg -= 100;
    }

    @Override
    public void przyspiesz(Integer przyspiesznie){
        this.setPredkosc(przyspiesznie-5);
    }

}
