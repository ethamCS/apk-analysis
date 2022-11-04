package hh;

import gg.x1;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
/* loaded from: classes3.dex */
public class x0 extends gg.t {

    /* renamed from: c */
    private Hashtable f12134c = new Hashtable();

    /* renamed from: d */
    private Vector f12135d = new Vector();

    /* renamed from: q */
    public static final gg.v f12125q = new gg.v("2.5.29.9");

    /* renamed from: x */
    public static final gg.v f12132x = new gg.v("2.5.29.14");

    /* renamed from: y */
    public static final gg.v f12133y = new gg.v("2.5.29.15");
    public static final gg.v U3 = new gg.v("2.5.29.16");
    public static final gg.v V3 = new gg.v("2.5.29.17");
    public static final gg.v W3 = new gg.v("2.5.29.18");
    public static final gg.v X3 = new gg.v("2.5.29.19");
    public static final gg.v Y3 = new gg.v("2.5.29.20");
    public static final gg.v Z3 = new gg.v("2.5.29.21");

    /* renamed from: a4 */
    public static final gg.v f12109a4 = new gg.v("2.5.29.23");

    /* renamed from: b4 */
    public static final gg.v f12110b4 = new gg.v("2.5.29.24");

    /* renamed from: c4 */
    public static final gg.v f12111c4 = new gg.v("2.5.29.27");

    /* renamed from: d4 */
    public static final gg.v f12112d4 = new gg.v("2.5.29.28");

    /* renamed from: e4 */
    public static final gg.v f12113e4 = new gg.v("2.5.29.29");

    /* renamed from: f4 */
    public static final gg.v f12114f4 = new gg.v("2.5.29.30");

    /* renamed from: g4 */
    public static final gg.v f12115g4 = new gg.v("2.5.29.31");

    /* renamed from: h4 */
    public static final gg.v f12116h4 = new gg.v("2.5.29.32");

    /* renamed from: i4 */
    public static final gg.v f12117i4 = new gg.v("2.5.29.33");

    /* renamed from: j4 */
    public static final gg.v f12118j4 = new gg.v("2.5.29.35");

    /* renamed from: k4 */
    public static final gg.v f12119k4 = new gg.v("2.5.29.36");

    /* renamed from: l4 */
    public static final gg.v f12120l4 = new gg.v("2.5.29.37");

    /* renamed from: m4 */
    public static final gg.v f12121m4 = new gg.v("2.5.29.46");

    /* renamed from: n4 */
    public static final gg.v f12122n4 = new gg.v("2.5.29.54");

    /* renamed from: o4 */
    public static final gg.v f12123o4 = new gg.v("1.3.6.1.5.5.7.1.1");

    /* renamed from: p4 */
    public static final gg.v f12124p4 = new gg.v("1.3.6.1.5.5.7.1.11");

    /* renamed from: q4 */
    public static final gg.v f12126q4 = new gg.v("1.3.6.1.5.5.7.1.12");

    /* renamed from: r4 */
    public static final gg.v f12127r4 = new gg.v("1.3.6.1.5.5.7.1.2");

    /* renamed from: s4 */
    public static final gg.v f12128s4 = new gg.v("1.3.6.1.5.5.7.1.3");

    /* renamed from: t4 */
    public static final gg.v f12129t4 = new gg.v("1.3.6.1.5.5.7.1.4");

    /* renamed from: u4 */
    public static final gg.v f12130u4 = new gg.v("2.5.29.56");

    /* renamed from: v4 */
    public static final gg.v f12131v4 = new gg.v("2.5.29.55");

    public x0(gg.d0 d0Var) {
        Enumeration H = d0Var.H();
        while (H.hasMoreElements()) {
            gg.d0 F = gg.d0.F(H.nextElement());
            if (F.size() == 3) {
                this.f12134c.put(F.G(0), new w0(gg.e.E(F.G(1)), gg.w.E(F.G(2))));
            } else if (F.size() != 2) {
                throw new IllegalArgumentException("Bad sequence size: " + F.size());
            } else {
                this.f12134c.put(F.G(0), new w0(false, gg.w.E(F.G(1))));
            }
            this.f12135d.addElement(F.G(0));
        }
    }

    public static x0 l(Object obj) {
        if (obj == null || (obj instanceof x0)) {
            return (x0) obj;
        }
        if (obj instanceof gg.d0) {
            return new x0((gg.d0) obj);
        }
        if (obj instanceof v) {
            return new x0((gg.d0) ((v) obj).b());
        }
        if (obj instanceof gg.j0) {
            return l(((gg.j0) obj).O());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        gg.h hVar = new gg.h(this.f12135d.size());
        Enumeration elements = this.f12135d.elements();
        while (elements.hasMoreElements()) {
            gg.h hVar2 = new gg.h(3);
            gg.v vVar = (gg.v) elements.nextElement();
            w0 w0Var = (w0) this.f12134c.get(vVar);
            hVar2.a(vVar);
            if (w0Var.c()) {
                hVar2.a(gg.e.f10801x);
            }
            hVar2.a(w0Var.b());
            hVar.a(new x1(hVar2));
        }
        return new x1(hVar);
    }
}
