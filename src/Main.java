public class Main {
    public static void main(String[] args) {

        System.out.println(getBack(24, 47));
        System.out.println(getBack(41, 34));
        System.out.println(getBack(35, 13));
        System.out.println(getBack(76, 24));
        System.out.println(getBack(45, -15));
    }

    public static String getBack(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайся дома";
        }
    }
}