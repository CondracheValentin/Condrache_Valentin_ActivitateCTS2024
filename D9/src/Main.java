public class Main {
    public static void main(String[] args) {
        IUnitateBancara filiala1=new Filiala("BT Iasi");
        IUnitateBancara filiala2=new Filiala("Patria Bank Cluj");
        IUnitateBancara filiala3=new Filiala("BRD Timisoara");
        IUnitateBancara filiala4=new Filiala("BT Suceava");
        IUnitateBancara filiala5=new Filiala("BRD Brasov");
        IUnitateBancara filiala6=new Filiala("Patria Bank Giurgiu");

        IUnitateBancara agentieBT=new Agentie("BT Bucuresti");
        agentieBT.aduaga(filiala1);
        agentieBT.aduaga(filiala4);
        IUnitateBancara agentiePatriaBank=new Agentie("Patria Bank Bucuresti");
        agentiePatriaBank.aduaga(filiala2);
        agentiePatriaBank.aduaga(filiala6);
        IUnitateBancara agentieBRD=new Agentie("BRD Bucuresti");
        agentieBRD.aduaga(filiala3);
        agentieBRD.aduaga(filiala5);

        IUnitateBancara surcusalaCentrala=new Surcusala(" centrala Bucuresti");
        surcusalaCentrala.aduaga(agentieBT);
        surcusalaCentrala.aduaga(agentiePatriaBank);
        surcusalaCentrala.aduaga(agentieBRD);

        surcusalaCentrala.afiseazaDetalii();
    }
}
