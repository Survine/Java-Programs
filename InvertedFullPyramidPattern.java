public class InvertedFullPyramidPattern {
    public static void main(String[] args) {
        printInvertedFullPyramid(5);
    }

    public static void printInvertedFullPyramid(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<size-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
