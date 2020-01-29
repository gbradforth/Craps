
/**
 * Rolls a 6-sided die.
 *
 * @author Gwen Bradforth
 * @version 1/14/20
 */
public class Die
{
    
    /**
     * Constructor for objects of class Magic8Ball
     */
    public Die() 
    {

    }

    /**
     * Rolls two random responses from the die and adds their values.
     * 
     * @return the sum of the two rolls
     */
    public int doubleRoll()
    {
        return ((int)(Math.random()*6 + 1) + (int)(Math.random()*6 + 1));
    }
}
