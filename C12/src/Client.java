public class Client implements IObserver{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Notificare pentru "+ nume + ":"+mesaj);
    }
}
