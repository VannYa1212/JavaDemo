
import java.util.Scanner;

public class formatingIdCard {
    static void getInformation(String str) {
        if (str.length() > 20) {
            String[] strArray1 = str.split(",");
            String id = strArray1[0].substring(5, 14);
            String date = strArray1[1].substring(0, 6);
            String Gender = strArray1[1].substring(17, 18);
            String ShGender;
            if (Gender.equals("M")) {
                ShGender = "MEN";
            } else {
                ShGender = "FEMALE";
            }
            String cutting = strArray1[2].substring(ShGender.length());
            int startIndex = cutting.indexOf("<") + 2;
            int endIndex = 0;

            for (int i = 2; i < cutting.length(); i++) {
                if (cutting.charAt(i) == '<') {
                    endIndex = i;
                    break;
                }
            }
            if (Integer.parseInt(date.substring(0, 2)) > 20) {
                date = "" + date.charAt(4) + date.charAt(5) + "/"
                        + date.charAt(2) + date.charAt(3) + "/19"
                        + date.charAt(0) + date.charAt(1);
            } else {
                date = "" + date.charAt(4) + date.charAt(5) + "/"
                        + date.charAt(2) + date.charAt(3) + "/20"
                        + date.charAt(0) + date.charAt(1);
            }

            String name = cutting.substring(startIndex, endIndex);

            System.out.println(id);
            System.out.println(Gender);
            System.out.println(ShGender);
            System.out.println(name);
            System.out.println(date);

        } else {
            String[] strArray = str.split(": ");
            System.out.println(strArray[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String Str = scanner.nextLine();
        getInformation(Str);
        scanner.close();

    }

}