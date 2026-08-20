import java.util.Scanner;
class MultiTable {
    void printMultiplicationTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println( n + "x"+ i + "="+ n *i);
        }
    }
    public static void main(String[] args){
        MultiTable obj1 = new MultiTable();
        Scanner val = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = val.nextInt();
        obj1.printMultiplicationTable(n);
    }
}
