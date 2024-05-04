
package matteo_nusca_st10440432_prog5121_poe;
//author: Matteo Nusca_ST10440432
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Login1Test {
    
    @Test
    public void testCorrectUsernameFormat() {
        String isValidUsername = "kyl_1";
        boolean expectedResult = true;
        boolean result = Login1.checkUserName(isValidUsername);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testIncorrectUsernameFormat() {
        String username = "kylel !!!! ll";
        boolean expectedResult = false;
        boolean result = Login1.checkUserName(username);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCorrectPasswordComplexity() {
        String password = "Ch&&sec@ke99!";
        boolean expectedResult = true;
        boolean result = Login1.checkPasswordComplexity(password);
        assertEquals(expectedResult, result);
    }   

    @Test
    public void testIncorrectPasswordComplexity() {
        String password = "password";
        boolean expectedResult = false;
        boolean result = Login1.checkPasswordComplexity(password);
        assertEquals(expectedResult, result);
    }
}
