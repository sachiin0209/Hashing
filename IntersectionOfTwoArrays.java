import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

// in this problem we are given 2 arrays and we have to find elements which are present in both the arrays
// we can do that during taking input as well but we will make it simple so we will create a different method to do it
// input arrayList1: 1 2 3 4 5 6 7 8
//input: arrayList2: 5 6 7 8 9 10 11 12 13

// output: 5 6 7 8

public class IntersectionOfTwoArrays {

    public static ArrayList findIntersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        for(Integer element : list1){
            hashSet.add(element);
        }
        for(Integer element : list2){
            if(hashSet.contains(element)){
                resultList.add(element);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter the size of the first array");
        int n = scanner.nextInt();

        System.out.println("Enter elements of the array");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arrayList.add(scanner.nextInt());
        }

        System.out.println("Enter the size of the second array");

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int m = scanner.nextInt();

        System.out.println("Enter elements of the array");
        for(int i = 0; i < m; i++){
            arrayList2.add(scanner.nextInt());
        }
        System.out.println("First array: " + arrayList);
        System.out.println("Second array: " + arrayList2);

        ArrayList<Integer> resultList = findIntersection(arrayList, arrayList2);
        System.out.println("The intersection is: " + resultList);
    }
}