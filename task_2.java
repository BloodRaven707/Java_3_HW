import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class task_2 {
    public static void main( String[] args ) {
        System.out.println( "\nПрограмма удаляет не четные числа из списка\n" );

        List<Integer> list = new Random().ints( 20, -9, 10 ).boxed().collect( Collectors.toList() );
        System.out.println( "Исходный список:\t" + list );
        System.out.println( "Очищенный список:\t" + remove_even( list ) + "\n");
    }


    // Функция очистки списка чисел от четных чисел
    public static List<Integer> remove_even( List<Integer> list ) {
        Iterator<Integer> iteratorList = list.iterator();

        while ( iteratorList.hasNext() ) {
            int item = iteratorList.next();
            if ( item % 2 == 0 ) iteratorList.remove();
        }
        return list;
    }
}