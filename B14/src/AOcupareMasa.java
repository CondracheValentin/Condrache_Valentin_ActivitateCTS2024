public abstract class AOcupareMasa {
    abstract void curatareMasa();
    abstract void asezareServetele();
    abstract void asezareTacamuri();
    abstract void invitaPersoane();
    public final void ocupaMasa(){
        curatareMasa();
        asezareServetele();
        asezareTacamuri();
        invitaPersoane();
    }
}
