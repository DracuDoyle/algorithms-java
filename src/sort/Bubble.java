package sort;

import java.util.Scanner;

public class Bubble {
    
    public static void run( Scanner sc ) {

        System.out.println( "\n  [ Bubble Sort ]\n" );

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

        // --- Bubble Sort algorithm ---
        for( int i = 0; i < n - 1; i++ ) {
            for( int j = i + 1; j < n; j++ ) {
                
                if( array[ i ] > array[ j ] ) {
                    int aux = array[ i ];
                    array[ i ] = array[ j ];
                    array[ j ] = aux;
                }
            
            }
        }

        // Show result
        System.out.print( "\n  Sorted array: " );
        for( int i = 0; i < n; i++ ) {
            System.out.print( array[ i ] + " " );
        }

        System.out.println( "\n\n  Returning to main menu...\n" );

    }

}
