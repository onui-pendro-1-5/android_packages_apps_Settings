
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getOnUIPendroVersion(){
        return SystemProperties.get("org.OnUIPendroVersion.display","");
    }
}
