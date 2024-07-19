public class HourGlassPattern {
    public static void main(String[] args) {
        printHourglass(5);
    }

    public static void printHourglass(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<size-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<size; i++) {
            for(int j=0; j<size-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
