public class Dysk1 extends KomputerDecorator{

    public Dysk1(Komputer Komputer) {
        super(Komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 289;
    }

    @Override
    public String Name() {
        return super.Name() + " Samsung 500GB M.2 PCIe NVMe 980 ";
    }
}
