package search;

import java.util.Scanner;

public class Linear {
    
    public static void run( Scanner sc ) {

        System.out.println( "\n  [ Linear Search ]\n" );

        System.out.print( "  Enter number of elements: " );
        int n = sc.nextInt();

        int[] array = new int[ n ];

        System.out.println( "\n  Enter " + n + " integers..." );
        for( int i = 0; i < n; i++ ) {
            System.out.print( "  Element " + ( i + 1 ) + ": " );
            array[ i ] = sc.nextInt();
        }

        System.out.print( "\n  Enter the value to search: " );
        int target = sc.nextInt();

        // --- Linear Search algorithm ---
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }

        if( index != -1 ) {
            System.out.println( "\n  Found " + target + " at position " + ( index + 1 ) + "." );
        } else {
            System.out.println( "\n  Value not found in array." );
        }

        System.out.println( "\n  Returning to main menu...\n" );
    
    }

}
