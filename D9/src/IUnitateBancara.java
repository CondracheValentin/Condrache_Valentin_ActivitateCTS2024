import java.util.List;

public interface IUnitateBancara {
    void afiseazaDetalii();
    void aduaga(IUnitateBancara unitate);
    void sterge(IUnitateBancara unitate);
    List<IUnitateBancara> getSubunitati();
}
