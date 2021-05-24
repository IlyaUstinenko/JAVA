import by.gsu.pms.Bus;


public class Runner {
    public static void main(String[] args) {


        Bus[] buses = {
                new Bus(1993, "Vasiliy E.V", 20, "Mercedes"),
                null,
                new Bus(1492, "Novikov K.T", 34, "Volkswagen", 2001,450000),
                new Bus(1141, "Kirzanov I.S", 18, "Mercedes", 1999,350000),
                new Bus(2029, "Filatov",17,"Volvo",1999,200000),
                new Bus(1849, "Chizow",20,"Mercedes",1998,150000),
                new Bus(),
                new Bus(1347,"Stolyarov", 15,"Wolkswagen",2000,210000),
                new Bus(1142,"Voitenkov",34,"Volvo",1993,310000),
                new Bus(2196,"Zvrkov",16,"ГАЗ",1900,425000)
        };

        for (Bus value : buses) {
            if (value != null) {
                System.out.println(value.toString());
            }

        }
        System.out.println("***************************************************************");
        for (Bus value : buses) {
            if (value != null) {
                value.showRouteNumber(20);
            }
        }
        System.out.println("***************************************************************");
        for(Bus value : buses){
            if (value != null){
                value.showMileage(300000);
            }
        }
        System.out.println("***************************************************************");
        for(Bus value : buses){
            if (value != null){
                value.showYearOfUse(2000);
            }
        }
    }
}
