import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

// in this problem we will be given an array of integers and we ned to count the frequency of each element in the array
// input : 10 30 45 54 20 10 34 45 54 60
// output: 10 -> 2
// 30 -> 1
// 45 -> 2
// 54 -> 2
// 20 -> 1
// 34 -> 1
// 60 -> 1

// what we will do is we will create a hashMap of integer to integer and than we will iterate on the array
// and increment the frequency by 1 each time than we will use entry map for printing the frequency of each element in the array
// as HashMap does not implements iterable so we have to use entry set for this

public class CountFrequencyOfElementsInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int arrayLength = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter the elements in the array");
        for(int i = 0; i < arrayLength; i++){
            arrayList.add(scanner.nextInt());
            // we can increment the frequency here itself as well but we will do it in next loop for better understanding

        }

        System.out.println("Array: " + arrayList);
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int element : arrayList) {
            // if the element element came firstime than we have to add that element in the hashMap
            // and if it is already existing we will increment the counter by 1
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        System.out.println("Frequency Map: ");
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}