public class StudentReg{
    String name;
    int rollNo;
    String phoneNo;
    String address;

    public static void main(String[] args){
        StudentReg s1 = new StudentReg();
        s1.name = "John";
        s1.rollNo = 2;
        s1.phoneNo = "9892077917";
        s1.address = "12th block, nortin hill";

        StudentReg s2 = new StudentReg();
        s2.name = "Sam";
        s2.rollNo = 1;
        s2.phoneNo = "8282820771";
        s2.address = "2nd street, backhood";

        System.out.println("The Registry of Student");
        System.out.println("Name of Student: "+s1.name);
        System.out.println("Roll No: "+s1.rollNo);
        System.out.println("Phone No.: "+s1.phoneNo);
        System.out.println("Address of Student: " + s1.address);

        // //System.out.println("The Registry of Student");
        System.out.println("Name of Student: "+s2.name);
        System.out.println("Roll No: "+s2.rollNo);
        System.out.println("Phone No.: "+s2.phoneNo);
        System.out.println("Address of Student: " + s2.address);

    }
}

