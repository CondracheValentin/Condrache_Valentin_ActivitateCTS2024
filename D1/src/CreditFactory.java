public class CreditFactory {

    public ICredit creareCredit(ETipCredit tipCredit) throws Exception{
        switch (tipCredit){
            case IPOTECARE:
                return new CreditIpotecar();
            case NEVOI_PERSONALE:
                return new CreditNevoiPersonale();
            default:
                throw new Exception("Nu este tip de credit valid!");
        }
    }
}
