public class LeapYear {
    public static void main(String[] args) {
        int a = 2025;
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not Leap Year");
        }

    }

}