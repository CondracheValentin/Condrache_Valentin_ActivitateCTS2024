public abstract class AAchizitieMedicamente {
    abstract void primireReteta();
    abstract boolean verificareStoc();
    abstract void aduceMedicamente();
    abstract void incaseazaBani();
    abstract void scadeStoc();
    abstract void emiteBon();
    abstract void mergeInDepozit();
    abstract void achizitieAnulata();
    public final void achizitioneazaMedicamente(){
        primireReteta();
        if(verificareStoc()){
            mergeInDepozit();
            aduceMedicamente();
        }
        else {
                achizitieAnulata();
                aduceMedicamente();
                incaseazaBani();
                scadeStoc();
                emiteBon();

        }
    }


}
