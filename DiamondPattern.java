public class DiamondPattern {
    public static void main(String[] args) {
        printDiamond(5);
    }

    public static void printDiamond(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<size-1; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<size-i-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
