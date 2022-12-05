package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad() {
        for (int runner = 0; runner < 20; ++runner) {
            System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
        }
    }

    public static void main(String[] args) {
        RepeatIsBad repeatIsBad = new RepeatIsBad();
        repeatIsBad.repeatIsBad();
    }
}
