import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        String [] word = {"zero", "one", "two", "three", "four"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit between 0 to 4");
        int index = sc.nextInt();
        for(int i =0; i<5; i++){
           System.out.println(word[i]);
        }

        }
}



