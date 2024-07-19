public class NumberSeriesRightHalfPyramidPattern {
    public static void main(String[] args) {
        printNumberSeriesRightHalfNumberPyramid(5);
    }

    public static void printNumberSeriesRightHalfNumberPyramid(int size) {
        int num=1;
        for(int i=0; i<size; i++) {
            for(int j=1; j<=i+1; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
