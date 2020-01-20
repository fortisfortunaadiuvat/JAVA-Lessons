package ooplab6;

public class Car {
    private String model;
    private int year;
    private int velocity;
    private int numofAcceleration;
    private int numofDeceleration;
    private static int numofcar;
    
    Car(){
        numofcar++;
    }
    Car(String model,int year){
        this.model = model;
        this.year = year;
        this.velocity = 0;
        numofcar++;
    }
    Car(String model,int year,int velocity){
        this.model = model;
        this.year =year;
        this.velocity = velocity;
        numofcar++;
    }
    public void accelerate(){
        if(this.velocity+5 >= 0){
            this.velocity += 5;
        }
        else{
            System.out.println("The car doesn't accelerate");
            System.out.println("Current speed: " + this.velocity);
        }
        numofAcceleration++;
    }
    public void deceleration(){
        if(this.velocity >= 5){
            this.velocity -=5;
        }
        else{
            System.out.println("Invalid velocity");
        }
        numofDeceleration++;
    }
    public void information(){
        System.out.println("Model is: " + this.model);
        System.out.println("Year is: " + this.year);
        System.out.println("Velocity is: " + this.velocity);
        System.out.println("NumofAcc is: " + numofAcceleration);
        System.out.println("NumıfDec is: " + numofDeceleration);
    }
    public int quantity(){
        return numofcar;
    }
    public static void main(String[] args) {
        Car car1 = new Car("2019",2019,150);
        car1.accelerate();
        car1.accelerate();
        System.out.println("CAR1\n");
        car1.information();
        System.out.println("\n");
        Car car2 = new Car("2018",2018,200);
        car2.deceleration();
        car2.deceleration();
        System.out.println("CAR2\n");
        car2.information();
        System.out.println("\n");
        Car car3 = new Car("2020",2020,100);
        car3.accelerate();
        car3.accelerate();
        System.out.println("CAR3\n");
        car3.information();
        System.out.println("\n");
        System.out.println(car3.quantity());
    }
}