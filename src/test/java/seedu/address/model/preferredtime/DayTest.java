package seedu.address.model.preferredtime;

import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;


public class DayTest {

    @Test
    public void isValidDay() {
        // TODO: implement test for Day format

        // null day
        assertThrows(NullPointerException.class, () -> Day.isValidDay(null));
    }
}
