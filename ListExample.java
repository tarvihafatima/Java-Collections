import java.util.*;

public class ListExample
{
    public static void main(String args[])
    {
        //declaring List
        List<String> al=new ArrayList<String>();

        //initializing List
        al.add("Khadija");
        al.add("Sabiqa");
        al.add("Arham");
        al.add("Hafsa");
        al.add(1,"Tarviha");

        //printing List
        System.out.println("An element at 2nd position: "+al.get(2));
        for(String s:al)
        {
            System.out.println(s);
        }
    }
}