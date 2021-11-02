public class CompanyEmpWage {
    private String name_of_Company;     // Stores company Name
    private int part_time_Hours;        //Store no of hours
    private int full_time_Hours;           //Stores full time hours
    private int wage_per_Hour;            //Store wage per hour
    private int no_of_Days_in_month;            //Stores no of days employee should work in a company
    private int no_of_Hours_in_month;              //Stores maximum limit employee should work in company
    public int totalwage;                            //Stores total Wage of Employee


    /*
     * Creating Constructer of the class for accessing methods and variables present in class
     * */
    public CompanyEmpWage(){

    }
    /*
    * Creating Constructor
    * */
    public CompanyEmpWage(String name, int parttime, int fulltime, int wagehour, int noofdays, int noofhours, int totalWage) {
        name_of_Company = name;
        part_time_Hours = parttime;
        full_time_Hours = fulltime;
        wage_per_Hour = wagehour;
        no_of_Days_in_month = noofdays;
        no_of_Hours_in_month = noofhours;
        totalwage = totalWage;
    }
    /*
    *Creating Constructers
    * */
    public String getName_of_Company() {
        return name_of_Company;
    }

    public int getFull_time_Hours() {
        return full_time_Hours;
    }

    public int getPart_time_Hours() {
        return part_time_Hours;
    }

    public int getWage_per_Hour() {
        return wage_per_Hour;
    }

    public int getNo_of_Days_in_month() {
        return no_of_Days_in_month;
    }

    public int getNo_of_Hours_in_month() {
        return no_of_Hours_in_month;
    }

    public int getTotalwage() {
        return totalwage;
    }
    /*
    * Function for print after initialising instance variables by constructer
    * */
    public String toString(){
        return "Company name"+name_of_Company+"Full time hours of Comapany"+full_time_Hours+"Part time Hours of a Company"+part_time_Hours
                +"Wage per hour "+wage_per_Hour+"No of Working days in a Company "+no_of_Days_in_month+"Total wage of employee of Company"+totalwage;
    }
}
