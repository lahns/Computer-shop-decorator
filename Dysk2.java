public class Dysk2 extends KomputerDecorator{

    public Dysk2(Komputer Komputer) {
        super(Komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 479;
    }

    @Override
    public String Name() {
        return super.Name() + " Crucial 1TB 2,5\" SATA SSD MX500 ";
    }
}

