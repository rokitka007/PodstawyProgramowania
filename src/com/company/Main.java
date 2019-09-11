package com.company;

import java.util.*;

public class Main {
    //NAWIGACJA
    //najeżdzamy kursorem na zmienna/metode/klase, kombinacja ctrl + lewy przycisk myszki
    //ctrl + z - cofaj zmiany
    //alt+enter na nieistniejącej zmiennej

    //Funkcja jest bloczkiem kodu, który jest reużywalny
    public static String pierwszaMetoda(){
        String costam = "costam";
        return costam;
    }

    public static Double dodawanie(Integer a, Double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Pierwszy rzut");

        //Zmienna tekstowa (jest ciągiem zmiennych typu Char
        Character character = 'a';
        char c;
        String pierwszyS = "nowy String";

        //Zmienne liczbowe
        Integer liczba1 = 1;
        int l1;
        Float liczba2 = 10.4f;
        Double liczba3 = 10.3;

        System.out.println(pierwszaMetoda());
        String wiadomość = "Liczba " + liczba1 + " + liczba " + liczba3 + " wynosi " + dodawanie(liczba1, liczba3);
        System.out.println(wiadomość);

        //na czarno (Char, Ingteger) - definicja typu zmienny
        // nazwy zmiennej np. liczba1, pierwszyS
        // operatory java np =, + https://www.w3schools.com/java/java_operators.asp

        //Klasy i obiekty
        //Inicjalizacja obiektów
        Samochod opel = new Samochod("opel", "astra");
        System.out.println(opel.getInfo());

        System.out.println("Inny samochód");

        Samochod toyota = new Samochod("toyota", "yaris");
        System.out.println(toyota.getInfo());

        //wykorzystanie metod klasy w obiektach
        opel.przyspiesz(10);
        System.out.println("Nowa prędkość: " + opel.getPredkosc());
        opel.przyspiesz(50);
        System.out.println("Nowa prędkość: " + opel.getPredkosc());
        opel.ustawPrzebieg(20);
        System.out.println(opel.getStan());
        opel.ustawPrzebieg(60);
        System.out.println(opel.getStan());

        //Dziedziczenie
        Tir mojTir = new Tir("jelcz", "jelczowy", 13);
        System.out.println(mojTir.getInfo());
        mojTir.ustawPrzebieg(1500);
        System.out.println(mojTir.przebieg);
        mojTir.przekrecLicznik(1500);
        System.out.println(mojTir.przebieg);
        System.out.println(mojTir.getStan());
        mojTir.przyspiesz(25);
        System.out.println("Przyspieszenie tira: " + mojTir.getPredkosc());

        //Złożone typy zmiennych
        //[element, element, element] ->0, 1, 2
        List<String> lista1 = new ArrayList<>();
        lista1.add("element1");
        lista1.add("element2");
        lista1.add(1, "element3");
        System.out.println("wielkosc listy" + lista1.size());
        System.out.println(lista1.toString());

        Hashtable<String, String> table = new Hashtable<>();
        table.put("zajecia", "testPoz4");
        table.put("zajecia2", "testPoz3");
        System.out.println("Tabela " + table.get("zajecia"));

    }
}
