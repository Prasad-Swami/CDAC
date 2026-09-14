class Parent{
    public Parent(){
        System.out.println("This is Parent Class");//print parent 
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("This is Child Class"); //print parent then child
    }
}
public class Inheritance{
    public static void main(String[] args){
        Parent pobj = new Parent();
        Child cobj = new Child();
        Parent uobj = new Child(); //print parent then child
    }
}