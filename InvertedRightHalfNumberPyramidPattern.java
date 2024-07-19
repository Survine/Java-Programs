public class InvertedRightHalfNumberPyramidPattern {
    public static void main(String[] args) {
        printInvertedRightHalfNumberPyramid(5);
    }

    public static void printInvertedRightHalfNumberPyramid(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size-i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
