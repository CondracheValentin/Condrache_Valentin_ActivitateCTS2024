public class CardContactLessDecorator extends DecoratorCard{
    public CardContactLessDecorator(ICard cardDecorat) {
        super(cardDecorat);
    }
     public void platesteContactLess(){
        System.out.println("Plata ContactLess cu cardul este efectuata");
    }

}
