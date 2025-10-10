package searching;
import java.util.Scanner;
public class lin_search {
    public static void main(String[] args) {

        int target;
        int found = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array element");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the element to be found : ");
        target = scan.nextInt();

        search(arr,target,found);







    }

    static void search(int[] arr, int target, int found) {
        if (arr.length == 0) {
            System.out.println("Enter a valid array");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = 1;
                System.out.println("The element is found at the index: " + i);
                break;
            }

        }
        if (found != 1) {
            System.out.println("The element is not present inside the array");
        }


    }



}

