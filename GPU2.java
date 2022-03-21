public class GPU2 extends KomputerDecorator{

    public GPU2(Komputer Komputer) {
        super(Komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 3000;
    }

    @Override
    public String Name() {
        return super.Name() + " RTX 3060 ";
    }
}
