public class Main {
    public static void main(String[] args) {
        SpitalNotificare notificare=new SpitalNotificare();

        Pacient pacient1=new Pacient("Georgescu Catalin");
        Pacient pacient2=new Pacient("Iacob Veronica");
        Pacient pacient3=new Pacient("Ilie Robert");
        notificare.addObserver(pacient1);
        notificare.addObserver(pacient2);
        notificare.addObserver(pacient3);
        notificare.notifyAll("A aparut in Romania un virus nou numit COVID-19");
        notificare.removeObserver(pacient2);
        notificare.notifyAll("A aparut in Romania o epidemie de gripa");
    }
}
