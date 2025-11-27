package sort;

import java.util.Scanner;

public class Insertion {

    public static void run( Scanner sc ) {

        System.out.println( "\n  [ Insertion Sort ]\n" );

        System.out.print( "  Enter number of elements: " );
        int n = sc.nextInt();

        int[] array = new int[ n ];

        System.out.println( "\n  Enter " + n + " integers..." );
        for( int i = 0; i < n; i++ ) {
            System.out.print( "  Element " + ( i + 1 ) + ": " );
            array[ i ] = sc.nextInt();
        }

        System.out.print( "\n  Array: " );
        for( int i = 0; i < n; i++ ) {
            System.out.print( array[ i ] + " " );
        }

        // --- Insertion Sort algorithm ---
        for( int i = 1; i < n; i++ ) {
            
            int key = array[ i ];
            int j = i - 1;

            while( j>= 0 && array[ j ] > key ) {
                array[ j + 1 ] = array[ j ];
                j--;
            }

            array[ j + 1 ] = key;
        
        }

        // Show result
        System.out.print( "\n  Sorted array: " );
        for( int i = 0; i < n; i++ ) {
            System.out.print( array[ i ] + " " );
        }

        System.out.println( "\n\n  Returning to main menu...\n" );

    }
    
}
