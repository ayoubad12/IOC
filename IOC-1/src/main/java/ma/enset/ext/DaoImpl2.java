package ma.enset.ext;

import ma.enset.dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double data = 55 ;
        return data;
    }
}
