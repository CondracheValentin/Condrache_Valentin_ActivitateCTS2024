public class Main {
    public static void main(String[] args) {
        VerificareActeStrategy strategie=new VerificareActeStrategy();

        strategie.setStrategie(new VerificareActePersoanaFizica());
        strategie.verifica();
        strategie.setStrategie(new VerificareActePersoanaJuridica());
        strategie.verifica();
        strategie.setStrategie(new VerificareActePersoanaFizica());
        strategie.verifica();
    }
}
