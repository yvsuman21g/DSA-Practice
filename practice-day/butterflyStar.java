    /* 
    
*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***
**        **
*          *
    
    */
    
    
    import java.util.Scanner;
    class butterflyStar {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of n: ");
            int n = sc.nextInt();
        
            //Upper part 
            // leftn side pattern -
            for(int i=1; i<=n; i++){
                // print star -
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }

                // print spaces -
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }

            // right side pattern -
                // space
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                // Stars -
                 for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            // below pattern (Reverse of Above) -
                
             for(int i=1; i<=n; i++){
                // print star -
                for(int j=n; j>=i; j--){
                    System.out.print("*");
                }

                // print spaces -
                for(int j=1; j<=i-1; j++){
                    System.out.print(" ");
                }

            // right side pattern -
                // space
                for(int j=1; j<=i-1; j++){
                    System.out.print(" ");
                }
                // Stars -
                 for(int j=n; j>=i; j--){
                    System.out.print("*");
                }
                System.out.println();
            }

            sc.close();
        }
    }