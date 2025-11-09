package menu;

import java.util.Scanner;
import search.Linear;

public class Menu {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        int option;

        while( true ) {

            System.out.println( "\n");
            System.out.println( "  |---------------------------------------|" );
            System.out.println( "  |                                       |" );
            System.out.println( "  |  WELCOME TO <<< ALGORITHMS VAULT >>>  |" );
            System.out.println( "  |            by DracuDoyle              |" );
            System.out.println( "  |                                       |" );
            System.out.println( "  |---------------------------------------|\n" );

            System.out.println( "  Choose an algorithm...\n" );

            System.out.println( "  0) Exit" );
            System.out.println( "  1) Lineal Search" );
            System.out.println( "  2) Binary Search" );

            System.out.print( "\n  Option: " );
            option = sc.nextInt();

            switch( option ) {

                case 0 -> {
                    sc.close();
                    System.out.println( "\n  Killing program...\n" );
                    return;
                }
                
                case 1 -> { Linear.run(); }

                case 2 -> {}

                default -> { System.out.println( "  Invalid input..." ); }
        
            }

            System.out.println( "\n  Press Enter to return to menu..." );
            sc.nextLine();
            sc.nextLine();

        }

    }

}
