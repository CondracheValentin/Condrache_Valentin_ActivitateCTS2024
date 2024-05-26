public abstract class AOcupareaLocurilor {
    abstract void asezareLaCoada();
    abstract void prezentareBilet();
    abstract void controlCorporal();
    abstract void intrareInStadion();
    abstract void ocupareLoc();
    public final void ocupaLoc(){
        asezareLaCoada();
        prezentareBilet();
        controlCorporal();
        intrareInStadion();
        ocupareLoc();
    }
}
