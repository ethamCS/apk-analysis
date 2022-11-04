package io.flutter.embedding.engine.i;

import android.os.Build;
import android.view.InputDevice;
import android.view.KeyEvent;
import d.a.c.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private a f996a;

    /* renamed from: b */
    public final d.a.c.a.a<Object> f997b;

    /* loaded from: classes.dex */
    public interface a {
        void a(KeyEvent keyEvent);

        void b(KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final KeyEvent f998a;

        /* renamed from: b */
        public final Character f999b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f998a = keyEvent;
            this.f999b = ch;
        }
    }

    public d(d.a.c.a.b bVar) {
        this.f997b = new d.a.c.a.a<>(bVar, "flutter/keyevent", d.a.c.a.d.f693a);
    }

    private void b(b bVar, Map<String, Object> map) {
        int i;
        map.put("flags", Integer.valueOf(bVar.f998a.getFlags()));
        int i2 = 0;
        map.put("plainCodePoint", Integer.valueOf(bVar.f998a.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(bVar.f998a.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(bVar.f998a.getKeyCode()));
        map.put("scanCode", Integer.valueOf(bVar.f998a.getScanCode()));
        map.put("metaState", Integer.valueOf(bVar.f998a.getMetaState()));
        Character ch = bVar.f999b;
        if (ch != null) {
            map.put("character", ch.toString());
        }
        map.put("source", Integer.valueOf(bVar.f998a.getSource()));
        InputDevice device = InputDevice.getDevice(bVar.f998a.getDeviceId());
        if (device == null || Build.VERSION.SDK_INT < 19) {
            i = 0;
        } else {
            i2 = device.getVendorId();
            i = device.getProductId();
        }
        map.put("vendorId", Integer.valueOf(i2));
        map.put("productId", Integer.valueOf(i));
        map.put("deviceId", Integer.valueOf(bVar.f998a.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(bVar.f998a.getRepeatCount()));
    }

    /* renamed from: e */
    public /* synthetic */ void f(KeyEvent keyEvent, Object obj) {
        a aVar = this.f996a;
        if (aVar == null) {
            return;
        }
        try {
            if (obj == null) {
                aVar.a(keyEvent);
            } else if (((JSONObject) obj).getBoolean("handled")) {
                this.f996a.b(keyEvent);
            } else {
                this.f996a.a(keyEvent);
            }
        } catch (JSONException e2) {
            d.a.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e2);
            this.f996a.a(keyEvent);
        }
    }

    a.e<Object> a(final KeyEvent keyEvent) {
        return new a.e() { // from class: io.flutter.embedding.engine.i.a
            @Override // d.a.c.a.a.e
            public final void a(Object obj) {
                d.this.f(keyEvent, obj);
            }
        };
    }

    public void c(b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "keydown");
        hashMap.put("keymap", "android");
        b(bVar, hashMap);
        this.f997b.d(hashMap, a(bVar.f998a));
    }

    public void d(b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "keyup");
        hashMap.put("keymap", "android");
        b(bVar, hashMap);
        this.f997b.d(hashMap, a(bVar.f998a));
    }

    public void g(a aVar) {
        this.f996a = aVar;
    }
}
