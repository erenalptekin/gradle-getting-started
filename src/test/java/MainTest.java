import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class MainTest {
    @Test
    public void jenkinsAutoDeployPushes() {
        assertThat(1, equalTo(2));
    }
}
