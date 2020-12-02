package org.thoughtcrime.securesms.groups;

import org.junit.Test;
import org.thoughtcrime.securesms.R;
import org.thoughtcrime.securesms.color.GroupColours;
import static org.junit.Assert.assertEquals;

public class GroupColorTest {

    @Test
    public void canGetGroupColor() {
        assertEquals(0X6b6b78, GroupColours.getMainStr());
        assertEquals(0Xbebec6, GroupColours.getTintStr());
        assertEquals(0X5a5a63, GroupColours.getShadeStr());
    }

    @Test
    public void canSetGroupColor() {
        GroupColours gc = new GroupColours();
        gc.setMainStr(R.color.amber);
        gc.setShadeStr(R.color.amber);
        gc.setTintStr(R.color.amber);
        assertEquals(R.color.amber, gc.getMainStr());
        assertEquals(R.color.amber, gc.getTintStr());
        assertEquals(R.color.amber, gc.getShadeStr());
    }
}
