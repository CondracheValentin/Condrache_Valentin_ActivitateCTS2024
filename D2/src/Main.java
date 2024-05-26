public class Main {
    public static void main(String[] args) {
        IFactory factory1=null;
        factory1=new FactoryPersoanaFizica();

        IClient client1=null;
        client1=factory1.adaugaClient();
        client1.afisareDescriere();

        IFactory factory2=null;
        factory2=new FactoryPersoanaJuridica();

        IClient client2=null;
        client2=factory2.adaugaClient();
        client2.afisareDescriere();

        IFactory factory3=null;
        factory3=new FactoryPersoanaJuridica();

        IClient client3=null;
        client3=factory3.adaugaClient();
        client3.afisareDescriere();
    }
}
