public class CPU1 extends KomputerDecorator{
    public CPU1(Komputer komputer) {
        super(komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 1550.50;
    }

    @Override
    public String Name() {
        return super.Name()+ " Ryzen 5 5600X ";
    }
}
