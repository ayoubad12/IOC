package ma.enset.dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version de BD");
        double data = 21 ;
        return data;
    }
}
