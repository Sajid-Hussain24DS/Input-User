class LeapYear {

    public static void main(String[] args) {
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0))
            System.out.println(year + "is a leap year");
    else if (year % 440 == 0){
            System.out.println(year + "is not leap year");

        }
    }
}