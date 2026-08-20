class LeapYear{
    public static void main(String agrs[]){
        int year_1 = 2005;
        int div_4 =  year_1 % 4;
        int div_100 = year_1 % 100;
        int div_400 = year_1 % 400;
        if ((div_4 == 0 && div_100 != 0) || (div_400 == 0) ){
            System.out.println(year_1+ " is a Leap Year");
        }else{
            System.out.println(year_1 + " is not a Leap Year");
        }       
    }
}