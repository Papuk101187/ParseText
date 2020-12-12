import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        ReadText();

    }

    private static void ReadText() throws IOException {
        FileReader fr = new FileReader("sample1.txt");
        ParseText(new Scanner(fr));

    }

    private static void ParseText(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String s1 = scanner.nextLine();
            checkReg(s1);

        }
    }

    private static void checkReg(String s1) {
        String reg = "\\d+\\.\\d+\\S+";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(s1);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
