package switch1_forloop;

public class Switch03 {
    public static void main(String[] args) {

        //Boyutu kontrol etmek icin Java Programi
        //switch.. case ifadesini kullanarak
        //small -medium - large-extra large -unknown

        int foodsize=42;
        String size;


        switch (foodsize){

            case 36:
                size="Small";
                break;
            case 38:
                size="Medium";
                break;
            case 40:
                size="Large";
                break;
            case 42:
                size="Extra large";
                break;
            default:
                size="unknown";
                break;

        }
        System.out.println("size : " +size);






    }
}
