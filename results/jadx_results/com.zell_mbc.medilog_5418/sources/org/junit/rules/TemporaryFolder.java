package org.junit.rules;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import org.junit.Assert;
/* loaded from: classes.dex */
public class TemporaryFolder extends ExternalResource {
    private static final int TEMP_DIR_ATTEMPTS = 10000;
    private static final String TMP_PREFIX = "junit";
    private final boolean assureDeletion;
    private File folder;
    private final File parentFolder;

    public TemporaryFolder() {
        this((File) null);
    }

    public TemporaryFolder(File file) {
        this.parentFolder = file;
        this.assureDeletion = false;
    }

    protected TemporaryFolder(Builder builder) {
        this.parentFolder = builder.parentFolder;
        this.assureDeletion = builder.assureDeletion;
    }

    public static Builder builder() {
        return new Builder();
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private boolean assureDeletion;
        private File parentFolder;

        protected Builder() {
        }

        public Builder parentFolder(File file) {
            this.parentFolder = file;
            return this;
        }

        public Builder assureDeletion() {
            this.assureDeletion = true;
            return this;
        }

        public TemporaryFolder build() {
            return new TemporaryFolder(this);
        }
    }

    @Override // org.junit.rules.ExternalResource
    protected void before() throws Throwable {
        create();
    }

    @Override // org.junit.rules.ExternalResource
    protected void after() {
        delete();
    }

    public void create() throws IOException {
        this.folder = createTemporaryFolderIn(this.parentFolder);
    }

    public File newFile(String str) throws IOException {
        File file = new File(getRoot(), str);
        if (file.createNewFile()) {
            return file;
        }
        throw new IOException("a file with the name '" + str + "' already exists in the test folder");
    }

    public File newFile() throws IOException {
        return File.createTempFile(TMP_PREFIX, null, getRoot());
    }

    public File newFolder(String str) throws IOException {
        return newFolder(str);
    }

    public File newFolder(String... strArr) throws IOException {
        if (strArr.length == 0) {
            throw new IllegalArgumentException("must pass at least one path");
        }
        File root = getRoot();
        int i = 0;
        for (String str : strArr) {
            if (new File(str).isAbsolute()) {
                throw new IOException("folder path '" + str + "' is not a relative path");
            }
        }
        File file = null;
        int length = strArr.length;
        boolean z = true;
        File file2 = root;
        while (i < length) {
            File file3 = new File(file, strArr[i]);
            File file4 = new File(root, file3.getPath());
            z = file4.mkdirs();
            if (!z && !file4.isDirectory()) {
                if (file4.exists()) {
                    throw new IOException("a file with the path '" + file3.getPath() + "' exists");
                }
                throw new IOException("could not create a folder with the path '" + file3.getPath() + "'");
            }
            i++;
            file2 = file4;
            file = file3;
        }
        if (z) {
            return file2;
        }
        throw new IOException("a folder with the path '" + file.getPath() + "' already exists");
    }

    public File newFolder() throws IOException {
        return createTemporaryFolderIn(getRoot());
    }

    private static File createTemporaryFolderIn(File file) throws IOException {
        try {
            return createTemporaryFolderWithNioApi(file);
        } catch (ClassNotFoundException unused) {
            return createTemporaryFolderWithFileApi(file);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            IOException iOException = new IOException("Failed to create temporary folder in " + file);
            iOException.initCause(cause);
            throw iOException;
        } catch (Exception e2) {
            throw new RuntimeException("Failed to create temporary folder in " + file, e2);
        }
    }

    private static File createTemporaryFolderWithNioApi(File file) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object obj;
        Class<?> cls = Class.forName("java.nio.file.Files");
        Object newInstance = Array.newInstance(Class.forName("java.nio.file.attribute.FileAttribute"), 0);
        Class<?> cls2 = Class.forName("java.nio.file.Path");
        if (file != null) {
            obj = cls.getDeclaredMethod("createTempDirectory", cls2, String.class, newInstance.getClass()).invoke(null, File.class.getDeclaredMethod("toPath", new Class[0]).invoke(file, new Object[0]), TMP_PREFIX, newInstance);
        } else {
            obj = cls.getDeclaredMethod("createTempDirectory", String.class, newInstance.getClass()).invoke(null, TMP_PREFIX, newInstance);
        }
        return (File) cls2.getDeclaredMethod("toFile", new Class[0]).invoke(obj, new Object[0]);
    }

    private static File createTemporaryFolderWithFileApi(File file) throws IOException {
        File file2 = null;
        int i = 0;
        while (i < TEMP_DIR_ATTEMPTS) {
            File createTempFile = File.createTempFile(TMP_PREFIX, ".tmp", file);
            String file3 = createTempFile.toString();
            File file4 = new File(file3.substring(0, file3.length() - 4));
            if (file4.mkdir()) {
                createTempFile.delete();
                return file4;
            }
            createTempFile.delete();
            i++;
            file2 = file4;
        }
        throw new IOException("Unable to create temporary directory in: " + file.toString() + ". Tried " + TEMP_DIR_ATTEMPTS + " times. Last attempted to create: " + file2.toString());
    }

    public File getRoot() {
        File file = this.folder;
        if (file != null) {
            return file;
        }
        throw new IllegalStateException("the temporary folder has not yet been created");
    }

    public void delete() {
        if (tryDelete() || !this.assureDeletion) {
            return;
        }
        Assert.fail("Unable to clean up temporary folder " + this.folder);
    }

    private boolean tryDelete() {
        File file = this.folder;
        if (file == null) {
            return true;
        }
        return recursiveDelete(file);
    }

    private boolean recursiveDelete(File file) {
        if (file.delete()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!recursiveDelete(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }
}
