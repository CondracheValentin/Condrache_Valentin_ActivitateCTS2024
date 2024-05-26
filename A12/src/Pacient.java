public class Pacient implements IObserver {
    private String name;

    public Pacient(String name){
        this.name=name;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Notificare pentru "+ name + ":"+mesaj);
    }
}
