package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int i = 0; i < lastPrinted + 1; i++) {
            if(i%3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
