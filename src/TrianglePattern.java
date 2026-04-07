public class TrianglePattern {
    public static void main(String[] args) {
        int n = 4;
        int trows = n;
        int spaces = n-1;
        int stars = 1;
        for(int i =1 ; i<=trows;i++){
            for(int j =1 ; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int k =1 ; k<=stars; k++){
                System.out.print("*");
            }
            spaces--;
            stars += 2;
            System.out.println();
        }
    }
}
