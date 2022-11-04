package org.bouncycastle.jcajce.provider.asymmetric.dh;

import ak.g;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import mi.b;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import sh.d;
import zh.e;
import zh.i;
import zh.j;
import zh.k;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    e param;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();
    d engine = new d();
    int strength = 2048;
    SecureRandom random = l.b();
    boolean initialised = false;

    public KeyPairGeneratorSpi() {
        super("DH");
    }

    private e convertParams(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        return dHParameterSpec instanceof b ? new e(secureRandom, ((b) dHParameterSpec).a()) : new e(secureRandom, new i(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        e convertParams;
        if (!this.initialised) {
            Integer e10 = g.e(this.strength);
            if (params.containsKey(e10)) {
                convertParams = (e) params.get(e10);
            } else {
                DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.strength);
                if (dHDefaultParameters != null) {
                    convertParams = convertParams(this.random, dHDefaultParameters);
                } else {
                    synchronized (lock) {
                        if (params.containsKey(e10)) {
                            this.param = (e) params.get(e10);
                        } else {
                            sh.g gVar = new sh.g();
                            int i10 = this.strength;
                            gVar.b(i10, PrimeCertaintyCalculator.getDefaultCertainty(i10), this.random);
                            e eVar = new e(this.random, gVar.a());
                            this.param = eVar;
                            params.put(e10, eVar);
                        }
                    }
                    this.engine.b(this.param);
                    this.initialised = true;
                }
            }
            this.param = convertParams;
            this.engine.b(this.param);
            this.initialised = true;
        }
        org.bouncycastle.crypto.b a10 = this.engine.a();
        return new KeyPair(new BCDHPublicKey((k) a10.b()), new BCDHPrivateKey((j) a10.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        this.strength = i10;
        this.random = secureRandom;
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            try {
                e convertParams = convertParams(secureRandom, (DHParameterSpec) algorithmParameterSpec);
                this.param = convertParams;
                this.engine.b(convertParams);
                this.initialised = true;
                return;
            } catch (IllegalArgumentException e10) {
                throw new InvalidAlgorithmParameterException(e10.getMessage(), e10);
            }
        }
        throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
    }
}
