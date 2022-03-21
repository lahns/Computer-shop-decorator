public class KomputerDecorator extends Komputer {

    protected Komputer _komputer;

    public KomputerDecorator(Komputer komputer){
        _komputer = komputer;
    }
    @Override
    public double Cost() {
        return _komputer.Cost();
    }

    @Override
    public String Name() {
        return _komputer.Name();
    }
}
