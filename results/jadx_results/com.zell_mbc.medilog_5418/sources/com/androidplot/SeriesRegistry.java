package com.androidplot;

import com.androidplot.Series;
import com.androidplot.ui.Formatter;
import com.androidplot.ui.SeriesBundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class SeriesRegistry<BundleType extends SeriesBundle<SeriesType, FormatterType>, SeriesType extends Series, FormatterType extends Formatter> implements Serializable {
    private ArrayList<BundleType> registry = new ArrayList<>();

    protected abstract BundleType newSeriesBundle(SeriesType seriestype, FormatterType formattertype);

    public List<BundleType> getSeriesAndFormatterList() {
        return this.registry;
    }

    public List<SeriesType> getSeriesList() {
        ArrayList arrayList = new ArrayList(this.registry.size());
        Iterator<BundleType> it = this.registry.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSeries());
        }
        return arrayList;
    }

    public int size() {
        return this.registry.size();
    }

    public boolean isEmpty() {
        return this.registry.isEmpty();
    }

    public boolean add(SeriesType seriestype, FormatterType formattertype) {
        if (seriestype == null || formattertype == null) {
            throw new IllegalArgumentException("Neither series nor formatter param may be null.");
        }
        return this.registry.add(newSeriesBundle(seriestype, formattertype));
    }

    public List<SeriesBundle<SeriesType, FormatterType>> get(SeriesType seriestype) {
        ArrayList arrayList = new ArrayList();
        Iterator<BundleType> it = this.registry.iterator();
        while (it.hasNext()) {
            BundleType next = it.next();
            if (next.getSeries() == seriestype) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public synchronized List<BundleType> remove(SeriesType seriestype, Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<BundleType> it = this.registry.iterator();
        while (it.hasNext()) {
            BundleType next = it.next();
            if (next.getSeries() == seriestype && next.getFormatter().getRendererClass() == cls) {
                it.remove();
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public synchronized boolean remove(SeriesType seriestype) {
        boolean z;
        z = false;
        Iterator<BundleType> it = this.registry.iterator();
        while (it.hasNext()) {
            if (it.next().getSeries() == seriestype) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public void clear() {
        Iterator<BundleType> it = this.registry.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public List<SeriesBundle<SeriesType, FormatterType>> getLegendEnabledItems() {
        ArrayList arrayList = new ArrayList();
        Iterator<BundleType> it = this.registry.iterator();
        while (it.hasNext()) {
            BundleType next = it.next();
            if (next.getFormatter().isLegendIconEnabled()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public boolean contains(SeriesType seriestype, Class<? extends FormatterType> cls) {
        Iterator<BundleType> it = this.registry.iterator();
        while (it.hasNext()) {
            BundleType next = it.next();
            if (next.getFormatter().getClass() == cls && next.getSeries() == seriestype) {
                return true;
            }
        }
        return false;
    }
}
