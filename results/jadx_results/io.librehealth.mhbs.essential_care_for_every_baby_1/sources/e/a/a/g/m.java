package e.a.a.g;

import android.os.Build;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public class m {
    public static String a(String str) {
        try {
            String replaceAll = str.replaceAll("\\W+", "");
            byte[] bArr = new byte[0];
            if (Build.VERSION.SDK_INT >= 19) {
                bArr = replaceAll.getBytes(StandardCharsets.UTF_8);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return String.format("%032x", new BigInteger(1, messageDigest.digest()));
        } catch (Exception unused) {
            return str;
        }
    }

    public static String b(String str, String str2) {
        return c(str).booleanValue() ? str2 : str;
    }

    public static Boolean c(String str) {
        return Boolean.valueOf(str == null || str.trim().isEmpty());
    }
}
