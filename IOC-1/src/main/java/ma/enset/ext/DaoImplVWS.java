package ma.enset.ext;

import ma.enset.dao.IDao;

public class DaoImplVWS implements IDao {

    @Override
    public double getData() {
        System.out.println("version web service:");
        return 90;
    }
}
