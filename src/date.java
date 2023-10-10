public class date {
    public int day;
    public int year;
    public int month;
    
    public date(int day,int year,int month){
        this.day=day;
        this.month=month;
        this.year=year;
        
    }
    public boolean IsCorrectDate(){
        if (month<1&&month>12)return false;
        if(month==4||month==6||month==9||month==11&&day>30) return false;
        if(month==2&&year%4==0&&day>29)return false;
        if (month==2&&year%4!=0&&day>28) return false;

        return true;
    }
    public void PrintDate(){
        System.out.println("Dátum: "+year+"."+month+"."+day);
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
