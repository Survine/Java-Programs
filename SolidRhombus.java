public class SolidRhombus {
    public static void main(String[] args) {
        printSolidRhombus(5);
    }

    public static void printSolidRhombus(int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<size; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
