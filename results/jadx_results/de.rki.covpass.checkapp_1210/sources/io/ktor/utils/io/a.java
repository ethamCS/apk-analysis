package io.ktor.utils.io;

import hc.v;
import io.ktor.utils.io.internal.g;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.a2;
import ob.f0;
import ob.g0;
import ob.k0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000 Û\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0004:\u0001xB/\u0012\u0007\u0010\u0091\u0001\u001a\u00020\u0017\u0012\u0010\b\u0002\u0010Ö\u0001\u001a\t\u0012\u0004\u0012\u00020k0Õ\u0001\u0012\t\b\u0002\u0010\u0094\u0001\u001a\u00020\u0005¢\u0006\u0006\b×\u0001\u0010Ø\u0001B\u0014\b\u0016\u0012\u0007\u0010Ù\u0001\u001a\u00020\n¢\u0006\u0006\b×\u0001\u0010Ú\u0001J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u0007*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010$\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%J'\u0010)\u001a\u00020\u00052\u0006\u0010!\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010*J+\u0010+\u001a\u00020\u00052\u0006\u0010!\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u00020\u00052\u0006\u0010!\u001a\u00020-H\u0082@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J#\u00103\u001a\u00020\u0007*\u00020\n2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0005H\u0002¢\u0006\u0004\b3\u00104J#\u00105\u001a\u00020\u0007*\u00020\n2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0005H\u0002¢\u0006\u0004\b5\u00104J!\u00108\u001a\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0015H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u00020\u00072\u0006\u0010:\u001a\u00020-H\u0082@ø\u0001\u0000¢\u0006\u0004\b=\u0010/J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00052\u0006\u0010:\u001a\u00020 H\u0002¢\u0006\u0004\bB\u0010CJ'\u0010D\u001a\u00020\u00052\u0006\u0010:\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0004\bD\u0010*J+\u0010E\u001a\u00020\u00072\u0006\u0010:\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\bE\u0010,J+\u0010F\u001a\u00020\u00052\u0006\u0010:\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\bF\u0010,J/\u0010J\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00052\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070HH\u0082@ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u001f\u0010P\u001a\u00020O2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u0005H\u0002¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020O2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0007H\u0002¢\u0006\u0004\bT\u0010\u0014J\u000f\u0010U\u001a\u00020\u0007H\u0002¢\u0006\u0004\bU\u0010\u0014J\u0019\u0010X\u001a\u00020\u00072\b\u0010W\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bX\u0010YJ\u001b\u0010[\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\u001b\u0010]\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b]\u0010\\J%\u0010`\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00052\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00170^H\u0002¢\u0006\u0004\b`\u0010\\J\u001b\u0010a\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\ba\u0010\\J\u000f\u0010b\u001a\u00020\u0017H\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020\u0005H\u0002¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\bf\u0010\\J%\u0010i\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u00052\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00070gH\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010l\u001a\u00020kH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00072\u0006\u0010n\u001a\u00020kH\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\u00020qH\u0000¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020\u00072\u0006\u0010u\u001a\u00020tH\u0016¢\u0006\u0004\bv\u0010wJ\u0019\u0010x\u001a\u00020\u00172\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bx\u0010yJ\u0019\u0010z\u001a\u00020\u00172\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bz\u0010yJ\u000f\u0010{\u001a\u00020\u0007H\u0016¢\u0006\u0004\b{\u0010\u0014J\u0011\u0010|\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b|\u0010\u0012J\u000f\u0010}\u001a\u00020\u0007H\u0000¢\u0006\u0004\b}\u0010\u0014J\u000f\u0010~\u001a\u00020\u0017H\u0000¢\u0006\u0004\b~\u0010cJ+\u0010\u007f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010,J\u001d\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u0010!\u001a\u00020-H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0080\u0001\u0010/J\u0012\u0010\u0081\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010h\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\bh\u0010<J\u001d\u0010\u0083\u0001\u001a\u00020\u00072\u0006\u0010:\u001a\u00020-H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010/J0\u0010\u0084\u0001\u001a\u00020L2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0080@ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J-\u0010\u0086\u0001\u001a\u00020\u00072\u0006\u0010:\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0086\u0001\u0010,J-\u0010\u0087\u0001\u001a\u00020\u00052\u0006\u0010:\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0087\u0001\u0010,J.\u0010\u0088\u0001\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070HH\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J1\u0010\u008a\u0001\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00052\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070HH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u008a\u0001\u0010KJ%\u0010\u008b\u0001\u001a\u00020O2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u008b\u0001\u0010SJ\u001d\u0010\u008c\u0001\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u008c\u0001\u0010\\J\u0013\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\r\n\u0004\bx\u0010l\u001a\u0005\b\u0090\u0001\u0010cR\u001d\u0010\u0094\u0001\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u000e\n\u0004\bh\u00105\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u00107\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010\u0095\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u00105R\u0018\u0010\u0097\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u00105R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R1\u0010\u009b\u0001\u001a\u00020L2\u0007\u0010\u009a\u0001\u001a\u00020L8\u0016@PX\u0096\u000e¢\u0006\u0017\n\u0005\b\u009b\u0001\u00103\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R1\u0010 \u0001\u001a\u00020L2\u0007\u0010\u009a\u0001\u001a\u00020L8\u0016@PX\u0096\u000e¢\u0006\u0017\n\u0005\b \u0001\u00103\u001a\u0006\b¡\u0001\u0010\u009d\u0001\"\u0006\b¢\u0001\u0010\u009f\u0001R\u001f\u0010¦\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010¤\u0001\u0012\u0005\b¥\u0001\u0010\u0014R\u0017\u0010©\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010¨\u0001R\u001e\u0010\u00ad\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001e\u0010¯\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¬\u0001R\u0018\u0010°\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u00105R\u0016\u0010²\u0001\u001a\u00020q8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u0010sR0\u0010¹\u0001\u001a\u0005\u0018\u00010³\u00012\n\u0010´\u0001\u001a\u0005\u0018\u00010³\u00018B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R:\u0010¾\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010^2\u000f\u0010´\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010^8B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R:\u0010Á\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010^2\u000f\u0010´\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010^8B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\b¿\u0001\u0010»\u0001\"\u0006\bÀ\u0001\u0010½\u0001R0\u0010Â\u0001\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u001f\n\u0006\bÂ\u0001\u0010Ã\u0001\u0012\u0005\bÈ\u0001\u0010\u0014\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R9\u0010Ê\u0001\u001a\u00020\u000b2\u0007\u0010É\u0001\u001a\u00020\u000b8\u0016@VX\u0097\u000e¢\u0006\u001f\n\u0006\bÊ\u0001\u0010Ã\u0001\u0012\u0005\bÍ\u0001\u0010\u0014\u001a\u0006\bË\u0001\u0010Å\u0001\"\u0006\bÌ\u0001\u0010Ç\u0001R\u0017\u0010Î\u0001\u001a\u00020\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010\u0093\u0001R\u0016\u0010Ð\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010cR\u0016\u0010Ò\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010cR\u0019\u0010Ô\u0001\u001a\u0004\u0018\u00010V8VX\u0096\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010Ó\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ü\u0001"}, d2 = {"Lio/ktor/utils/io/a;", "Lio/ktor/utils/io/c;", "Lio/ktor/utils/io/h;", "Lio/ktor/utils/io/k;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "minWriteSize", "Ltb/e0;", "O", "(I)V", "Ljava/nio/ByteBuffer;", "Lob/p;", "order", "position", "available", "a0", "(Ljava/nio/ByteBuffer;Lob/p;II)V", "y0", "()Ljava/nio/ByteBuffer;", "r0", "()V", "Lio/ktor/utils/io/internal/d;", "joined", BuildConfig.FLAVOR, "C0", "(Lio/ktor/utils/io/internal/d;)Z", "forceTermination", "D0", "(Z)Z", "idx", "K", "(Ljava/nio/ByteBuffer;I)I", "Lob/e;", "dst", "consumed", "max", "b0", "(Lob/e;II)I", BuildConfig.FLAVOR, "offset", "length", "c0", "([BII)I", "h0", "([BIILxb/d;)Ljava/lang/Object;", "Lob/f0;", "g0", "(Lob/f0;Lxb/d;)Ljava/lang/Object;", "Lio/ktor/utils/io/internal/i;", "capacity", "count", "J", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/i;I)V", "I", "current", "joining", "q0", "(Lio/ktor/utils/io/a;Lio/ktor/utils/io/internal/d;)Lio/ktor/utils/io/a;", "src", "Q0", "(Ljava/nio/ByteBuffer;Lxb/d;)Ljava/lang/Object;", "R0", "N", "(Lio/ktor/utils/io/internal/d;)V", "H0", "(Ljava/nio/ByteBuffer;)I", "I0", "(Lob/e;)I", "J0", "S0", "U0", "min", "Lkotlin/Function1;", "block", "H", "(ILgc/l;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "limit", "headerSizeHint", "Lob/u;", "o0", "(JI)Lob/u;", "j0", "(JILxb/d;)Ljava/lang/Object;", "u0", "v0", BuildConfig.FLAVOR, "cause", "t0", "(Ljava/lang/Throwable;)V", "size", "k0", "(ILxb/d;)Ljava/lang/Object;", "m0", "Lxb/d;", "continuation", "B0", "l0", "A0", "()Z", "W0", "(I)Z", "T0", "Lkotlinx/coroutines/p;", "c", "V0", "(ILkotlinx/coroutines/p;)V", "Lio/ktor/utils/io/internal/g$c;", "Z", "()Lio/ktor/utils/io/internal/g$c;", "buffer", "n0", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g;", "M", "()Lio/ktor/utils/io/internal/g;", "Lkotlinx/coroutines/a2;", "job", "d", "(Lkotlinx/coroutines/a2;)V", "a", "(Ljava/lang/Throwable;)Z", "g", "flush", "z0", "s0", "E0", "i", "h", "p0", "()Lio/ktor/utils/io/a;", "b", "L", "(Lio/ktor/utils/io/a;JLio/ktor/utils/io/internal/d;Lxb/d;)Ljava/lang/Object;", "e", "L0", "K0", "(ILgc/l;)I", "f", "l", "F0", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "n", "autoFlush", "S", "()I", "reservedSize", "Lio/ktor/utils/io/internal/d;", "readPosition", "writePosition", "attachedJob", "Lkotlinx/coroutines/a2;", "<set-?>", "totalBytesRead", "U", "()J", "w0", "(J)V", "totalBytesWritten", "V", "x0", "Lio/ktor/utils/io/internal/f;", "Lio/ktor/utils/io/internal/f;", "getReadSession$annotations", "readSession", "Lio/ktor/utils/io/internal/l;", "Lio/ktor/utils/io/internal/l;", "writeSession", "Lio/ktor/utils/io/internal/b;", "j", "Lio/ktor/utils/io/internal/b;", "readSuspendContinuationCache", "k", "writeSuspendContinuationCache", "writeSuspensionSize", "T", "state", "Lio/ktor/utils/io/internal/c;", "value", "P", "()Lio/ktor/utils/io/internal/c;", "setClosed", "(Lio/ktor/utils/io/internal/c;)V", "closed", "R", "()Lxb/d;", "setReadOp", "(Lxb/d;)V", "readOp", "X", "setWriteOp", "writeOp", "readByteOrder", "Lob/p;", "Q", "()Lob/p;", "setReadByteOrder", "(Lob/p;)V", "getReadByteOrder$annotations", "newOrder", "writeByteOrder", "W", "setWriteByteOrder", "getWriteByteOrder$annotations", "availableForRead", "m", "isClosedForRead", "Y", "isClosedForWrite", "()Ljava/lang/Throwable;", "closedCause", "Lrb/f;", "pool", "<init>", "(ZLrb/f;I)V", "content", "(Ljava/nio/ByteBuffer;)V", "Companion", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class a implements io.ktor.utils.io.c, io.ktor.utils.io.h, io.ktor.utils.io.k {
    public static final C0192a Companion = new C0192a(null);

    /* renamed from: m */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12784m = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_state");

    /* renamed from: n */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12785n = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_closed");

    /* renamed from: o */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12786o = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_readOp");

    /* renamed from: p */
    static final /* synthetic */ AtomicReferenceFieldUpdater f12787p = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_writeOp");
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;

    /* renamed from: a */
    private final boolean f12788a;
    private volatile a2 attachedJob;

    /* renamed from: b */
    private final rb.f<g.c> f12789b;

    /* renamed from: c */
    private final int f12790c;

    /* renamed from: d */
    private int f12791d;

    /* renamed from: e */
    private int f12792e;

    /* renamed from: f */
    private ob.p f12793f;

    /* renamed from: g */
    private ob.p f12794g;

    /* renamed from: h */
    private final io.ktor.utils.io.internal.f f12795h;

    /* renamed from: i */
    private final io.ktor.utils.io.internal.l f12796i;

    /* renamed from: j */
    private final io.ktor.utils.io.internal.b<Boolean> f12797j;
    private volatile io.ktor.utils.io.internal.d joining;

    /* renamed from: k */
    private final io.ktor.utils.io.internal.b<e0> f12798k;

    /* renamed from: l */
    private final gc.l<xb.d<? super e0>, Object> f12799l;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "ReservedLongIndex", "I", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* renamed from: io.ktor.utils.io.a$a */
    /* loaded from: classes.dex */
    public static final class C0192a {
        private C0192a() {
        }

        public /* synthetic */ C0192a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "cause", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    static final class b extends v implements gc.l<Throwable, e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(1);
            a.this = r1;
        }

        public final void b(Throwable th2) {
            a.this.attachedJob = null;
            if (th2 == null) {
                return;
            }
            a.this.g(r.a(th2));
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1532, 1533}, m = "awaitFreeSpaceOrDelegate")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends zb.d {
        int U3;
        /* synthetic */ Object V3;
        int X3;

        /* renamed from: x */
        Object f12801x;

        /* renamed from: y */
        Object f12802y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.X3 |= Integer.MIN_VALUE;
            return a.this.H(0, null, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1216, 1287, 1295}, m = "copyDirect$ktor_io")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends zb.d {
        Object U3;
        Object V3;
        Object W3;
        Object X3;
        Object Y3;
        Object Z3;

        /* renamed from: a4 */
        Object f12803a4;

        /* renamed from: b4 */
        Object f12804b4;

        /* renamed from: c4 */
        Object f12805c4;

        /* renamed from: d4 */
        long f12806d4;

        /* renamed from: e4 */
        long f12807e4;

        /* renamed from: f4 */
        boolean f12808f4;

        /* renamed from: g4 */
        /* synthetic */ Object f12809g4;

        /* renamed from: i4 */
        int f12811i4;

        /* renamed from: x */
        Object f12812x;

        /* renamed from: y */
        Object f12813y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(xb.d<? super d> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f12809g4 = obj;
            this.f12811i4 |= Integer.MIN_VALUE;
            return a.this.L(null, 0L, null, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {731, 735}, m = "readAvailableSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class e extends zb.d {
        int U3;
        int V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f12814x;

        /* renamed from: y */
        Object f12815y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(xb.d<? super e> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return a.this.h0(null, 0, 0, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {747, 751}, m = "readAvailableSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class f extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12816x;

        /* renamed from: y */
        Object f12817y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(xb.d<? super f> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return a.this.g0(null, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2156}, m = "readRemainingSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class g extends zb.d {
        Object U3;
        Object V3;
        Object W3;
        /* synthetic */ Object X3;
        int Z3;

        /* renamed from: x */
        Object f12818x;

        /* renamed from: y */
        Object f12819y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(xb.d<? super g> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.X3 = obj;
            this.Z3 |= Integer.MIN_VALUE;
            return a.this.j0(0L, 0, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2248}, m = "readSuspendLoop")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class h extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12820x;

        /* renamed from: y */
        int f12821y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(xb.d<? super h> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return a.this.m0(0, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1527}, m = "write$suspendImpl")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class i extends zb.d {
        int U3;
        /* synthetic */ Object V3;
        int X3;

        /* renamed from: x */
        Object f12822x;

        /* renamed from: y */
        Object f12823y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(xb.d<? super i> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.X3 |= Integer.MIN_VALUE;
            return a.G0(a.this, 0, null, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1124, 1126}, m = "writeFullySuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class j extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12824x;

        /* renamed from: y */
        Object f12825y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(xb.d<? super j> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return a.this.Q0(null, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1134, 1136}, m = "writeFullySuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class k extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12826x;

        /* renamed from: y */
        Object f12827y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(xb.d<? super k> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return a.this.R0(null, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1441}, m = "writeFullySuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class l extends zb.d {
        int U3;
        int V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f12828x;

        /* renamed from: y */
        Object f12829y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(xb.d<? super l> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return a.this.S0(null, 0, 0, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1458, 1460}, m = "writeSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class m extends zb.d {
        int U3;
        int V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f12830x;

        /* renamed from: y */
        Object f12831y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(xb.d<? super m> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return a.this.U0(null, 0, 0, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2462}, m = "writeSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class n extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12832x;

        /* renamed from: y */
        int f12833y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(xb.d<? super n> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return a.this.T0(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxb/d;", "Ltb/e0;", "ucont", BuildConfig.FLAVOR, "b", "(Lxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o extends v implements gc.l<xb.d<? super e0>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o() {
            super(1);
            a.this = r1;
        }

        /* renamed from: b */
        public final Object invoke(xb.d<? super e0> dVar) {
            Object c10;
            xb.d b10;
            boolean z10;
            Throwable c11;
            hc.t.e(dVar, "ucont");
            int i10 = a.this.writeSuspensionSize;
            while (true) {
                io.ktor.utils.io.internal.c P = a.this.P();
                if (P != null && (c11 = P.c()) != null) {
                    io.ktor.utils.io.b.b(c11);
                    throw new tb.i();
                } else if (a.this.W0(i10)) {
                    a aVar = a.this;
                    b10 = yb.c.b(dVar);
                    a aVar2 = a.this;
                    while (true) {
                        z10 = true;
                        if (!(aVar.X() == null)) {
                            throw new IllegalStateException("Operation is already in progress".toString());
                        }
                        if (!aVar2.W0(i10)) {
                            break;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f12787p;
                        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, aVar, null, b10)) {
                            if (aVar2.W0(i10)) {
                                continue;
                            } else if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, aVar, b10, null)) {
                                continue;
                            }
                        }
                    }
                    z10 = false;
                    continue;
                    if (z10) {
                        break;
                    }
                } else {
                    s.a aVar3 = tb.s.Companion;
                    dVar.y(tb.s.c(e0.f22152a));
                    break;
                }
            }
            a.this.O(i10);
            if (a.this.A0()) {
                a.this.u0();
            }
            c10 = yb.d.c();
            return c10;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ByteBuffer byteBuffer) {
        this(false, io.ktor.utils.io.internal.e.b(), 0);
        hc.t.e(byteBuffer, "content");
        ByteBuffer slice = byteBuffer.slice();
        hc.t.d(slice, "content.slice()");
        g.c cVar = new g.c(slice, 0);
        cVar.f12890b.i();
        this._state = cVar.d();
        s0();
        io.ktor.utils.io.l.a(this);
        E0();
    }

    public a(boolean z10, rb.f<g.c> fVar, int i10) {
        hc.t.e(fVar, "pool");
        this.f12788a = z10;
        this.f12789b = fVar;
        this.f12790c = i10;
        this._state = g.a.f12891c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        ob.p pVar = ob.p.BIG_ENDIAN;
        this.f12793f = pVar;
        this.f12794g = pVar;
        this.f12795h = new io.ktor.utils.io.internal.f(this);
        this.f12796i = new io.ktor.utils.io.internal.l(this);
        this.f12797j = new io.ktor.utils.io.internal.b<>();
        this.f12798k = new io.ktor.utils.io.internal.b<>();
        this.f12799l = new o();
    }

    public /* synthetic */ a(boolean z10, rb.f fVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i11 & 2) != 0 ? io.ktor.utils.io.internal.e.c() : fVar, (i11 & 4) != 0 ? 8 : i10);
    }

    public final boolean A0() {
        return this.joining != null && (T() == g.a.f12891c || (T() instanceof g.b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ac, code lost:
        r7 = yb.d.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b0, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00aa, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006d A[EDGE_INSN: B:90:0x006d->B:41:0x006d ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object B0(int r7, xb.d<? super java.lang.Boolean> r8) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.B0(int, xb.d):java.lang.Object");
    }

    private final boolean C0(io.ktor.utils.io.internal.d dVar) {
        if (!D0(true)) {
            return false;
        }
        N(dVar);
        xb.d dVar2 = (xb.d) f12786o.getAndSet(this, null);
        if (dVar2 != null) {
            s.a aVar = tb.s.Companion;
            dVar2.y(tb.s.c(tb.t.a(new IllegalStateException("Joining is in progress"))));
        }
        v0();
        return true;
    }

    private final boolean D0(boolean z10) {
        Object obj;
        g.f fVar;
        g.c cVar = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.g gVar = (io.ktor.utils.io.internal.g) obj;
            if (cVar != null) {
                cVar.f12890b.j();
                v0();
                cVar = null;
            }
            io.ktor.utils.io.internal.c P = P();
            fVar = g.f.f12901c;
            if (gVar == fVar) {
                return true;
            }
            if (gVar != g.a.f12891c) {
                if (P == null || !(gVar instanceof g.b) || (!gVar.f12890b.k() && P.b() == null)) {
                    if (!z10 || !(gVar instanceof g.b) || !gVar.f12890b.k()) {
                        return false;
                    }
                } else if (P.b() != null) {
                    gVar.f12890b.f();
                }
                cVar = ((g.b) gVar).g();
            }
        } while (!androidx.concurrent.futures.b.a(f12784m, this, obj, fVar));
        if (cVar != null && T() == fVar) {
            n0(cVar);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object G0(io.ktor.utils.io.a r5, int r6, gc.l r7, xb.d r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.a.i
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.a$i r0 = (io.ktor.utils.io.a.i) r0
            int r1 = r0.X3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X3 = r1
            goto L18
        L13:
            io.ktor.utils.io.a$i r0 = new io.ktor.utils.io.a$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.V3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.X3
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r5 = r0.U3
            java.lang.Object r6 = r0.f12823y
            gc.l r6 = (gc.l) r6
            java.lang.Object r7 = r0.f12822x
            io.ktor.utils.io.a r7 = (io.ktor.utils.io.a) r7
            tb.t.b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L51
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            tb.t.b(r8)
            r8 = 0
            if (r6 <= 0) goto L47
            r2 = r3
            goto L48
        L47:
            r2 = r8
        L48:
            if (r2 == 0) goto L89
            r2 = 4088(0xff8, float:5.729E-42)
            if (r6 > r2) goto L4f
            r8 = r3
        L4f:
            if (r8 == 0) goto L69
        L51:
            int r8 = r5.K0(r6, r7)
            if (r8 < 0) goto L5a
            tb.e0 r5 = tb.e0.f22152a
            return r5
        L5a:
            r0.f12822x = r5
            r0.f12823y = r7
            r0.U3 = r6
            r0.X3 = r3
            java.lang.Object r8 = r5.H(r6, r7, r0)
            if (r8 != r1) goto L51
            return r1
        L69:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Min("
            r5.append(r7)
            r5.append(r6)
            java.lang.String r6 = ") should'nt be greater than (4088)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L89:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "min should be positive"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.G0(io.ktor.utils.io.a, int, gc.l, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(int r6, gc.l<? super java.nio.ByteBuffer, tb.e0> r7, xb.d<? super tb.e0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.a.c
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.a$c r0 = (io.ktor.utils.io.a.c) r0
            int r1 = r0.X3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X3 = r1
            goto L18
        L13:
            io.ktor.utils.io.a$c r0 = new io.ktor.utils.io.a$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.V3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.X3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r8)
            goto L71
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.U3
            java.lang.Object r7 = r0.f12802y
            gc.l r7 = (gc.l) r7
            java.lang.Object r2 = r0.f12801x
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            tb.t.b(r8)
            goto L55
        L42:
            tb.t.b(r8)
            r0.f12801x = r5
            r0.f12802y = r7
            r0.U3 = r6
            r0.X3 = r4
            java.lang.Object r8 = r5.T0(r6, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r2 = r5
        L55:
            io.ktor.utils.io.internal.d r8 = r2.joining
            if (r8 != 0) goto L5a
            goto L60
        L5a:
            io.ktor.utils.io.a r8 = r2.q0(r2, r8)
            if (r8 != 0) goto L63
        L60:
            tb.e0 r6 = tb.e0.f22152a
            return r6
        L63:
            r2 = 0
            r0.f12801x = r2
            r0.f12802y = r2
            r0.X3 = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L71
            return r1
        L71:
            tb.e0 r6 = tb.e0.f22152a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.H(int, gc.l, xb.d):java.lang.Object");
    }

    private final int H0(ByteBuffer byteBuffer) {
        a aVar;
        int o10;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar == null || (aVar = q0(this, dVar)) == null) {
            aVar = this;
        }
        ByteBuffer z02 = aVar.z0();
        if (z02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.i iVar = aVar.T().f12890b;
        long V = aVar.V();
        try {
            io.ktor.utils.io.internal.c P = aVar.P();
            if (P != null) {
                io.ktor.utils.io.b.b(P.c());
                throw new tb.i();
            }
            int limit = byteBuffer.limit();
            int i10 = 0;
            while (true) {
                int position = limit - byteBuffer.position();
                if (position == 0 || (o10 = iVar.o(Math.min(position, z02.remaining()))) == 0) {
                    break;
                }
                if (!(o10 > 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                byteBuffer.limit(byteBuffer.position() + o10);
                z02.put(byteBuffer);
                i10 += o10;
                aVar.a0(z02, aVar.W(), aVar.K(z02, aVar.f12792e + i10), iVar._availableForWrite$internal);
            }
            byteBuffer.limit(limit);
            aVar.J(z02, iVar, i10);
            return i10;
        } finally {
            if (iVar.h() || aVar.n()) {
                aVar.flush();
            }
            if (aVar != this) {
                x0(V() + (aVar.V() - V));
            }
            aVar.s0();
            aVar.E0();
        }
    }

    private final void I(ByteBuffer byteBuffer, io.ktor.utils.io.internal.i iVar, int i10) {
        if (i10 >= 0) {
            this.f12791d = K(byteBuffer, this.f12791d + i10);
            iVar.a(i10);
            w0(U() + i10);
            v0();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final int I0(ob.e eVar) {
        a aVar;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar == null || (aVar = q0(this, dVar)) == null) {
            aVar = this;
        }
        ByteBuffer z02 = aVar.z0();
        int i10 = 0;
        if (z02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.i iVar = aVar.T().f12890b;
        long V = aVar.V();
        try {
            io.ktor.utils.io.internal.c P = aVar.P();
            if (P != null) {
                io.ktor.utils.io.b.b(P.c());
                throw new tb.i();
            }
            while (true) {
                int o10 = iVar.o(Math.min(eVar.s() - eVar.p(), z02.remaining()));
                if (o10 == 0) {
                    break;
                }
                g0.a(eVar, z02, o10);
                i10 += o10;
                aVar.a0(z02, aVar.W(), aVar.K(z02, aVar.f12792e + i10), iVar._availableForWrite$internal);
            }
            aVar.J(z02, iVar, i10);
            return i10;
        } finally {
            if (iVar.h() || aVar.n()) {
                aVar.flush();
            }
            if (aVar != this) {
                x0(V() + (aVar.V() - V));
            }
            aVar.s0();
            aVar.E0();
        }
    }

    private final void J(ByteBuffer byteBuffer, io.ktor.utils.io.internal.i iVar, int i10) {
        if (i10 >= 0) {
            this.f12792e = K(byteBuffer, this.f12792e + i10);
            iVar.c(i10);
            x0(V() + i10);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final int J0(byte[] bArr, int i10, int i11) {
        a aVar;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar == null || (aVar = q0(this, dVar)) == null) {
            aVar = this;
        }
        ByteBuffer z02 = aVar.z0();
        if (z02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.i iVar = aVar.T().f12890b;
        long V = aVar.V();
        try {
            io.ktor.utils.io.internal.c P = aVar.P();
            if (P != null) {
                io.ktor.utils.io.b.b(P.c());
                throw new tb.i();
            }
            int i12 = 0;
            while (true) {
                int o10 = iVar.o(Math.min(i11 - i12, z02.remaining()));
                if (o10 == 0) {
                    aVar.J(z02, iVar, i12);
                    return i12;
                }
                if (!(o10 > 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                z02.put(bArr, i10 + i12, o10);
                i12 += o10;
                aVar.a0(z02, aVar.W(), aVar.K(z02, aVar.f12792e + i12), iVar._availableForWrite$internal);
            }
        } finally {
            if (iVar.h() || aVar.n()) {
                aVar.flush();
            }
            if (aVar != this) {
                x0(V() + (aVar.V() - V));
            }
            aVar.s0();
            aVar.E0();
        }
    }

    private final int K(ByteBuffer byteBuffer, int i10) {
        return i10 >= byteBuffer.capacity() - this.f12790c ? i10 - (byteBuffer.capacity() - this.f12790c) : i10;
    }

    static /* synthetic */ Object M0(a aVar, byte[] bArr, int i10, int i11, xb.d dVar) {
        a q02;
        io.ktor.utils.io.internal.d dVar2 = aVar.joining;
        if (dVar2 == null || (q02 = aVar.q0(aVar, dVar2)) == null) {
            int J0 = aVar.J0(bArr, i10, i11);
            return J0 > 0 ? zb.b.c(J0) : aVar.U0(bArr, i10, i11, dVar);
        }
        return q02.L0(bArr, i10, i11, dVar);
    }

    private final void N(io.ktor.utils.io.internal.d dVar) {
        io.ktor.utils.io.internal.c P = P();
        if (P == null) {
            return;
        }
        this.joining = null;
        if (!dVar.b()) {
            dVar.c().flush();
            dVar.a();
            return;
        }
        io.ktor.utils.io.internal.g T = dVar.c().T();
        boolean z10 = (T instanceof g.C0196g) || (T instanceof g.e);
        if (P.b() != null || !z10) {
            dVar.c().a(P.b());
        } else {
            dVar.c().flush();
        }
        dVar.a();
    }

    static /* synthetic */ Object N0(a aVar, ByteBuffer byteBuffer, xb.d dVar) {
        Object c10;
        a q02;
        Object c11;
        io.ktor.utils.io.internal.d dVar2 = aVar.joining;
        if (dVar2 != null && (q02 = aVar.q0(aVar, dVar2)) != null) {
            Object c12 = q02.c(byteBuffer, dVar);
            c11 = yb.d.c();
            return c12 == c11 ? c12 : e0.f22152a;
        }
        aVar.H0(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return e0.f22152a;
        }
        Object Q0 = aVar.Q0(byteBuffer, dVar);
        c10 = yb.d.c();
        return Q0 == c10 ? Q0 : e0.f22152a;
    }

    public final void O(int i10) {
        io.ktor.utils.io.internal.g T;
        g.f fVar;
        a c10;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar != null && (c10 = dVar.c()) != null) {
            c10.flush();
        }
        do {
            T = T();
            fVar = g.f.f12901c;
            if (T == fVar) {
                return;
            }
            T.f12890b.e();
        } while (T != T());
        int i11 = T.f12890b._availableForWrite$internal;
        if (T.f12890b._availableForRead$internal >= 1) {
            u0();
        }
        io.ktor.utils.io.internal.d dVar2 = this.joining;
        if (i11 >= i10) {
            if (dVar2 != null && T() != fVar) {
                return;
            }
            v0();
        }
    }

    static /* synthetic */ Object O0(a aVar, f0 f0Var, xb.d dVar) {
        Object c10;
        aVar.I0(f0Var);
        if (!(f0Var.s() > f0Var.p())) {
            return e0.f22152a;
        }
        Object R0 = aVar.R0(f0Var, dVar);
        c10 = yb.d.c();
        return R0 == c10 ? R0 : e0.f22152a;
    }

    public final io.ktor.utils.io.internal.c P() {
        return (io.ktor.utils.io.internal.c) this._closed;
    }

    static /* synthetic */ Object P0(a aVar, byte[] bArr, int i10, int i11, xb.d dVar) {
        Object c10;
        a q02;
        Object c11;
        io.ktor.utils.io.internal.d dVar2 = aVar.joining;
        if (dVar2 != null && (q02 = aVar.q0(aVar, dVar2)) != null) {
            Object e10 = q02.e(bArr, i10, i11, dVar);
            c11 = yb.d.c();
            return e10 == c11 ? e10 : e0.f22152a;
        }
        while (i11 > 0) {
            int J0 = aVar.J0(bArr, i10, i11);
            if (J0 == 0) {
                break;
            }
            i10 += J0;
            i11 -= J0;
        }
        if (i11 == 0) {
            return e0.f22152a;
        }
        Object S0 = aVar.S0(bArr, i10, i11, dVar);
        c10 = yb.d.c();
        return S0 == c10 ? S0 : e0.f22152a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0054 -> B:22:0x0057). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q0(java.nio.ByteBuffer r6, xb.d<? super tb.e0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.j
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$j r0 = (io.ktor.utils.io.a.j) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            io.ktor.utils.io.a$j r0 = new io.ktor.utils.io.a$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r7)
            goto L74
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f12825y
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r2 = r0.f12824x
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            tb.t.b(r7)
            goto L57
        L40:
            tb.t.b(r7)
            r2 = r5
        L44:
            boolean r7 = r6.hasRemaining()
            if (r7 == 0) goto L77
            r0.f12824x = r2
            r0.f12825y = r6
            r0.W3 = r4
            java.lang.Object r7 = r2.F0(r4, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            io.ktor.utils.io.internal.d r7 = r2.joining
            if (r7 != 0) goto L5c
            goto L62
        L5c:
            io.ktor.utils.io.a r7 = r2.q0(r2, r7)
            if (r7 != 0) goto L66
        L62:
            r2.H0(r6)
            goto L44
        L66:
            r2 = 0
            r0.f12824x = r2
            r0.f12825y = r2
            r0.W3 = r3
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r1) goto L74
            return r1
        L74:
            tb.e0 r6 = tb.e0.f22152a
            return r6
        L77:
            tb.e0 r6 = tb.e0.f22152a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.Q0(java.nio.ByteBuffer, xb.d):java.lang.Object");
    }

    private final xb.d<Boolean> R() {
        return (xb.d) this._readOp;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005d -> B:25:0x0060). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(ob.f0 r7, xb.d<? super tb.e0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.a.k
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.a$k r0 = (io.ktor.utils.io.a.k) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            io.ktor.utils.io.a$k r0 = new io.ktor.utils.io.a$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r8)
            goto L7d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f12827y
            ob.f0 r7 = (ob.f0) r7
            java.lang.Object r2 = r0.f12826x
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            tb.t.b(r8)
            goto L60
        L40:
            tb.t.b(r8)
            r2 = r6
        L44:
            int r8 = r7.s()
            int r5 = r7.p()
            if (r8 <= r5) goto L50
            r8 = r4
            goto L51
        L50:
            r8 = 0
        L51:
            if (r8 == 0) goto L80
            r0.f12826x = r2
            r0.f12827y = r7
            r0.W3 = r4
            java.lang.Object r8 = r2.F0(r4, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            io.ktor.utils.io.internal.d r8 = r2.joining
            if (r8 != 0) goto L65
            goto L6b
        L65:
            io.ktor.utils.io.a r8 = r2.q0(r2, r8)
            if (r8 != 0) goto L6f
        L6b:
            r2.I0(r7)
            goto L44
        L6f:
            r2 = 0
            r0.f12826x = r2
            r0.f12827y = r2
            r0.W3 = r3
            java.lang.Object r7 = r8.b(r7, r0)
            if (r7 != r1) goto L7d
            return r1
        L7d:
            tb.e0 r7 = tb.e0.f22152a
            return r7
        L80:
            tb.e0 r7 = tb.e0.f22152a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.R0(ob.f0, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:20:0x0057). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S0(byte[] r6, int r7, int r8, xb.d<? super tb.e0> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.a.l
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.a$l r0 = (io.ktor.utils.io.a.l) r0
            int r1 = r0.Y3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y3 = r1
            goto L18
        L13:
            io.ktor.utils.io.a$l r0 = new io.ktor.utils.io.a$l
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.W3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.Y3
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r6 = r0.V3
            int r7 = r0.U3
            java.lang.Object r8 = r0.f12829y
            byte[] r8 = (byte[]) r8
            java.lang.Object r2 = r0.f12828x
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            tb.t.b(r9)
            goto L57
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            tb.t.b(r9)
            r2 = r5
        L41:
            if (r8 <= 0) goto L63
            r0.f12828x = r2
            r0.f12829y = r6
            r0.U3 = r7
            r0.V3 = r8
            r0.Y3 = r3
            java.lang.Object r9 = r2.L0(r6, r7, r8, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r4 = r8
            r8 = r6
            r6 = r4
        L57:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r7 = r7 + r9
            int r6 = r6 - r9
            r4 = r8
            r8 = r6
            r6 = r4
            goto L41
        L63:
            tb.e0 r6 = tb.e0.f22152a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.S0(byte[], int, int, xb.d):java.lang.Object");
    }

    private final io.ktor.utils.io.internal.g T() {
        return (io.ktor.utils.io.internal.g) this._state;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T0(int r6, xb.d<? super tb.e0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.n
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$n r0 = (io.ktor.utils.io.a.n) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            io.ktor.utils.io.a$n r0 = new io.ktor.utils.io.a$n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r6 = r0.f12833y
            java.lang.Object r2 = r0.f12832x
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            tb.t.b(r7)
            goto L3b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            tb.t.b(r7)
            r2 = r5
        L3b:
            boolean r7 = r2.W0(r6)
            if (r7 == 0) goto L66
            r0.f12832x = r2
            r0.f12833y = r6
            r0.W3 = r3
            kotlinx.coroutines.q r7 = new kotlinx.coroutines.q
            xb.d r4 = yb.b.b(r0)
            r7.<init>(r4, r3)
            r7.z()
            F(r2, r6, r7)
            java.lang.Object r7 = r7.s()
            java.lang.Object r4 = yb.b.c()
            if (r7 != r4) goto L63
            zb.h.c(r0)
        L63:
            if (r7 != r1) goto L3b
            return r1
        L66:
            io.ktor.utils.io.internal.c r6 = r2.P()
            if (r6 != 0) goto L6d
            goto L73
        L6d:
            java.lang.Throwable r6 = r6.c()
            if (r6 != 0) goto L76
        L73:
            tb.e0 r6 = tb.e0.f22152a
            return r6
        L76:
            io.ktor.utils.io.b.a(r6)
            tb.i r6 = new tb.i
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.T0(int, xb.d):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v6 java.lang.Object), (r10v1 java.lang.Object) binds: [B:29:0x007d, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:20:0x005c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U0(byte[] r7, int r8, int r9, xb.d<? super java.lang.Integer> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.a.m
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.a$m r0 = (io.ktor.utils.io.a.m) r0
            int r1 = r0.Y3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y3 = r1
            goto L18
        L13:
            io.ktor.utils.io.a$m r0 = new io.ktor.utils.io.a$m
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.W3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.Y3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r10)
            goto L80
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            int r7 = r0.V3
            int r8 = r0.U3
            java.lang.Object r9 = r0.f12831y
            byte[] r9 = (byte[]) r9
            java.lang.Object r2 = r0.f12830x
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            tb.t.b(r10)
            r5 = r9
            r9 = r7
            r7 = r5
            goto L5c
        L47:
            tb.t.b(r10)
            r2 = r6
        L4b:
            r0.f12830x = r2
            r0.f12831y = r7
            r0.U3 = r8
            r0.V3 = r9
            r0.Y3 = r4
            java.lang.Object r10 = r2.F0(r4, r0)
            if (r10 != r1) goto L5c
            return r1
        L5c:
            io.ktor.utils.io.internal.d r10 = r2.joining
            if (r10 != 0) goto L61
            goto L67
        L61:
            io.ktor.utils.io.a r10 = r2.q0(r2, r10)
            if (r10 != 0) goto L72
        L67:
            int r10 = r2.J0(r7, r8, r9)
            if (r10 <= 0) goto L4b
            java.lang.Integer r7 = zb.b.c(r10)
            return r7
        L72:
            r2 = 0
            r0.f12830x = r2
            r0.f12831y = r2
            r0.Y3 = r3
            java.lang.Object r10 = r10.U0(r7, r8, r9, r0)
            if (r10 != r1) goto L80
            return r1
        L80:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.U0(byte[], int, int, xb.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        O(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (A0() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        u0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V0(int r6, kotlinx.coroutines.p<? super tb.e0> r7) {
        /*
            r5 = this;
        L0:
            io.ktor.utils.io.internal.c r0 = r5.P()
            if (r0 != 0) goto L7
            goto Ld
        L7:
            java.lang.Throwable r0 = r0.c()
            if (r0 != 0) goto L64
        Ld:
            boolean r0 = r5.W0(r6)
            if (r0 != 0) goto L1f
            tb.s$a r0 = tb.s.Companion
            tb.e0 r0 = tb.e0.f22152a
            java.lang.Object r0 = tb.s.c(r0)
            r7.y(r0)
            goto L4b
        L1f:
            xb.d r0 = r5.X()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L58
            boolean r0 = r5.W0(r6)
            if (r0 != 0) goto L34
        L32:
            r1 = r2
            goto L49
        L34:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = io.ktor.utils.io.a.f12787p
            r3 = 0
            boolean r4 = androidx.concurrent.futures.b.a(r0, r5, r3, r7)
            if (r4 == 0) goto L1f
            boolean r4 = r5.W0(r6)
            if (r4 != 0) goto L49
            boolean r0 = androidx.concurrent.futures.b.a(r0, r5, r7, r3)
            if (r0 != 0) goto L32
        L49:
            if (r1 == 0) goto L0
        L4b:
            r5.O(r6)
            boolean r6 = r5.A0()
            if (r6 == 0) goto L57
            r5.u0()
        L57:
            return
        L58:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Operation is already in progress"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L64:
            io.ktor.utils.io.b.a(r0)
            tb.i r6 = new tb.i
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.V0(int, kotlinx.coroutines.p):void");
    }

    public final boolean W0(int i10) {
        io.ktor.utils.io.internal.d dVar = this.joining;
        io.ktor.utils.io.internal.g T = T();
        if (P() == null) {
            if (dVar == null) {
                if (T.f12890b._availableForWrite$internal < i10 && T != g.a.f12891c) {
                    return true;
                }
            } else if (T != g.f.f12901c && !(T instanceof g.C0196g) && !(T instanceof g.e)) {
                return true;
            }
        }
        return false;
    }

    public final xb.d<e0> X() {
        return (xb.d) this._writeOp;
    }

    private final g.c Z() {
        g.c c02 = this.f12789b.c0();
        c02.a().order(Q().g());
        c02.b().order(W().g());
        c02.f12890b.j();
        return c02;
    }

    private final void a0(ByteBuffer byteBuffer, ob.p pVar, int i10, int i11) {
        int d10;
        boolean z10 = true;
        if (i10 >= 0) {
            if (i11 < 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            byteBuffer.order(pVar.g());
            d10 = nc.m.d(i11 + i10, byteBuffer.capacity() - this.f12790c);
            byteBuffer.limit(d10);
            byteBuffer.position(i10);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EDGE_INSN: B:32:0x0070->B:26:0x0070 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int b0(ob.e r8, int r9, int r10) {
        /*
            r7 = this;
        L0:
            java.nio.ByteBuffer r0 = r7.y0()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lb
        L8:
            r0 = r2
            r5 = r0
            goto L54
        Lb:
            io.ktor.utils.io.internal.g r3 = r7.T()
            io.ktor.utils.io.internal.i r3 = r3.f12890b
            int r4 = r3._availableForRead$internal     // Catch: java.lang.Throwable -> L71
            if (r4 != 0) goto L1c
            r7.r0()
            r7.E0()
            goto L8
        L1c:
            int r4 = r8.j()     // Catch: java.lang.Throwable -> L71
            int r5 = r8.s()     // Catch: java.lang.Throwable -> L71
            int r4 = r4 - r5
            int r5 = r0.remaining()     // Catch: java.lang.Throwable -> L71
            int r6 = java.lang.Math.min(r4, r10)     // Catch: java.lang.Throwable -> L71
            int r5 = java.lang.Math.min(r5, r6)     // Catch: java.lang.Throwable -> L71
            int r5 = r3.l(r5)     // Catch: java.lang.Throwable -> L71
            if (r5 > 0) goto L39
            r0 = r2
            goto L4e
        L39:
            int r6 = r0.remaining()     // Catch: java.lang.Throwable -> L71
            if (r4 >= r6) goto L47
            int r6 = r0.position()     // Catch: java.lang.Throwable -> L71
            int r6 = r6 + r4
            r0.limit(r6)     // Catch: java.lang.Throwable -> L71
        L47:
            ob.k.a(r8, r0)     // Catch: java.lang.Throwable -> L71
            r7.I(r0, r3, r5)     // Catch: java.lang.Throwable -> L71
            r0 = r1
        L4e:
            r7.r0()
            r7.E0()
        L54:
            int r9 = r9 + r5
            int r10 = r10 - r5
            if (r0 == 0) goto L70
            int r0 = r8.j()
            int r3 = r8.s()
            if (r0 <= r3) goto L63
            goto L64
        L63:
            r1 = r2
        L64:
            if (r1 == 0) goto L70
            io.ktor.utils.io.internal.g r0 = r7.T()
            io.ktor.utils.io.internal.i r0 = r0.f12890b
            int r0 = r0._availableForRead$internal
            if (r0 > 0) goto L0
        L70:
            return r9
        L71:
            r8 = move-exception
            r7.r0()
            r7.E0()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.b0(ob.e, int, int):int");
    }

    private final int c0(byte[] bArr, int i10, int i11) {
        ByteBuffer y02 = y0();
        int i12 = 0;
        if (y02 != null) {
            io.ktor.utils.io.internal.i iVar = T().f12890b;
            try {
                if (iVar._availableForRead$internal != 0) {
                    int capacity = y02.capacity() - S();
                    while (true) {
                        int i13 = i11 - i12;
                        if (i13 == 0) {
                            break;
                        }
                        int i14 = this.f12791d;
                        int l10 = iVar.l(Math.min(capacity - i14, i13));
                        if (l10 == 0) {
                            break;
                        }
                        y02.limit(i14 + l10);
                        y02.position(i14);
                        y02.get(bArr, i10 + i12, l10);
                        I(y02, iVar, l10);
                        i12 += l10;
                    }
                }
            } finally {
                r0();
                E0();
            }
        }
        return i12;
    }

    static /* synthetic */ int d0(a aVar, ob.e eVar, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = eVar.j() - eVar.s();
            }
            return aVar.b0(eVar, i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsMuchAsPossible");
    }

    static /* synthetic */ Object e0(a aVar, f0 f0Var, xb.d dVar) {
        int d02 = d0(aVar, f0Var, 0, 0, 6, null);
        if (d02 == 0 && aVar.P() != null) {
            d02 = aVar.T().f12890b.e() ? d0(aVar, f0Var, 0, 0, 6, null) : -1;
        } else if (d02 <= 0) {
            if (f0Var.j() > f0Var.s()) {
                return aVar.g0(f0Var, dVar);
            }
        }
        return zb.b.c(d02);
    }

    static /* synthetic */ Object f0(a aVar, byte[] bArr, int i10, int i11, xb.d dVar) {
        int c02 = aVar.c0(bArr, i10, i11);
        if (c02 == 0 && aVar.P() != null) {
            c02 = aVar.T().f12890b.e() ? aVar.c0(bArr, i10, i11) : -1;
        } else if (c02 <= 0 && i11 != 0) {
            return aVar.h0(bArr, i10, i11, dVar);
        }
        return zb.b.c(c02);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(ob.f0 r6, xb.d<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.f
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$f r0 = (io.ktor.utils.io.a.f) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            io.ktor.utils.io.a$f r0 = new io.ktor.utils.io.a$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r7)
            goto L6d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f12817y
            ob.f0 r6 = (ob.f0) r6
            java.lang.Object r2 = r0.f12816x
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            tb.t.b(r7)
            goto L51
        L40:
            tb.t.b(r7)
            r0.f12816x = r5
            r0.f12817y = r6
            r0.W3 = r4
            java.lang.Object r7 = r5.k0(r4, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5f
            r6 = -1
            java.lang.Integer r6 = zb.b.c(r6)
            return r6
        L5f:
            r7 = 0
            r0.f12816x = r7
            r0.f12817y = r7
            r0.W3 = r3
            java.lang.Object r7 = r2.h(r6, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.g0(ob.f0, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h0(byte[] r6, int r7, int r8, xb.d<? super java.lang.Integer> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.a.e
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.a$e r0 = (io.ktor.utils.io.a.e) r0
            int r1 = r0.Y3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y3 = r1
            goto L18
        L13:
            io.ktor.utils.io.a$e r0 = new io.ktor.utils.io.a$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.W3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.Y3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r9)
            goto L75
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r8 = r0.V3
            int r7 = r0.U3
            java.lang.Object r6 = r0.f12815y
            byte[] r6 = (byte[]) r6
            java.lang.Object r2 = r0.f12814x
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            tb.t.b(r9)
            goto L59
        L44:
            tb.t.b(r9)
            r0.f12814x = r5
            r0.f12815y = r6
            r0.U3 = r7
            r0.V3 = r8
            r0.Y3 = r4
            java.lang.Object r9 = r5.k0(r4, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            r2 = r5
        L59:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L67
            r6 = -1
            java.lang.Integer r6 = zb.b.c(r6)
            return r6
        L67:
            r9 = 0
            r0.f12814x = r9
            r0.f12815y = r9
            r0.Y3 = r3
            java.lang.Object r9 = r2.i(r6, r7, r8, r0)
            if (r9 != r1) goto L75
            return r1
        L75:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.h0(byte[], int, int, xb.d):java.lang.Object");
    }

    static /* synthetic */ Object i0(a aVar, long j10, int i10, xb.d dVar) {
        if (aVar.Y()) {
            Throwable j11 = aVar.j();
            if (j11 == null) {
                return aVar.o0(j10, i10);
            }
            io.ktor.utils.io.b.b(j11);
            throw new tb.i();
        }
        return aVar.j0(j10, i10, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x00cd, blocks: (B:35:0x00b5, B:37:0x00be, B:39:0x00c3, B:12:0x0039, B:18:0x0060, B:20:0x0070, B:21:0x0074, B:23:0x008a, B:25:0x0090, B:29:0x00a6, B:40:0x00c4), top: B:46:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[Catch: all -> 0x00cd, TRY_ENTER, TryCatch #1 {all -> 0x00cd, blocks: (B:35:0x00b5, B:37:0x00be, B:39:0x00c3, B:12:0x0039, B:18:0x0060, B:20:0x0070, B:21:0x0074, B:23:0x008a, B:25:0x0090, B:29:0x00a6, B:40:0x00c4), top: B:46:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00cd, blocks: (B:35:0x00b5, B:37:0x00be, B:39:0x00c3, B:12:0x0039, B:18:0x0060, B:20:0x0070, B:21:0x0074, B:23:0x008a, B:25:0x0090, B:29:0x00a6, B:40:0x00c4), top: B:46:0x0039 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a3 -> B:29:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b2 -> B:34:0x00b3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(long r12, int r14, xb.d<? super ob.u> r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.j0(long, int, xb.d):java.lang.Object");
    }

    private final Object k0(int i10, xb.d<? super Boolean> dVar) {
        boolean z10 = true;
        if (T().f12890b._availableForRead$internal >= i10) {
            return zb.b.a(true);
        }
        io.ktor.utils.io.internal.c P = P();
        if (P == null) {
            return i10 == 1 ? l0(1, dVar) : m0(i10, dVar);
        }
        Throwable b10 = P.b();
        if (b10 != null) {
            io.ktor.utils.io.b.b(b10);
            throw new tb.i();
        }
        io.ktor.utils.io.internal.i iVar = T().f12890b;
        if (!iVar.e() || iVar._availableForRead$internal < i10) {
            z10 = false;
        }
        if (R() != null) {
            throw new IllegalStateException("Read operation is already in progress");
        }
        return zb.b.a(z10);
    }

    private final Object l0(int i10, xb.d<? super Boolean> dVar) {
        xb.d<? super Boolean> b10;
        Object c10;
        io.ktor.utils.io.internal.g T = T();
        if (!(T.f12890b._availableForRead$internal < i10 && (this.joining == null || X() == null || (T != g.a.f12891c && !(T instanceof g.b))))) {
            return zb.b.a(true);
        }
        io.ktor.utils.io.internal.b<Boolean> bVar = this.f12797j;
        B0(i10, bVar);
        b10 = yb.c.b(dVar);
        Object f10 = bVar.f(b10);
        c10 = yb.d.c();
        if (f10 == c10) {
            zb.h.c(dVar);
        }
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:24:0x005e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m0(int r6, xb.d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.h
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$h r0 = (io.ktor.utils.io.a.h) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            io.ktor.utils.io.a$h r0 = new io.ktor.utils.io.a$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r6 = r0.f12821y
            java.lang.Object r2 = r0.f12820x
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            tb.t.b(r7)
            goto L5e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            tb.t.b(r7)
            r2 = r5
        L3c:
            io.ktor.utils.io.internal.g r7 = r2.T()
            io.ktor.utils.io.internal.i r7 = r7.f12890b
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L4b
            java.lang.Boolean r6 = zb.b.a(r4)
            return r6
        L4b:
            io.ktor.utils.io.internal.c r7 = r2.P()
            if (r7 != 0) goto L6b
            r0.f12820x = r2
            r0.f12821y = r6
            r0.W3 = r4
            java.lang.Object r7 = r2.l0(r6, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L3c
            java.lang.Boolean r6 = zb.b.a(r3)
            return r6
        L6b:
            java.lang.Throwable r0 = r7.b()
            if (r0 != 0) goto L95
            io.ktor.utils.io.internal.g r7 = r2.T()
            io.ktor.utils.io.internal.i r7 = r7.f12890b
            boolean r0 = r7.e()
            if (r0 == 0) goto L82
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L82
            r3 = r4
        L82:
            xb.d r6 = r2.R()
            if (r6 != 0) goto L8d
            java.lang.Boolean r6 = zb.b.a(r3)
            return r6
        L8d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Read operation is already in progress"
            r6.<init>(r7)
            throw r6
        L95:
            java.lang.Throwable r6 = r7.b()
            io.ktor.utils.io.b.a(r6)
            tb.i r6 = new tb.i
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.m0(int, xb.d):java.lang.Object");
    }

    private final void n0(g.c cVar) {
        this.f12789b.B0(cVar);
    }

    private final ob.u o0(long j10, int i10) {
        ob.r a10 = k0.a(i10);
        try {
            pb.a i11 = pb.h.i(a10, 1, null);
            while (true) {
                if (i11.j() - i11.s() > j10) {
                    i11.e0((int) j10);
                }
                j10 -= d0(this, i11, 0, 0, 6, null);
                if (!(j10 > 0 && !m())) {
                    pb.h.a(a10, i11);
                    return a10.q1();
                }
                i11 = pb.h.i(a10, 1, i11);
            }
        } catch (Throwable th2) {
            a10.z0();
            throw th2;
        }
    }

    private final a q0(a aVar, io.ktor.utils.io.internal.d dVar) {
        while (aVar.T() == g.f.f12901c) {
            aVar = dVar.c();
            dVar = aVar.joining;
            if (dVar == null) {
                return aVar;
            }
        }
        return null;
    }

    private final void r0() {
        Object obj;
        io.ktor.utils.io.internal.g e10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g.b bVar = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.g gVar = (io.ktor.utils.io.internal.g) obj;
            g.b bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.f12890b.j();
                v0();
                bVar = null;
            }
            e10 = gVar.e();
            if ((e10 instanceof g.b) && T() == gVar && e10.f12890b.k()) {
                e10 = g.a.f12891c;
                bVar = e10;
            }
            atomicReferenceFieldUpdater = f12784m;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, e10));
        g.a aVar = g.a.f12891c;
        if (e10 == aVar) {
            g.b bVar3 = bVar;
            if (bVar3 != null) {
                n0(bVar3.g());
            }
            v0();
        } else if (!(e10 instanceof g.b) || !e10.f12890b.g() || !e10.f12890b.k() || !androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e10, aVar)) {
        } else {
            e10.f12890b.j();
            n0(((g.b) e10).g());
            v0();
        }
    }

    private final void t0(Throwable th2) {
        Object valueOf;
        xb.d dVar = (xb.d) f12786o.getAndSet(this, null);
        if (dVar != null) {
            if (th2 != null) {
                s.a aVar = tb.s.Companion;
                valueOf = tb.t.a(th2);
            } else {
                valueOf = Boolean.valueOf(T().f12890b._availableForRead$internal > 0);
                s.a aVar2 = tb.s.Companion;
            }
            dVar.y(tb.s.c(valueOf));
        }
        xb.d dVar2 = (xb.d) f12787p.getAndSet(this, null);
        if (dVar2 == null) {
            return;
        }
        s.a aVar3 = tb.s.Companion;
        if (th2 == null) {
            th2 = new io.ktor.utils.io.o("Byte channel was closed");
        }
        dVar2.y(tb.s.c(tb.t.a(th2)));
    }

    public final void u0() {
        Object obj;
        Throwable th2 = null;
        xb.d dVar = (xb.d) f12786o.getAndSet(this, null);
        if (dVar == null) {
            return;
        }
        io.ktor.utils.io.internal.c P = P();
        if (P != null) {
            th2 = P.b();
        }
        if (th2 != null) {
            s.a aVar = tb.s.Companion;
            obj = tb.t.a(th2);
        } else {
            obj = Boolean.TRUE;
            s.a aVar2 = tb.s.Companion;
        }
        dVar.y(tb.s.c(obj));
    }

    private final void v0() {
        xb.d<e0> X;
        io.ktor.utils.io.internal.c P;
        Object obj;
        do {
            X = X();
            if (X == null) {
                return;
            }
            P = P();
            if (P == null && this.joining != null) {
                io.ktor.utils.io.internal.g T = T();
                if (!(T instanceof g.C0196g) && !(T instanceof g.e) && T != g.f.f12901c) {
                    return;
                }
            }
        } while (!androidx.concurrent.futures.b.a(f12787p, this, X, null));
        if (P == null) {
            s.a aVar = tb.s.Companion;
            obj = e0.f22152a;
        } else {
            s.a aVar2 = tb.s.Companion;
            obj = tb.t.a(P.c());
        }
        X.y(tb.s.c(obj));
    }

    private final ByteBuffer y0() {
        Object obj;
        Throwable b10;
        Throwable b11;
        io.ktor.utils.io.internal.g c10;
        Throwable b12;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.g gVar = (io.ktor.utils.io.internal.g) obj;
            if (hc.t.a(gVar, g.f.f12901c)) {
                io.ktor.utils.io.internal.c P = P();
                if (P == null || (b10 = P.b()) == null) {
                    return null;
                }
                io.ktor.utils.io.b.b(b10);
                throw new tb.i();
            } else if (hc.t.a(gVar, g.a.f12891c)) {
                io.ktor.utils.io.internal.c P2 = P();
                if (P2 == null || (b11 = P2.b()) == null) {
                    return null;
                }
                io.ktor.utils.io.b.b(b11);
                throw new tb.i();
            } else {
                io.ktor.utils.io.internal.c P3 = P();
                if (P3 != null && (b12 = P3.b()) != null) {
                    io.ktor.utils.io.b.b(b12);
                    throw new tb.i();
                } else if (gVar.f12890b._availableForRead$internal == 0) {
                    return null;
                } else {
                    c10 = gVar.c();
                }
            }
        } while (!androidx.concurrent.futures.b.a(f12784m, this, obj, c10));
        ByteBuffer a10 = c10.a();
        a0(a10, Q(), this.f12791d, c10.f12890b._availableForRead$internal);
        return a10;
    }

    public final boolean E0() {
        if (P() == null || !D0(false)) {
            return false;
        }
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar != null) {
            N(dVar);
        }
        u0();
        v0();
        return true;
    }

    public final Object F0(int i10, xb.d<? super e0> dVar) {
        xb.d<? super e0> b10;
        Object c10;
        Object c11;
        Object c12;
        Object c13;
        Object c14;
        Throwable c15;
        if (!W0(i10)) {
            io.ktor.utils.io.internal.c P = P();
            if (P != null && (c15 = P.c()) != null) {
                io.ktor.utils.io.b.b(c15);
                throw new tb.i();
            }
            c14 = yb.d.c();
            if (c14 != null) {
                return e0.f22152a;
            }
            return null;
        }
        this.writeSuspensionSize = i10;
        if (this.attachedJob != null) {
            Object invoke = this.f12799l.invoke(dVar);
            c12 = yb.d.c();
            if (invoke == c12) {
                zb.h.c(dVar);
            }
            c13 = yb.d.c();
            return invoke == c13 ? invoke : e0.f22152a;
        }
        io.ktor.utils.io.internal.b<e0> bVar = this.f12798k;
        this.f12799l.invoke(bVar);
        b10 = yb.c.b(dVar);
        Object f10 = bVar.f(b10);
        c10 = yb.d.c();
        if (f10 == c10) {
            zb.h.c(dVar);
        }
        c11 = yb.d.c();
        return f10 == c11 ? f10 : e0.f22152a;
    }

    /* JADX WARN: Finally extract failed */
    public int K0(int i10, gc.l<? super ByteBuffer, e0> lVar) {
        a aVar;
        int i11;
        hc.t.e(lVar, "block");
        int i12 = 1;
        int i13 = 0;
        if (i10 > 0) {
            if (!(i10 <= 4088)) {
                throw new IllegalArgumentException(("Min(" + i10 + ") shouldn't be greater than 4088").toString());
            }
            io.ktor.utils.io.internal.d dVar = this.joining;
            if (dVar == null || (aVar = q0(this, dVar)) == null) {
                aVar = this;
            }
            ByteBuffer z02 = aVar.z0();
            if (z02 == null) {
                i11 = 0;
            } else {
                io.ktor.utils.io.internal.i iVar = aVar.T().f12890b;
                long V = aVar.V();
                try {
                    io.ktor.utils.io.internal.c P = aVar.P();
                    if (P != null) {
                        io.ktor.utils.io.b.b(P.c());
                        throw new tb.i();
                    }
                    int n10 = iVar.n(i10);
                    if (n10 <= 0) {
                        i12 = 0;
                    } else {
                        aVar.a0(z02, aVar.W(), aVar.f12792e, n10);
                        int position = z02.position();
                        int limit = z02.limit();
                        lVar.invoke(z02);
                        if (!(limit == z02.limit())) {
                            throw new IllegalStateException("Buffer limit modified".toString());
                        }
                        int position2 = z02.position() - position;
                        if (position2 >= 0) {
                            i13 = 1;
                        }
                        if (i13 == 0) {
                            throw new IllegalStateException("Position has been moved backward: pushback is not supported".toString());
                        }
                        if (position2 < 0) {
                            throw new IllegalStateException();
                        }
                        aVar.J(z02, iVar, position2);
                        if (position2 < n10) {
                            iVar.a(n10 - position2);
                        }
                        i13 = position2;
                    }
                    if (iVar.h() || aVar.n()) {
                        aVar.flush();
                    }
                    if (aVar != this) {
                        x0(V() + (aVar.V() - V));
                    }
                    aVar.s0();
                    aVar.E0();
                    i11 = i13;
                    i13 = i12;
                } catch (Throwable th2) {
                    if (iVar.h() || aVar.n()) {
                        aVar.flush();
                    }
                    if (aVar != this) {
                        x0(V() + (aVar.V() - V));
                    }
                    aVar.s0();
                    aVar.E0();
                    throw th2;
                }
            }
            if (i13 != 0) {
                return i11;
            }
            return -1;
        }
        throw new IllegalArgumentException("min should be positive".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x014a, code lost:
        if (r10 != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a8 A[Catch: all -> 0x02d5, TryCatch #10 {all -> 0x02d5, blocks: (B:111:0x028b, B:112:0x0291, B:115:0x02a8, B:118:0x02ba, B:129:0x02ea, B:130:0x02f0), top: B:226:0x028b }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0319 A[Catch: all -> 0x03ee, TryCatch #7 {all -> 0x03ee, blocks: (B:136:0x0313, B:138:0x0319, B:140:0x031f, B:142:0x0324, B:143:0x0331), top: B:220:0x0313 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0324 A[Catch: all -> 0x03ee, TryCatch #7 {all -> 0x03ee, blocks: (B:136:0x0313, B:138:0x0319, B:140:0x031f, B:142:0x0324, B:143:0x0331), top: B:220:0x0313 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x033c A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #5 {all -> 0x0088, blocks: (B:14:0x004b, B:19:0x0082, B:48:0x013b, B:50:0x0141, B:53:0x0146, B:56:0x014d, B:59:0x0155, B:146:0x033c, B:149:0x0344, B:151:0x0350, B:152:0x0355, B:155:0x035d, B:157:0x0366, B:161:0x0398, B:164:0x03a2, B:168:0x03ab, B:174:0x03c0, B:176:0x03c4, B:190:0x0411, B:192:0x0417, B:194:0x041d, B:196:0x0422, B:197:0x042f, B:198:0x0435, B:200:0x0438, B:201:0x043b), top: B:217:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x035d A[Catch: all -> 0x0088, TryCatch #5 {all -> 0x0088, blocks: (B:14:0x004b, B:19:0x0082, B:48:0x013b, B:50:0x0141, B:53:0x0146, B:56:0x014d, B:59:0x0155, B:146:0x033c, B:149:0x0344, B:151:0x0350, B:152:0x0355, B:155:0x035d, B:157:0x0366, B:161:0x0398, B:164:0x03a2, B:168:0x03ab, B:174:0x03c0, B:176:0x03c4, B:190:0x0411, B:192:0x0417, B:194:0x041d, B:196:0x0422, B:197:0x042f, B:198:0x0435, B:200:0x0438, B:201:0x043b), top: B:217:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03c4 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #5 {all -> 0x0088, blocks: (B:14:0x004b, B:19:0x0082, B:48:0x013b, B:50:0x0141, B:53:0x0146, B:56:0x014d, B:59:0x0155, B:146:0x033c, B:149:0x0344, B:151:0x0350, B:152:0x0355, B:155:0x035d, B:157:0x0366, B:161:0x0398, B:164:0x03a2, B:168:0x03ab, B:174:0x03c0, B:176:0x03c4, B:190:0x0411, B:192:0x0417, B:194:0x041d, B:196:0x0422, B:197:0x042f, B:198:0x0435, B:200:0x0438, B:201:0x043b), top: B:217:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0417 A[Catch: all -> 0x0088, TryCatch #5 {all -> 0x0088, blocks: (B:14:0x004b, B:19:0x0082, B:48:0x013b, B:50:0x0141, B:53:0x0146, B:56:0x014d, B:59:0x0155, B:146:0x033c, B:149:0x0344, B:151:0x0350, B:152:0x0355, B:155:0x035d, B:157:0x0366, B:161:0x0398, B:164:0x03a2, B:168:0x03ab, B:174:0x03c0, B:176:0x03c4, B:190:0x0411, B:192:0x0417, B:194:0x041d, B:196:0x0422, B:197:0x042f, B:198:0x0435, B:200:0x0438, B:201:0x043b), top: B:217:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0422 A[Catch: all -> 0x0088, TryCatch #5 {all -> 0x0088, blocks: (B:14:0x004b, B:19:0x0082, B:48:0x013b, B:50:0x0141, B:53:0x0146, B:56:0x014d, B:59:0x0155, B:146:0x033c, B:149:0x0344, B:151:0x0350, B:152:0x0355, B:155:0x035d, B:157:0x0366, B:161:0x0398, B:164:0x03a2, B:168:0x03ab, B:174:0x03c0, B:176:0x03c4, B:190:0x0411, B:192:0x0417, B:194:0x041d, B:196:0x0422, B:197:0x042f, B:198:0x0435, B:200:0x0438, B:201:0x043b), top: B:217:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0438 A[Catch: all -> 0x0088, TryCatch #5 {all -> 0x0088, blocks: (B:14:0x004b, B:19:0x0082, B:48:0x013b, B:50:0x0141, B:53:0x0146, B:56:0x014d, B:59:0x0155, B:146:0x033c, B:149:0x0344, B:151:0x0350, B:152:0x0355, B:155:0x035d, B:157:0x0366, B:161:0x0398, B:164:0x03a2, B:168:0x03ab, B:174:0x03c0, B:176:0x03c4, B:190:0x0411, B:192:0x0417, B:194:0x041d, B:196:0x0422, B:197:0x042f, B:198:0x0435, B:200:0x0438, B:201:0x043b), top: B:217:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141 A[Catch: all -> 0x0088, TryCatch #5 {all -> 0x0088, blocks: (B:14:0x004b, B:19:0x0082, B:48:0x013b, B:50:0x0141, B:53:0x0146, B:56:0x014d, B:59:0x0155, B:146:0x033c, B:149:0x0344, B:151:0x0350, B:152:0x0355, B:155:0x035d, B:157:0x0366, B:161:0x0398, B:164:0x03a2, B:168:0x03ab, B:174:0x03c0, B:176:0x03c4, B:190:0x0411, B:192:0x0417, B:194:0x041d, B:196:0x0422, B:197:0x042f, B:198:0x0435, B:200:0x0438, B:201:0x043b), top: B:217:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176 A[Catch: all -> 0x03f1, TryCatch #9 {all -> 0x03f1, blocks: (B:63:0x0170, B:65:0x0176, B:67:0x017a), top: B:224:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c5 A[Catch: all -> 0x01d6, TRY_LEAVE, TryCatch #11 {all -> 0x01d6, blocks: (B:77:0x01ba, B:81:0x01c5), top: B:228:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0229 A[Catch: all -> 0x02f1, TRY_LEAVE, TryCatch #8 {all -> 0x02f1, blocks: (B:90:0x0208, B:93:0x0229), top: B:222:0x0208 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x02bd -> B:224:0x0170). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0350 -> B:179:0x03ea). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x03c2 -> B:179:0x03ea). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x03e7 -> B:179:0x03ea). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(io.ktor.utils.io.a r27, long r28, io.ktor.utils.io.internal.d r30, xb.d<? super java.lang.Long> r31) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.L(io.ktor.utils.io.a, long, io.ktor.utils.io.internal.d, xb.d):java.lang.Object");
    }

    public Object L0(byte[] bArr, int i10, int i11, xb.d<? super Integer> dVar) {
        return M0(this, bArr, i10, i11, dVar);
    }

    public final io.ktor.utils.io.internal.g M() {
        return T();
    }

    public ob.p Q() {
        return this.f12793f;
    }

    public final int S() {
        return this.f12790c;
    }

    public long U() {
        return this.totalBytesRead;
    }

    public long V() {
        return this.totalBytesWritten;
    }

    public ob.p W() {
        return this.f12794g;
    }

    public boolean Y() {
        return P() != null;
    }

    @Override // io.ktor.utils.io.k
    public boolean a(Throwable th2) {
        io.ktor.utils.io.internal.d dVar;
        if (P() != null) {
            return false;
        }
        io.ktor.utils.io.internal.c a10 = th2 == null ? io.ktor.utils.io.internal.c.Companion.a() : new io.ktor.utils.io.internal.c(th2);
        T().f12890b.e();
        if (!androidx.concurrent.futures.b.a(f12785n, this, null, a10)) {
            return false;
        }
        T().f12890b.e();
        if (T().f12890b.g() || th2 != null) {
            E0();
        }
        t0(th2);
        if (T() == g.f.f12901c && (dVar = this.joining) != null) {
            N(dVar);
        }
        if (th2 == null) {
            this.f12798k.e(new io.ktor.utils.io.o("Byte channel was closed"));
            this.f12797j.d(Boolean.valueOf(T().f12890b.e()));
            return true;
        }
        a2 a2Var = this.attachedJob;
        if (a2Var != null) {
            a2.a.a(a2Var, null, 1, null);
        }
        this.f12797j.e(th2);
        this.f12798k.e(th2);
        return true;
    }

    @Override // io.ktor.utils.io.k
    public Object b(f0 f0Var, xb.d<? super e0> dVar) {
        return O0(this, f0Var, dVar);
    }

    @Override // io.ktor.utils.io.k
    public Object c(ByteBuffer byteBuffer, xb.d<? super e0> dVar) {
        return N0(this, byteBuffer, dVar);
    }

    @Override // io.ktor.utils.io.c
    public void d(a2 a2Var) {
        hc.t.e(a2Var, "job");
        a2 a2Var2 = this.attachedJob;
        if (a2Var2 != null) {
            a2.a.a(a2Var2, null, 1, null);
        }
        this.attachedJob = a2Var;
        a2.a.d(a2Var, true, false, new b(), 2, null);
    }

    @Override // io.ktor.utils.io.k
    public Object e(byte[] bArr, int i10, int i11, xb.d<? super e0> dVar) {
        return P0(this, bArr, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.k
    public Object f(int i10, gc.l<? super ByteBuffer, e0> lVar, xb.d<? super e0> dVar) {
        return G0(this, i10, lVar, dVar);
    }

    @Override // io.ktor.utils.io.k
    public void flush() {
        O(1);
    }

    @Override // io.ktor.utils.io.h
    public boolean g(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel has been cancelled");
        }
        return a(th2);
    }

    @Override // io.ktor.utils.io.h
    public Object h(f0 f0Var, xb.d<? super Integer> dVar) {
        return e0(this, f0Var, dVar);
    }

    @Override // io.ktor.utils.io.h
    public Object i(byte[] bArr, int i10, int i11, xb.d<? super Integer> dVar) {
        return f0(this, bArr, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.h
    public Throwable j() {
        io.ktor.utils.io.internal.c P = P();
        if (P == null) {
            return null;
        }
        return P.b();
    }

    @Override // io.ktor.utils.io.h
    public int k() {
        return T().f12890b._availableForRead$internal;
    }

    @Override // io.ktor.utils.io.h
    public Object l(long j10, int i10, xb.d<? super ob.u> dVar) {
        return i0(this, j10, i10, dVar);
    }

    @Override // io.ktor.utils.io.h
    public boolean m() {
        return T() == g.f.f12901c && P() != null;
    }

    @Override // io.ktor.utils.io.k
    public boolean n() {
        return this.f12788a;
    }

    public final a p0() {
        a q02;
        io.ktor.utils.io.internal.d dVar = this.joining;
        return (dVar == null || (q02 = q0(this, dVar)) == null) ? this : q02;
    }

    public final void s0() {
        Object obj;
        io.ktor.utils.io.internal.g f10;
        g.b bVar;
        g.b bVar2 = null;
        do {
            obj = this._state;
            f10 = ((io.ktor.utils.io.internal.g) obj).f();
            if ((f10 instanceof g.b) && f10.f12890b.g()) {
                f10 = g.a.f12891c;
                bVar2 = f10;
            }
        } while (!androidx.concurrent.futures.b.a(f12784m, this, obj, f10));
        if (f10 != g.a.f12891c || (bVar = bVar2) == null) {
            return;
        }
        n0(bVar.g());
    }

    public String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + T() + ')';
    }

    public void w0(long j10) {
        this.totalBytesRead = j10;
    }

    public void x0(long j10) {
        this.totalBytesWritten = j10;
    }

    public final ByteBuffer z0() {
        Object obj;
        io.ktor.utils.io.internal.g gVar;
        g.a aVar;
        io.ktor.utils.io.internal.g gVar2;
        xb.d<e0> X = X();
        if (X == null) {
            io.ktor.utils.io.internal.g gVar3 = null;
            g.c cVar = null;
            do {
                obj = this._state;
                gVar = (io.ktor.utils.io.internal.g) obj;
                if (this.joining != null) {
                    if (cVar != null) {
                        n0(cVar);
                    }
                    return null;
                } else if (P() != null) {
                    if (cVar != null) {
                        n0(cVar);
                    }
                    io.ktor.utils.io.internal.c P = P();
                    hc.t.b(P);
                    io.ktor.utils.io.b.b(P.c());
                    throw new tb.i();
                } else {
                    aVar = g.a.f12891c;
                    if (gVar == aVar) {
                        if (cVar == null) {
                            cVar = Z();
                        }
                        gVar2 = cVar.d();
                    } else if (gVar == g.f.f12901c) {
                        if (cVar != null) {
                            n0(cVar);
                        }
                        if (this.joining != null) {
                            return null;
                        }
                        io.ktor.utils.io.internal.c P2 = P();
                        hc.t.b(P2);
                        io.ktor.utils.io.b.b(P2.c());
                        throw new tb.i();
                    } else {
                        gVar2 = gVar.d();
                    }
                }
            } while (!androidx.concurrent.futures.b.a(f12784m, this, obj, gVar2));
            if (P() != null) {
                s0();
                E0();
                io.ktor.utils.io.internal.c P3 = P();
                hc.t.b(P3);
                io.ktor.utils.io.b.b(P3.c());
                throw new tb.i();
            }
            ByteBuffer b10 = gVar2.b();
            if (cVar != null) {
                if (gVar == null) {
                    hc.t.s("old");
                } else {
                    gVar3 = gVar;
                }
                if (gVar3 != aVar) {
                    n0(cVar);
                }
            }
            a0(b10, W(), this.f12792e, gVar2.f12890b._availableForWrite$internal);
            return b10;
        }
        throw new IllegalStateException(hc.t.l("Write operation is already in progress: ", X));
    }
}
