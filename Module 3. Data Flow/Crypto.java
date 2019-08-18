import java.util.*;
/*
    Module 3 Project. Create Caesar cipher.
 */
public class Crypto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a string to encrypt: ");
        String inputStr = sc.nextLine();
        String normedStr = normalizeText(inputStr);
        System.out.println("Normalised text: " + normedStr);
        System.out.print("Please, enter the value for a Caesar key: ");
        int caesarKey = sc.nextInt();
        String caesarString = caesarify(normedStr, caesarKey);
        System.out.println("Caesar ciphered text: " + caesarString);
        System.out.print("Please, enter the value for groups lengths: ");
        int groupLen = sc.nextInt();
        String groupedStr = groupify(caesarString, groupLen);
        System.out.println("...........");
        System.out.println("Your encrypted string: " + groupedStr);
    }

    public static String normalizeText(String text) {
        // remove all special characters, numbers and spaces from an input string
        String result = text.replaceAll("[\\-+.,^;:/()\\[\\]{}\\\\\"!?'\\s+[0-9]]", "");
        result = result.toUpperCase();
        return result;
    }

    public static String caesarify(String strToEnc, int key) {
        // create two alphabets normal and shifted to replace letters
        String normalAlphabet = shiftAlphabet(0);
        String shiftedAlphabet = shiftAlphabet(key);
        String encrypted = "";
        // loop through each character of the input string and find equivalent for it from 2nd alphabet
        for (int i = 0; i < strToEnc.length(); i++) {
            char currChar = strToEnc.charAt(i);
            int normIndex = normalAlphabet.indexOf(currChar);
            char encChar = shiftedAlphabet.charAt(normIndex);
            encrypted = encrypted + encChar;
        }
        return encrypted;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String groupify(String str, int groupLen) {
        // remove front and back spaces if any
        str = str.trim();
        String result = "";
        // jump through string using groupLen step and add whitespace after each newly created group
        while (str.length() > groupLen) {
            result = result + str.substring(0,groupLen) + " ";
            str = str.substring(groupLen);
            // when string ends and there are no enough chars for a group,
            // replace missing with 'x's to fill the group
            if (str.length() < groupLen) {
                String trailingXs = "";
                for (int i = 0; i < groupLen-str.length(); i++) {
                    trailingXs += 'x';
                }
                result = result + str + trailingXs;
            }
        }

        return result;
    }
}
