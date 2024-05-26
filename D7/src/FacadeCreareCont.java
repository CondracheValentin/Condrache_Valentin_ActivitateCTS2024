public class FacadeCreareCont {
    private VerificareVarsta verificareVarsta;
    private VerificareCazier verificareCazier;
    private VerificareCreante verificareCreante;

    public FacadeCreareCont() {
        this.verificareVarsta =new VerificareVarsta();
        this.verificareCazier =new VerificareCazier();
        this.verificareCreante =new VerificareCreante();
    }
    public boolean poateCreaCont(String nume, int varsta) {
        if (!verificareVarsta.esteVarstaValida(varsta)) {
            System.out.println("Vârsta nu este validă pentru crearea unui cont");
            return false;
        }
        if (!verificareCazier.areCazierCurat(nume)) {
            System.out.println("Persoana are cazier judiciar");
            return false;
        }
        if (verificareCreante.areCreante(nume)) {
            System.out.println("Persoana are creanțe la alte bănci");
            return false;
        }
        System.out.println("Toate verificările au fost trecute. Se poate crea contul.");
        return true;
    }
}
