

class Member{
    private String name;
    private int age;
    private String phoneNo;
    private String address;
    private int salary;

    //setter
    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }

    void setAddress(String address){
        this.address = address;
    }

    void setSalary(int salary){
        this.salary = salary;
    }

    //getter
    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    String getPhoneNo(){
        return phoneNo;
    }

    String getAddress(){
        return address;
    }

    int getSalary(){
        return salary;
    }

    void printSalary(){
        System.out.println(salary);
    }
}

class PrimeMember extends Member{
    private int joiningYear;
    private int joiningFees;
    private boolean isActive;

    //setters
    void setJoiningYear(int jy){
        joiningYear = jy;
    }

    void setJoiningFees(int jf){
        joiningFees = jf;
    }

    void setIsActive(boolean status){
        if(status = true){
            isActive = true;
            System.out.println("Employee is Active");
        }else{
            isActive = false;
            System.out.println("This Employee is not active Anymore");
        }
    }

    //getters

    int getJoiningYear(){
        return joiningYear;
    }

    int getJoiningFees(){
        return joiningFees;
    }

    boolean getIsActive(){
        return isActive;
    }

    void display(){
        System.out.println("The Name of the Employee is: ");
        System.out.println(getName());
        System.out.println("Age: ");
        System.out.println(getAge());
        System.out.println("Phone Number: ");
        System.out.println(getPhoneNo());
        System.out.println("Address: ");
        System.out.println(getAddress());
        System.out.println("Salary: ");
        System.out.println(getSalary());

        System.out.println("Joining Year");
        System.out.println(getJoiningYear());
        System.out.println("Joining Fees: ");
        System.out.println(getJoiningFees());
        System.out.println("Is Employee Active? ");
        System.out.println(getIsActive());

    }

}

public class EmployeeDetails{
    public static void main(String[] args){
        Member mObj = new Member();
        PrimeMember pObj = new PrimeMember();

        //set the values from user
        System.out.println("Enter the Employee Details: ");

        System.out.println("Enter Name: ");
        pObj.setName(Console.getString());

        System.out.println("Age: ");
        pObj.setAge(Console.getInt());

        System.out.println("Phone No: ");
        pObj.setPhoneNo(Console.getString());

        System.out.println("Address: ");
        pObj.setAddress(Console.getString());

        System.out.println("Salary: ");
        pObj.setSalary(Console.getInt());

        System.out.println("Joining Year: ");
        pObj.setJoiningYear(Console.getInt());

        System.out.println("Joining Fees: ");
        pObj.setJoiningFees(Console.getInt());

        System.out.println("IS Employee Active: ");
        pObj.setIsActive(true);

        pObj.display();
    }
}