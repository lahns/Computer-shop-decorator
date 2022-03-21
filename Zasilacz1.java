public class Zasilacz1 extends KomputerDecorator{

    public Zasilacz1(Komputer komputer) {
        super(komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 899;
    }

    @Override
    public String Name() {
        return super.Name() + " be quiet! Straight Power 11 1000W 80 Plus Gold ";
    }
}
