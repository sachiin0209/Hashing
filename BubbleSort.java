import java.util.Scanner;
import java.util.ArrayList;

// bubble sort is a simple sorting algorithm that works by coninuous swapping of adjacent elements
// if they are in the wrong place

// input: 5 3 4 8 2
// output: 2 3 4 5 8
// List after 1 iteration: [3, 4, 5, 2, 8]
// List after 2 iteration: [3, 4, 2, 5, 8]
// List after 3 iteration: [3, 2, 4, 5, 8]
// List after 4 iteration: [2, 3, 4, 5, 8]

public class BubbleSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = scanner.nextInt();
        System.out.println("Enter the elements in the array");

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }

        System.out.println("List before sorting: " + arrayList);

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arrayList.get(j) > arrayList.get(j + 1)) {

                    int temp = arrayList.get(j);

                    arrayList.set(j, arrayList.get(j + 1));

                    arrayList.set(j + 1, temp);
                }
            }

            System.out.println(
                    "List after " + (i + 1) + " iteration: " + arrayList
            );
        }

        System.out.println("After sorting: " + arrayList);
    }
}