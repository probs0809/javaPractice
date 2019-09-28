import java.util.Scanner;

public class Pattern{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the input Element: ");
        int n = s.nextInt();

        for(int i = 0; i <= n*2 ; i++){
            if(i%2 != 0){
                for(int j = 0 ; j < i; j++ ){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }

}
