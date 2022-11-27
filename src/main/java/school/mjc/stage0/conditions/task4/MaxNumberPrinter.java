package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = Math.max(Math.max(first, second), third);
        System.out.println(result);
    }
}
