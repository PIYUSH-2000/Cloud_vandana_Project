import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

 
        try {
            int result = romanToInteger(romanNumeral);
            System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Roman numeral. Please enter a valid Roman numeral.");
        }
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && romanNumerals.get(s.charAt(i)) > romanNumerals.get(s.charAt(i - 1))) {
                result += romanNumerals.get(s.charAt(i)) - 2 * romanNumerals.get(s.charAt(i - 1));
            } else {
                result += romanNumerals.get(s.charAt(i));
            }
        }

        return result;
    }
}

