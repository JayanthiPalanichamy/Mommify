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
        assertEquals("dfhg", mommy.mommify("dfhg"));
    }

    @Test
    public void shouldReplaceWithMommyWhenInputStringHasOneVowel() {
        assertEquals("HMommyr", mommy.mommify("Her"));
    }

    @Test
    public void shouldReplaceWithMommyWhenInputStringHasMoreThanOneVowel() {
        assertEquals("HMommyrMommy", mommy.mommify("Here"));
    }

    @Test
    public void shouldReplaceWithMommiesIfThereAreTwoContinuousVowels() {
        assertEquals("HMommiesr", mommy.mommify("Hear"));
    }

    @Test
    public void shouldReplaceWithMommiesIfThereAreMoreThanTwoContinuousVowels() {
        assertEquals("HMommiesrMommymMommiesdfgMommies", mommy.mommify("Heeeeearumioooodfgii"));
    }

    @Test
    public void returnTheInputStringIfVowelPercentIsLessThanThirty() {
        assertEquals("this", mommy.mommify("this"));
    }
}
