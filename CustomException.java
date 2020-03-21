/**
 * CustomException is used to handle custom exception
 * 
 * @author Dhruv
 * @version 23th October 2017
 */
public class CustomException extends Exception 
{
    /**
     * Constructor of the class
     * 
     * @param errorMessage message of error
     */
    CustomException(String errorMessage)
    {
        super(errorMessage);
    }
}
