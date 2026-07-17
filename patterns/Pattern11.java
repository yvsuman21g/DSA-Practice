
/*

1
01
101
0101
10101
010101
1010101
01010101

1
01
101
0101
10101
010101
1010101
01010101
101010101
0101010101

*/

public class Pattern11 {
    public static void main(String[] args) {
        int firstprint = 8;
        patternPrint(firstprint);

        int secondprint = 10;
        patternPrint(secondprint);
    }

    public static void patternPrint(int n) {

        // outer loop for the rows
        for (int i = 0; i < n; i++) {

            int start = 1;

            if( i % 2 == 0){
                start = 1;
            } else {
                start = 0;
            }
          

            // inner loop for the columns
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
        System.out.println();

    }
}