package cn.itcast.day09.Study3;

public class SUV extends Auto{

    double minLength = 4290.0;
    double maxLength = 5070.0;

    public SUV() {
    }

    public SUV(double length, double price) {
        super("SUV",length, price);
    }
    public boolean smallCar(){
        return getLength() < minLength;
    }
    public boolean middleCar(){
        return getLength() >= minLength && getLength() <maxLength;
    }
    public  boolean bigCar(){
        return getLength() >= maxLength;
    }
}
