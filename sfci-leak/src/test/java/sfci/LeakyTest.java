package sfci;

import org.junit.FixMethodOrder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.runners.MethodSorters.NAME_ASCENDING;
import static sfci.Constants.LEAKED_VALUE;

@FixMethodOrder(NAME_ASCENDING)
public class LeakyTest {

    String value = "requires cleanup";

    @Test
    public void _1_verifySetWorks() {
        CachedSet.getInstance().add(LEAKED_VALUE);
        assertTrue("expected that set add/contains works",
                CachedSet.getInstance().contains(LEAKED_VALUE));
    }

    @Test
    public void _2_verifyLeakAmongTests() {
        assertTrue("expected value to be visible across tests methods",
                CachedSet.getInstance().contains(LEAKED_VALUE));
    }

}
