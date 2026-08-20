import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

// in this problem we are given an array of n-1 elements and the elements are in the range of 1 to n
// we have to find the missing number in the array
// there are 2 approaches of doing this one is we calculate sum of all the elements
// and subtract it from sum of first n natural numbers and the
// other approach is we create one hashMap and store all the elements in the hashSet and then we check for the missing number in the range of 1 to n

//input: 9 4 6 5 2 1 8 7
//output: 3

public class CheckMissingNumber {

    public static int findMissingNumberUsingSumLogic(ArrayList<Integer> arrayList, int n){

        int sum = 0;
        for(int i=0 ;i< n-1; i++ ){
            sum+= arrayList.get(i);
        }
        int totalSum = n*(n+1)/2;
        return totalSum - sum;
    }

    public static int findMissingNumberByHashSet(ArrayList<Integer> arrayList, int n){

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < n-1; i++){
            hashSet.add(arrayList.get(i));
        }

        for(int i = 1; i < n+1; i++ ){
            if(!hashSet.contains(i)) {
                return i;
            }
        }
        return n+1;
    }

    public static void main(String [] args){

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the value  of n : ");
        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter " + ( n-1) + " elements of the array : ");
        for(int i = 0; i < n-1; i++){
            arrayList.add(scanner.nextInt());
        }

        System.out.println("By sum logic : ");
        int missingNumber = findMissingNumberUsingSumLogic(arrayList, n);
        System.out.println("The missing number is: " + missingNumber);

        System.out.println("By hash set logic : ");
         missingNumber = findMissingNumberByHashSet(arrayList, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
