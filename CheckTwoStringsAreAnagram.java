import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

// in this problem we are given two string and we need to check whether they are anagrams of each other
// Anagram means: when two strings have same characters but in different order
// for example: "listen" and "silent" are anagrams of each other
// input: listen    and  silent
// output: true
// we will use the similar approach which we will use in first non-repeating character problem

public class CheckTwoStringsAreAnagram {

    public static Boolean checkForAnagram(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }
        ArrayList<Integer> charCount = new ArrayList<>(Collections.nCopies(26, 0));

        int length  = str1.length();
        for(int i = 0; i < length; i++){

            int index = str1.charAt(i) - 'a';
            charCount.set(index, charCount.get(index) + 1);
        }

        for(int i = 0; i < length; i++){
            int index = str2.charAt(i) - 'a';
            charCount.set(index, charCount.get(index) - 1);
        }

        for(int freq : charCount){
            if(freq != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1  = scanner.nextLine();
        System.out.print("Enter a string: ");
        String str2 = scanner.nextLine();

        // we can make 2 hashmaps and count the freuqency of each character in both strings and than compare the hashmaps
        // or we can use one hashMap and while iterating one string we will increment the counter and while iterating the other we will decrement the count
        // and at last we will see if each item is zero if not than both string are not anagram

        if ( checkForAnagram(str1, str2)){
            System.out.println("Anagrams found");
        }
        else{
            System.out.println("Anagrams not found");
        }
    }
}