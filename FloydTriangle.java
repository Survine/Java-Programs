public class FloydTriangle {
    public static void main(String[] args) {
        printFloydTriangle(5);
    }

    public static void printFloydTriangle(int size) {
        int num=1;
        for(int i=0; i<size; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
