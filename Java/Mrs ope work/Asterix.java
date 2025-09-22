public class Asterix {
    public static void main(String[] args) {
        int rows = 6;

                for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("a ");
            }

           
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print("  ");
            }

                for (int g = 1; g <= i; g++) {
                System.out.print("b ");
            }
            System.out.println();
        }

       
          }
}