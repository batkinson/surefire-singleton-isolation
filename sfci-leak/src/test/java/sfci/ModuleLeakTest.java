package sfci;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static sfci.Constants.LEAKED_VALUE;

public class ModuleLeakTest {

    @Test
    public void verifyLeakAmongModuleTests() {
        assertTrue("expected value to be visible across tests in same module",
                CachedSet.getInstance().contains(LEAKED_VALUE));
    }

}
