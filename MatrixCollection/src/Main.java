
public class Main {
    public static void main(String[] args) {

        MatrixCollection matrixCollection = new MatrixCollection();

        matrixCollection.add(1, 0, 0);
        matrixCollection.add(54, 0, 1);
        matrixCollection.add(643, 1, 0);
        matrixCollection.add(34, 3, 2);
        matrixCollection.add(74, 3, 4);
        matrixCollection.add(4, 1, 1);
        matrixCollection.add(8, 4, 3);
        matrixCollection.add(9, 4, 4);

        System.out.println("MatrixCollection:");

        for (int i : matrixCollection) {
            System.out.println(i);
        }

        matrixCollection.remove(0, 1);
        matrixCollection.remove(0, 0);
        matrixCollection.remove(1, 0);
        matrixCollection.remove(3, 2);

        System.out.println("\nMatrixCollection after removing some elements:");

        for (int i : matrixCollection) {
            System.out.println(i);
        }
    }
}