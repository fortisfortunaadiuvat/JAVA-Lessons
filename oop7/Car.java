package oop7;

public class Car implements HGSCard{
    String plate;
    int type;
    int balance = 150;
    int kmpmoney;
    
    Car(){};
    
    @SuppressWarnings("SillyAssignment")
    public int setKmpm(int kmponey){
        return this.kmpmoney = kmpmoney;
    }
    
    @Override
    public void construct(String plate, int type) {
        this.plate = plate;
        this.type = type;
    }

    @Override
    public int addmoney(int money) {
        return this.balance += money;
    }

    @Override
    public int changemoney(int km) {
        switch (this.type) {
            case 1:
                return this.balance -= km*2;
            case 2:
                return this.balance -= km*4;
            default:
                return this.balance -= km*7;
        }
    }

    @Override
    public void info() {
        System.out.println("Plate is: " + this.plate);
        System.out.println("Balance is: " + this.balance);
    }
    
}
