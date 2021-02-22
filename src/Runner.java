import by.gsu.pms.Converter;
import by.gsu.pms.Employee;
public class Runner {
    public static void main (String[] args){

        Employee [] employees = {
                new Employee("Ilya Ustinenko",70000,5),
                null,
                new Employee("Anton Sluckiy",50000,11),
                new Employee("Sergey Zaitsev",100000,6),
                new Employee("Alexandr Litvinov",80000,3),
                new Employee()
        };

        for (Employee i : employees) {
            if (i!= null){
                System.out.println(i.show());
                System.out.println("----------------------");
            }
        }

        employees[employees.length - 1].setTransport(19);
        System.out.println(employees[5]);
        System.out.println("----------------------");

        System.out.println("Duration = " + employees[0].getDays()*2);

        for (Employee value : employees){
            if( value != null){
                System.out.println(value.toString());
                System.out.println("----------------------");
            }
        }

        int sum = 0;
        for(Employee value : employees){
           if(value != null){
               sum += value.getTotal();
           }
        }
        System.out.println("Sum total = "+sum);
        System.out.println("----------------------");

        int maxTotal = 0;
        Employee employeMaxTotal = new Employee();
        for (Employee value : employees){
            if(value != null){
                if (value.getTotal() > maxTotal){
                    employeMaxTotal = value;
                    maxTotal = (int) value.getTotal();
                }
            }
        }

        System.out.println("Name = " + employeMaxTotal.getAccount());

        Converter converter = new Converter();
        for (Employee value : employees ){
            if(value != null){
                System.out.println(converter.convert(value.getTotal(), 10000, 3));
            }
        }




    }
}
