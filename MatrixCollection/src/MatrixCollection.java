import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixCollection implements Iterable<Integer> {
    private final int[][] matrix = new int[5][5];

    //1,1,0,0,0
    //1,1,0,0,0
    //0,0,0,0,0
    //0,0,0,0,0
    //0,0,0,1,1

    public void add(int value, int row, int col) {
        this.matrix[row][col] = value;
    }

    public int get(int row, int col) {
        return this.matrix[row][col];
    }

    public void remove(int row, int col) {
        this.matrix[row][col] = 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MatrixIterator();
    }

    private class MatrixIterator implements Iterator<Integer> {

        private int row = 0;
        private int col = 0;

        @Override
        public boolean hasNext() {
            return row < matrix.length && col < matrix[row].length;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int value = matrix[row][col];
            col++;
            if (col == matrix[row].length) {
                col = 0;
                row++;
            }
            return value;
        }
    }
}
