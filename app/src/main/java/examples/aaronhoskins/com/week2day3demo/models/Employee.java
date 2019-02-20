package examples.aaronhoskins.com.week2day3demo.models;

public class Employee extends Person {
    private String position;
    private double payRate;


    public Employee(String firstName, String lastName, String doNotDoThis, String position, double payRate) {
        super(firstName, lastName, doNotDoThis);
        this.position = position;
        this.payRate = payRate;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public void talk() {
        System.out.println("I AM UNDER PAID AND OVER WORKED");
    }
}
