public class Card implements ICard{
    @Override
    public void platesteOnline() {
        System.out.println("Plata online cu cardul efectuata");
    }

    @Override
    public void platesteNormal() {
        System.out.println("Plata normala cu cardul efectuata");
    }
}
