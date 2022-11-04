package com.afollestad.date.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.date.util.DebouncerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: YearAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/afollestad/date/adapters/YearViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "adapter", "Lcom/afollestad/date/adapters/YearAdapter;", "(Landroid/view/View;Lcom/afollestad/date/adapters/YearAdapter;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "com.afollestad.date-picker"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class YearViewHolder extends RecyclerView.ViewHolder {
    private final YearAdapter adapter;
    private final TextView textView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YearAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.afollestad.date.adapters.YearViewHolder$1 */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<View, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1() {
            super(1);
            YearViewHolder.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(View it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            YearViewHolder.this.adapter.onRowClicked$com_afollestad_date_picker(YearViewHolder.this.getAdapterPosition());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearViewHolder(View itemView, YearAdapter adapter) {
        super(itemView);
        Intrinsics.checkParameterIsNotNull(itemView, "itemView");
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        this.adapter = adapter;
        this.textView = (TextView) itemView;
        DebouncerKt.onClickDebounced(itemView, new AnonymousClass1());
    }

    public final TextView getTextView() {
        return this.textView;
    }
}
