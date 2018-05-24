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

    @Test
    public void shouldReplaceWithMommyWhenInputStringHasMoreThanOneVowel() {
        assertEquals("HMommyrMommy",mommy.mommyify("Here"));
    }

    @Test
    public void shouldReplaceWithMommiesIfThereAreTwoContinousVowels() {
        assertEquals("HMommiesr", mommy.mommyify("Hear"));

    }

    @Test
    public void shouldReplaceWithMommiesIfThereAreMoreThanTwoContinousVowels() {
        assertEquals("HMommiesrMommymMommiesdfgMommies", mommy.mommyify("Heeeeearumioooodfgii"));

    }

}
