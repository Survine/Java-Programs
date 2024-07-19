public class PatternRIghtPyramidUsing0and1 {
    public static void main(String[] args) {
        print0and1RightHalfNumberPyramid(5);
    }

    public static void print0and1RightHalfNumberPyramid(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<i+1; j++) {
                if ((i+j)%2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
