package org.thoughtcrime.securesms.groups;

import org.junit.Test;
import org.thoughtcrime.securesms.R;
import org.thoughtcrime.securesms.color.GroupColours;
import org.thoughtcrime.securesms.color.MaterialColor;

import static org.junit.Assert.assertEquals;

public class GroupColorTest {

    @Test
    public void canGetGroupColor() {
        assertEquals(R.color.conversation_crimson, GroupColours.getMainStr());
        assertEquals(R.color.conversation_crimson_tint, GroupColours.getTintStr());
        assertEquals(R.color.conversation_crimson_shade, GroupColours.getShadeStr());
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

    @Test
    public void canSetMaterialColor() {
        MaterialColor mc = MaterialColor.PLUM;
        mc.SetColors(R.color.amber, R.color.amber, R.color.amber, "test");

        assertEquals(R.color.amber, mc.getMainColor());
        assertEquals(R.color.amber, mc.getShadeColor());
        assertEquals(R.color.amber, mc.getShadeColor());
        assertEquals("test", mc.getSerialized());
    }
}
