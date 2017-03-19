import org.junit.Test
import org.junit.Rule

import org.jgotesting.rule.JGoTestRule
import static org.jgotesting.Assert.* // same methods as org.junit.Assert.*
import static org.jgotesting.Check.* // ditto, with different names
 
class MyTest {
 
    @Rule
    public JGoTestRule test = new JGoTestRule()
 
    @Test
    void checksSeveralThings() {
        // These are all checked, then they all report as failures
 
        // using assert methods
        assertEquals("this fails", "one", "ONE")
        assertEquals("this also fails", "two", "TWO")
 
        // same again using check aliases
        checkEquals("so does this", "one", "ONE")
        checkEquals("and this", "two", "TWO")
 
        // Test fails with four errors. Sweet!
    }
}
