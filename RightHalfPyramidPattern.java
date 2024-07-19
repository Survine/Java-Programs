public class RightHalfPyramidPattern {
    public static void main(String[] args) {
        printRightHalfPyramid(5);
    }

    public static void printRightHalfPyramid(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
