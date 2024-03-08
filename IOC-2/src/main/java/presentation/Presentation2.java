package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //DaoImpl dao = new DaoImpl(); //instantiation statique
        //l'instanciation dynamique
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class classDao = Class.forName(daoClassName);
        IDao dao = (IDao) classDao.getConstructor().newInstance();


//        MetierImpl metier = new MetierImpl();
        String metierClassName = sc.nextLine();
        Class classMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) classMetier.getConstructor(IDao.class).newInstance(dao);


        System.out.println("RES="+metier.calcul());
    }
}
