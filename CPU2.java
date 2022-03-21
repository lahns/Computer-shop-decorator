public class CPU2 extends KomputerDecorator{
    public CPU2(Komputer komputer) {
        super(komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 1799;
    }

    @Override
    public String Name() {
        return super.Name()+ " AMD Ryzen 7 5800X ";
    }
}
