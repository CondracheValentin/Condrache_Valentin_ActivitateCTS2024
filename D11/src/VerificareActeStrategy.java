public class VerificareActeStrategy {
    private IVerificareActe strategie;

    public void setStrategie(IVerificareActe strategie) {
        this.strategie = strategie;
    }
    public void verifica() {
        if (strategie != null) {
            strategie.verificaActe();
        } else {
            System.out.println("Nicio strategie de verificare a actelor nu a fost setata");
        }
    }

}
