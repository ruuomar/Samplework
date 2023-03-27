public class Car{
    private int speed;
    private String color;
    private double regularPrice;

    public Car(int intSpeed,String color,double regularPrice){
        this.speed=speed;
        this.color=color;
        this.regularPrice=regularPrice;
    }

    public int getSpeed(){
        return speed;
    }

    public String getColor(){
        return color;
    }
    
    public double getRegularPrice(){
        return regularPrice;
    }

    public double getSalePrice(){
        return regularPrice;
    }

}