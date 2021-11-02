
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWageBuilder {
    /*
    * Creating array of company to store company details as objects
    * */
    private ArrayList<EmployeeWageBuilder> company; // An array of Contacts - each stores info for one friend

    public EmployeeWageBuilder() {
        company = new ArrayList<EmployeeWageBuilder>();
    }

    /*
    * Creating Instance Variables
    * */

    private String name_of_Company;     // Stores company Name
    private int part_time_Hours;        //Store no of hours
    private int full_time_Hours;           //Stores full time hours
    private int wage_per_Hour;            //Store wage per hour
    private int no_of_Days_in_month;            //Stores no of days employee should work in a company
    private int no_of_Hours_in_month;              //Stores maximum limit employee should work in company
    public int totalwage;                            //Stores total Wage of Employee
    /*
     * Creating Constructer of the class
     * */
    public EmployeeWageBuilder(String name, int parttime, int fulltime, int wagehour, int noofdays, int noofhours, int totalWage) {
        name_of_Company = name;
        part_time_Hours = parttime;
        full_time_Hours = fulltime;
        wage_per_Hour = wagehour;
        no_of_Days_in_month = noofdays;
        no_of_Hours_in_month = noofhours;
        totalwage = totalWage;
    }
    /*
    * add company Details to company array
    * */
    public void addCompany(EmployeeWageBuilder c) {
        company.add(c);
    }
    /*
    * menu() for asking user for which action to perform
    * */
    static void menu() {
        System.out.println("Press 1 for Adding details of Comapny");
        System.out.println("Press 2 for Printing Company Deatials");
        System.out.println("Press 3 for Quiting");
    }
    /*
     * Method for Priting details of Company
     */

    public void printCompanyDetails() {
        for (int i = 0; i < company.size(); i++)
            System.out.println(company.get(i));
    }
    /*
    * hours() Method for get how many Hours employee worked
    * */
    int hours(){
        int emphrs=0;
        int days =0;

        Random ran = new Random();
        int i = ran.nextInt(3)+1;
        while (emphrs<=99 && days<=20) {
            switch (i) {
                case 1:
                    emphrs = emphrs +obj1.getFull_time_Hours();
                    break;
                case 2:
                    emphrs = emphrs + obj1.getPart_time_Hours();
                    break;
                default:
                    break;
            }
        }
        return emphrs;
    }
    /*
    * Method for total wage of Employee
    * */
    int total_wage(){
        int total_wage=hours()*obj1.getWage_per_Hour();
        return total_wage;
    }

    static CompanyEmpWage obj1 =new CompanyEmpWage();       //Creating object of CompanyEmpWage Class


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        EmployeeWageBuilder obj = new EmployeeWageBuilder();
        menu();
        int choice = inp.nextInt();
        while (choice != 3) {

            if (choice == 1) {                                  //Taking inputs of company
                System.out.println("Enter Name of the Company");
                String name = inp.next();
                System.out.println("Enter full Time Hours");
                int full_time = inp.nextInt();
                System.out.println("Enter Part time Hours  ");
                int part_time = inp.nextInt();
                System.out.println("Enter wage per Hour of Company");
                int wage_per_hour = inp.nextInt();
                System.out.println("Enter no of Working Days of Company in a month");
                int days = inp.nextInt();
                System.out.println("Enter maximum no of Hours limit in a company");
                int max_hours = inp.nextInt();
                System.out.println("Total Wage of Company");
                int totalWage = obj.total_wage();
                obj.addCompany(new EmployeeWageBuilder(name, full_time, part_time, wage_per_hour, days, max_hours, totalWage));
            }
            else if (choice == 2)
            {
                obj.printCompanyDetails();
            }
        }
    }
}
