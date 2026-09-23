import java.util.*;
public class Client{
    public static void main(String args[]){
        Computer computer=new Computer.Builder()
        .setBrand("Lenovo")
        .setOsType("Windows")
        .setCost(60000)
        .setWifi(true)
        .setProcessor("i5")
        .setColor("White")
        .build();
        System.out.println("Computer Brand: "+computer.getBrand());
        System.out.println("Computer osType: "+computer.getOsType());
        System.out.println("Computer cost: "+computer.getCost());
        System.out.println("Computer wifiConnection: "+computer.getWifi());
        System.out.println("Computer Processor: "+computer.getProcessor());
        System.out.println("Computer Color: "+computer.getColor());


    }
}
class Computer{
    private String brand;
    private String osType;
    private int cost;
    private boolean wifi;
    private String processor;
    private String color;
    private Computer(String brand,String osType,int cost,boolean wifi,String processor,String color){
        this.brand=brand;
        this.osType=osType;
        this.cost=cost;
        this.wifi=wifi;
        this.processor=processor;
        this.color=color;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setOsType(String osType){
        this.osType=osType;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
    public void setWifi(boolean wifi){
        this.wifi=wifi;
    }
    public void setProcessor(String processor){
        this.processor=processor;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getBrand(){
        return brand;
    }
    public String getOsType(){
        return osType;
    }
    public int getCost(){
        return cost;
    }
    public boolean getWifi(){
        return wifi;
    }
    public String getProcessor(){
        return processor;
    }
    public String getColor(){
        return color;
    }
    static class Builder{
    private String brand;
    private String osType;
    private int cost;
    private boolean wifi;
    private String processor;
    private String color;
    public Builder setBrand(String brand){
        this.brand=brand;
        return this;
    }
    public Builder setOsType(String osType){
        this.osType=osType;
        return this;
    }
    public Builder setCost(int cost){
        this.cost=cost;
        return this;
    }
    public Builder setWifi(boolean wifi){
        this.wifi=wifi;
        return this;
    }
    public Builder setProcessor(String processor){
        this.processor=processor;
        return this;
    }
    public Builder setColor(String color){
        this.color=color;
        return this;
    }
    public Computer build(){
        return new Computer(brand,osType,cost,wifi,processor,color);
    }
    }
}