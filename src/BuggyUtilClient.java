import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BuggyUtilClient {
    public static void main(String[] args) {
        // First test case in Main
        //Testing commit
        System.out.println("Example 1: Make My Username");
        System.out.println("In: first = " + "\"Sean\"" +
                ", last = " + "\"Flannery\"");
        System.out.println("Out: " +
        StringUtils.makePurdueUsername("Sean", "Flannery"));
    }
}