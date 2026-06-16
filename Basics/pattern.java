package Basics;
import java.util.Scanner;

public class pattern{
    public static void main(String args[]){



        // square pattern
        // for (int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }





        // // outer boundry 
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || i==4 || j==1 || j==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }





        // // half piramid
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }







        // // inverted piramis
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }






        // //  inverted half piramid
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }





        // int n=5;
        // int m=5;


        // half piramid with number
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }




        // inverted half piramid with number
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // OR

        // for(int i=1;i<=n;i++ ){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }




        // // floyds triangle
        // int num=1;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }





        // // 0-1 triangle
        // int num=0;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j) % 2 == 0){
        //             num=1;
        //         }
        //         else{
        //             num=0;
        //         }
        //         System.out.print(num  +" ");
        //     }
        //     System.out.println();
        // }





        // // Butterfly patternn
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     int space=2*(4-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     int space=2*(4-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }





        // // Solid Rhoumbus
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for (int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }










        // //  piramid

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for (int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // } 








        // // pelindrome
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }


        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }


        //     // for(int j=)
        //     System.out.println();
        // }







        // dimond problem
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }










    }
}
