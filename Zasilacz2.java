public class Zasilacz2 extends KomputerDecorator{

    public Zasilacz2(Komputer komputer) {
        super(komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 1599;
    }

    @Override
    public String Name() {
        return super.Name() + " be quiet! Dark Power 12 1000W 80 Plus Titanium ";
    }
}
