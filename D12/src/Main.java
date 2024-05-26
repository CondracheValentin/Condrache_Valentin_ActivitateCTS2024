public class Main {
    public static void main(String[] args) {
        BancaNotificare notificare=new BancaNotificare();

        Client client1=new Client("Ciobanu Andrei");
        Client client2=new Client("Sterp Iancu");
        notificare.addObserver(client1);
        notificare.addObserver(client2);
        notificare.notifyAll("Noua oferta de imprumut la dobanzi mici");
        notificare.removeObserver(client1);
        notificare.notifyAll("Actualizare noua oferta");
    }
}
