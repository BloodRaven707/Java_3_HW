import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class task_3 {
    public static void main( String[] args ) {
        System.out.printf( "\nПрограмма для рассчета минимального, максимального и среднее арифметического\n" );

        List<Integer> numbers = new Random().ints( 10, -99, 100 ).boxed().collect( Collectors.toList() );

        int min = get_min( numbers );
        int max = get_max( numbers );
        double avg = get_avg( numbers );

        System.out.printf( "\nПолученный список: %s\n", numbers.toString() );
        System.out.printf( "\nМаксимальное значение в списке:\t%d"+
                           "\nМинимальное значение списка:\t%d" +
                           "\nСреднее элементов списка:\t%.2f\n\n", min, max, avg );
    }


    // Поиск минимального
    public static int get_min( List<Integer> arr ) {
        int result = arr.get( 0 );

        for ( int i = 1; i < arr.size() ; i++ ) {
            if ( result > arr.get( i ) ) {
                result = arr.get( i );
            }
        }
        return result;
    }


    // Поиск максимального
    public static int get_max( List<Integer> arr ) {
        int result = arr.get( 0 );

        for ( int i = 1; i < arr.size() ; i++ ) {
            if ( result < arr.get( i ) ) {
                result = arr.get( i );
            }
        }
        return result;
    }


    // Поиск суммы
    public static int get_sum( List<Integer> arr ) {
        int result = 0;

        for ( int i = 0; i < arr.size() ; i++ ) {
            result += arr.get( i );
        }
        return result;
    }


    // Поиск среднего
    private static Double get_avg ( List<Integer> arr ) {
        int sum = get_sum( arr );
        return ( double )sum / arr.size();
    }
}
