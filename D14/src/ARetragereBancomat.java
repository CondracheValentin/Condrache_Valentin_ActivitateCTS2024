public abstract class ARetragereBancomat {
    abstract void introducereCard();
    abstract void introducerePIN();
    abstract void specificareSuma();
    abstract void retragereBani();
    abstract void retragereCard();

    public final void retragere(){
        introducereCard();
        introducerePIN();
        specificareSuma();
        retragereBani();
        retragereCard();
    }
}
