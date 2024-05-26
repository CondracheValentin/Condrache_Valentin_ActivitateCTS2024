public class FactoryPersoanaJuridica implements IFactory{
    @Override
    public IClient adaugaClient() {
        return new PersoanaJuridica();
    }
}
