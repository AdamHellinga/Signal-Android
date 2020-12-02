package org.thoughtcrime.securesms.color;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;

import org.signal.glide.Log;
import org.thoughtcrime.securesms.R;
import org.thoughtcrime.securesms.util.ThemeUtil;

import java.util.HashMap;
import java.util.Map;

import static org.thoughtcrime.securesms.util.ThemeUtil.isDarkTheme;

public class GroupColours {
    public static int mainStr = R.color.conversation_crimson;
    public static int tintStr = R.color.conversation_crimson_tint;
    public static int shadeStr = R.color.conversation_crimson_shade;

    public static int getMainStr() {
        return mainStr;
    }

    public static int getShadeStr() {
        return shadeStr;
    }

    public static int getTintStr() {
        return tintStr;
    }

    public static void setMainStr(int mainStr) {
        GroupColours.mainStr = mainStr;
    }

    public static void setShadeStr(int shadeStr) {
        GroupColours.shadeStr = shadeStr;
    }

    public static void setTintStr(int tintStr) {
        GroupColours.tintStr = tintStr;
    }
}
