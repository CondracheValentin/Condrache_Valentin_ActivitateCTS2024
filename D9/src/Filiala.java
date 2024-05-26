import java.util.Collections;
import java.util.List;

public class Filiala implements IUnitateBancara{
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("  Filiala "+nume);
    }

    @Override
    public void aduaga(IUnitateBancara unitate) {
       throw new UnsupportedOperationException();
    }

    @Override
    public void sterge(IUnitateBancara unitate) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<IUnitateBancara> getSubunitati() {
        return null;
    }
}
