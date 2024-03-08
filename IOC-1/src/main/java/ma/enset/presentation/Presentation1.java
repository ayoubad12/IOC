package ma.enset.presentation;

import ma.enset.dao.DaoImpl;
import ma.enset.dao.IDao;
import ma.enset.ext.DaoImpl2;
import ma.enset.metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl(); //instantiation statique
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao); //injection des dependences
        System.out.println("RES=" + metier.calcul());
    }
}
