
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWageBuilder {
    /*
     * Creating array of company to store company details as objects
     * */
    private ArrayList<CompanyEmpWage> company; // An array of Contacts - each stores info for one friend

    public EmployeeWageBuilder() {
        company = new ArrayList<CompanyEmpWage>();
    }
    /*
     *adCompany method for adding Company Details
     */
    public void addCompany(CompanyEmpWage c) {
        company.add(c);
    }
    /*
     * haveContacts() method to return index of particular person in person array
     * */
    int haveCompanydetails(String s) {
        for (int i = 0; i < company.size(); i++)
            if (company.get(i).getName_of_Company().equals(s))
                return i;

        return -1;
    }
    /*
     * editCompanydetails() for editing details of Company
     * */
    public void editCompanydetial(String s) {
        Scanner inp = new Scanner(System.in);
        int place = haveCompanydetails(s);
        EmployeeWageBuilderUC2 obj2 = new EmployeeWageBuilderUC2();
        if (place >= 0) {
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
            int totalWage = obj2.total_wage();
            CompanyEmpWage obj = new CompanyEmpWage(name, full_time, part_time, wage_per_hour, days, max_hours, totalWage);

            company.set(place, obj);
        }
        else if (place==-1);{
            System.out.println("\nFirst Name Not Match\n");
        }
    }
    /*
     * menu() for asking user for which action to perform
     * */
    static void menu() {
        System.out.println("Press 1 for Adding details of Company");
        System.out.println("Press 2 for Printing Company Details");
        System.out.println("Press 3 for Editing Company Details");
        System.out.println("Press 4 for Quiting");
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
                    emphrs = emphrs +obj2.getFull_time_Hours();
                    break;
                case 2:
                    emphrs = emphrs + obj2.getPart_time_Hours();
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
        int total_wage=hours()*obj2.getWage_per_Hour();
        return total_wage;
    }

    static CompanyEmpWage obj2 =new CompanyEmpWage();                       //Creating object of CompanyEmpWage Class

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        EmployeeWageBuilder obj2 = new EmployeeWageBuilder();
        menu();
        int choice = inp.nextInt();
        while (choice != 3) {
            if (choice == 1) {
                System.out.println("Enter no of contacts to Add");
                int number = inp.nextInt();
                for (int i = 0; i <= number - 1; i++) {
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
                    int totalWage = obj2.total_wage();
                    obj2.addCompany(new CompanyEmpWage(name, full_time, part_time, wage_per_hour, days, max_hours, totalWage));
                }
            }
            else if (choice == 2)
            {
                obj2.printCompanyDetails();
            }
            else if (choice ==3)
            {
                System.out.println("What is the name of Company to Edit");
                String k=inp.next();
                obj2.editCompanydetial(k);
            }
        }
    }
}
