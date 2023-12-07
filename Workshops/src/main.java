public class main {
    public static void main(String[] args) {
        printHallowPattern(5,5);
    }

    public static void printHallowPattern(int numberOfRows, int noOfCols)  {
        for(int i = 0; i < numberOfRows; i++) {
            for(int j = 0; j < noOfCols; j++) {
                if(i == 0 || j == 0 || i == numberOfRows - 1 || j == noOfCols - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
