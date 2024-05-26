public class FactoryPersoanaFizica implements IFactory{
    @Override
    public IClient adaugaClient() {
        return new PersoanaFizica();
    }
}
