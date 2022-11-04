package net.lingala.zip4j.util;

import net.lingala.zip4j.headers.VersionMadeBy;
import net.lingala.zip4j.headers.VersionNeededToExtract;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
/* loaded from: classes2.dex */
public class ZipVersionUtils {
    public static int determineVersionMadeBy(ZipParameters zipParameters, RawIO rawIO) {
        byte[] bArr = {VersionMadeBy.SPECIFICATION_VERSION.getCode(), VersionMadeBy.UNIX.getCode()};
        if (FileUtils.isWindows() && !zipParameters.isUnixMode()) {
            bArr[1] = VersionMadeBy.WINDOWS.getCode();
        }
        return rawIO.readShortLittleEndian(bArr, 0);
    }

    public static VersionNeededToExtract determineVersionNeededToExtract(ZipParameters zipParameters) {
        VersionNeededToExtract versionNeededToExtract = VersionNeededToExtract.DEFAULT;
        if (zipParameters.getCompressionMethod() == CompressionMethod.DEFLATE) {
            versionNeededToExtract = VersionNeededToExtract.DEFLATE_COMPRESSED;
        }
        if (zipParameters.getEntrySize() > InternalZipConstants.ZIP_64_SIZE_LIMIT) {
            versionNeededToExtract = VersionNeededToExtract.ZIP_64_FORMAT;
        }
        return (!zipParameters.isEncryptFiles() || !zipParameters.getEncryptionMethod().equals(EncryptionMethod.AES)) ? versionNeededToExtract : VersionNeededToExtract.AES_ENCRYPTED;
    }
}
