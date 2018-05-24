import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MommyTest {
    Mommy mommy;

    @Before

    public void setUp() {
        mommy = new Mommy();
    }

    @Test
    public void shouldReturnStringWhenStringHasNoVowels() {
        assertEquals("dfhg",mommy.mommyify("dfhg"));
    }

    @Test
    public void shouldReplaceWithMommyWhenInputStringHasOneVowel() {
        assertEquals("HMommyr",mommy.mommyify("Her"));
    }
}
