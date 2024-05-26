public class OcupareMasa extends AOcupareMasa{
    @Override
    void curatareMasa() {
        System.out.println("Se curata masa");
    }

    @Override
    void asezareServetele() {
        System.out.println("Se aseaza servetelele");
    }

    @Override
    void asezareTacamuri() {
        System.out.println("Se aseaza tacamurile");
    }

    @Override
    void invitaPersoane() {
        System.out.println("Sunt invitate persoanele la masa");
    }
}
