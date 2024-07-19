public class InvertedRightHalfPyramidPattern {
    public static void main(String[] args) {
        printInvertedRightHalfPyramid(5);
    }

    public static void printInvertedRightHalfPyramid(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
