public class PaintingJob {
    public static void main(String[] args) {
        final int quartsPerGallon = 4;
        int quartsPaint = 22;
        int gallonsPaint = quartsPaint / quartsPerGallon;
        int remainingQuarts = quartsPaint % quartsPerGallon;
        System.out.println("Paint Requirements:");
        System.out.println(gallonsPaint + " gallons and "  + remainingQuarts +  " quarts of paint needed to complete the job." );
    }
}