package m6;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private static final String f16359a = "g";

    /* renamed from: b */
    private static final Pattern f16360b = Pattern.compile(",");

    public static Map<h6.e, Object> a(Intent intent) {
        h6.e[] values;
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(h6.e.class);
        for (h6.e eVar : h6.e.values()) {
            if (eVar != h6.e.CHARACTER_SET && eVar != h6.e.NEED_RESULT_POINT_CALLBACK && eVar != h6.e.POSSIBLE_FORMATS) {
                String name = eVar.name();
                if (extras.containsKey(name)) {
                    if (eVar.b().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!eVar.b().isInstance(obj)) {
                            Log.w(f16359a, "Ignoring hint " + eVar + " because it is not assignable from " + obj);
                        }
                    }
                    enumMap.put((EnumMap) eVar, (h6.e) obj);
                }
            }
        }
        Log.i(f16359a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
