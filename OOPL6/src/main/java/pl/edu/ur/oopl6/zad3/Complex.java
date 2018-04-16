/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;

public class Complex {
    
    private double Re;
    private double Im;

    public Complex(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }
    
    public Complex(){ }
    
    public static double sprzezenie(double Im){
        return -Im;
    }
    
    public static double modul(double Re, double Im){
        return Math.sqrt(Math.pow(Re, 2) + Math.pow(Im, 2));
    }
    
    public static void sumaA(double Re, double Im, double Re2, double Im2){
        System.out.println("SumaA: "+ (Re + Re2) +"+("+(Im + Im2) +")i");
    }
    
    public static void roznicaA(double Re, double Im, double Re2, double Im2){
        System.out.println("RoznicaA: "+ (Re - Re2) +"+("+ (Im - Im2) +")i");
    }
    
    public static void iloczynA(double Re, double Im, double Re2, double Im2){
        System.out.println("IloczynA: "+ (Re * Re2 - Im * Im2) +"+("+ (Re2 * Im + Re * Im2) +")i");
    }
    
    public static void ilorazA(double Re, double Im, double Re2, double Im2){
        System.out.println("IlorazA: "+ (Re * Re2 - Im * Im2) / (Math.pow(Re2, 2) + Math.pow(Im2, 2)) +"+("+ (Re * (-Im2) + Im * Re2) / (Math.pow(Re2, 2) + Math.pow(Im2, 2)) +")i");
    }
    
    public static double kat(double Re, double Im){
        double sin = Im / modul(Re, Im); double cos = Re / modul(Re, Im);
        
        if(Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) > 0){
            return Math.toDegrees(Math.asin(sin));
        }
        else if(Math.toDegrees(Math.asin(sin)) < 0 && Math.toDegrees(Math.acos(cos)) < 0){
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 3 / 2));
        }
        else if(Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) < 0){
            return Math.toDegrees(Math.asin(sin) + (Math.PI / 2));
        }
        else{
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 2));
        }
    }
    
    public static void zamianaAnaW(double Re, double Im){
        System.out.println("Postac wykladnicza: "+ modul(Re, Im) + " * e ^ ("+ kat(Re, Im) + " * i)");
    }
    
    public static void zamianaWnaA(double Re, double Im){
        System.out.println("Postac algebraiczna: "+ (modul(Re, Im) * Math.cos(Math.toRadians(kat(Re, Im)))) +"+("+ (modul(Re, Im) * Math.sin(Math.toRadians(kat(Re, Im)))) +")i");
    }
    
    public static void sumaW(double Re, double Im, double Re2, double Im2){
        System.out.println("SumaW: "+ kat((modul(Re, Im) * Math.cos(kat(Re, Im)) + modul(Re2, Im2) * Math.cos(kat(Re2, Im2))), (modul(Re, Im) * Math.sin(kat(Re, Im)) + modul(Re2, Im2) * Math.sin(kat(Re2, Im2)))));
    }
    
    public static void ilorazW(double Re, double Im, double Re2, double Im2){
        System.out.println("IlorazW: "+ (modul(Re, Im) / modul(Re2, Im2)) +" * e ^ ("+ (kat(Re, Im) - kat(Re2, Im2)) +" * i)");
    }
    
    public static String Alg(double Re, double Im){
        String wynik = "Postac algebraiczna: "+ (modul(Re, Im) * Math.cos(Math.toRadians(kat(Re, Im)))) +"+("+ (modul(Re, Im) * Math.sin(Math.toRadians(kat(Re, Im)))) +")i";
        return wynik;
    }
    
    public static String Wyk(double Re, double Im){
        String wynik = "Postac wykladnicza: "+ modul(Re, Im) + " * e ^ ("+ kat(Re, Im) + " * i)";
        return wynik;
    }
    
    public static String Try(double Re, double Im){
        String wynik = "Postac trygonometryczna: "+ modul(Re, Im) + " * (cos" + kat(Re, Im) +" + "+ "i * sin"+ kat(Re, Im) +")";
        return wynik;
    }
}
