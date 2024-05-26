public class Main {
    public static void main(String[] args) {
        CreditNou creditNou=new CreditNou();
        ICreditExistent credit=new AdaptorCredit(creditNou);
        credit.aprobaCredit();
        credit.platiRata();
    }
}
