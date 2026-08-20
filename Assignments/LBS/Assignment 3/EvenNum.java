class EvenNum {
    void printEvenNumbers(){
        int i = 1;
        while (i <= 50) { 
            int even = i % 2;
            if(even == 0){
             System.out.println(i +" ");
            }
            i++;
        } 
    }
    public static void main(String[] args){
        EvenNum obj = new EvenNum();
        obj.printEvenNumbers();

    }
}
