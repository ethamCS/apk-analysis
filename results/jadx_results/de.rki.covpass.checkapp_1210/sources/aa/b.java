package aa;

import bf.y;
import hc.t;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import kf.x0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Laa/b;", "Lkotlinx/serialization/KSerializer;", "j$/time/LocalDate", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ltb/e0;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b implements KSerializer<LocalDate> {

    /* renamed from: a */
    public static final b f223a = new b();

    /* renamed from: b */
    private static final DateTimeFormatter f224b = DateTimeFormatter.ISO_LOCAL_DATE;

    /* renamed from: c */
    public static final /* synthetic */ SerialDescriptor f225c = new x0("java.time.LocalDate", null, 0);

    private b() {
    }

    /* renamed from: a */
    public LocalDate deserialize(Decoder decoder) {
        String P0;
        t.e(decoder, "decoder");
        P0 = y.P0(decoder.D(), "T", null, 2, null);
        LocalDate parse = LocalDate.parse(P0, f224b);
        t.d(parse, "parse(dateString, formatter)");
        return parse;
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, LocalDate localDate) {
        t.e(encoder, "encoder");
        t.e(localDate, "value");
        String format = localDate.format(f224b);
        t.d(format, "value.format(formatter)");
        encoder.D(format);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.j, kotlinx.serialization.b
    public SerialDescriptor getDescriptor() {
        return f225c;
    }
}
