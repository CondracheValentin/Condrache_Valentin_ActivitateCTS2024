public class CreditProxy implements ICredit{
    private Credit credit;
    public CreditProxy(){
        this.credit=new Credit();
    }

    @Override
    public void creareCont(String moneda) {
        if ("RON".equalsIgnoreCase(moneda)) {
            credit.creareCont(moneda);
        } else {
            System.out.println("Doar moneda RON este permisa pentru creare conturi");
        }
    }
}
