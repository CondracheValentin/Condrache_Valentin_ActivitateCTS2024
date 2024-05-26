public class AchizitieMedicamente extends AAchizitieMedicamente{
    @Override
    void primireReteta() {
        System.out.println("Se primeste reteta");
    }

    @Override
    boolean verificareStoc() {
        return false;
    }

    @Override
    void aduceMedicamente() {
        System.out.println("Se aduc medicamentele");
    }

    @Override
    void incaseazaBani() {
        System.out.println("Se incaseaza banii");
    }

    @Override
    void scadeStoc() {
        System.out.println("Se scade stocul medicamentelor");
    }

    @Override
    void emiteBon() {
        System.out.println("Se emite bonul fiscal");
    }

    @Override
    void mergeInDepozit() {
        System.out.println("Se merge in depozit");
    }

    @Override
    void achizitieAnulata() {
        System.out.println("Achizitia va fi anulata");
    }
}
