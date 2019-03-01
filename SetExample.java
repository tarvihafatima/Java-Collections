import java.util.*;

public class SetExample
{
    public static void main(String[] args)
    {
        // Set demonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("I");
        hash_Set.add("don't");
        hash_Set.add("like");
        hash_Set.add("Fast");
        hash_Set.add("Fast");

        System.out.print("Set output without the duplicates");
        System.out.println(hash_Set);

        // Set deonstration using TreeSet
        Set<String> tree_Set = new TreeSet<String>(hash_Set);

        System.out.print("Sorted Set after passing into TreeSet");
        System.out.println(tree_Set);
    }
} 