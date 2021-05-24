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

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfuse() {
        return yearOfuse;
    }

    public void setYearOfuse(int yearOfuse) {
        this.yearOfuse = yearOfuse;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                ", fullName='" + fullName + '\'' +
                ", routeNumber=" + routeNumber +
                ", brand='" + brand + '\'' +
                ", yearOfuse=" + yearOfuse +
                ", mileage=" + mileage +
                '}';
    }

    public void showRouteNumber(int route) {

        if(routeNumber == route){
            System.out.println(toString());
        }
    }

    public void showMileage (int limitMileage){
        if(mileage > limitMileage){
            System.out.println(toString());
        }
    }

    public void showYearOfUse(int limitYear){
        if(yearOfuse > limitYear){
            System.out.println(toString());
        }
    }


}
