package u6;
/* loaded from: classes.dex */
public final class m extends c {
    @Override // u6.c
    int c(char c10, StringBuilder sb2) {
        int i10;
        int i11;
        char c11;
        if (c10 == ' ') {
            c11 = 3;
        } else {
            if (c10 >= '0' && c10 <= '9') {
                i11 = (c10 - '0') + 4;
            } else if (c10 < 'a' || c10 > 'z') {
                if (c10 < ' ') {
                    sb2.append((char) 0);
                } else {
                    if (c10 <= '/') {
                        sb2.append((char) 1);
                        i10 = c10 - '!';
                    } else if (c10 <= '@') {
                        sb2.append((char) 1);
                        i10 = (c10 - ':') + 15;
                    } else if (c10 >= '[' && c10 <= '_') {
                        sb2.append((char) 1);
                        i10 = (c10 - '[') + 22;
                    } else if (c10 == '`') {
                        sb2.append((char) 2);
                        i10 = c10 - '`';
                    } else if (c10 <= 'Z') {
                        sb2.append((char) 2);
                        i10 = (c10 - 'A') + 1;
                    } else if (c10 > 127) {
                        sb2.append("\u0001\u001e");
                        return c((char) (c10 - 128), sb2) + 2;
                    } else {
                        sb2.append((char) 2);
                        i10 = (c10 - '{') + 27;
                    }
                    c10 = (char) i10;
                }
                sb2.append(c10);
                return 2;
            } else {
                i11 = (c10 - 'a') + 14;
            }
            c11 = (char) i11;
        }
        sb2.append(c11);
        return 1;
    }

    @Override // u6.c
    public int e() {
        return 2;
    }
}
