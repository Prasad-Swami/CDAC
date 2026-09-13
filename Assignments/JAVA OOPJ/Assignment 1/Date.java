public class Date{
    
    private int day;
    private int month;
    private int year;
    int daysInMonth;


    //Setter
    public void setDate(int dd, int mm, int yy){
        if(yy >= 1950 && yy <= 2100){
            year = yy;
        }

        if(mm < 1 || mm > 12 ){
            month = 1;
        }else{
            month = mm;
        }

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if(dd < 1 || dd > 31){
                day = 1;
            }else{
                day = dd;
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
                if(dd < 1 || dd > 30){
                    day = 1;
                }else{
                    day = dd;
                }   
        }else if(month == 2){
            if(year % 400 == 0 && (year % 4 == 0 || year % 100 == 0)){
                if(dd < 1 || dd > 29){
                    day = 1;
                }else{
                    day = dd;
                }
            }else{
                if(dd < 1 || dd > 28){
                    day = 1;
                }else{
                    day = dd;
                }
            }
        }
    }
    //days in month
    int daysMonth(){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }else if(month == 2){
            if((year%400 == 0)||(year%4 == 0 && year%100 != 0)){
                return 29;
            }else{
                return 28;
            }
        }
        return 1;
    }

    
    
    
    
        
        // for(int itmp = 0; itmp < days; itmp++){
        //     day += days;
        // }
        // int monappend = day%3;
        // if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            //     if(monappend ){
        //         day = 1;
        //         month += 1;
        //     }
        // }
    
 
        // Getter
        
        public void getDate(){
            System.out.println(day + "/" + month + "/" + year);
        }
        
        public int getDay(){
            return day;
        }
        
        public int getMonth(){
            return month;
        }
        
        public int getYear(){
            return year;
        }
        
        //add functions
        
        public void addDays(int days){
            int totalDay = day + days;
            if(totalDay <= daysMonth()){
                day = totalDay;
            }else if(totalDay > daysMonth()){
                day = totalDay - daysMonth();
                month += 1;
                while(day > daysMonth()){
                    day = day - daysMonth();   
                    month ++;
                    if(month > 12){
                        year++;
                        month = 1;
                    }
                }
            }
        }

        public void addMonth(int months){
            int totalMonths = month + months;
            if(totalMonths <= 12){
                month = totalMonths;
            }else if(totalMonths >= 12){
                month = totalMonths - 12;
                year += 1;
                //what if months 11+
            }
        }

        public void addYear(int years){
            year += years;
        }
                    
    public static void main(String[] args){
        Date obj = new Date();
        obj.setDate(24, 11, 2004);
        obj.getDate();
        //System.out.println(obj.getDay());
        obj.addDays(3000);
        obj.addMonth(10);
        obj.addYear(15);
        obj.getDate();

    }
}