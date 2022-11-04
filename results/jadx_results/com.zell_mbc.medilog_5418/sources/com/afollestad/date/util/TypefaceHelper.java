package com.afollestad.date.util;

import android.graphics.Typeface;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: TypefaceHelper.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0007R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/afollestad/date/util/TypefaceHelper;", "", "()V", "cache", "Ljava/util/HashMap;", "", "Landroid/graphics/Typeface;", "Lkotlin/collections/HashMap;", "allocateAndCache", "familyName", "create", "com.afollestad.date-picker"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class TypefaceHelper {
    public static final TypefaceHelper INSTANCE = new TypefaceHelper();
    private static final HashMap<String, Typeface> cache = new HashMap<>();

    private TypefaceHelper() {
    }

    public final Typeface create(String familyName) {
        Intrinsics.checkParameterIsNotNull(familyName, "familyName");
        Typeface typeface = cache.get(familyName);
        return typeface != null ? typeface : allocateAndCache(familyName);
    }

    private final Typeface allocateAndCache(String str) {
        Typeface typeface;
        try {
            Typeface it = Typeface.create(str, 0);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            cache.put(str, it);
            Intrinsics.checkExpressionValueIsNotNull(it, "Typeface.create(familyNa… cache[familyName] = it }");
            return it;
        } catch (Exception unused) {
            String str2 = str;
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "medium", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "bold", false, 2, (Object) null)) {
                typeface = Typeface.DEFAULT_BOLD;
                Intrinsics.checkExpressionValueIsNotNull(typeface, "Typeface.DEFAULT_BOLD");
            } else {
                typeface = Typeface.DEFAULT;
                Intrinsics.checkExpressionValueIsNotNull(typeface, "Typeface.DEFAULT");
            }
            return typeface;
        }
    }
}
