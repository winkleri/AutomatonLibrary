import Component.State;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/*
 * Author: Ilja Winkler
 * E-Mail: iljawinkler@googlemail.com
 * GitHub: winkleri
 *
 * Class description: Unit tests to facilitate test driven development of Transition class
 *
 */

public class TransitionTest {
    private State source;
    private State target;

    @BeforeEach
    void setup() {
        source = new State("s0");
        target = new State("s1");
    }

    @AfterEach
    void teardown() {}

    @Test
    void deleteTransitionSuccess() {
        assertNotNull(source);
        assertNotNull(target);
        assertNotEquals(source, target);
    }

    @Test
    void settingSourceSuccess() {}

    @Test
    void settingSourceFailure() {}

    @Test
    void settingTargetSuccess() {}

    @Test
    void settingTargetFailure() {}

    @Test
    void isLoopWorks() {}
}
