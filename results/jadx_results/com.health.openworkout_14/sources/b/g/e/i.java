package b.g.e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import b.g.d.c.c;
import b.g.i.b;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class i extends j {
    @Override // b.g.e.j
    public Typeface b(Context context, c.b bVar, Resources resources, int i) {
        c.C0042c[] a2 = bVar.a();
        int length = a2.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            c.C0042c c0042c = a2[i3];
            try {
                Font.Builder weight = new Font.Builder(resources, c0042c.b()).setWeight(c0042c.e());
                if (!c0042c.f()) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(c0042c.c()).setFontVariationSettings(c0042c.d()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = (i & 1) != 0 ? 700 : 400;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
    }

    @Override // b.g.e.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        int length = fVarArr.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            b.f fVar = fVarArr[i3];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(fVar.c(), "r", cancellationSignal);
            } catch (IOException unused) {
            }
            if (openFileDescriptor != null) {
                Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(fVar.d());
                if (!fVar.e()) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(fVar.b()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
                if (openFileDescriptor == null) {
                    i3++;
                }
            } else if (openFileDescriptor == null) {
                i3++;
            }
            openFileDescriptor.close();
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = (i & 1) != 0 ? 700 : 400;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
    }

    @Override // b.g.e.j
    public Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // b.g.e.j
    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // b.g.e.j
    public b.f h(b.f[] fVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
