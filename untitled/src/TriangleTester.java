import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){
        List<Integer> list = Arrays.asList(a,b,c);
        list.sort(Comparator.naturalOrder());
        return list.get(0) + list.get(1) > list.get(2);
    }
}
