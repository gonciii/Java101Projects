package week2;

// B letter with array

public class BLetterWithArray {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        // add element for the array
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {

                //    ---
                //    ---
                //    ---
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                    // ->   |  |
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        // - >> print to screen " B "
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

