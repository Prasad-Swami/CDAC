class GradeEvaluation{
    public static void main(String args[]){
        int maths = 58;
        int phy = 49;
        int chem = 44;
        int avg = (maths + phy + chem)/3;
        System.out.println("Average Marks = " + avg);
        if(avg >= 90){
            System.out.println("Grade A");
        }else if(89 >= avg && avg >= 70){
            System.out.println("Grade B");
        }else if(69 >= avg && avg >= 50){
            System.out.println("Grade C");
        }else if(49 >= avg && avg >= 30){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
    }
}