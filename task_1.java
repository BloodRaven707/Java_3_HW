import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class task_1 {
    public static void main( String[] args ) {
        System.out.println( "\nПрограмма выполняет сортировку случайно сгенерированного списка\n" );

        // Можно использовать функцию для передачи параметров для генерации
        List<Integer> list = new Random().ints( 20, -99, 100 ).boxed().collect( Collectors.toList() );
        System.out.println( "Не сортированный список:\t" + list );

        list = merge_sort(list);
        System.out.println( "Отсортированный список:\t\t" + list + "\n" );
    }


    // Главный обработчик Merge Sort
    public static List<Integer> merge_sort( List<Integer> list ) {
        if ( list.size() < 2 ) {
            return list;
        }

        int middle = list.size() / 2;
        List<Integer> left = list.subList( 0, middle );
        List<Integer> right = list.subList( middle, list.size() );

        left = merge_sort( left );
        right = merge_sort( right );
        return sort_part( left, right );
    }


    // Функция перестановки и слияния частей
    public static List<Integer> sort_part( List<Integer> left, List<Integer> right ) {
        int li = 0,  ri = 0;
        List<Integer> merged = new ArrayList<>();

        while ( li < left.size() && ri < right.size() ) {
            if ( left.get( li ) <= right.get( ri ) ) {
                merged.add( left.get( li++ ) );
            } else {
                merged.add( right.get( ri++ ) );
            }
        }

        merged.addAll( left.subList( li, left.size( ) ) );
        merged.addAll( right.subList( ri, right.size( ) ) );
        return merged;
    }
}