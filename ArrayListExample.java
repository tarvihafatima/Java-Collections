import java.util.*;

class ArrayListExample
{
    public static void main(String args[])
    {
        List<String> al=new ArrayList<String>(); //creating arraylist

        al.add("TreeSet"); //adding object in arraylist
        al.add("HashSet");
        al.add("SortedSet");
        al.add("NavigableSet");

        //traversing elements using Iterator
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}