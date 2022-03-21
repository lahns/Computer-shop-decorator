public class Motherboard2 extends KomputerDecorator{

    public Motherboard2(Komputer Komputer) {
        super(Komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 899;
    }

    @Override
    public String Name() {
        return super.Name() + " ASUS ROG STRIX B550-A GAMING ";
    }
}
