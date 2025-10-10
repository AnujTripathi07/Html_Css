package searching;

public class min_no {
    public static void main(String[] args) {
        int[] num = {3,4,5,6,1,0};
        int min = num[0];
        System.out.println(search(num,min));

    }
    static int search(int[] num , int min){
//         int min = num[0];
        for (int i = 0; i < num.length; i++) {

            if(min > num[i]){
              min = num[i];

            }
        }
        return min;
    }
}
