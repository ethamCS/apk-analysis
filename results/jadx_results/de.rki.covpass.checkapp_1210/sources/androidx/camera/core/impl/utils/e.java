package androidx.camera.core.impl.utils;

import android.location.Location;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c */
    private static final String f2326c = "e";

    /* renamed from: d */
    private static final ThreadLocal<SimpleDateFormat> f2327d = new a();

    /* renamed from: e */
    private static final ThreadLocal<SimpleDateFormat> f2328e = new b();

    /* renamed from: f */
    private static final ThreadLocal<SimpleDateFormat> f2329f = new c();

    /* renamed from: g */
    private static final List<String> f2330g = e();

    /* renamed from: h */
    private static final List<String> f2331h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a */
    private final z0.a f2332a;

    /* renamed from: b */
    private boolean f2333b = false;

    /* loaded from: classes.dex */
    class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* loaded from: classes.dex */
    class b extends ThreadLocal<SimpleDateFormat> {
        b() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* loaded from: classes.dex */
    class c extends ThreadLocal<SimpleDateFormat> {
        c() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            final double f2334a;

            a(double d10) {
                this.f2334a = d10;
            }

            double a() {
                return this.f2334a / 2.23694d;
            }
        }

        static a a(double d10) {
            return new a(d10 * 0.621371d);
        }

        static a b(double d10) {
            return new a(d10 * 1.15078d);
        }

        static a c(double d10) {
            return new a(d10);
        }
    }

    private e(z0.a aVar) {
        this.f2332a = aVar;
    }

    private static Date a(String str) {
        return f2327d.get().parse(str);
    }

    private static Date b(String str) {
        return f2329f.get().parse(str);
    }

    private static Date c(String str) {
        return f2328e.get().parse(str);
    }

    public static e d(InputStream inputStream) {
        return new e(new z0.a(inputStream));
    }

    public static List<String> e() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    private long o(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return b(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    private long p(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return a(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        } else if (str == null) {
            try {
                return c(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        } else {
            return o(str + " " + str2);
        }
    }

    public String f() {
        return this.f2332a.f("ImageDescription");
    }

    public int g() {
        return this.f2332a.h("ImageLength", 0);
    }

    public Location h() {
        String f10 = this.f2332a.f("GPSProcessingMethod");
        double[] l10 = this.f2332a.l();
        double e10 = this.f2332a.e(0.0d);
        double g10 = this.f2332a.g("GPSSpeed", 0.0d);
        String f11 = this.f2332a.f("GPSSpeedRef");
        if (f11 == null) {
            f11 = "K";
        }
        long p10 = p(this.f2332a.f("GPSDateStamp"), this.f2332a.f("GPSTimeStamp"));
        if (l10 == null) {
            return null;
        }
        if (f10 == null) {
            f10 = f2326c;
        }
        Location location = new Location(f10);
        location.setLatitude(l10[0]);
        location.setLongitude(l10[1]);
        if (e10 != 0.0d) {
            location.setAltitude(e10);
        }
        if (g10 != 0.0d) {
            char c10 = 65535;
            int hashCode = f11.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && f11.equals("N")) {
                        c10 = 1;
                    }
                } else if (f11.equals("M")) {
                    c10 = 0;
                }
            } else if (f11.equals("K")) {
                c10 = 2;
            }
            location.setSpeed((float) (c10 != 0 ? c10 != 1 ? d.a(g10) : d.b(g10) : d.c(g10)).a());
        }
        if (p10 != -1) {
            location.setTime(p10);
        }
        return location;
    }

    public int i() {
        return this.f2332a.h("Orientation", 0);
    }

    public int j() {
        switch (i()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long k() {
        long o10 = o(this.f2332a.f("DateTimeOriginal"));
        if (o10 == -1) {
            return -1L;
        }
        String f10 = this.f2332a.f("SubSecTimeOriginal");
        if (f10 == null) {
            return o10;
        }
        try {
            long parseLong = Long.parseLong(f10);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return o10 + parseLong;
        } catch (NumberFormatException unused) {
            return o10;
        }
    }

    public int l() {
        return this.f2332a.h("ImageWidth", 0);
    }

    public boolean m() {
        return i() == 2;
    }

    public boolean n() {
        int i10 = i();
        return i10 == 4 || i10 == 5 || i10 == 7;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(l()), Integer.valueOf(g()), Integer.valueOf(j()), Boolean.valueOf(n()), Boolean.valueOf(m()), h(), Long.valueOf(k()), f());
    }
}
