package net.lingala.zip4j.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ZipModel implements Cloneable {
    private long end;
    private boolean isNestedZipFile;
    private boolean splitArchive;
    private long start;
    private File zipFile;
    private List<LocalFileHeader> localFileHeaders = new ArrayList();
    private List<DataDescriptor> dataDescriptors = new ArrayList();
    private ArchiveExtraDataRecord archiveExtraDataRecord = new ArchiveExtraDataRecord();
    private CentralDirectory centralDirectory = new CentralDirectory();
    private EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = new EndOfCentralDirectoryRecord();
    private Zip64EndOfCentralDirectoryLocator zip64EndOfCentralDirectoryLocator = new Zip64EndOfCentralDirectoryLocator();
    private Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecord = new Zip64EndOfCentralDirectoryRecord();
    private boolean isZip64Format = false;
    private long splitLength = -1;

    public List<LocalFileHeader> getLocalFileHeaders() {
        return this.localFileHeaders;
    }

    public void setLocalFileHeaders(List<LocalFileHeader> list) {
        this.localFileHeaders = list;
    }

    public List<DataDescriptor> getDataDescriptors() {
        return this.dataDescriptors;
    }

    public void setDataDescriptors(List<DataDescriptor> list) {
        this.dataDescriptors = list;
    }

    public CentralDirectory getCentralDirectory() {
        return this.centralDirectory;
    }

    public void setCentralDirectory(CentralDirectory centralDirectory) {
        this.centralDirectory = centralDirectory;
    }

    public EndOfCentralDirectoryRecord getEndOfCentralDirectoryRecord() {
        return this.endOfCentralDirectoryRecord;
    }

    public void setEndOfCentralDirectoryRecord(EndOfCentralDirectoryRecord endOfCentralDirectoryRecord) {
        this.endOfCentralDirectoryRecord = endOfCentralDirectoryRecord;
    }

    public ArchiveExtraDataRecord getArchiveExtraDataRecord() {
        return this.archiveExtraDataRecord;
    }

    public void setArchiveExtraDataRecord(ArchiveExtraDataRecord archiveExtraDataRecord) {
        this.archiveExtraDataRecord = archiveExtraDataRecord;
    }

    public boolean isSplitArchive() {
        return this.splitArchive;
    }

    public void setSplitArchive(boolean z) {
        this.splitArchive = z;
    }

    public File getZipFile() {
        return this.zipFile;
    }

    public void setZipFile(File file) {
        this.zipFile = file;
    }

    public Zip64EndOfCentralDirectoryLocator getZip64EndOfCentralDirectoryLocator() {
        return this.zip64EndOfCentralDirectoryLocator;
    }

    public void setZip64EndOfCentralDirectoryLocator(Zip64EndOfCentralDirectoryLocator zip64EndOfCentralDirectoryLocator) {
        this.zip64EndOfCentralDirectoryLocator = zip64EndOfCentralDirectoryLocator;
    }

    public Zip64EndOfCentralDirectoryRecord getZip64EndOfCentralDirectoryRecord() {
        return this.zip64EndOfCentralDirectoryRecord;
    }

    public void setZip64EndOfCentralDirectoryRecord(Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecord) {
        this.zip64EndOfCentralDirectoryRecord = zip64EndOfCentralDirectoryRecord;
    }

    public boolean isZip64Format() {
        return this.isZip64Format;
    }

    public void setZip64Format(boolean z) {
        this.isZip64Format = z;
    }

    public boolean isNestedZipFile() {
        return this.isNestedZipFile;
    }

    public void setNestedZipFile(boolean z) {
        this.isNestedZipFile = z;
    }

    public long getStart() {
        return this.start;
    }

    public void setStart(long j) {
        this.start = j;
    }

    public long getEnd() {
        return this.end;
    }

    public void setEnd(long j) {
        this.end = j;
    }

    public long getSplitLength() {
        return this.splitLength;
    }

    public void setSplitLength(long j) {
        this.splitLength = j;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
