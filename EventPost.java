
/**
 * Write a description of class EventPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EventPost extends Post
{
    private String eventName;
    private String date;
    
    public EventPost(String Author, String eventName, String date)
    {
        super(Author);
        this.eventName = eventName;
        this.date = date;    
    }
}