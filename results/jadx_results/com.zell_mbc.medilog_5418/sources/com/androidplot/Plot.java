package com.androidplot;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.compose.material.TextFieldImplKt;
import com.androidplot.Series;
import com.androidplot.SeriesRegistry;
import com.androidplot.ui.Anchor;
import com.androidplot.ui.BoxModel;
import com.androidplot.ui.Formatter;
import com.androidplot.ui.HorizontalPositioning;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.Resizable;
import com.androidplot.ui.SeriesBundle;
import com.androidplot.ui.SeriesRenderer;
import com.androidplot.ui.Size;
import com.androidplot.ui.SizeMode;
import com.androidplot.ui.TextOrientation;
import com.androidplot.ui.VerticalPositioning;
import com.androidplot.ui.widget.TextLabelWidget;
import com.androidplot.util.AttrUtils;
import com.androidplot.util.DisplayDimensions;
import com.androidplot.util.PixelUtils;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class Plot<SeriesType extends Series, FormatterType extends Formatter, RendererType extends SeriesRenderer, BundleType extends SeriesBundle<SeriesType, FormatterType>, RegistryType extends SeriesRegistry<BundleType, SeriesType, FormatterType>> extends View implements Resizable {
    private static final String BASE_PACKAGE = "com.androidplot.";
    private static final int DEFAULT_TITLE_WIDGET_TEXT_SIZE_SP = 10;
    private static final String TAG = "com.androidplot.Plot";
    private static final String XML_ATTR_PREFIX = "androidplot";
    private Paint backgroundPaint;
    private Paint borderPaint;
    private float borderRadiusX;
    private float borderRadiusY;
    private BorderStyle borderStyle;
    private BoxModel boxModel;
    private DisplayDimensions displayDims;
    private boolean isIdle;
    private boolean keepRunning;
    private LayoutManager layoutManager;
    private final ArrayList<PlotListener> listeners;
    private final BufferedCanvas pingPong;
    private RegistryType registry;
    private RenderMode renderMode;
    private final Object renderSync;
    private Thread renderThread;
    private HashMap<Class<? extends RendererType>, RendererType> renderers;
    private TextLabelWidget title;

    /* loaded from: classes2.dex */
    public enum BorderStyle {
        ROUNDED,
        SQUARE,
        NONE
    }

    /* loaded from: classes2.dex */
    public enum RenderMode {
        USE_MAIN_THREAD,
        USE_BACKGROUND_THREAD
    }

    protected abstract RegistryType getRegistryInstance();

    protected boolean isHwAccelerationSupported() {
        return false;
    }

    protected void onAfterConfig() {
    }

    protected void onPreInit() {
    }

    protected abstract void processAttrs(TypedArray typedArray);

    public DisplayDimensions getDisplayDimensions() {
        return this.displayDims;
    }

    public HashMap<Class<? extends RendererType>, RendererType> getRenderers() {
        return this.renderers;
    }

    public RegistryType getRegistry() {
        return this.registry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRegistry(RegistryType registrytype) {
        this.registry = registrytype;
        for (BundleType bundletype : registrytype.getSeriesAndFormatterList()) {
            attachSeries(bundletype.getSeries(), bundletype.getFormatter());
        }
    }

    public TextLabelWidget getTitle() {
        return this.title;
    }

    public void setTitle(TextLabelWidget textLabelWidget) {
        this.title = textLabelWidget;
    }

    public void setTitle(String str) {
        getTitle().setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class BufferedCanvas {
        private volatile Bitmap bgBuffer;
        private Canvas canvas;
        private volatile Bitmap fgBuffer;
        private int lastHeight;
        private int lastWidth;

        private BufferedCanvas() {
            this.lastHeight = 0;
            this.lastWidth = 0;
            this.canvas = new Canvas();
        }

        /* synthetic */ BufferedCanvas(AnonymousClass1 anonymousClass1) {
            this();
        }

        public synchronized void swap() {
            Bitmap bitmap = this.bgBuffer;
            this.bgBuffer = this.fgBuffer;
            this.fgBuffer = bitmap;
        }

        public void resizeToLast() {
            resize(this.lastHeight, this.lastWidth);
        }

        public synchronized void resize(int i, int i2) {
            if (i2 <= 0 || i <= 0) {
                this.bgBuffer = null;
                this.fgBuffer = null;
            } else {
                this.lastHeight = i;
                this.lastWidth = i2;
                try {
                    this.bgBuffer = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                    this.fgBuffer = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                } catch (IllegalArgumentException unused) {
                    throw new IllegalArgumentException("Illegal argument passed to Bitmap.createBitmap.  width: " + i2 + " height: " + i);
                }
            }
        }

        public void recycle() {
            if (this.bgBuffer != null) {
                this.bgBuffer.recycle();
                this.bgBuffer = null;
            }
            if (this.fgBuffer != null) {
                this.fgBuffer.recycle();
                this.fgBuffer = null;
            }
            System.gc();
        }

        public synchronized Canvas getCanvas() {
            if (this.bgBuffer != null) {
                this.canvas.setBitmap(this.bgBuffer);
                return this.canvas;
            }
            return null;
        }

        public Bitmap getBitmap() {
            return this.fgBuffer;
        }
    }

    public Plot(Context context, String str) {
        this(context, str, RenderMode.USE_MAIN_THREAD);
    }

    public Plot(Context context, String str, RenderMode renderMode) {
        super(context);
        this.boxModel = new BoxModel();
        this.borderStyle = BorderStyle.NONE;
        this.borderRadiusX = 15.0f;
        this.borderRadiusY = 15.0f;
        this.displayDims = new DisplayDimensions();
        this.renderMode = RenderMode.USE_MAIN_THREAD;
        this.pingPong = new BufferedCanvas(null);
        this.renderSync = new Object();
        this.keepRunning = false;
        this.isIdle = true;
        this.listeners = new ArrayList<>();
        this.registry = getRegistryInstance();
        this.renderers = new HashMap<>();
        Paint paint = new Paint();
        this.borderPaint = paint;
        paint.setColor(Color.rgb((int) TextFieldImplKt.AnimationDuration, (int) TextFieldImplKt.AnimationDuration, (int) TextFieldImplKt.AnimationDuration));
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(1.0f);
        this.borderPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.backgroundPaint = paint2;
        paint2.setColor(-12303292);
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        this.renderMode = renderMode;
        init(context, null, 0);
        getTitle().setText(str);
    }

    public Plot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.boxModel = new BoxModel();
        this.borderStyle = BorderStyle.NONE;
        this.borderRadiusX = 15.0f;
        this.borderRadiusY = 15.0f;
        this.displayDims = new DisplayDimensions();
        this.renderMode = RenderMode.USE_MAIN_THREAD;
        this.pingPong = new BufferedCanvas(null);
        this.renderSync = new Object();
        this.keepRunning = false;
        this.isIdle = true;
        this.listeners = new ArrayList<>();
        this.registry = getRegistryInstance();
        this.renderers = new HashMap<>();
        Paint paint = new Paint();
        this.borderPaint = paint;
        paint.setColor(Color.rgb((int) TextFieldImplKt.AnimationDuration, (int) TextFieldImplKt.AnimationDuration, (int) TextFieldImplKt.AnimationDuration));
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(1.0f);
        this.borderPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.backgroundPaint = paint2;
        paint2.setColor(-12303292);
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        init(context, attributeSet, 0);
    }

    public Plot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.boxModel = new BoxModel();
        this.borderStyle = BorderStyle.NONE;
        this.borderRadiusX = 15.0f;
        this.borderRadiusY = 15.0f;
        this.displayDims = new DisplayDimensions();
        this.renderMode = RenderMode.USE_MAIN_THREAD;
        this.pingPong = new BufferedCanvas(null);
        this.renderSync = new Object();
        this.keepRunning = false;
        this.isIdle = true;
        this.listeners = new ArrayList<>();
        this.registry = getRegistryInstance();
        this.renderers = new HashMap<>();
        Paint paint = new Paint();
        this.borderPaint = paint;
        paint.setColor(Color.rgb((int) TextFieldImplKt.AnimationDuration, (int) TextFieldImplKt.AnimationDuration, (int) TextFieldImplKt.AnimationDuration));
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(1.0f);
        this.borderPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.backgroundPaint = paint2;
        paint2.setColor(-12303292);
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        init(context, attributeSet, i);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
    }

    protected final void init(Context context, AttributeSet attributeSet, int i) {
        PixelUtils.init(context);
        LayoutManager layoutManager = new LayoutManager();
        this.layoutManager = layoutManager;
        TextLabelWidget textLabelWidget = new TextLabelWidget(layoutManager, new Size(25.0f, SizeMode.ABSOLUTE, 100.0f, SizeMode.ABSOLUTE), TextOrientation.HORIZONTAL);
        this.title = textLabelWidget;
        textLabelWidget.position(0.0f, HorizontalPositioning.RELATIVE_TO_CENTER, 0.0f, VerticalPositioning.ABSOLUTE_FROM_TOP, Anchor.TOP_MIDDLE);
        this.title.getLabelPaint().setTextSize(PixelUtils.spToPix(10.0f));
        onPreInit();
        this.layoutManager.moveToTop(this.title);
        if (context != null && attributeSet != null) {
            loadAttrs(attributeSet, i);
        }
        onAfterConfig();
        this.layoutManager.onPostInit();
        if (this.renderMode == RenderMode.USE_BACKGROUND_THREAD) {
            startBackgroundRendering();
        }
    }

    protected void startBackgroundRendering() {
        if (this.renderThread != null) {
            return;
        }
        this.renderThread = new Thread(new Runnable() { // from class: com.androidplot.Plot$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Plot.this.m4439lambda$startBackgroundRendering$0$comandroidplotPlot();
            }
        }, "Androidplot renderThread");
    }

    /* renamed from: lambda$startBackgroundRendering$0$com-androidplot-Plot */
    public /* synthetic */ void m4439lambda$startBackgroundRendering$0$comandroidplotPlot() {
        PrintStream printStream = System.out;
        printStream.println("Thread started with id " + hashCode());
        this.keepRunning = true;
        while (this.keepRunning) {
            this.isIdle = false;
            synchronized (this.pingPong) {
                renderOnCanvas(this.pingPong.getCanvas());
                this.pingPong.swap();
            }
            synchronized (this.renderSync) {
                postInvalidate();
                if (this.keepRunning) {
                    try {
                        this.renderSync.wait();
                    } catch (InterruptedException unused) {
                        this.keepRunning = false;
                    }
                }
            }
        }
        PrintStream printStream2 = System.out;
        printStream2.println("Thread exited with id " + hashCode());
        this.renderThread = null;
        this.pingPong.recycle();
    }

    private void processBaseAttrs(TypedArray typedArray) {
        setMarkupEnabled(typedArray.getBoolean(R.styleable.Plot_markupEnabled, false));
        RenderMode renderMode = RenderMode.values()[typedArray.getInt(R.styleable.Plot_renderMode, getRenderMode().ordinal())];
        if (renderMode != getRenderMode()) {
            setRenderMode(renderMode);
        }
        AttrUtils.configureBoxModelable(typedArray, this.boxModel, R.styleable.Plot_marginTop, R.styleable.Plot_marginBottom, R.styleable.Plot_marginLeft, R.styleable.Plot_marginRight, R.styleable.Plot_paddingTop, R.styleable.Plot_paddingBottom, R.styleable.Plot_paddingLeft, R.styleable.Plot_paddingRight);
        getTitle().setText(typedArray.getString(R.styleable.Plot_title));
        getTitle().getLabelPaint().setTextSize(typedArray.getDimension(R.styleable.Plot_titleTextSize, PixelUtils.spToPix(10.0f)));
        getTitle().getLabelPaint().setColor(typedArray.getColor(R.styleable.Plot_titleTextColor, getTitle().getLabelPaint().getColor()));
        getBackgroundPaint().setColor(typedArray.getColor(R.styleable.Plot_backgroundColor, getBackgroundPaint().getColor()));
        AttrUtils.configureLinePaint(typedArray, getBorderPaint(), R.styleable.Plot_borderColor, R.styleable.Plot_borderThickness);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
        processBaseAttrs(r3);
        r3.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        r9 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
        if (r5 >= r8.getAttributeCount()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
        r0 = r8.getAttributeName(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (r0.toUpperCase().startsWith(com.androidplot.Plot.XML_ATTR_PREFIX.toUpperCase()) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        r9.put(r0.substring(12), r8.getAttributeValue(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
        com.halfhp.fig.Fig.configure(getContext(), r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
        throw new java.lang.RuntimeException(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: NoSuchFieldException -> 0x006d, all -> 0x0084, IllegalAccessException -> 0x008e, TRY_LEAVE, TryCatch #6 {IllegalAccessException -> 0x008e, NoSuchFieldException -> 0x006d, blocks: (B:15:0x0056, B:17:0x005c), top: B:43:0x0056, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void loadAttrs(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Plot"
            java.lang.String r1 = "Styleable definition not found for: "
            if (r8 == 0) goto Ld7
            java.lang.Class<com.androidplot.R$styleable> r2 = com.androidplot.R.styleable.class
            java.lang.Class r3 = r7.getClass()
            java.lang.String r3 = r3.getName()
            r4 = 16
            java.lang.String r3 = r3.substring(r4)
            r4 = 46
            r5 = 95
            java.lang.String r3 = r3.replace(r4, r5)
            r4 = 0
            java.lang.reflect.Field r3 = r2.getField(r3)     // Catch: java.lang.NoSuchFieldException -> L24
            goto L39
        L24:
            java.lang.String r5 = com.androidplot.Plot.TAG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            android.util.Log.d(r5, r3)
            r3 = r4
        L39:
            r5 = 0
            if (r3 == 0) goto L55
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L53 java.lang.IllegalAccessException -> L55
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L53 java.lang.IllegalAccessException -> L55
            android.content.Context r6 = r7.getContext()     // Catch: java.lang.Throwable -> L53 java.lang.IllegalAccessException -> L55
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r8, r3, r9, r5)     // Catch: java.lang.Throwable -> L53 java.lang.IllegalAccessException -> L55
            if (r3 == 0) goto L56
            r7.processAttrs(r3)
            r3.recycle()
            goto L56
        L53:
            r8 = move-exception
            throw r8
        L55:
            r3 = r4
        L56:
            java.lang.reflect.Field r2 = r2.getField(r0)     // Catch: java.lang.NoSuchFieldException -> L6d java.lang.Throwable -> L84 java.lang.IllegalAccessException -> L8e
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.NoSuchFieldException -> L6d java.lang.Throwable -> L84 java.lang.IllegalAccessException -> L8e
            int[] r2 = (int[]) r2     // Catch: java.lang.NoSuchFieldException -> L6d java.lang.Throwable -> L84 java.lang.IllegalAccessException -> L8e
            android.content.Context r4 = r7.getContext()     // Catch: java.lang.NoSuchFieldException -> L6d java.lang.Throwable -> L84 java.lang.IllegalAccessException -> L8e
            android.content.res.TypedArray r3 = r4.obtainStyledAttributes(r8, r2, r9, r5)     // Catch: java.lang.NoSuchFieldException -> L6d java.lang.Throwable -> L84 java.lang.IllegalAccessException -> L8e
        L6a:
            if (r3 == 0) goto L97
            goto L91
        L6d:
            java.lang.String r9 = com.androidplot.Plot.TAG     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r2.<init>()     // Catch: java.lang.Throwable -> L84
            r2.append(r1)     // Catch: java.lang.Throwable -> L84
            r2.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L84
            android.util.Log.d(r9, r0)     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L97
            goto L91
        L84:
            r8 = move-exception
            if (r3 == 0) goto L8d
            r7.processBaseAttrs(r3)
            r3.recycle()
        L8d:
            throw r8
        L8e:
            if (r3 == 0) goto L97
        L91:
            r7.processBaseAttrs(r3)
            r3.recycle()
        L97:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L9c:
            int r0 = r8.getAttributeCount()
            if (r5 >= r0) goto Lc8
            java.lang.String r0 = r8.getAttributeName(r5)
            if (r0 == 0) goto Lc5
            java.lang.String r1 = r0.toUpperCase()
            java.lang.String r2 = "androidplot"
            java.lang.String r2 = r2.toUpperCase()
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto Lc5
            r1 = 12
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = r8.getAttributeValue(r5)
            r9.put(r0, r1)
        Lc5:
            int r5 = r5 + 1
            goto L9c
        Lc8:
            android.content.Context r8 = r7.getContext()     // Catch: com.halfhp.fig.FigException -> Ld0
            com.halfhp.fig.Fig.configure(r8, r7, r9)     // Catch: com.halfhp.fig.FigException -> Ld0
            goto Ld7
        Ld0:
            r8 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r9.<init>(r8)
            throw r9
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidplot.Plot.loadAttrs(android.util.AttributeSet, int):void");
    }

    public RenderMode getRenderMode() {
        return this.renderMode;
    }

    public synchronized boolean addListener(PlotListener plotListener) {
        boolean z;
        if (!this.listeners.contains(plotListener)) {
            if (this.listeners.add(plotListener)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public synchronized boolean removeListener(PlotListener plotListener) {
        return this.listeners.remove(plotListener);
    }

    protected ArrayList<PlotListener> getListeners() {
        return this.listeners;
    }

    public void notifyListenersBeforeDraw(Canvas canvas) {
        Iterator<PlotListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onBeforeDraw(this, canvas);
        }
    }

    protected void notifyListenersAfterDraw(Canvas canvas) {
        Iterator<PlotListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAfterDraw(this, canvas);
        }
    }

    public synchronized boolean addSeries(FormatterType formattertype, SeriesType... seriestypeArr) {
        for (SeriesType seriestype : seriestypeArr) {
            if (!addSeries((Plot<SeriesType, FormatterType, RendererType, BundleType, RegistryType>) seriestype, (SeriesType) formattertype)) {
                return false;
            }
        }
        return true;
    }

    public synchronized boolean addSeries(SeriesType seriestype, FormatterType formattertype) {
        boolean add;
        add = getRegistry().add(seriestype, formattertype);
        attachSeries(seriestype, formattertype);
        return add;
    }

    protected void attachSeries(SeriesType seriestype, FormatterType formattertype) {
        Class<? extends RendererType> cls = (Class<? extends RendererType>) formattertype.getRendererClass();
        if (!getRenderers().containsKey(cls)) {
            getRenderers().put(cls, (RendererType) formattertype.getRendererInstance(this));
        }
        if (seriestype instanceof PlotListener) {
            addListener((PlotListener) seriestype);
        }
    }

    protected SeriesBundle<SeriesType, FormatterType> getSeries(SeriesType seriestype, Class<? extends RendererType> cls) {
        for (SeriesBundle<SeriesType, FormatterType> seriesBundle : getSeries(seriestype)) {
            if (seriesBundle.getFormatter().getRendererClass() == cls) {
                return seriesBundle;
            }
        }
        return null;
    }

    protected List<SeriesBundle<SeriesType, FormatterType>> getSeries(SeriesType seriestype) {
        return getRegistry().get(seriestype);
    }

    public synchronized boolean removeSeries(SeriesType seriestype, Class<? extends RendererType> cls) {
        if (getRegistry().remove(seriestype, cls).size() != 1 || !(seriestype instanceof PlotListener)) {
            return false;
        }
        removeListener((PlotListener) seriestype);
        return true;
    }

    public synchronized void removeSeries(SeriesType seriestype) {
        if (seriestype instanceof PlotListener) {
            removeListener((PlotListener) seriestype);
        }
        getRegistry().remove(seriestype);
    }

    public void clear() {
        for (SeriesType seriestype : getRegistry().getSeriesList()) {
            if (seriestype instanceof PlotListener) {
                removeListener((PlotListener) seriestype);
            }
        }
        getRegistry().clear();
    }

    public boolean isEmpty() {
        return getRegistry().isEmpty();
    }

    public FormatterType getFormatter(SeriesType seriestype, Class<? extends RendererType> cls) {
        return getSeries(seriestype, cls).getFormatter();
    }

    public SeriesRenderer getRenderer(Class cls) {
        return getRenderers().get(cls);
    }

    public List<RendererType> getRendererList() {
        return new ArrayList(getRenderers().values());
    }

    public void setMarkupEnabled(boolean z) {
        this.layoutManager.setMarkupEnabled(z);
    }

    public void redraw() {
        if (this.renderMode == RenderMode.USE_BACKGROUND_THREAD) {
            if (this.renderThread == null || !this.isIdle) {
                return;
            }
            synchronized (this.renderSync) {
                this.renderSync.notify();
            }
        } else if (this.renderMode == RenderMode.USE_MAIN_THREAD) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                invalidate();
            } else {
                postInvalidate();
            }
        } else {
            throw new IllegalArgumentException("Unsupported Render Mode: " + this.renderMode);
        }
    }

    @Override // com.androidplot.ui.Resizable
    public synchronized void layout(DisplayDimensions displayDimensions) {
        this.displayDims = displayDimensions;
        this.layoutManager.layout(displayDimensions);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        synchronized (this.renderSync) {
            this.keepRunning = false;
            this.renderSync.notify();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.renderMode == RenderMode.USE_BACKGROUND_THREAD && this.renderThread == null) {
            this.pingPong.resizeToLast();
            startBackgroundRendering();
            this.renderThread.start();
        }
    }

    @Override // android.view.View
    protected synchronized void onSizeChanged(int i, int i2, int i3, int i4) {
        PixelUtils.init(getContext());
        if (Build.VERSION.SDK_INT >= 11 && !isHwAccelerationSupported() && isHardwareAccelerated()) {
            setLayerType(1, null);
        }
        if (this.renderMode == RenderMode.USE_BACKGROUND_THREAD) {
            this.pingPong.resize(i2, i);
        }
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        RectF marginatedRect = this.boxModel.getMarginatedRect(rectF);
        layout(new DisplayDimensions(rectF, marginatedRect, this.boxModel.getPaddedRect(marginatedRect)));
        super.onSizeChanged(i, i2, i3, i4);
        Thread thread = this.renderThread;
        if (thread != null && !thread.isAlive()) {
            this.renderThread.start();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.renderMode == RenderMode.USE_BACKGROUND_THREAD) {
            synchronized (this.pingPong) {
                Bitmap bitmap = this.pingPong.getBitmap();
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
            }
        } else if (this.renderMode == RenderMode.USE_MAIN_THREAD) {
            renderOnCanvas(canvas);
        } else {
            throw new IllegalArgumentException("Unsupported Render Mode: " + this.renderMode);
        }
    }

    protected synchronized void renderOnCanvas(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        notifyListenersBeforeDraw(canvas);
        try {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (this.backgroundPaint != null) {
                drawBackground(canvas, this.displayDims.marginatedRect);
            }
            this.layoutManager.draw(canvas);
            if (getBorderPaint() != null) {
                drawBorder(canvas, this.displayDims.marginatedRect);
            }
        } catch (Exception e) {
            Log.e(TAG, "Exception while rendering Plot.", e);
        }
        this.isIdle = true;
        notifyListenersAfterDraw(canvas);
    }

    public void setBorderStyle(BorderStyle borderStyle, Float f, Float f2) {
        if (borderStyle == BorderStyle.ROUNDED) {
            if (f == null || f2 == null) {
                throw new IllegalArgumentException("radiusX and radiusY cannot be null when using BorderStyle.ROUNDED");
            }
            this.borderRadiusX = f.floatValue();
            this.borderRadiusY = f2.floatValue();
        }
        this.borderStyle = borderStyle;
    }

    protected void drawBorder(Canvas canvas, RectF rectF) {
        drawRect(canvas, rectF, this.borderPaint);
    }

    protected void drawBackground(Canvas canvas, RectF rectF) {
        drawRect(canvas, rectF, this.backgroundPaint);
    }

    /* renamed from: com.androidplot.Plot$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$Plot$BorderStyle;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            $SwitchMap$com$androidplot$Plot$BorderStyle = iArr;
            try {
                iArr[BorderStyle.ROUNDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$Plot$BorderStyle[BorderStyle.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected void drawRect(Canvas canvas, RectF rectF, Paint paint) {
        if (AnonymousClass1.$SwitchMap$com$androidplot$Plot$BorderStyle[this.borderStyle.ordinal()] == 1) {
            canvas.drawRoundRect(rectF, this.borderRadiusX, this.borderRadiusY, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
    }

    public LayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    public Paint getBackgroundPaint() {
        return this.backgroundPaint;
    }

    public void setBackgroundPaint(Paint paint) {
        this.backgroundPaint = paint;
    }

    public void setPlotMargins(float f, float f2, float f3, float f4) {
        setPlotMarginLeft(f);
        setPlotMarginTop(f2);
        setPlotMarginRight(f3);
        setPlotMarginBottom(f4);
    }

    public void setPlotPadding(float f, float f2, float f3, float f4) {
        setPlotPaddingLeft(f);
        setPlotPaddingTop(f2);
        setPlotPaddingRight(f3);
        setPlotPaddingBottom(f4);
    }

    public float getPlotMarginTop() {
        return this.boxModel.getMarginTop();
    }

    public void setPlotMarginTop(float f) {
        this.boxModel.setMarginTop(f);
    }

    public float getPlotMarginBottom() {
        return this.boxModel.getMarginBottom();
    }

    public void setPlotMarginBottom(float f) {
        this.boxModel.setMarginBottom(f);
    }

    public float getPlotMarginLeft() {
        return this.boxModel.getMarginLeft();
    }

    public void setPlotMarginLeft(float f) {
        this.boxModel.setMarginLeft(f);
    }

    public float getPlotMarginRight() {
        return this.boxModel.getMarginRight();
    }

    public void setPlotMarginRight(float f) {
        this.boxModel.setMarginRight(f);
    }

    public float getPlotPaddingTop() {
        return this.boxModel.getPaddingTop();
    }

    public void setPlotPaddingTop(float f) {
        this.boxModel.setPaddingTop(f);
    }

    public float getPlotPaddingBottom() {
        return this.boxModel.getPaddingBottom();
    }

    public void setPlotPaddingBottom(float f) {
        this.boxModel.setPaddingBottom(f);
    }

    public float getPlotPaddingLeft() {
        return this.boxModel.getPaddingLeft();
    }

    public void setPlotPaddingLeft(float f) {
        this.boxModel.setPaddingLeft(f);
    }

    public float getPlotPaddingRight() {
        return this.boxModel.getPaddingRight();
    }

    public void setPlotPaddingRight(float f) {
        this.boxModel.setPaddingRight(f);
    }

    public Paint getBorderPaint() {
        return this.borderPaint;
    }

    public void setBorderPaint(Paint paint) {
        if (paint == null) {
            this.borderPaint = null;
            return;
        }
        Paint paint2 = new Paint(paint);
        this.borderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
    }
}
