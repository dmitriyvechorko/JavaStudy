package HWTasks.MaxAndMinFinder;

import java.util.ArrayList;

class MaxFinder implements Runnable {
    private ArrayList<Integer> numbers;
    private Result result;

    public MaxFinder(ArrayList<Integer> numbers, Result result) {
        this.numbers = numbers;
        this.result = result;
    }

    @Override
    public void run() {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        result.setMax(max);
    }
}
