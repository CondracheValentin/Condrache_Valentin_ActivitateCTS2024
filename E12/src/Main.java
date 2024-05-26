public class Main {
    public static void main(String[] args) {
        SalaDeSportNotificare notificare=new SalaDeSportNotificare();

        Client client1=new Client("Lionel Messi");
        Client client2=new Client("Cristiano Ronaldo");
        Client client3=new Client("Kylian Mbappe");

        notificare.addObserver(client1);
        notificare.addObserver(client2);
        notificare.addObserver(client3);
        notificare.notifyAll("Astazi avem meci de fotbal dintre FCSB si Dinamo");
        notificare.removeObserver(client2);
        notificare.notifyAll("Astazi avem meci de handbal dintre Romania si Franta");
    }
}
