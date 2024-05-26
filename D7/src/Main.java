public class Main {
    public static void main(String[] args) {
        FacadeCreareCont facadeCreareCont=new FacadeCreareCont();
        String nume="Iacob Beniamin";
        int varsta=23;

        if(facadeCreareCont.poateCreaCont(nume,varsta)){
            System.out.println("Contul s-a creat cu succes "+nume);
        }else{
            System.out.println("Crearea contului a esuat pentru "+nume);
        }
    }
}
