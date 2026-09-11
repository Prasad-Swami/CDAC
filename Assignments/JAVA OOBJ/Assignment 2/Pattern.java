public class Pattern {
    public static void main(String[] args) {

        //Odd num 1- 1000
        for(int itmp = 1; itmp <= 1000; itmp++){
            if(itmp%2 != 0){
                System.out.println(itmp);
            }
        }

       // even nums 1-500
        for(int itmp = 1; itmp <= 500; itmp++){
            if(itmp%2 == 0){
                System.out.println(itmp);
            }
        }

        //display 7th table till 200
        for(int itmp = 7; itmp <= 200; itmp+=7){
            // if(itmp%7 == 0){
            //     itmp += 1;
                System.out.println(itmp);
            //}
        }


        for(int itmp = 0; itmp < 5; itmp++){
            for(int jtmp = 0; jtmp < itmp + 1; jtmp++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int itmp = 0; itmp < 5; itmp++){
            for(int jtmp = 5; jtmp > itmp + 1; jtmp--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int itmp = 0; itmp < 5; itmp++){
            for(int jtmp = 5; jtmp > itmp; jtmp--){
                System.out.print("*");
            }
            System.out.println();
        }

        //123456
        int count = 1;
        for(int itmp = 0; itmp < 4; itmp++){
            for(int jtmp = 0; jtmp < itmp + 1; jtmp++){
                System.out.print(count + " ");
                count++;
                
            }
            System.out.println();
        }

        for(int outer = 1; outer <= 6; outer++){
            for(int inner = 1; inner <= outer; inner++){
                System.out.print(inner + " ");
            }
            System.out.println();
        }

        for(int outer = 6; outer > 0; outer--){
            for(int inner = 1; inner <= outer; inner++){
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }


}
