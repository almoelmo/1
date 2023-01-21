package kirill.cars;

public class Car {

    private int year;
    private String name;
    private int hp;
    private int oil;

    public Car(int year, String name, int hp, int oil) {
        this.year = year;
        this.name = name;
        this.hp = hp;
        this.oil = oil;
    }

    public void ride(int kilometr){
        System.out.println("We are ride " + kilometr + " kilometrs");
    }

    public int addOil(int oil){
        if (oil + this.oil > 60){
            this.oil = 60;
            System.out.println("We are full");
        }
        System.out.println("Oil is added");
        return this.oil;
    }
}
