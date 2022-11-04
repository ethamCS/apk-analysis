package aa;

import bf.k;
import hc.t;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import kf.x0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Laa/c;", "Lkotlinx/serialization/KSerializer;", "j$/time/ZonedDateTime", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c implements KSerializer<ZonedDateTime> {

    /* renamed from: a */
    public static final c f226a = new c();

    /* renamed from: b */
    private static final DateTimeFormatter f227b = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[XXX][X]");

    /* renamed from: c */
    private static final DateTimeFormatter f228c = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[XXX]");

    /* renamed from: d */
    public static final /* synthetic */ SerialDescriptor f229d = new x0("java.time.ZonedDateTime", null, 0);

    private c() {
    }

    /* renamed from: a */
    public ZonedDateTime deserialize(Decoder decoder) {
        t.e(decoder, "decoder");
        ZonedDateTime parse = ZonedDateTime.parse(new k("\\.[0-9]*").j(decoder.D(), BuildConfig.FLAVOR), f227b);
        t.d(parse, "parse(correctedDateString, deserializeFormatter)");
        return parse;
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, ZonedDateTime zonedDateTime) {
        t.e(encoder, "encoder");
        t.e(zonedDateTime, "value");
        String format = zonedDateTime.format(f228c);
        t.d(format, "value.format(serializeFormatter)");
        encoder.D(format);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return f229d;
    }
}
