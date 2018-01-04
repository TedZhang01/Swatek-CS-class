package PP_5_7;


/**
 * Write a description of interface Lockable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Lockable
{
    public void setKey(int n);
    public void lock(int n);
    public void unlock(int n);
    public boolean locked();
}
