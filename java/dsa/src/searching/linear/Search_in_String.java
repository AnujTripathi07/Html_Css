package searching;

public class Search_in_String {
    public static void main(String[] args) {
        //Search in String

        String name = "Anuj";
        char target = 'u';

        search(name,target);


    }
    static void search(String str , char target){
        int found = 0;
        if(str.length() == 0){
            System.out.println("INVAlID TARGET");
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                found = 1;
                System.out.printf("The target %s is found at the index value %d", target, i);
                break;
            }
        }
        if(found!= 1){
            System.out.println("Target is not found inside the string");
        }
    }
}
