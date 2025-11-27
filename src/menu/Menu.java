package menu;

import java.util.Scanner;

import search.Linear;
import search.Binary;

import sort.Bubble;
import sort.Insertion;

public class Menu {

    private static void clearConsole() {
        System.out.print( "\033[H\033[2J" );
        System.out.flush();
    }

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        int option;

        while( true ) {

            clearConsole();

            System.out.println( "\n");
            System.out.println( "  |---------------------------------------|" );
            System.out.println( "  |                                       |" );
            System.out.println( "  |  WELCOME TO <<< ALGORITHMS VAULT >>>  |" );
            System.out.println( "  |            by DracuDoyle              |" );
            System.out.println( "  |                                       |" );
            System.out.println( "  |---------------------------------------|\n" );

            System.out.println( "  Choose an algorithm...\n" );

            System.out.println( "  0) Exit" );
            System.out.println( "\n  --- Search Algorithms ---" );
            System.out.println( "  1) Lineal Search" );
            System.out.println( "  2) Binary Search" );
            System.out.println( "\n  --- Sort Algorithms ---" );
            System.out.println( "  3) Bubble Sort" );
            System.out.println( "  4) Insertion Sort" );

            System.out.print( "\n  Option: " );
            option = sc.nextInt();

            switch( option ) {

                case 0 -> {
                    sc.close();
                    System.out.println( "\n  Killing program...\n" );
                    return;
                }

                // -- Search Algorithms --
                
                case 1 -> { Linear.run( sc ); }

                case 2 -> { Binary.run( sc ); }

                // -- Sort Algorithms --

                case 3 -> { Bubble.run( sc ); }

                case 4 -> { Insertion.run( sc ); }

                default -> { System.out.println( "  Invalid input..." ); }
        
            }

            System.out.println( "\n  Press Enter to return to menu..." );
            sc.nextLine();
            sc.nextLine();

        }

    }

}
