public class Main {
    public static void main(String[] args) {
        ICredit credit=new CreditProxy();
        credit.creareCont("RON");
        credit.creareCont("EUR");
        credit.creareCont("USD");
    }
}
