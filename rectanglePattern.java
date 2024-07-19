public class rectanglePattern {
    public static void main(String[] args) {

        printRectangle(6, 4);
    }

    public static void printRectangle(int length, int breadth) {
        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
