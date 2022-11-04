package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import ak.g;
import ak.m;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import nh.x;
import org.bouncycastle.crypto.b;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.PSKKeyManager;
import sh.i;
import sh.j;
import zh.o;
import zh.q;
import zh.r;
import zh.s;
import zh.t;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    o param;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();
    i engine = new i();
    int strength = 2048;
    SecureRandom random = l.b();
    boolean initialised = false;

    public KeyPairGeneratorSpi() {
        super("DSA");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        j jVar;
        int i10;
        SecureRandom secureRandom;
        if (!this.initialised) {
            Integer e10 = g.e(this.strength);
            if (params.containsKey(e10)) {
                this.param = (o) params.get(e10);
            } else {
                synchronized (lock) {
                    if (params.containsKey(e10)) {
                        this.param = (o) params.get(e10);
                    } else {
                        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
                        int i11 = this.strength;
                        if (i11 == 1024) {
                            jVar = new j();
                            if (m.c("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                i10 = this.strength;
                                secureRandom = this.random;
                                jVar.k(i10, defaultCertainty, secureRandom);
                                o oVar = new o(this.random, jVar.d());
                                this.param = oVar;
                                params.put(e10, oVar);
                            } else {
                                jVar.l(new q(1024, 160, defaultCertainty, this.random));
                                o oVar2 = new o(this.random, jVar.d());
                                this.param = oVar2;
                                params.put(e10, oVar2);
                            }
                        } else if (i11 > 1024) {
                            q qVar = new q(i11, PSKKeyManager.MAX_KEY_LENGTH_BYTES, defaultCertainty, this.random);
                            jVar = new j(new x());
                            jVar.l(qVar);
                            o oVar22 = new o(this.random, jVar.d());
                            this.param = oVar22;
                            params.put(e10, oVar22);
                        } else {
                            jVar = new j();
                            i10 = this.strength;
                            secureRandom = this.random;
                            jVar.k(i10, defaultCertainty, secureRandom);
                            o oVar222 = new o(this.random, jVar.d());
                            this.param = oVar222;
                            params.put(e10, oVar222);
                        }
                    }
                }
            }
            this.engine.d(this.param);
            this.initialised = true;
        }
        b a10 = this.engine.a();
        return new KeyPair(new BCDSAPublicKey((t) a10.b()), new BCDSAPrivateKey((s) a10.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        boolean z10;
        if (i10 < 512 || i10 > 4096 || ((i10 < 1024 && i10 % 64 != 0) || (i10 >= 1024 && i10 % 1024 != 0))) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        DSAParameterSpec dSADefaultParameters = BouncyCastleProvider.CONFIGURATION.getDSADefaultParameters(i10);
        if (dSADefaultParameters != null) {
            o oVar = new o(secureRandom, new r(dSADefaultParameters.getP(), dSADefaultParameters.getQ(), dSADefaultParameters.getG()));
            this.param = oVar;
            this.engine.d(oVar);
            z10 = true;
        } else {
            this.strength = i10;
            this.random = secureRandom;
            z10 = false;
        }
        this.initialised = z10;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec instanceof DSAParameterSpec) {
            DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
            o oVar = new o(secureRandom, new r(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
            this.param = oVar;
            this.engine.d(oVar);
            this.initialised = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
    }
}
