import java.util.ArrayList;
import java.util.Iterator;
//After changes.
public class Arraylist_Test
{
    public static void main(String[] args)
    {
       // ArrayList java2_session=new ArrayList();
        ArrayList<Integer>java2_session =new ArrayList<Integer>();    //Generic
        java2_session.add(5);
        java2_session.add(3);
        java2_session.add(6);
        java2_session.add(0);

        /*Iterator iter=java2_session.iterator();

        while(iter.hasNext())
        {
            System.out.println(String.valueOf(iter.next()));
        }*/
        /*
        //Generic
        for (Integer x:java2_session)
        {
            System.out.println(x);
        }
        */
        java2_session.forEach
        (
          x->
          {
              System.out.println(x);
          }
        );
    }
}
