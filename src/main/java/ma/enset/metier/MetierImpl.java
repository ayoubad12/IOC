package ma.enset.metier;

import ma.enset.dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao ;
    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data*11.4 ;
        return res;
    }

    //pour permettre d'injecter dans la variable dao
    //un objet d'une calsse de type IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
