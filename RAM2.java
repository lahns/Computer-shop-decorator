public class RAM2 extends KomputerDecorator{

    public RAM2(Komputer Komputer) {
        super(Komputer);
    }
    @Override
    public double Cost(){
        return super.Cost() + 630;
    }

    @Override
    public String Name() {
        return super.Name() + " G.SKILL 16GB (2x8GB) 3200MHz CL14 Flare X Black Ryzen ";
    }
}
