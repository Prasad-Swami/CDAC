public class Complex {
    int real;
    int imag;

    Complex(int r, int i){
        real = r;
        imag = i;
    }

    int sumReal(int r1){
        return real + r1;
    }

    int sumImag(int i1){
        return imag + i1;
    }

    int diffReal(int r1){
        return real - r1;
    }

    int diffImag(int i1){
        return imag - i1;
    }

    int productReal(int r1){
        return real*r1;
    }

    int productImag(int i1){
        return imag*i1;
    }

    public static void main(String[] args){
        
        System.out.println("Enter the Real num 1: ");
        int real = Console.getInt();
        
        System.out.println("Enter the Imag num 1: ");
        int imag = Console.getInt();

        System.out.println("Enter the Real num 2: ");
        int r1 = Console.getInt();

        System.out.println("Enter the Imag num 2:  ");
        int i1 = Console.getInt();
        
        Complex val = new Complex(real, imag);

        val.sumReal(r1);
        val.sumImag(i1);

        val.diffReal(r1);
        val.diffImag(i1);

        val.productReal(r1);
        val.productImag(i1);

        System.out.println("The Sum of Complex Nums: ");
        System.out.println(val.sumReal(r1) + "+" + val.sumImag(i1) + "i" );

        System.out.println("The Difference of Complex Nums: ");
        System.out.println(val.diffReal(r1) + "-" + val.diffImag(i1) + "i");

        System.out.println("The Product of Complex Nums: ");
        System.out.println(val.productReal(r1) + "*" + val.productImag(i1) + "i");
    }
}
