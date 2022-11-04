package com.zell_mbc.medilog.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MediLogDB.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/zell_mbc/medilog/data/Settings;", "", "_id", "", "type", "_key", "", "value", "(IILjava/lang/String;Ljava/lang/String;)V", "get_id", "()I", "get_key", "()Ljava/lang/String;", "set_key", "(Ljava/lang/String;)V", "getType", "setType", "(I)V", "getValue", "setValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Settings {
    public static final int $stable = 8;
    private final int _id;
    private String _key;
    private int type;
    private String value;

    public static /* synthetic */ Settings copy$default(Settings settings, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = settings._id;
        }
        if ((i3 & 2) != 0) {
            i2 = settings.type;
        }
        if ((i3 & 4) != 0) {
            str = settings._key;
        }
        if ((i3 & 8) != 0) {
            str2 = settings.value;
        }
        return settings.copy(i, i2, str, str2);
    }

    public final int component1() {
        return this._id;
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this._key;
    }

    public final String component4() {
        return this.value;
    }

    public final Settings copy(int i, int i2, String _key, String value) {
        Intrinsics.checkNotNullParameter(_key, "_key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Settings(i, i2, _key, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) obj;
        return this._id == settings._id && this.type == settings.type && Intrinsics.areEqual(this._key, settings._key) && Intrinsics.areEqual(this.value, settings.value);
    }

    public int hashCode() {
        return (((((this._id * 31) + this.type) * 31) + this._key.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        int i = this._id;
        int i2 = this.type;
        String str = this._key;
        String str2 = this.value;
        return "Settings(_id=" + i + ", type=" + i2 + ", _key=" + str + ", value=" + str2 + ")";
    }

    public Settings(int i, int i2, String _key, String value) {
        Intrinsics.checkNotNullParameter(_key, "_key");
        Intrinsics.checkNotNullParameter(value, "value");
        this._id = i;
        this.type = i2;
        this._key = _key;
        this.value = value;
    }

    public final int get_id() {
        return this._id;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final String get_key() {
        return this._key;
    }

    public final void set_key(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this._key = str;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }
}
