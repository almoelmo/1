package kirill.cars;

public class Tesla extends Car{

    int power = 100;
    String typeOfDoors;

    public Tesla(int year, String name, int hp, int oil, String typeOfDoors) {
        super(year, name, hp, oil);
        this.typeOfDoors = typeOfDoors;
    }

    @Override
    public void ride(int kilometr) {
        super.ride(kilometr);
        this.power -= kilometr * 5;
    }

    @Override
    public int addOil(int oil) {
        return super.addOil(oil);
    }

    public void charge(int hour){
        this.power += hour * 10;
        System.out.println("Car is charging");
    }
}
