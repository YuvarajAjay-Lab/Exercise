public class Test5 {
    /*
     *    1
     *   111
     *  11111
     * 1111111*/
    //
//    1
//   111
//  11111
// 1111111
//111111111
    public static void main(String[] args) {
        gptAnswer();
    }

   static void gokulAnswer(){
        int maxOddNum = 9;
        int positionCounter = 5;
        for (int i = 1; i <= maxOddNum; i = i + 2) {
            int charPrinted = 0;
            for (int j = 1; j <= maxOddNum; j++) {
                if(positionCounter<=j) {
                    System.out.print(1);
                    charPrinted++;
                }
                else
                    System.out.print(" ");
                if(charPrinted==i)
                    break;
            }
            --positionCounter;
            System.out.println();
        }
    }

    static void gptAnswer(){
        int rows = 5; // There are 5 lines in your example

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print ones
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("1");
            }
            // Move to the next line
            System.out.println();
        }
    }

}
