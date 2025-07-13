/**
 * Demonstration class showing how to use live templates for Javadoc generation.
 * 
 * @author Demo User
 * @since 2024-12-19
 */
public class JavadocDemo {
    
    // DEMO 1: Try typing 'jdoc' above this method and press Tab
    // The template will expand and you can fill in the placeholders
    
    public String calculateTotal(double price, int quantity) throws IllegalArgumentException {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and quantity must be positive");
        }
        return String.valueOf(price * quantity);
    }
    
    
    // DEMO 2: Try typing 'jdoc' above this method and press Tab
/**
 * Method Description
 *
 * @return return description
 * @throws Exception when this exception occurs
 * @author nitik
 * @since 28-06-2025
 */    
    public void processData(String[] data) {
        for (String item : data) {
            System.out.println("Processing: " + item);
        }
    }
    
    // DEMO 3: Try typing 'jdoc' above this method and press Tab
    
    public boolean isValid(String input) {
        return input != null && !input.trim().isEmpty();
    }
    
    /*
     * INSTRUCTIONS FOR USING LIVE TEMPLATES:
     * 
     * 1. Position your cursor on the line ABOVE any method
     * 2. Type: jdoc
     * 3. Press: Tab
     * 4. The template will expand with placeholders
     * 5. Fill in each placeholder:
     *    - First: Method description
     *    - Press Tab to move to next placeholder
     *    - Continue until all placeholders are filled
     * 
     * PLACEHOLDERS YOU'LL SEE:
     * - $DESCRIPTION$ - Type what the method does
     * - $RETURN_DESC$ - Describe what it returns
     * - $EXCEPTION$ - Name of exception thrown
     * - $EXCEPTION_DESC$ - When the exception occurs
     * - $USER$ and $DATE$ - Auto-filled
     */
}