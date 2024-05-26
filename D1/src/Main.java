public class Main {
    public static void main(String[] args) {
        CreditFactory creditFactory=new CreditFactory();
        ICredit credit=null;
        try{
            credit=creditFactory.creareCredit(ETipCredit.NEVOI_PERSONALE);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        credit.afisareDescriere();
    }

}
