import java.util.Arrays;

public class MehrdimensionaleArray {
    public static void main(String[] args){

        String[][] board = new String[8][8]; // Sting kann auch als boolaen angelegt werden

        board[0][1] = "Hier ist ein Text"; // Hier kann die Array gefüllt werden

        for (String[] row : board){
            System.out.println(Arrays.toString(row));
        }

    }

}
