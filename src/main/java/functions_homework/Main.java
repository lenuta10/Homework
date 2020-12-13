package functions_homework;

import homework3.model.Person;
import homework3.model.Student;
import homework3.model.StudentType;

public class Main {


    public static void ms(){

    }
    public static void main(String... args) {
        SalesRepresentative salesRepresentative1 = new SalesRepresentative(10, 500);
        SalesRepresentative salesRepresentative2 = new SalesRepresentative(7, 200);
        SalesRepresentative salesRepresentative3 = new SalesRepresentative(12, 120.5);
        SalesRepresentative salesRepresentative4 = new SalesRepresentative(5, 2100);
        SalesRepresentative salesRepresentative5 = new SalesRepresentative(20, 30);

        SalesRepresentative[] reps = {salesRepresentative1, salesRepresentative2, salesRepresentative3, salesRepresentative4, salesRepresentative5};

        SalesRepresentative[] sortedSales = new SalesRepresentativeImpl().sort(reps);

        for (int i = 0; i < sortedSales.length; i++) {
            System.out.println("Sales guy " + (i + 1) + " has " + sortedSales[i].getNrOfSales() + " sales with a quota of " + sortedSales[i].getQuota()
                    + ". He has achieved " + sortedSales[i].calculateRevenue() + "$ worth of sales.");
        }

    }
}
