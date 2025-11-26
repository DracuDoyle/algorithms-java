package search;

import java.util.Scanner;
import java.util.Arrays;

public class Binary {

    public static void run( Scanner sc ) {

        System.out.println( "\n  [ Binary Search ]\n" );

        System.out.print( "  Enter number of elements: " );
        int n = sc.nextInt();

        int[] array = new int[ n ];

        System.out.println( "\n  Enter " + n + " integers..." );
        for( int i = 0; i < n; i++ ) {
            System.out.print( "  Element " + (i + 1) + ": " );
            array[ i ] = sc.nextInt();
        }

        System.out.print( "\n  Enter the value to search: " );
        int target = sc.nextInt();

        // Sorting array first...
        Arrays.sort( array );

        // --- Binary Search algorithm ---
        int left = 0;
        int right = n - 1;
        int index = -1;

        while( left <= right ) {
            
            int mid = ( left + right ) / 2;

            if( array[ mid ] == target ) {
                index = mid;
                break;
            }

            if( target < array[ mid ] ) {
                right = mid - 1;
            } else if( target > array[ mid ] ) {
                left = mid + 1;
            }
        
        }

        if( index != -1 ) {
            System.out.println("\n  Found " + target + " at position " + ( index + 1 ) + "." );
        } else {
            System.out.println( "\n  Value not found in array." );
        }

        System.out.println( "\n  Returning to main menu...\n" );

    }
    
}
