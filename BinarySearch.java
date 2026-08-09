import java.util.Scanner;
import java.util.ArrayList;

// the problem is you are given an sorted array and an element which you need to find
// you have to return the index of that element if it is present in the array
// for this we will use binary search where all the elements are sorted and we will check the mid element and if it is equal to the target than we will return the index of that element

public class BinarySearch {

    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");

        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arrayList.add(scanner.nextInt());
        }

        int element = scanner.nextInt();
        int left = 0;
        int right = n-1;
        while(left <= right ){
            int mid  = left + (right - left)/2;

            if(arrayList.get(mid) == element){
                System.out.println("Element found at index: " + mid);
                return;
            } else if(arrayList.get(mid) < element){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
}