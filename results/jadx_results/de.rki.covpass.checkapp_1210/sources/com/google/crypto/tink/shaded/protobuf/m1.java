package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public final class m1 {

    /* loaded from: classes.dex */
    public class a implements b {

        /* renamed from: a */
        final /* synthetic */ i f7955a;

        a(i iVar) {
            this.f7955a = iVar;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.m1.b
        public byte a(int i10) {
            return this.f7955a.c(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.m1.b
        public int size() {
            return this.f7955a.size();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        byte a(int i10);

        int size();
    }

    public static String a(i iVar) {
        return b(new a(iVar));
    }

    static String b(b bVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            int a10 = bVar.a(i10);
            if (a10 == 34) {
                str = "\\\"";
            } else if (a10 == 39) {
                str = "\\'";
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a10 < 32 || a10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a10 >>> 6) & 3) + 48));
                            sb2.append((char) (((a10 >>> 3) & 7) + 48));
                            a10 = (a10 & 7) + 48;
                        }
                        sb2.append((char) a10);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static String c(String str) {
        return a(i.n(str));
    }
}
