/*

Staircase detail

This is a staircase of size :

   #
  ##
 ###
####
Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

int n: an integer

Print

Print a staircase as described above.

Input Format

A single integer, , denoting the size of the staircase.

Constraints

0 < n <= 100

Output Format:

Print a staircase of size  using # symbols and spaces.

Note: The last line must have  spaces in it.

*/


public static void staircase(int n) {
   
        for(int j=0;j<n;j++){
        
            for(int i=1;i<=n;i++){
            
                System.out.print(i<n-j?" ":"#");
            }
            
            System.out.println("");
        }

    }

}
