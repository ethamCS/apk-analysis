package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import io.flutter.embedding.engine.i.d;
import java.util.ArrayDeque;
import java.util.Deque;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final io.flutter.embedding.engine.i.d f851a;

    /* renamed from: b */
    private int f852b;

    /* renamed from: c */
    private C0045a f853c;

    /* renamed from: io.flutter.embedding.android.a$a */
    /* loaded from: classes.dex */
    public static class C0045a implements d.a {

        /* renamed from: a */
        final Deque<KeyEvent> f854a = new ArrayDeque();

        /* renamed from: b */
        private final View f855b;

        /* renamed from: c */
        private final io.flutter.plugin.editing.d f856c;

        public C0045a(View view, io.flutter.plugin.editing.d dVar) {
            this.f855b = view;
            this.f856c = dVar;
        }

        public KeyEvent f(KeyEvent keyEvent) {
            for (KeyEvent keyEvent2 : this.f854a) {
                if (keyEvent2 == keyEvent) {
                    return keyEvent2;
                }
            }
            return null;
        }

        private void g(KeyEvent keyEvent) {
            if (this.f856c.o().isAcceptingText() && this.f856c.p() != null && this.f856c.p().sendKeyEvent(keyEvent)) {
                h(keyEvent);
                return;
            }
            View view = this.f855b;
            if (view == null) {
                return;
            }
            view.getRootView().dispatchKeyEvent(keyEvent);
        }

        public void h(KeyEvent keyEvent) {
            this.f854a.remove(keyEvent);
        }

        @Override // io.flutter.embedding.engine.i.d.a
        public void a(KeyEvent keyEvent) {
            g(f(keyEvent));
        }

        @Override // io.flutter.embedding.engine.i.d.a
        public void b(KeyEvent keyEvent) {
            h(keyEvent);
        }

        public void e(KeyEvent keyEvent) {
            this.f854a.addLast(keyEvent);
            if (this.f854a.size() > 1000) {
                d.a.b.b("AndroidKeyProcessor", "There are " + this.f854a.size() + " keyboard events that have not yet received a response. Are responses being sent?");
            }
        }
    }

    public a(View view, io.flutter.embedding.engine.i.d dVar, io.flutter.plugin.editing.d dVar2) {
        this.f851a = dVar;
        dVar2.A(this);
        C0045a c0045a = new C0045a(view, dVar2);
        this.f853c = c0045a;
        dVar.g(c0045a);
    }

    private Character a(int i) {
        if (i == 0) {
            return null;
        }
        char c2 = (char) i;
        if ((Integer.MIN_VALUE & i) != 0) {
            int i2 = i & Integer.MAX_VALUE;
            int i3 = this.f852b;
            if (i3 != 0) {
                i2 = KeyCharacterMap.getDeadChar(i3, i2);
            }
            this.f852b = i2;
        } else {
            int i4 = this.f852b;
            if (i4 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i4, i);
                if (deadChar > 0) {
                    c2 = (char) deadChar;
                }
                this.f852b = 0;
            }
        }
        return Character.valueOf(c2);
    }

    public void b() {
        this.f851a.g(null);
    }

    public boolean c(KeyEvent keyEvent) {
        return this.f853c.f(keyEvent) != null;
    }

    public boolean d(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            if (c(keyEvent)) {
                this.f853c.h(keyEvent);
                return false;
            }
            d.b bVar = new d.b(keyEvent, a(keyEvent.getUnicodeChar()));
            this.f853c.e(keyEvent);
            io.flutter.embedding.engine.i.d dVar = this.f851a;
            if (action == 0) {
                dVar.c(bVar);
            } else {
                dVar.d(bVar);
            }
            return true;
        }
        return false;
    }
}
