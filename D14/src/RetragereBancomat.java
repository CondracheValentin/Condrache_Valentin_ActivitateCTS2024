public class RetragereBancomat extends ARetragereBancomat {
    @Override
    void introducereCard() {
        System.out.println("Cardul a fost introdus");
    }

    @Override
    void introducerePIN() {
        System.out.println("PIN-ul a fost introdus");
    }

    @Override
    void specificareSuma() {
        System.out.println("Suma solicitata a fost specificata");
    }

    @Override
    void retragereBani() {
        System.out.println("Banii au fost retrasi");
    }

    @Override
    void retragereCard() {
        System.out.println("Cardul a fost retras");
    }
}
