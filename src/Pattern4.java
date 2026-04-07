/*
For n = 5
*
* *
* * *
* *
*
 */

public class Pattern4 {
    public static void main(String[] args) {
        int n = 7;
        int rows = n;
        int stars = 1;
        for(int i = 1 ; i<= rows; i++){
            for(int cst =1 ; cst <=stars; cst++)
            {
                System.out.print("* ");
            }
            System.out.println();
            if(i <= rows/2){
                stars++;
            }else {
                stars--;
            }
        }
    }
}
