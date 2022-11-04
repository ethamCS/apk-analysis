package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t0 extends u0.c implements View.OnClickListener {

    /* renamed from: a4 */
    private final SearchView f1493a4;

    /* renamed from: b4 */
    private final SearchableInfo f1494b4;

    /* renamed from: c4 */
    private final Context f1495c4;

    /* renamed from: d4 */
    private final WeakHashMap<String, Drawable.ConstantState> f1496d4;

    /* renamed from: e4 */
    private final int f1497e4;

    /* renamed from: h4 */
    private ColorStateList f1500h4;

    /* renamed from: f4 */
    private boolean f1498f4 = false;

    /* renamed from: g4 */
    private int f1499g4 = 1;

    /* renamed from: i4 */
    private int f1501i4 = -1;

    /* renamed from: j4 */
    private int f1502j4 = -1;

    /* renamed from: k4 */
    private int f1503k4 = -1;

    /* renamed from: l4 */
    private int f1504l4 = -1;

    /* renamed from: m4 */
    private int f1505m4 = -1;

    /* renamed from: n4 */
    private int f1506n4 = -1;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f1507a;

        /* renamed from: b */
        public final TextView f1508b;

        /* renamed from: c */
        public final ImageView f1509c;

        /* renamed from: d */
        public final ImageView f1510d;

        /* renamed from: e */
        public final ImageView f1511e;

        public a(View view) {
            this.f1507a = (TextView) view.findViewById(16908308);
            this.f1508b = (TextView) view.findViewById(16908309);
            this.f1509c = (ImageView) view.findViewById(16908295);
            this.f1510d = (ImageView) view.findViewById(16908296);
            this.f1511e = (ImageView) view.findViewById(e.f.q_res_0x7f0900e0);
        }
    }

    public t0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1493a4 = searchView;
        this.f1494b4 = searchableInfo;
        this.f1497e4 = searchView.getSuggestionCommitIconResId();
        this.f1495c4 = context;
        this.f1496d4 = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1496d4.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = this.f1496d4.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f1500h4 == null) {
            TypedValue typedValue = new TypedValue();
            this.f1495c4.getTheme().resolveAttribute(e.a.M_res_0x7f0303f4, typedValue, true);
            this.f1500h4 = this.f1495c4.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1500h4, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        String nameNotFoundException;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f1495c4.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e10) {
            nameNotFoundException = e10.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", nameNotFoundException);
        return null;
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1496d4.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1496d4.get(flattenToShortString);
            if (constantState2 != null) {
                return constantState2.newDrawable(this.f1495c4.getResources());
            }
            return null;
        }
        Drawable m10 = m(componentName);
        if (m10 != null) {
            constantState = m10.getConstantState();
        }
        this.f1496d4.put(flattenToShortString, constantState);
        return m10;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable n10 = n(this.f1494b4.getSearchActivity());
        return n10 != null ? n10 : this.f1495c4.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1495c4.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
            } catch (IOException e10) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
            }
            return createFromStream;
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1495c4.getPackageName() + "/" + parseInt;
            Drawable k10 = k(str2);
            if (k10 != null) {
                return k10;
            }
            Drawable d10 = androidx.core.content.a.d(this.f1495c4, parseInt);
            A(str2, d10);
            return d10;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k11 = k(str);
            if (k11 != null) {
                return k11;
            }
            Drawable q10 = q(Uri.parse(str));
            A(str, q10);
            return q10;
        }
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.f1504l4;
        if (i10 == -1) {
            return null;
        }
        Drawable s10 = s(cursor.getString(i10));
        return s10 != null ? s10 : p();
    }

    private Drawable u(Cursor cursor) {
        int i10 = this.f1505m4;
        if (i10 == -1) {
            return null;
        }
        return s(cursor.getString(i10));
    }

    private static String w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // u0.a, u0.b.a
    public void a(Cursor cursor) {
        if (this.f1498f4) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor == null) {
                return;
            }
            cursor.close();
            return;
        }
        try {
            super.a(cursor);
            if (cursor == null) {
                return;
            }
            this.f1501i4 = cursor.getColumnIndex("suggest_text_1");
            this.f1502j4 = cursor.getColumnIndex("suggest_text_2");
            this.f1503k4 = cursor.getColumnIndex("suggest_text_2_url");
            this.f1504l4 = cursor.getColumnIndex("suggest_icon_1");
            this.f1505m4 = cursor.getColumnIndex("suggest_icon_2");
            this.f1506n4 = cursor.getColumnIndex("suggest_flags");
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // u0.a, u0.b.a
    public CharSequence c(Cursor cursor) {
        String o10;
        String o11;
        if (cursor == null) {
            return null;
        }
        String o12 = o(cursor, "suggest_intent_query");
        if (o12 != null) {
            return o12;
        }
        if (this.f1494b4.shouldRewriteQueryFromData() && (o11 = o(cursor, "suggest_intent_data")) != null) {
            return o11;
        }
        if (this.f1494b4.shouldRewriteQueryFromText() && (o10 = o(cursor, "suggest_text_1")) != null) {
            return o10;
        }
        return null;
    }

    @Override // u0.b.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
        if (this.f1493a4.getVisibility() == 0 && this.f1493a4.getWindowVisibility() == 0) {
            try {
                Cursor v10 = v(this.f1494b4, charSequence2, 50);
                if (v10 != null) {
                    v10.getCount();
                    return v10;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // u0.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f1506n4;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1507a != null) {
            z(aVar.f1507a, w(cursor, this.f1501i4));
        }
        if (aVar.f1508b != null) {
            String w9 = w(cursor, this.f1503k4);
            CharSequence l10 = w9 != null ? l(w9) : w(cursor, this.f1502j4);
            if (TextUtils.isEmpty(l10)) {
                TextView textView = aVar.f1507a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1507a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1507a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1507a.setMaxLines(1);
                }
            }
            z(aVar.f1508b, l10);
        }
        ImageView imageView = aVar.f1509c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1510d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i12 = this.f1499g4;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f1511e.setVisibility(8);
            return;
        }
        aVar.f1511e.setVisibility(0);
        aVar.f1511e.setTag(aVar.f1507a.getText());
        aVar.f1511e.setOnClickListener(this);
    }

    @Override // u0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View g10 = g(this.f1495c4, b(), viewGroup);
            if (g10 != null) {
                ((a) g10.getTag()).f1507a.setText(e10.toString());
            }
            return g10;
        }
    }

    @Override // u0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View h10 = h(this.f1495c4, b(), viewGroup);
            if (h10 != null) {
                ((a) h10.getTag()).f1507a.setText(e10.toString());
            }
            return h10;
        }
    }

    @Override // u0.c, u0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h10 = super.h(context, cursor, viewGroup);
        h10.setTag(new a(h10));
        ((ImageView) h10.findViewById(e.f.q_res_0x7f0900e0)).setImageResource(this.f1497e4);
        return h10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1493a4.U((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1495c4.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f1495c4.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i10) {
        this.f1499g4 = i10;
    }
}
