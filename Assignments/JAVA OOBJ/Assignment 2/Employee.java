public class Employee {
    String name;
    int joiningYear;
    int salary;
    String address;

    Employee(String n, int jY, int sal, String ad){
        name = n;
        joiningYear = jY;
        salary = sal;
        address = ad;
    }

    public static void main(String[] args){
        Employee e1 = new Employee("Robert", 1994, 10000 , "64C-WallsStreet");
        Employee e2 = new Employee("Sam", 2000, 9800, "68D-WallsStreat");
        Employee e3 = new Employee("John", 1999, 12000, "26B-WallsStreat");
        System.out.println("Name        Year of Joining       Address");
        System.out.println(e1.name+"        "+e1.joiningYear+"          "+e1.address);
        System.out.println(e2.name+"          "+e2.joiningYear+"          "+e2.address);
        System.out.println(e3.name+"          "+e3.joiningYear+"          "+e3.address);

    }
}
