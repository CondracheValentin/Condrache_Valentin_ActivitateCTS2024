public class Main {
    public static void main(String[] args) {
        FarmacieNotificare notificare=new FarmacieNotificare();

        Client client1=new Client("Georgescu Vasile");
        Client client2=new Client("Tofan Cosmin");
        Client client3=new Client("Ciobotaru Andreea");

        notificare.addObserver(client1);
        notificare.addObserver(client2);
        notificare.addObserver(client3);
        notificare.notifyAll("A aparut reduceri la antibiotice");
        notificare.removeObserver(client2);
        notificare.notifyAll("Avem oferte semnificative la medicamente");
    }
}
