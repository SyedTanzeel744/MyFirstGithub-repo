import java.util.*;

public class EB_Calculator {
   static  Scanner sc = new Scanner(System.in);
    public static void totalCost() {
        System.out.println();
        System.out.print("Enter units : ");
        double unit = sc.nextInt();
        double total = 0;
        while (unit > 100) {
           if(unit > 500) {
            if(unit > 1000) {
                double secUnit = unit - 1000;
                total += secUnit * 11;
                unit -= secUnit;
            }
            if(unit > 800) {
                double subUnit = unit - 800;
                total += subUnit * 10;
                unit -= subUnit;
            }
            if(unit > 600) {
                double subUnit = unit - 600;
                total += subUnit * 9;
                unit -= subUnit;
            }
            if(unit > 500) {
                double subUnit = unit - 500;
                total += subUnit * 8;
                unit -= subUnit;
            }
            if(unit > 400) {
                double subUnit = unit - 400;
                total += subUnit * 6;
                unit -= subUnit;
            }
            if(unit > 100) {
                double subUnit = unit - 100;
                total += subUnit * 4.50;
                unit -= subUnit;
            }
           } else {
                if(unit > 400) {
                    double subUnit = unit - 400;
                    total += subUnit * 6;
                    unit -= subUnit;
                }
                if(unit > 200) {
                    double subUnit = unit - 200;
                    total += subUnit * 4.50;
                    unit -= subUnit;
                }
                if(unit > 100) {
                    double subUnit = unit - 100;
                    total += subUnit * 2.25;
                    unit -= subUnit;
                }
           }
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total Bill Rupees : " +  total);
        System.out.println("Average unit :" + total / unit );
        System.out.println("-----------------------------------------");
    }

    public static void commerical() {
        System.out.println();
        System.out.print("Enter units : ");
        double unit = sc.nextInt();
        if(unit < 100) {
            double total = unit * 2.50;
            System.out.println("--------------------");
            System.out.println("Total EB bill : " +  total);
            System.out.println("--------------------");

            return;
        } else if(unit < 200) {
            double total = unit * 5 ;
            System.out.println("--------------------");
            System.out.println("Total EB bill : " + total );
            System.out.println("per unit: 5");
            System.out.println("--------------------");
            return;
        } else if(unit < 400) {
            double total = unit * 9 ;
            System.out.println("--------------------");
            System.out.println("Total EB Bill : " + total);
            System.out.println("per unit : 9.00");
            System.out.println("--------------------");

            return;
        } else if (unit < 500) {
            double total = unit * 12;
            System.out.println("--------------------");
            System.out.println("Total EB bill : " + total);
            System.out.println("per unit : 12.00");
            System.out.println("--------------------");

            return;
        }else {
            double total = unit * 16;
            System.out.println("--------------------");
            System.out.println("Total EB bill : " + total);
            System.out.println("per unit : 16.00");
            System.out.println("--------------------");
        }
    }
    public static void main(String... args) {
        while(true) {
            System.out.println();
            System.out.println();
            System.out.println("EB bill Calculator ");
            System.out.println("--------------------------------");
            System.out.println("1.Domestic ");
            System.out.println("2.Commerical ");
            System.out.println("3. exit");
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                totalCost();
                break;
            case 2 : 
                commerical();
                break;
            case 3 : 
            System.out.println("program ended...");
            return;

            default:
            System.out.println("Enter valid number!!!");
            break;
           }
        }
    }
}