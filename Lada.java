package kirill.cars;

public class Lada extends Car{

    String typeWheels;
    int hp = 100;
    int dirty = 0;

    public Lada(int year, String name, int hp, int oil, String typeWheels) {
        super(year, name, hp, oil);
        this.typeWheels = typeWheels;
    }

    @Override
    public void ride(int kilometr) {
        super.ride(kilometr);
        this.hp -= kilometr;
        this.dirty += kilometr;
    }

    @Override
    public int addOil(int oil) {
        return super.addOil(oil);
    }

    public int cleanCar(int water){
        this.dirty -= water;
        return this.dirty;
    }

    public void fixCar(){
        this.hp += 10;
        System.out.println("Car was fixed, little bit");
    }
}
