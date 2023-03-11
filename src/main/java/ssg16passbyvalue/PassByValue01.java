package ssg16passbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {


        int watchPrice=200;
        System.out.println("original value " +watchPrice);
        studentWatchPrice(watchPrice,10);

    }

    public static void studentWatchPrice(int watchPrice,int discount){

        int discountForStudent = watchPrice-discount;
        System.out.println("after discount for students :" +discountForStudent);

    }



    public static void teacherWatchPrice(int watchPrice,int discount){

        int discountForStudent = watchPrice-discount;
        System.out.println("after discount for teachers :" +discountForStudent);

    }


    public static void otherWatchPrice(int watchPrice,int discount){

        int discountForStudent = watchPrice-discount;
        System.out.println("after discount for others :" +discountForStudent);

    }



}
