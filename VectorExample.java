import java.util.*;

class VectorExample
{
    public static void main(String args[])
    {
        Vector<String> v=new Vector<String>();//creating vector

        v.add("Set");//method of Collection
        v.addElement("Hash");//method of Vector
        v.addElement("Tree");
        v.addElement("LinkedHash");

        //traversing elements using Enumeration
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}      