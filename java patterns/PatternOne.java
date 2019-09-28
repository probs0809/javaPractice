class PatternOne{
    public static void main(String[] args){
        int x = 10;
        for(int i = 0; i < x; i++){
            for(int j = i; j < x; j++){
                System.out.print(" *");
            }
            for(int j = 0; j <= i-1; j++){
                if(j == i-1){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j = 0; j <= i-2; j++){
                System.out.print("  ");
            }
            for(int j = i; j < x; j++){
                if(i == 0 && j == 0){
                    System.out.print("");
                }else{
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }

        for(int i=0; i<=x+8; i++){
            System.out.print(" *");
        }
        System.out.println("");

        for(int i = 0; i < x; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" *");
            }
            for(int j = i+3; j <= x; j++){
                System.out.print("  ");
            }
            for(int j = i+2; j <= x; j++){
                if( j == i+2){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j = 0; j <= i; j++){
                if(j==x-1 && i == x-1){
                    System.out.print("");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
}