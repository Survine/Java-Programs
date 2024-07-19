public class FullPyramidPattern {
    public static void main(String[] args) {
        printFullPyramid(5);
    }

    public static void printFullPyramid(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
