package HWTasks.MaxAndMinFinder;

import java.util.ArrayList;

class MinFinder implements Runnable {
    private ArrayList<Integer> numbers;
    private Result result;

    public MinFinder(ArrayList<Integer> numbers, Result result) {
        this.numbers = numbers;
        this.result = result;
    }

    @Override
    public void run() {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        result.setMin(min);
    }
}