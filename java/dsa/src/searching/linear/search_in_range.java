package searching;
import java.util.Scanner;
public class search_in_range {
    public static void main(String[] args) {

        int target;
        int found = 0;
        int start ;
        int end ;
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
        System.out.print("Enter the range from where you want to search: ");
        start = scan.nextInt();
        System.out.print("Enter the end value you want to end the searching: ");
        end = scan.nextInt();

        search(arr,target,found,start,end);







    }

    static void search(int[] arr, int target, int found , int start, int end) {
        if (arr.length == 0) {
            System.out.println("Enter a valid array");
        }
        for (int i = start; i < end; i++) {
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

