class Shape{
    Shape(){
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape{
    Rectangle(){
        System.out.println("This is Rectangle");
    }
}

class Circle extends Shape{
    Circle(){
        System.out.println("This is Circle");
    }
}

class Square extends Rectangle{
    Square(){
        System.out.println("Square is a Rectangle");
    }

}

public class WhichShape {
    public static void main(String[] args) {
        Shape sObj = new Shape();
        Rectangle rObj = new Rectangle();
        Circle cObj = new Circle();
        Square sqObj = new Square();   
    }
}
