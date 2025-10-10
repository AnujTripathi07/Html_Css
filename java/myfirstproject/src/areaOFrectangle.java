import java.util.Scanner;
public class areaOFrectangle {
    public static void main(String[] args) {

        // Area of a Rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the width : ");
        width = scan.nextDouble();

        System.out.print("Enter the height : ");
        height = scan.nextDouble();


        System.out.println("the width and height of the rectangle is : " + width + " and " + height) ;

        area =  width * height;
        System.out.println("the area is " + area + "cm²");



    }
}
