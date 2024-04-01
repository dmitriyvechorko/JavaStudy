public class Task1 {
    public static void main(String[] args) {
        char whiteSquare = 'W';
        char blackSquare = 'B';
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            if ((i % 2 == 0) | (i == 0)) {
                for (int j = 0; j < array[i].length; j += 2) {
                    array[i][j] = String.valueOf(whiteSquare);
                }
                for (int j = 1; j < array[i].length; j += 2) {
                    array[i][j] = String.valueOf(blackSquare);
                }
            } else {
                for (int j = 0; j < array[i].length; j += 2) {
                    array[i][j] = String.valueOf(blackSquare);
                }
                for (int j = 1; j < array[i].length; j += 2) {
                    array[i][j] = String.valueOf(whiteSquare);
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
