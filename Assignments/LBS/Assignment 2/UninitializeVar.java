class UninitializeVar {

    byte a; //instance
    static short b;//static variable
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;

    public static void main(String args[]){
        //Declaring the instance
        UninitializeVar alpha = new UninitializeVar();
        //Printing all values
        System.out.println(alpha.a); //printing the initalize one
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
