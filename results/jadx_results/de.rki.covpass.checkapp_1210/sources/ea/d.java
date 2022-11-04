package ea;
/* loaded from: classes.dex */
public class d {
    public static ka.b a(ja.b bVar, ja.b bVar2, ka.b bVar3) {
        if (bVar3 == null) {
            bVar3 = new ka.b();
        }
        double d10 = bVar.f14234d;
        double d11 = bVar2.f14235q;
        double d12 = bVar.f14235q;
        double d13 = bVar2.f14234d;
        double d14 = (d10 * d11) - (d12 * d13);
        bVar3.f10622c = d14;
        double d15 = bVar2.f14233c;
        double d16 = bVar.f14233c;
        double d17 = (d12 * d15) - (d11 * d16);
        bVar3.f10623d = d17;
        double d18 = (d16 * d13) - (d10 * d15);
        if (d18 == 0.0d) {
            return null;
        }
        bVar3.f10622c = d14 / d18;
        bVar3.f10623d = d17 / d18;
        return bVar3;
    }

    public static ka.b b(ja.e eVar, ja.e eVar2, ka.b bVar) {
        ja.e eVar3;
        ka.b bVar2;
        ka.b bVar3 = eVar.f14241d;
        double d10 = bVar3.f10622c;
        ka.b bVar4 = eVar.f14240c;
        double d11 = bVar4.f10622c;
        double d12 = d10 - d11;
        double d13 = bVar3.f10623d;
        double d14 = bVar4.f10623d;
        double d15 = d13 - d14;
        ka.b bVar5 = eVar2.f14241d;
        double d16 = bVar5.f10622c;
        ka.b bVar6 = eVar2.f14240c;
        double d17 = bVar6.f10622c;
        double d18 = d16 - d17;
        double d19 = bVar5.f10623d;
        double d20 = bVar6.f10623d;
        double d21 = d19 - d20;
        double d22 = ((d17 - d11) * d15) + ((d14 - d20) * d12);
        double d23 = d12 * d21;
        double d24 = d15 * d18;
        double d25 = d23 - d24;
        if (d25 == 0.0d) {
            return null;
        }
        double d26 = d22 / d25;
        if (d26 >= 0.0d && d26 <= 1.0d) {
            double d27 = (((d11 - d17) * d21) + ((d20 - d14) * d18)) / (d24 - d23);
            if (d27 >= 0.0d && d27 <= 1.0d) {
                if (bVar == null) {
                    bVar2 = new ka.b();
                    eVar3 = eVar2;
                } else {
                    eVar3 = eVar2;
                    bVar2 = bVar;
                }
                ka.b bVar7 = eVar3.f14240c;
                bVar2.i(bVar7.f10622c + (d18 * d26), bVar7.f10623d + (d21 * d26));
                return bVar2;
            }
        }
        return null;
    }

    public static ka.b c(ka.b bVar, ka.b bVar2, ka.b bVar3, ka.b bVar4, ka.b bVar5) {
        ka.b bVar6 = bVar5 == null ? new ka.b() : bVar5;
        double d10 = bVar2.f10622c;
        double d11 = bVar.f10622c;
        double d12 = d10 - d11;
        double d13 = bVar2.f10623d;
        double d14 = bVar.f10623d;
        double d15 = d13 - d14;
        double d16 = bVar4.f10622c;
        double d17 = bVar3.f10622c;
        double d18 = d16 - d17;
        ka.b bVar7 = bVar6;
        double d19 = bVar4.f10623d;
        double d20 = bVar3.f10623d;
        double d21 = d19 - d20;
        double d22 = ((d17 - d11) * d15) + ((d14 - d20) * d12);
        double d23 = (d12 * d21) - (d15 * d18);
        if (d23 == 0.0d) {
            return null;
        }
        double d24 = d22 / d23;
        bVar7.f10622c = d17 + (d18 * d24);
        bVar7.f10623d = d20 + (d24 * d21);
        return bVar7;
    }
}
