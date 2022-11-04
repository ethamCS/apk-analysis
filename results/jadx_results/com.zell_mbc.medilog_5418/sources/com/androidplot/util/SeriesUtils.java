package com.androidplot.util;

import com.androidplot.Region;
import com.androidplot.xy.FastXYSeries;
import com.androidplot.xy.OrderedXYSeries;
import com.androidplot.xy.RectRegion;
import com.androidplot.xy.XYConstraints;
import com.androidplot.xy.XYSeries;
import java.util.List;
/* loaded from: classes2.dex */
public class SeriesUtils {
    public static RectRegion minMax(List<XYSeries> list) {
        return minMax((XYConstraints) null, list);
    }

    public static RectRegion minMax(XYSeries... xYSeriesArr) {
        return minMax((XYConstraints) null, xYSeriesArr);
    }

    public static Region minMaxX(XYSeries... xYSeriesArr) {
        Region region = new Region();
        for (XYSeries xYSeries : xYSeriesArr) {
            for (int i = 0; i < xYSeries.size(); i++) {
                region.union(xYSeries.getX(i));
            }
        }
        return region;
    }

    public static Region minMaxY(XYSeries... xYSeriesArr) {
        Region region = new Region();
        for (XYSeries xYSeries : xYSeriesArr) {
            for (int i = 0; i < xYSeries.size(); i++) {
                region.union(xYSeries.getY(i));
            }
        }
        return region;
    }

    public static RectRegion minMax(XYConstraints xYConstraints, List<XYSeries> list) {
        return minMax(xYConstraints, (XYSeries[]) list.toArray(new XYSeries[list.size()]));
    }

    public static RectRegion minMax(XYConstraints xYConstraints, XYSeries... xYSeriesArr) {
        RectRegion rectRegion = new RectRegion();
        if (xYSeriesArr != null && xYSeriesArr.length > 0) {
            for (XYSeries xYSeries : xYSeriesArr) {
                if (xYSeries instanceof FastXYSeries) {
                    RectRegion minMax = ((FastXYSeries) xYSeries).minMax();
                    if (minMax != null) {
                        if (xYConstraints == null || xYConstraints.contains(minMax)) {
                            rectRegion.union(minMax);
                        }
                    }
                }
                for (int i = 0; i < xYSeries.size(); i++) {
                    Number x = xYSeries.getX(i);
                    Number y = xYSeries.getY(i);
                    if (xYConstraints == null || xYConstraints.contains(x, y)) {
                        rectRegion.union(x, y);
                    }
                }
            }
        }
        return rectRegion;
    }

    public static Region minMax(Region region, List<Number>... listArr) {
        for (List<Number> list : listArr) {
            for (Number number : list) {
                region.union(number);
            }
        }
        return region;
    }

    public static Region iBounds(XYSeries xYSeries, RectRegion rectRegion) {
        float f = xYSeries.size() >= 200 ? 50.0f : 1.0f;
        return new Region(Integer.valueOf(iBoundsMin(xYSeries, rectRegion.getMinX().doubleValue(), f)), Integer.valueOf(iBoundsMax(xYSeries, rectRegion.getMaxX().doubleValue(), f)));
    }

    protected static int iBoundsMax(XYSeries xYSeries, double d, float f) {
        Number x;
        int size = xYSeries.size() - 1;
        int size2 = xYSeries.size();
        for (int ceil = (int) Math.ceil(size2 / f); ceil >= 0; ceil--) {
            int i = ((int) f) * ceil;
            int i2 = 0;
            while (true) {
                if (i2 >= f) {
                    break;
                }
                int i3 = i + i2;
                if (i3 >= size2 || (x = xYSeries.getX(i3)) == null) {
                    i2++;
                } else {
                    int i4 = (x.doubleValue() > d ? 1 : (x.doubleValue() == d ? 0 : -1));
                    if (i4 <= 0) {
                        return i4 == 0 ? i3 : size;
                    }
                    size = i3;
                }
            }
        }
        return size;
    }

    protected static int iBoundsMin(XYSeries xYSeries, double d, float f) {
        int i;
        Number x;
        int ceil = (int) Math.ceil(xYSeries.size() / f);
        int i2 = 0;
        for (int i3 = 1; i3 <= ceil; i3++) {
            int i4 = ((int) f) * i3;
            int i5 = 1;
            while (true) {
                if (i5 <= f && (i = i4 - i5) >= 0) {
                    if (i >= xYSeries.size() || (x = xYSeries.getX(i)) == null) {
                        i5++;
                    } else if (x.doubleValue() >= d) {
                        return x.doubleValue() == d ? i : i2;
                    } else {
                        i2 = i;
                    }
                }
            }
        }
        return i2;
    }

    protected static Region getNullRegion(XYSeries xYSeries, int i) {
        Region region = new Region();
        if (xYSeries.getX(i) != null) {
            throw new IllegalArgumentException("Attempt to find null region for non null index: " + i);
        }
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                break;
            } else if (xYSeries.getX(i2) != null) {
                region.setMin(Integer.valueOf(i2));
                break;
            } else {
                i2--;
            }
        }
        while (true) {
            i++;
            if (i < xYSeries.size()) {
                if (xYSeries.getX(i) != null) {
                    region.setMax(Integer.valueOf(i));
                    break;
                }
            } else {
                break;
            }
        }
        return region;
    }

    public static Region minMax(List<Number>... listArr) {
        return minMax(new Region(), listArr);
    }

    public static OrderedXYSeries.XOrder getXYOrder(XYSeries xYSeries) {
        return xYSeries instanceof OrderedXYSeries ? ((OrderedXYSeries) xYSeries).getXOrder() : OrderedXYSeries.XOrder.NONE;
    }
}
