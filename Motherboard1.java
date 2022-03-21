public class Motherboard1 extends KomputerDecorator{

    public Motherboard1(Komputer Komputer) {
        super(Komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 1139;
    }

    @Override
    public String Name() {
        return super.Name() + " ASUS ROG STRIX B550-E GAMING ";
    }
}
