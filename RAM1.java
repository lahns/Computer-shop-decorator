public class RAM1 extends KomputerDecorator{

    public RAM1(Komputer Komputer) {
        super(Komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 729;
    }

    @Override
    public String Name() {
        return super.Name() + " Kingston FURY 32GB (2x16GB) 3000MHz CL16 Beast RGB ";
    }
}
