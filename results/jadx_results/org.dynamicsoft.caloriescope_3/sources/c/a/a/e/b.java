package c.a.a.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import b.c.a.s;
import b.c.a.w;
import java.util.ArrayList;
import org.dynamicsoft.caloriescope.R;
/* loaded from: classes.dex */
public class b extends ArrayAdapter<a> {

    /* renamed from: b */
    private final Context f1363b;

    public b(Context context, int i, ArrayList<a> arrayList) {
        super(context, i, arrayList);
        this.f1363b = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.calorie_scope_videos_inflate, (ViewGroup) null, true);
        }
        a item = getItem(i);
        w a2 = s.a(this.f1363b).a(item.b());
        a2.a(R.drawable.ic_default_image);
        a2.a((ImageView) view.findViewById(R.id.ivImage));
        ((TextView) view.findViewById(R.id.tvName)).setText(item.c());
        ((TextView) view.findViewById(R.id.tvDescription)).setText(item.a().equals("null") ? "" : item.a());
        return view;
    }
}
