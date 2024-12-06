package main;

public class StringManipulator {

    // input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i) + "";
        }
        return reversed;
    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        return input.equals(reverse(input));
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {
        return input.contains(part);
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        String returnString = "";
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                returnString += input.charAt(i) + "";
            }
        }
        return returnString;
    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        return input.toUpperCase();
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        return input.toLowerCase();
    }

    // input: example string => output: Example String
    public String capitalString(String input) {
        String returnString = "";
        boolean toBeCapital = true;
        for (int i = 0; i < input.length(); i++) {
            if (toBeCapital) {
                returnString += Character.toUpperCase(input.charAt(i)) + "";
                toBeCapital = false;
                continue;
            }
            if (Character.isWhitespace(input.charAt(i))) {
                toBeCapital = true;
                returnString += input.charAt(i) + "";
                continue;
            }
            returnString += input.charAt(i) + "";
        }
        return returnString;
    }

    // input: Example => output: 3
    public int countVowels(String input) {
        // Your code here
        String vowels = "aeuio";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (vowels.contains(input.charAt(i) + "")) {
                count++;
            }
        }
        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        // count white spaces
        if (sentence.isBlank()) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isWhitespace(sentence.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {

        return input.indexOf(substring);
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        String returnString = "";
        int lastSpaceIndex = sentence.length() - 1;
        for (int i = sentence.length() - 1; i >= 0; i--) {
            char c = sentence.charAt(i);
            if (Character.isWhitespace(c)) {
                returnString += sentence.substring(i + 1, lastSpaceIndex);
                lastSpaceIndex = i - 1;
            }
        }
        return returnString;
    }
}
