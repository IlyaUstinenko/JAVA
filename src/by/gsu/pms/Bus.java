package by.gsu.pms;

public class Bus {
    private int busNumber;
    private String fullName;
    private int routeNumber;
    private String brand;
    private int yearOfuse;
    private int mileage;

    public Bus(int busNumber, String fullName, int routeNumber, String brand, int yearOfuse, int mileage) {
        this.busNumber = busNumber;
        this.fullName = fullName;
        this.routeNumber = routeNumber;
        this.brand = brand;
        this.yearOfuse = yearOfuse;
        this.mileage = mileage;
    }

    public Bus(int busNumber, String fullName, int routeNumber, String brand) {
        this.busNumber = busNumber;
        this.fullName = fullName;
        this.routeNumber = routeNumber;
        this.brand = brand;
    }

    public Bus() {
    }

}
