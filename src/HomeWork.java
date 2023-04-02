import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Как зовут вашего друга?");

        Scanner in  = new Scanner(System.in);
        String nameFriend = in.nextLine();

        System.out.println("Сколько лет вашему другу?");
        String ageFriend = in.nextLine();

        System.out.println("Моему другу "+nameFriend+" на данный момент "+ageFriend+" лет");

    }
}
