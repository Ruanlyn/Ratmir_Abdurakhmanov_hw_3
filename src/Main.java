import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] number = {7.0, 5.0, -3.5, -7.0, 9.3, 4.7, -6.1, 4.4, 5.5,
                -7.3, 8.9, -30.1, -70.1, -4.1, 6.6};
        boolean negativeNumber = false;
        double totalSum = 0;
        int countNumber = 0;
        for (double middleNumber : number
        ) {
            if (negativeNumber && middleNumber > 0) {
                totalSum += middleNumber;
                countNumber++;
            }
            if (middleNumber < 0) {
                negativeNumber = true;
            }
        }
        double average = totalSum / countNumber;
        System.out.println(average);

        /*while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ваше слово: ");
            String words = scanner.nextLine();
            String words1 = words.toLowerCase();
            String words2 = words1.replaceAll(" ", "");
            //String toWords = words.replaceAll(" ", "");
            if (words2.equals("Палиндром")) {
                System.out.println("Это слово: " + words2);
            } else {
                System.out.println("Это не Палиндром");
            }
            break;
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String word = scanner.nextLine();
        String defendWord = word.replaceAll("\\s", "").toLowerCase();
        if (palindrome(defendWord)) {
            System.out.println("Эта строка являеться Palindrome");
        } else {
            System.out.println("Эта строка не Palindrome");
        }
    }

    public static boolean palindrome(String str) {
        int beginText = 0;
        int endText = str.length() - 1;
        while (beginText < endText) {
            if (str.charAt(beginText) != str.charAt(endText)) {
                return false;
            }
            beginText++;
            endText--;
        }
        return true;
    }
}
