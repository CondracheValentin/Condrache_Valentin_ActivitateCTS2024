public class AdaptorCredit implements ICreditExistent{
    private CreditNou creditNou;

    public AdaptorCredit(CreditNou creditNou) {
        this.creditNou = creditNou;
    }

    @Override
    public void aprobaCredit() {
        creditNou.autorizeaza();
    }

    @Override
    public void platiRata() {
       creditNou.efectueazaPlata();
    }
}
