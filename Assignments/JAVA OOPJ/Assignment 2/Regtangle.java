public class Regtangle {
    int length;
    int breadth;

    Regtangle (int l, int b){
        length = l;
        breadth = b;
    }

    int area(){
        int areaOfReg = length * breadth;
        return areaOfReg;
    }

    public static void main(String[] args) {
        Regtangle r1 = new Regtangle(4,5);
        System.out.println("The Area of Regtangle 1: ");
        System.out.println(r1.area());
    
        Regtangle r2 = new Regtangle(5,8);
        System.out.println("The Area of Regtangle 2: ");
        System.out.println(r2.area());
    }
}
