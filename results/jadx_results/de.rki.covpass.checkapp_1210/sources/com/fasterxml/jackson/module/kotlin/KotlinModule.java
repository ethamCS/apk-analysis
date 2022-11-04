package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import hc.t;
import java.util.BitSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc.c;
import nc.g;
import nc.j;
import oc.d;
import org.conscrypt.BuildConfig;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0002%$BE\b\u0007\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0012\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b\u001f\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "Lcom/fasterxml/jackson/databind/module/SimpleModule;", "Lcom/fasterxml/jackson/databind/Module$SetupContext;", "context", "Ltb/e0;", "setupModule", BuildConfig.FLAVOR, "reflectionCacheSize", "I", "getReflectionCacheSize", "()I", BuildConfig.FLAVOR, "nullToEmptyCollection", "Z", "getNullToEmptyCollection", "()Z", "nullToEmptyMap", "getNullToEmptyMap", "nullIsSameAsDefault", "getNullIsSameAsDefault", "Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;", "singletonSupport", "Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;", "getSingletonSupport", "()Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;", "strictNullChecks", "getStrictNullChecks", BuildConfig.FLAVOR, "Loc/d;", "ignoredClassesForImplyingJsonCreator", "Ljava/util/Set;", "<init>", "(IZZZLcom/fasterxml/jackson/module/kotlin/SingletonSupport;Z)V", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;", "builder", "(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;)V", "Companion", "Builder", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class KotlinModule extends SimpleModule {
    public static final Companion Companion = new Companion(null);
    private final Set<d<?>> ignoredClassesForImplyingJsonCreator;
    private final boolean nullIsSameAsDefault;
    private final boolean nullToEmptyCollection;
    private final boolean nullToEmptyMap;
    private final int reflectionCacheSize;
    private final SingletonSupport singletonSupport;
    private final boolean strictNullChecks;

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;", BuildConfig.FLAVOR, "Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;", "feature", BuildConfig.FLAVOR, "isEnabled", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "build", BuildConfig.FLAVOR, "<set-?>", "reflectionCacheSize", "I", "getReflectionCacheSize", "()I", "Ljava/util/BitSet;", "bitSet", "Ljava/util/BitSet;", "<init>", "()V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class Builder {
        private int reflectionCacheSize = 512;
        private final BitSet bitSet = KotlinFeature.Companion.getDefaults$jackson_module_kotlin();

        public final KotlinModule build() {
            return new KotlinModule(this, null);
        }

        public final int getReflectionCacheSize() {
            return this.reflectionCacheSize;
        }

        public final boolean isEnabled(KotlinFeature kotlinFeature) {
            t.e(kotlinFeature, "feature");
            return this.bitSet.intersects(kotlinFeature.getBitSet$jackson_module_kotlin());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Companion;", BuildConfig.FLAVOR, "()V", "serialVersionUID", BuildConfig.FLAVOR, "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SingletonSupport.values().length];
            iArr[SingletonSupport.DISABLED.ordinal()] = 1;
            iArr[SingletonSupport.CANONICALIZE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KotlinModule() {
        this(0, false, false, false, null, false, 63, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinModule(int i10, boolean z10, boolean z11, boolean z12, SingletonSupport singletonSupport, boolean z13) {
        super(KotlinModule.class.getName(), PackageVersion.VERSION);
        Set<d<?>> b10;
        t.e(singletonSupport, "singletonSupport");
        this.reflectionCacheSize = i10;
        this.nullToEmptyCollection = z10;
        this.nullToEmptyMap = z11;
        this.nullIsSameAsDefault = z12;
        this.singletonSupport = singletonSupport;
        this.strictNullChecks = z13;
        b10 = y0.b();
        this.ignoredClassesForImplyingJsonCreator = b10;
    }

    public /* synthetic */ KotlinModule(int i10, boolean z10, boolean z11, boolean z12, SingletonSupport singletonSupport, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 512 : i10, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? SingletonSupport.DISABLED : singletonSupport, (i11 & 32) == 0 ? z13 : false);
    }

    private KotlinModule(Builder builder) {
        this(builder.getReflectionCacheSize(), builder.isEnabled(KotlinFeature.NullToEmptyCollection), builder.isEnabled(KotlinFeature.NullToEmptyMap), builder.isEnabled(KotlinFeature.NullIsSameAsDefault), builder.isEnabled(KotlinFeature.SingletonSupport) ? SingletonSupport.CANONICALIZE : SingletonSupport.DISABLED, builder.isEnabled(KotlinFeature.StrictNullChecks));
    }

    public /* synthetic */ KotlinModule(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.fasterxml.jackson.databind.module.SimpleModule, com.fasterxml.jackson.databind.Module
    public void setupModule(Module.SetupContext setupContext) {
        t.e(setupContext, "context");
        super.setupModule(setupContext);
        if (setupContext.isEnabled(MapperFeature.USE_ANNOTATIONS)) {
            ReflectionCache reflectionCache = new ReflectionCache(this.reflectionCacheSize);
            setupContext.addValueInstantiators(new KotlinInstantiators(reflectionCache, this.nullToEmptyCollection, this.nullToEmptyMap, this.nullIsSameAsDefault, this.strictNullChecks));
            if (WhenMappings.$EnumSwitchMapping$0[this.singletonSupport.ordinal()] == 2) {
                setupContext.addBeanDeserializerModifier(KotlinBeanDeserializerModifier.INSTANCE);
            }
            setupContext.insertAnnotationIntrospector(new KotlinAnnotationIntrospector(setupContext, reflectionCache, this.nullToEmptyCollection, this.nullToEmptyMap, this.nullIsSameAsDefault));
            setupContext.appendAnnotationIntrospector(new KotlinNamesAnnotationIntrospector(this, reflectionCache, this.ignoredClassesForImplyingJsonCreator));
            setupContext.addDeserializers(new KotlinDeserializers());
            setupContext.addSerializers(new KotlinSerializers());
            setupContext.addKeySerializers(new KotlinKeySerializers());
            setupContext.setMixInAnnotations(g.class, ClosedRangeMixin.class);
            setupContext.setMixInAnnotations(c.class, ClosedRangeMixin.class);
            setupContext.setMixInAnnotations(j.class, ClosedRangeMixin.class);
            setupContext.setMixInAnnotations(nc.d.class, ClosedRangeMixin.class);
            return;
        }
        throw new IllegalStateException("The Jackson Kotlin module requires USE_ANNOTATIONS to be true or it cannot function");
    }
}
