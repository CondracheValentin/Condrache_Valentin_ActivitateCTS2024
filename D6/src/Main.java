public class Main {
    public static void main(String[] args) {
        ICard cardbancar=new Card();
        CardContactLessDecorator cardContactLess=new CardContactLessDecorator(cardbancar);

        cardbancar.platesteOnline();
        cardbancar.platesteNormal();
        cardContactLess.platesteOnline();
        cardContactLess.platesteNormal();
        cardContactLess.platesteContactLess();
    }
}
