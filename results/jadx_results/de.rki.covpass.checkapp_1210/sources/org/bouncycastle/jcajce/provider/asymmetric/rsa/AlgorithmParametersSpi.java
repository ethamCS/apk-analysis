package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import gg.r1;
import gg.t1;
import gg.v;
import gg.w;
import hh.b;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Objects;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import ni.d;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import zg.q;
import zg.u;
import zg.x;
/* loaded from: classes3.dex */
public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* loaded from: classes3.dex */
    public static class OAEP extends AlgorithmParametersSpi {
        OAEPParameterSpec currentSpec;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            v oid = DigestFactory.getOID(this.currentSpec.getDigestAlgorithm());
            r1 r1Var = r1.f10880d;
            try {
                return new u(new b(oid, r1Var), new b(q.f26806g1, new b(DigestFactory.getOID(((MGF1ParameterSpec) this.currentSpec.getMGFParameters()).getDigestAlgorithm()), r1Var)), new b(q.f26809h1, new t1(((PSource.PSpecified) this.currentSpec.getPSource()).getValue()))).k("DER");
            } catch (IOException unused) {
                throw new RuntimeException("Error encoding OAEPParameters");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof OAEPParameterSpec) {
                this.currentSpec = (OAEPParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            try {
                u m10 = u.m(bArr);
                if (m10.n().l().s(q.f26806g1)) {
                    this.currentSpec = new OAEPParameterSpec(d.a(m10.l().l()), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(d.a(b.n(m10.n().o()).l())), new PSource.PSpecified(w.E(m10.o().o()).F()));
                    return;
                }
                throw new IOException("unknown mask generation function: " + m10.n().l());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            } catch (ClassCastException unused2) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameter format " + str);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "OAEP Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.currentSpec;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
        }
    }

    /* loaded from: classes3.dex */
    public static class PSS extends AlgorithmParametersSpi {
        PSSParameterSpec currentSpec;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            PSSParameterSpec pSSParameterSpec = this.currentSpec;
            v oid = DigestFactory.getOID(pSSParameterSpec.getDigestAlgorithm());
            r1 r1Var = r1.f10880d;
            b bVar = new b(oid, r1Var);
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (mGF1ParameterSpec != null) {
                return new x(bVar, new b(q.f26806g1, new b(DigestFactory.getOID(mGF1ParameterSpec.getDigestAlgorithm()), r1Var)), new gg.q(pSSParameterSpec.getSaltLength()), new gg.q(pSSParameterSpec.getTrailerField())).k("DER");
            }
            return new x(bVar, new b(pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128") ? ug.b.f23655m : ug.b.f23657n), new gg.q(pSSParameterSpec.getSaltLength()), new gg.q(pSSParameterSpec.getTrailerField())).k("DER");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof PSSParameterSpec) {
                this.currentSpec = (PSSParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            try {
                x m10 = x.m(bArr);
                v l10 = m10.n().l();
                if (l10.s(q.f26806g1)) {
                    this.currentSpec = new PSSParameterSpec(d.a(m10.l().l()), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(d.a(b.n(m10.n().o()).l())), m10.o().intValue(), m10.q().intValue());
                    return;
                }
                v vVar = ug.b.f23655m;
                if (!l10.s(vVar) && !l10.s(ug.b.f23657n)) {
                    throw new IOException("unknown mask generation function: " + m10.n().l());
                }
                this.currentSpec = new PSSParameterSpec(d.a(m10.l().l()), l10.s(vVar) ? "SHAKE128" : "SHAKE256", null, m10.o().intValue(), m10.q().intValue());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            } catch (ClassCastException unused2) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) {
            if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameter format " + str);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "PSS Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == PSSParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.currentSpec;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        Objects.requireNonNull(cls, "argument to getParameterSpec must not be null");
        return localEngineGetParameterSpec(cls);
    }

    protected boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls);
}
