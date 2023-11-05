public class Exercicio {
    public static void main(String args []) {
        int startingDecrescentValue = reinitialize();
        startingDecrescentValue++;

        drawLine();
        System.out.println( "First Loop:");
        do {
            startingDecrescentValue --;
            System.out.println(startingDecrescentValue );
        } while (startingDecrescentValue>0);

        startingDecrescentValue = reinitialize();
        drawLine();
        System.out.println("Second Loop:");
        for (int i = startingDecrescentValue; i >= 0; i--) {
            System.out.println(i);}

        startingDecrescentValue = reinitialize()+1;
        drawLine();
        System.out.println("Third Loop:");
        while (startingDecrescentValue>0 ) {
            startingDecrescentValue--;
            System.out.println(startingDecrescentValue);
        }
    }

    private static int reinitialize() { return 4; }
    private static void drawLine() {
        System.out.println("*----------------------------------------------*");
    }
}
