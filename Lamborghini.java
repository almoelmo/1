package kirill.cars;

public class Lamborghini extends Car{

    private int countOfDoors;
    private String color;
    private String type;

    public Lamborghini(int year, String name, int hp, int oil, int doors, String color) {
        super(year, name, hp, oil);
        this.countOfDoors = doors;
        this.color = color;
    }

    @Override
    public void ride(int kilometr) {
        super.ride(kilometr);
    }

    @Override
    public int addOil(int oil) {
        return super.addOil(oil);
    }

    public void changeType(String type){
        this.type = type;
        System.out.println("Now I'm " + type + " car");
    }
}
