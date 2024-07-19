public class NumberPyramidPattern {
    public static void main(String[] args) {
        printNumberPyramid(5);
    }

    public static void printNumberPyramid(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++) {
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}
