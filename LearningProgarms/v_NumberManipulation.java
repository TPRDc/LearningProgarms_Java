/**
 * 5_NumberManipulation
 */
public class v_NumberManipulation {
    public static void main(String[] args) {
        int num=5; int count=5;
        int num1=5; int count1=5;
        int num2=5; int count2=5;

        System.out.println("Current Number");
        System.out.println(num);
        System.out.println(count);
        
        System.out.println();
        System.out.println("Right syntax to add one to current number");
        System.out.println("=> "+ ++num);
        System.out.println("=> "+ --count);
        //or
        System.out.println();
        System.out.println(num1++);
        System.out.println("=> "+ num1);

        System.out.println(count1--);
        System.out.println("=> "+ count1);
        //or
        System.out.println();
        num2++;
        count2--;
        System.out.println("=> "+ num2);
        System.out.println("=> "+ count2);     
    }
}