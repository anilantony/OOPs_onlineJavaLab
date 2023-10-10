# Create a class named 'Employee' having the following members:Data members are 1-Name 2-Age 3-Phone number 4-Address 5-Salary. 
# It also has a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class.
# The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively.
# Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the value you assigned. 

import java.util.Scanner;
class Employee
 {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public Employee(String name, int age, String phoneNumber, String address, double salary) 
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() 
    {
        System.out.println("Salary " + salary);
    }
    public void displayMember()
    {
    	System.out.println("Name " + name);
    	System.out.println("Age " + age);
    	System.out.println("Phone Number" + phoneNumber);
    	System.out.println("Address " + address);
    	System.out.println("Salary " + salary);
   }
}   
class Officer extends Employee 
{
    private String specialization;
    private String department;	
    public Officer(String name, int age, String phoneNumber,String address, double salary, String specialization, String department) 
        {
        super(name, age, phoneNumber, address, salary);
        this.department=department;
        this.specialization = specialization;
        }
    public void displayOfficer()
    	{  
    	displayMember();
    	System.out.println("Specialization " + specialization);
    	System.out.println("Department " + department);
    	}
}
class Manager extends Employee
{
    private String specialization;
    private String department;
    public Manager(String name, int age, String phoneNumber,String address, double salary,String specialization, String department)
        {
        super(name, age, phoneNumber, address, salary);
        this.specialization=specialization;
        this.department = department;
    	}
    public void displayManager()
    	{  
    	displayMember();
    	System.out.println("Specialization " + specialization);
    	System.out.println("Department " + department);
    	}
}
public class Company 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Officer Details");
        System.out.print("Name: ");
        String name1=sc.nextLine();
        System.out.print("Age: ");
        int age1 = sc.nextInt();
        sc.nextLine();
    	  System.out.print("Phone Number:");
    	  String phoneNumber1=sc.nextLine();
    	  System.out.print("Address:");
    	  String address1=sc.nextLine();
    	  System.out.print("Salary :");
   	    Double salary1=sc.nextDouble();
        sc.nextLine();   
        System.out.print("Specialization:");
    	  String specialization1=sc.nextLine();
        System.out.print("Department:");
    	  String department1=sc.nextLine();
        Officer officer = new Officer(name1,age1,phoneNumber1,address1,salary1,specialization1,department1);
        officer.displayOfficer();
        System.out.println("Enter Manager Details");
        System.out.print("Name: ");
        String name2=sc.nextLine();
        System.out.print("Age: ");
        int age2 = sc.nextInt();
        sc.nextLine();
    	  System.out.print("Phone Number:");
    	  String phoneNumber2=sc.nextLine();
    	  System.out.print("Address:");
    	  String address2=sc.nextLine();
    	  System.out.print("Salary :");
   	    Double salary2=sc.nextDouble();
        sc.nextLine();   
        System.out.print("Specialization:");
    	  String specialization2=sc.nextLine();
        System.out.print("Department:");
    	  String department2=sc.nextLine();
        Manager manager= new Manager(name2,age2,phoneNumber2,address2,salary2,specialization2,department2);
        manager.displayManager();
    }
}
