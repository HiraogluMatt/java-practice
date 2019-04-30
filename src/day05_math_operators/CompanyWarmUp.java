package day05_math_operators;

public class  CompanyWarmUp {
    public static void main(String[] args){
        String companyName = "Facebook";
        String address = "Silicon Valley, CA";
        int numberOfEmployee = 10000;
        long revenue = 4000000000L;
        boolean isTechCompany = true;
    
        System.out.println("Company name is " + companyName);
        System.out.println("Address of Facebook is " + address);
        System.out.println("Number of Facebook's employee is " + numberOfEmployee);
        System.out.println("Annual revenue of Facebook is " + revenue);
        System.out.println("Is Facebook tech company? The answer is = " + isTechCompany);
        
        String aboutCompany  = (companyName + " " + address);
        System.out.println(aboutCompany);
    }
    
}

