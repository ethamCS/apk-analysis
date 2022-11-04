package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Class windowExtensionsProviderClass;
        Class windowExtensionsClass;
        boolean doesReturn;
        boolean isPublic;
        windowExtensionsProviderClass = SafeWindowLayoutComponentProvider.INSTANCE.windowExtensionsProviderClass(this.$classLoader);
        boolean z = false;
        Method getWindowExtensionsMethod = windowExtensionsProviderClass.getDeclaredMethod("getWindowExtensions", new Class[0]);
        windowExtensionsClass = SafeWindowLayoutComponentProvider.INSTANCE.windowExtensionsClass(this.$classLoader);
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
        Intrinsics.checkNotNullExpressionValue(windowExtensionsClass, "windowExtensionsClass");
        doesReturn = safeWindowLayoutComponentProvider.doesReturn(getWindowExtensionsMethod, windowExtensionsClass);
        if (doesReturn) {
            isPublic = SafeWindowLayoutComponentProvider.INSTANCE.isPublic(getWindowExtensionsMethod);
            if (isPublic) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
