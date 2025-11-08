import java.util.Scanner;

public class Menu {

    public static void main( String[] args ) throws InterruptedException {

        Scanner sc = new Scanner( System.in );

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
        int option = sc.nextInt();

        switch( option ) {

            case 0:
                sc.close();
                System.out.println( "\n  Killing program...\n" );
                for( int i=0; i<5; i++ ) {
                    Thread.sleep(1000);
                     System.out.print( "  * " );
                }
                break;

            case 1:
                // call function
                break;

            case 2:
                //call function
                break;

            default:
                System.out.println( "  Invalid input..." );
                break;
        
        }

    }

}
