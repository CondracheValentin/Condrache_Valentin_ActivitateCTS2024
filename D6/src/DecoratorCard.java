public abstract class DecoratorCard implements ICard {
    protected ICard cardDecorat;

    public DecoratorCard(ICard cardDecorat) {
        this.cardDecorat = cardDecorat;
    }

    @Override
    public void platesteOnline() {
        cardDecorat.platesteOnline();
    }

    @Override
    public void platesteNormal() {
       cardDecorat.platesteNormal();
    }
}
