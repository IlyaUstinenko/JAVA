package by.gsu.pms;

public class Employee {
    private String account;
    private long transport;
    private int days;
    private final int  ALLOWANCE_RATE = 2500;

    public Employee() {
    }

    public Employee(String account, long transport, int days) {
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public long getTransport() {
        return transport;
    }

    public void setTransport(long transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public long getTotal(){
        return (ALLOWANCE_RATE * days + transport);
    }

    public String show(){
        return  "rate = " + ALLOWANCE_RATE +"\n"+
                "total = " + getTotal() +"\n"+
                "account = " + account +"\n"+
                "transport = " + transport +"\n"+
                "days = " + days;
    }

    @Override
    public String toString() {
        return  ALLOWANCE_RATE + ";" + account + ";" +
                transport + ";" +
                days + ";" + getTotal();

    }
}
