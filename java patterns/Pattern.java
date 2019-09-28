

public class Pattern{
    public void forward(int x, String toPrnt){
        for(int i = 0; i <= x; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(toPrnt);
            }
            System.out.println();
        }
    }
}