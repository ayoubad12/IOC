package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version de BD");
        double data = 21 ;
        return data;
    }
}
