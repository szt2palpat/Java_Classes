public class Person {
    public String firstName;
    public String Lastname;
    public int birthYear;
    public int birthMonth;
    public int birthDay;
    private void printPerson() {
        System.out.println("Vezetéknév: "+Lastname+"\n"+"Utonév: "+firstName+"\n"+"Születési idő: "+birthYear+"."+birthMonth+"."+birthDay);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setBirthMonth(int birthMonth) {
        if(birthMonth>12||birthMonth<1)return;
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(int birthDay) {
        if(birthDay>31||birthDay<1)return;
        if (birthMonth==4||birthMonth==6||birthMonth==9||birthMonth==11&&birthDay>30)return;
        if (birthMonth==2&&birthYear%4==0&&birthDay>29)return;
        if(birthMonth==2&&birthYear%4!=0&&birthDay>28)return;
        this.birthDay = birthDay;
    }

    public String getLastname() {
        return Lastname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String ToString(){
        return "Vezetéknév: "+Lastname+"\n"+"Utonév: "+firstName+"\n"+"Születési idő: "+birthYear+"."+birthMonth+"."+birthDay;
    }

}