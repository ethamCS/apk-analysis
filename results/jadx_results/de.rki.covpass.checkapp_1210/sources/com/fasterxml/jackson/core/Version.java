package com.fasterxml.jackson.core;

import java.io.Serializable;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class Version implements Comparable<Version>, Serializable {
    private static final Version UNKNOWN_VERSION = new Version(0, 0, 0, null, null, null);
    protected final String _artifactId;
    protected final String _groupId;
    protected final int _majorVersion;
    protected final int _minorVersion;
    protected final int _patchLevel;
    protected final String _snapshotInfo;

    public Version(int i10, int i11, int i12, String str, String str2, String str3) {
        this._majorVersion = i10;
        this._minorVersion = i11;
        this._patchLevel = i12;
        this._snapshotInfo = str;
        this._groupId = str2 == null ? BuildConfig.FLAVOR : str2;
        this._artifactId = str3 == null ? BuildConfig.FLAVOR : str3;
    }

    public static Version unknownVersion() {
        return UNKNOWN_VERSION;
    }

    public int compareTo(Version version) {
        if (version == this) {
            return 0;
        }
        int compareTo = this._groupId.compareTo(version._groupId);
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this._artifactId.compareTo(version._artifactId);
        if (compareTo2 != 0) {
            return compareTo2;
        }
        int i10 = this._majorVersion - version._majorVersion;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this._minorVersion - version._minorVersion;
        return i11 == 0 ? this._patchLevel - version._patchLevel : i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Version version = (Version) obj;
        return version._majorVersion == this._majorVersion && version._minorVersion == this._minorVersion && version._patchLevel == this._patchLevel && version._artifactId.equals(this._artifactId) && version._groupId.equals(this._groupId);
    }

    public String getArtifactId() {
        return this._artifactId;
    }

    public int hashCode() {
        return this._artifactId.hashCode() ^ (((this._groupId.hashCode() + this._majorVersion) - this._minorVersion) + this._patchLevel);
    }

    public boolean isSnapshot() {
        String str = this._snapshotInfo;
        return str != null && str.length() > 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this._majorVersion);
        sb2.append('.');
        sb2.append(this._minorVersion);
        sb2.append('.');
        sb2.append(this._patchLevel);
        if (isSnapshot()) {
            sb2.append('-');
            sb2.append(this._snapshotInfo);
        }
        return sb2.toString();
    }
}
