import java.util.*;
public class ItineraryTickets {

    public static String ticketLocation(HashMap<String,String> ticket)
    {
        HashMap<String,String> revMap=new HashMap<>();
        for(String key:ticket.keySet())
        {
            revMap.put(ticket.get(key),key);
        }
        for(String key:ticket.keySet())
        {
            if(!revMap.containsKey(key))
            {
                return key;
            }

        }
        return null;

    }
    public static void main(String[]args)
    {
        HashMap<String,String> ticket=new HashMap<>();
        ticket.put("ch","b");
        ticket.put("m", "d");
        ticket.put("g", "ch");
        ticket.put("d", "g");

 String start=ticketLocation(ticket);
 System.out.print(start);

 for(String key:ticket.keySet())
 {
    System.out.print("->"+ticket.get(start));
    start=ticket.get(start);
 }

    }
}
