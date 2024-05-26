import java.util.ArrayList;
import java.util.List;

public class Agentie implements IUnitateBancara{
    private String nume;
    private List<IUnitateBancara> subunitati;

    public Agentie(String nume) {
        this.nume = nume;
        this.subunitati = new ArrayList<>();
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(" Agentie "+nume);
        for(IUnitateBancara subunitate : subunitati){
            subunitate.afiseazaDetalii();
        }
    }

    @Override
    public void aduaga(IUnitateBancara unitate) {
       subunitati.add(unitate);
    }

    @Override
    public void sterge(IUnitateBancara unitate) {
       subunitati.remove(unitate);
    }

    @Override
    public List<IUnitateBancara> getSubunitati() {
        return subunitati;
    }
}
