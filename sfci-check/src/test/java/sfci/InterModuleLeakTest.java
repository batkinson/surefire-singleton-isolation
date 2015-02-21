package sfci;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static sfci.Constants.LEAKED_VALUE;

public class InterModuleLeakTest {

    @Test
    public void verifyLeakAmongModules() {
        assertFalse("expected no leak across modules",
                CachedSet.getInstance().contains(LEAKED_VALUE));
    }
}
