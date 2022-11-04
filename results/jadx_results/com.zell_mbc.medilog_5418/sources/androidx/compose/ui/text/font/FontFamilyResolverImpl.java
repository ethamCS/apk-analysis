package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FontFamilyResolver.kt */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\"\u001a\u00020\u000fH\u0002R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "platformFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "(Landroidx/compose/ui/text/font/PlatformFontLoader;Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;)V", "createDefaultTypeface", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "", "getPlatformFontLoader$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformFontLoader;", "preload", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/runtime/State;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "typefaceRequest", "ui-text_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    private final Function1<TypefaceRequest, Object> createDefaultTypeface;
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final PlatformFontLoader platformFontLoader;
    private final PlatformResolveInterceptor platformResolveInterceptor;
    private final TypefaceRequestCache typefaceRequestCache;

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter) {
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(platformResolveInterceptor, "platformResolveInterceptor");
        Intrinsics.checkNotNullParameter(typefaceRequestCache, "typefaceRequestCache");
        Intrinsics.checkNotNullParameter(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        Intrinsics.checkNotNullParameter(platformFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFamilyTypefaceAdapter;
        this.createDefaultTypeface = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    public final PlatformFontLoader getPlatformFontLoader$ui_text_release() {
        return this.platformFontLoader;
    }

    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(platformFontLoader, (i & 2) != 0 ? PlatformResolveInterceptor.Companion.getDefault$ui_text_release() : platformResolveInterceptor, (i & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, null) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[LOOP:0: B:23:0x0071->B:24:0x0073, LOOP_END] */
    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object preload(androidx.compose.ui.text.font.FontFamily r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r2 instanceof androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            if (r3 == 0) goto L1a
            r3 = r2
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r3 = (androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r2 = r3.label
            int r2 = r2 - r5
            r3.label = r2
            goto L1f
        L1a:
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r3 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            r3.<init>(r0, r2)
        L1f:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.label
            r6 = 1
            if (r5 == 0) goto L40
            if (r5 != r6) goto L38
            java.lang.Object r1 = r3.L$1
            androidx.compose.ui.text.font.FontFamily r1 = (androidx.compose.ui.text.font.FontFamily) r1
            java.lang.Object r3 = r3.L$0
            androidx.compose.ui.text.font.FontFamilyResolverImpl r3 = (androidx.compose.ui.text.font.FontFamilyResolverImpl) r3
            kotlin.ResultKt.throwOnFailure(r2)
            goto L5c
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L40:
            kotlin.ResultKt.throwOnFailure(r2)
            boolean r2 = r1 instanceof androidx.compose.ui.text.font.FontListFontFamily
            if (r2 != 0) goto L4a
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L4a:
            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter r2 = r0.fontListFontFamilyTypefaceAdapter
            androidx.compose.ui.text.font.PlatformFontLoader r5 = r0.platformFontLoader
            r3.L$0 = r0
            r3.L$1 = r1
            r3.label = r6
            java.lang.Object r2 = r2.preload(r1, r5, r3)
            if (r2 != r4) goto L5b
            return r4
        L5b:
            r3 = r0
        L5c:
            r2 = r1
            androidx.compose.ui.text.font.FontListFontFamily r2 = (androidx.compose.ui.text.font.FontListFontFamily) r2
            java.util.List r2 = r2.getFonts()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r2.size()
            r4.<init>(r5)
            r5 = 0
            int r6 = r2.size()
        L71:
            if (r5 >= r6) goto Lb3
            java.lang.Object r7 = r2.get(r5)
            r8 = r4
            java.util.Collection r8 = (java.util.Collection) r8
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.ui.text.font.Font) r7
            androidx.compose.ui.text.font.TypefaceRequest r15 = new androidx.compose.ui.text.font.TypefaceRequest
            androidx.compose.ui.text.font.PlatformResolveInterceptor r9 = r3.platformResolveInterceptor
            androidx.compose.ui.text.font.FontFamily r10 = r9.interceptFontFamily(r1)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r9 = r3.platformResolveInterceptor
            androidx.compose.ui.text.font.FontWeight r11 = r7.getWeight()
            androidx.compose.ui.text.font.FontWeight r11 = r9.interceptFontWeight(r11)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r9 = r3.platformResolveInterceptor
            int r7 = r7.mo3710getStyle_LCdwA()
            int r12 = r9.mo3707interceptFontStyleT2F_aPo(r7)
            androidx.compose.ui.text.font.FontSynthesis$Companion r7 = androidx.compose.ui.text.font.FontSynthesis.Companion
            int r13 = r7.m3769getAllGVVA2EU()
            androidx.compose.ui.text.font.PlatformFontLoader r7 = r3.platformFontLoader
            java.lang.Object r14 = r7.getCacheKey()
            r7 = 0
            r9 = r15
            r0 = r15
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.add(r0)
            int r5 = r5 + 1
            r0 = r16
            goto L71
        Lb3:
            java.util.List r4 = (java.util.List) r4
            androidx.compose.ui.text.font.TypefaceRequestCache r0 = r3.typefaceRequestCache
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 r1 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            r1.<init>(r3)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0.preWarmCache(r4, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontFamilyResolverImpl.preload(androidx.compose.ui.text.font.FontFamily, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /* renamed from: resolve-DPcqOEQ */
    public State<Object> mo3730resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.mo3707interceptFontStyleT2F_aPo(i), this.platformResolveInterceptor.mo3708interceptFontSynthesisMscr08Y(i2), this.platformFontLoader.getCacheKey(), null));
    }

    public final State<Object> resolve(TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new FontFamilyResolverImpl$resolve$result$1(this, typefaceRequest));
    }
}