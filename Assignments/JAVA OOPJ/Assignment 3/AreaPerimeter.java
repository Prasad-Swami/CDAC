class Rectangle{
    int length;
    int breadth;

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    int area(){
        return length * breadth;
    }

    int perimeter(){
        return 2*(length + breadth);
    }
}

class Square extends Rectangle{
    int side;

    Square(int s){
        super(s, s);
        side = s;
    }

    @Override int area(){
        return side * side;
    }

    @Override int perimeter(){
        return 4*side;
    }
}
public class AreaPerimeter{
    public static void main(String[] args){
        System.out.println("Enter length: ");
        int l = Console.getInt();

        System.out.println("Enter Breadth: ");
        int b = Console.getInt();

        System.out.println("Enter Side: ");
        int s = Console.getInt();

        Rectangle rObj = new Rectangle( l,  b);
        Square sObj = new Square(s);

        System.out.println("The area of Rectangle: ");
        System.out.println(rObj.area());
        System.out.println("The Perimeter of Rectangle: ");
        System.out.println(rObj.perimeter());

        System.out.println("The area of Square: ");
        System.out.println(sObj.area());
        System.out.println("The Perimeter of Square: ");
        System.out.println(sObj.perimeter());


    }
}