package com.health.openworkout.gui.utils;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.SoundPool;
import android.speech.tts.TextToSpeech;
import java.io.IOException;
import java.util.Locale;
/* loaded from: classes.dex */
public class b {

    /* renamed from: b */
    private TextToSpeech f3491b;

    /* renamed from: d */
    private int f3493d;

    /* renamed from: e */
    private int f3494e;

    /* renamed from: f */
    private int f3495f;

    /* renamed from: g */
    private int f3496g;

    /* renamed from: h */
    private AssetManager f3497h;

    /* renamed from: a */
    private SoundPool f3490a = new SoundPool.Builder().setMaxStreams(4).build();

    /* renamed from: c */
    private boolean f3492c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextToSpeech.OnInitListener {
        a() {
            b.this = r1;
        }

        @Override // android.speech.tts.TextToSpeech.OnInitListener
        public void onInit(int i) {
            if (i == -1) {
                h.a.a.b("Can't initialize text to speech", new Object[0]);
            }
            if (i == 0) {
                b.this.f3491b.setLanguage(Locale.ENGLISH);
                b.this.f3492c = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.health.openworkout.gui.utils.b$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0095b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3499a;

        static {
            int[] iArr = new int[c.values().length];
            f3499a = iArr;
            try {
                iArr[c.WORKOUT_COUNT_BEFORE_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3499a[c.WORKOUT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3499a[c.WORKOUT_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3499a[c.SESSION_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        WORKOUT_COUNT_BEFORE_START,
        WORKOUT_START,
        WORKOUT_STOP,
        SESSION_COMPLETED
    }

    public b(Context context) {
        this.f3497h = context.getAssets();
        this.f3491b = new TextToSpeech(context, new a());
        d();
    }

    private void d() {
        try {
            AssetFileDescriptor openFd = this.f3497h.openFd("sound/workout.mp3");
            this.f3493d = this.f3490a.load(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength(), 1);
            AssetFileDescriptor openFd2 = this.f3497h.openFd("sound/workout_start.mp3");
            this.f3494e = this.f3490a.load(openFd2.getFileDescriptor(), openFd2.getStartOffset(), openFd2.getLength(), 1);
            AssetFileDescriptor openFd3 = this.f3497h.openFd("sound/workout_stop.mp3");
            this.f3495f = this.f3490a.load(openFd3.getFileDescriptor(), openFd3.getStartOffset(), openFd3.getLength(), 1);
            AssetFileDescriptor openFd4 = this.f3497h.openFd("sound/session_completed.mp3");
            this.f3496g = this.f3490a.load(openFd4.getFileDescriptor(), openFd4.getStartOffset(), openFd4.getLength(), 1);
        } catch (IOException e2) {
            h.a.a.c(e2);
        }
    }

    public void c() {
        if (this.f3492c) {
            this.f3491b.stop();
        }
    }

    public void e(c cVar) {
        int i = C0095b.f3499a[cVar.ordinal()];
        if (i == 1) {
            this.f3490a.play(this.f3493d, 1.0f, 1.0f, 1, 0, 1.0f);
        } else if (i == 2) {
            this.f3490a.play(this.f3494e, 1.0f, 1.0f, 1, 0, 1.0f);
        } else if (i == 3) {
            this.f3490a.play(this.f3495f, 1.0f, 1.0f, 1, 0, 1.0f);
        } else if (i != 4) {
        } else {
            this.f3490a.play(this.f3496g, 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    public void f(String str) {
        if (this.f3492c) {
            this.f3491b.speak(str, 1, null, "textToSpeech");
        }
    }

    public void g(String str) {
        if (!this.f3492c || this.f3491b.isSpeaking()) {
            return;
        }
        this.f3491b.speak(str, 1, null, "textToSpeech");
    }
}
