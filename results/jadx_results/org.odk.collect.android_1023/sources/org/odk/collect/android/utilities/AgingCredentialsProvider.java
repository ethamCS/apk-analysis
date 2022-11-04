package org.odk.collect.android.utilities;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.auth.AuthScope;
import org.opendatakit.httpclientandroidlib.auth.Credentials;
import org.opendatakit.httpclientandroidlib.client.CredentialsProvider;
@ThreadSafe
/* loaded from: classes.dex */
public class AgingCredentialsProvider implements CredentialsProvider {
    private final ConcurrentHashMap<AuthScope, Credentials> credMap = new ConcurrentHashMap<>();
    private final long expiryInterval;
    private long nextClearTimestamp;

    public AgingCredentialsProvider(int expiryInterval) {
        this.expiryInterval = expiryInterval;
        this.nextClearTimestamp = System.currentTimeMillis() + expiryInterval;
    }

    @Override // org.opendatakit.httpclientandroidlib.client.CredentialsProvider
    public void setCredentials(AuthScope authscope, Credentials credentials) {
        if (authscope == null) {
            throw new IllegalArgumentException("Authentication scope may not be null");
        }
        if (this.nextClearTimestamp < System.currentTimeMillis()) {
            clear();
        }
        this.nextClearTimestamp = System.currentTimeMillis() + this.expiryInterval;
        if (credentials == null) {
            this.credMap.remove(authscope);
        } else {
            this.credMap.put(authscope, credentials);
        }
    }

    private static Credentials matchCredentials(Map<AuthScope, Credentials> map, AuthScope authscope) {
        Credentials creds = map.get(authscope);
        if (creds == null) {
            int bestMatchFactor = -1;
            AuthScope bestMatch = null;
            for (AuthScope current : map.keySet()) {
                int factor = authscope.match(current);
                if (factor > bestMatchFactor) {
                    bestMatchFactor = factor;
                    bestMatch = current;
                }
            }
            if (bestMatch != null) {
                return map.get(bestMatch);
            }
            return creds;
        }
        return creds;
    }

    @Override // org.opendatakit.httpclientandroidlib.client.CredentialsProvider
    public Credentials getCredentials(AuthScope authscope) {
        if (authscope == null) {
            throw new IllegalArgumentException("Authentication scope may not be null");
        }
        if (this.nextClearTimestamp < System.currentTimeMillis()) {
            clear();
        }
        this.nextClearTimestamp = System.currentTimeMillis() + this.expiryInterval;
        Credentials c = matchCredentials(this.credMap, authscope);
        return c;
    }

    @Override // org.opendatakit.httpclientandroidlib.client.CredentialsProvider
    public void clear() {
        this.credMap.clear();
    }

    public String toString() {
        return this.credMap.toString();
    }
}
