public class InternarePacient extends AInternarePacient{
    @Override
    void analizeazaStare() {
        System.out.println("Analizeaza dificultatea starii pacientului");
    }

    @Override
    void verificaDisponibilateSalon() {
        System.out.println("Verifica disponibilatea in saloanele spitalului");
    }

    @Override
    void emiteFisa() {
        System.out.println("Se emite fisa de internare");
    }
}
