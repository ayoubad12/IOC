package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl(); //instantiation statique
        MetierImpl metier = new MetierImpl(dao);//injection des dependences
        System.out.println("RES=" + metier.calcul());
    }
}
