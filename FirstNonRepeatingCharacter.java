import java.util.Scanner;
import java.util.HashMap;

// The problem is we need to find the first non-repeating character in this problem we are given a string
// and we need to find first non repeating character
//input: "cheesecake"
// output: "h"
// we will use hashing in this problem, there can be change in approach as well if the problem ask about case sensitive or the string given will be in lower case only
// we will consider that the string given to us is in lower case only
// we can do it in 2 ways one is we create one hashMap of character to integer and other is we create an array of size 26
// and we will iterate on the string and increment the frequency of each character in the hashMap or array
public class FirstNonRepeatingCharacter {

    public static void main(String []args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string  = scanner.nextLine();

        HashMap<Character, Integer> frequency = new HashMap<>();

        int n = string.length();
        for (int i=0; i<n; i++){
            char character = string.charAt(i);
            frequency.put(character, frequency.getOrDefault(character, 0) + 1 );
        }

        for (int i=0; i<n; i++){
            char character = string.charAt(i);
            if (frequency.get(character) == 1){
                System.out.print(character + " is the first non-repeating character in the string");
                return;
            }
        }
        System.out.print("There is no non-repeating character in the string");
    }
}