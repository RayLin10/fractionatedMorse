import java.util.*;

public class fractionatedMorse {

    public static String encode (String plaintext, String key, Hashtable<> cipherMap, Hashtable<> morseKey) {
        String morse = "", output = "";

        for (x = 0; x < plaintext.length(), x++) {
            morse += morseKey.get(plaintext.charAt(x));
            if (x != plaintext.length() - 1)
                morse += "x";
        }

        while ((morse.length() % 3) != 0)
            morse += "x"



        return output;
    }

    public static String decode (String ciphertext, String key, Hashtable<> cipherMap, Hashtable<> morseKey) {
        String output = '';



        return output;
    }

    public static void main (String[] args) {

        if (args.length != 3) {
            System.exit(0);
        }

        boolean encode = false, decode = false;
        String key = args[1]; 
        String inputText = args[2];

        if (args[0].equals("encode")) {
            encode = true;
        }
        if (args[0].equals("decode")) {
            decode = true;
        }

        inputText = inputText.toUpperCase();

        char[] textChar = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 
            'Z', '.', ',', ':', '"', '\'', '!', '?', '@', '-', ';', '(', ')', '=', '1', 
            '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String[] morseCode = new String[] {'.-', '-...', '-.-.', '-..', '.', '..-.', 
            '--.', '....', '..', '.---', '-.-', '.-..', '--', '-.', '---', '.--.', '--.-', 
            '.-.', '...', '-', '..-', '...-', '.--', '-..-'. '-.--', '--..', '.-.-.-'. 
            '--..--', '---...', '.-..-.', '.----.', '-.-.--', '..--..', '.--.-.', '-....-', 
            '-.-.-.', '-.--.', '-.--.-', '-...-', '.----', '..---', '...--', '....-', 
            '.....', '-....', '--...', '...--', '----.', '-----'};
        Hashtable<char, String> morseKey = new Hashtable<>(49, 1.0f);
        for (x = 0; x < 49, x++) {
            table.put(textChar[x], morseCode[x]);
        }

        String[] mapConstant = new String[] {"...", "..-", "..x", ".-.", ".--", ".-x", 
            ".x.", ".x-", ".xx", "-..", "-.-", "-.x", "--.", "---", "--x", "-x.", "-x-", 
            "-xx", "x..", "x.-", "x.x", "x-.", "x--", "x-x", "xx.", "xx-"};
        Hashtable<char, String> map = new Hashtable<>(26, 1.0f);
        for (x = 0; x < 26; x++) {
            table.put(key.charAt(x), mapConstant[x]);
        }

    }
}