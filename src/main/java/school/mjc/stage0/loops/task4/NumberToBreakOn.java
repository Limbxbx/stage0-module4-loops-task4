package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil) {
            System.out.println("Iterating till the end");
        }
        for (int i = 1; i <= numberToGoUntil + 1; i++) {
            if (i == toBreakWith) {
                break;
            }
            System.out.println(i);
        }
    }
}
