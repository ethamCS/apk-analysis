package org.bouncycastle.jcajce.provider.util;

import gg.v;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
/* loaded from: classes3.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    protected void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, v vVar) {
        configurableProvider.addAlgorithm("Signature." + str, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + vVar, str);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + vVar, str);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        addSignatureAlgorithm(configurableProvider, str, str2, str3, null);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, v vVar) {
        String str4 = str + "WITH" + str2;
        String str5 = str + "with" + str2;
        String str6 = str + "With" + str2;
        configurableProvider.addAlgorithm("Signature." + str4, str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + str5, str4);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + str6, str4);
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + (str + "/" + str2), str4);
        if (vVar != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + vVar, str4);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + vVar, str4);
        }
    }

    public void registerOid(ConfigurableProvider configurableProvider, v vVar, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + vVar, str);
        configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + vVar, str);
        configurableProvider.addKeyInfoConverter(vVar, asymmetricKeyInfoConverter);
    }

    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, v vVar, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + vVar, str);
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + vVar, str);
    }

    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, v vVar, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + vVar, str);
    }
}
