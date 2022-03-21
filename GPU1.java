public class GPU1 extends KomputerDecorator{

    public GPU1(Komputer Komputer) {
        super(Komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 7000;
    }

    @Override
    public String Name() {
        return super.Name() + " RTX 3090 Ti ";
    }
}
