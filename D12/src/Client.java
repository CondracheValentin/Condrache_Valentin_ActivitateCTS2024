public class Client implements IObserver{
    private String name;

    public Client(String name){
        this.name=name;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Notificare pentru "+ name + ":"+mesaj);
    }
}
