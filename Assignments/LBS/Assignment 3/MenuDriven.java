import java.util.Scanner;
class MenuDriven{
    static int a;
    static float b;
    static char c;
    static byte d;
    static short e;
    public static void main(String[] args){
        System.out.println("1 - Grade Evalutation System, 2 - Leap Year Check, 3 - Day of the week, 4 - Identify Default Values of Variables");
        System.out.println("Choose the MenuDrive Number: ");
        Scanner sc = new Scanner(System.in);
        int NumCase = sc.nextInt();
        
        switch(NumCase){
            case 1:
                System.out.println("Grade Evaluation System");
                System.out.println("Enter your Physics marks: ");
                int phy = sc.nextInt();
                System.out.println("Enter your Chemistry marks: ");
                int chem = sc.nextInt();
                System.out.println("Enter your Maths marks: ");
                int math = sc.nextInt();

                int avg = (phy + chem + math) / 3;
                if(avg >= 90){
                    System.out.println("Grade A");
                }else if (avg <= 89 && avg >= 60) {
                    System.out.println("Grade B");                    
                }else if(avg <= 59 && avg >= 35){
                    System.out.println("Grade C");
                }else{
                    System.out.println("Try Again");
                }

                break;
            
            case 2:
                System.out.println("Enter the Year: ");
                int year = sc.nextInt();
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    System.out.println(year + " is a leap year.");
                }else{
                    System.out.println(year + " isn't leap year");
                }
                break;

            case 3:
                System.out.println("Select the Day of a Week: ");
                int day = sc.nextInt();
                switch(day){
                    case 1:
                        System.out.println("Monday");
                        break;
                    
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    
                    case 4:
                        System.out.println("Thursday");
                        break;
                    
                    case 5:
                        System.out.println("Friday");
                        break;
                    
                    case 6:
                        System.out.println("Saturday");
                        break;

                    case 7:
                        System.out.println("Sunday");
                        break;

                    default:
                        System.out.println("This Day is Invalid, Please Select in the range of 1 to 7");
                
                
                }
                break;

            case 4:
                System.out.println("The Default values of the variables are:");
                System.out.println("Default Value of int " + a);
                System.out.println("Default Value of float " + b);
                System.out.println("Default Value of char " + c);
                System.out.println("Default Value of byte " + d);
                System.out.println("Default Value of short " + e);
                break;

            default:
                System.out.println("The given Num is Invaild - Exit");
                break;
        }
    }
}