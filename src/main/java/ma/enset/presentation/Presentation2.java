package ma.enset.presentation;

import ma.enset.dao.DaoImpl;
import ma.enset.dao.IDao;
import ma.enset.metier.IMetier;
import ma.enset.metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.management.ClassLoadingMXBean;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        DaoImpl dao = new DaoImpl(); //instantiation statique
        //l'instanciation dynamique
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine() ;
        Class classDao = Class.forName(daoClassName);
        IDao dao = (IDao) classDao.getConstructor().newInstance();


//        MetierImpl metier = new MetierImpl();
        String metierClassName = sc.nextLine();
        Class classMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) classMetier.getConstructor().newInstance();

//        metier.setDao(dao); //injection des dependences statique
        Method setDao = classMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao); //injection des dependences dynamique

        System.out.println("RES="+metier.calcul());

    }
}
