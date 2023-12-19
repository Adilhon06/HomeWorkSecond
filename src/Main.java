public class Main {
    public static void main(String[] args) {

        getBack(34, 20);
        getBack(23, 10);
        getBack(15, -20);
        getBack(16, 16);
        getBack(48, 36);
    }
    public static String getBack(int age, int temperature){

        if (age >= 20 && age <=40 && temperature >= -20 && temperature <= 30){
            System.out.println("Можно идти гулять");
        } else if (age <= 20 && temperature >= 0 && temperature <= 28){
            System.out.println("Можно идти гулять");
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайся дома");
            return "Оставайся дома";
        }
        return "Можно идти гулять";
    }
}