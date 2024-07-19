public class RightHalfNumberPyramidPattern {
    public static void main(String[] args) {
        printRightHalfNumberPyramid(5);
    }

    public static void printRightHalfNumberPyramid(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
