package org.javarosa.core.reference;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.services.locale.LocaleDataSource;
import org.javarosa.core.services.locale.LocalizationUtils;
import org.javarosa.core.util.OrderedHashtable;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class ReferenceDataSource implements LocaleDataSource {
    String referenceURI;

    public ReferenceDataSource() {
    }

    public ReferenceDataSource(String str) {
        if (str == null) {
            throw new NullPointerException("Reference URI cannot be null when creating a Resource File Data Source");
        }
        this.referenceURI = str;
    }

    @Override // org.javarosa.core.services.locale.LocaleDataSource
    public OrderedHashtable getLocalizedText() {
        try {
            return LocalizationUtils.parseLocaleInput(ReferenceManager._().DeriveReference(this.referenceURI).getStream());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("IOException while getting localized text at reference " + this.referenceURI);
        } catch (InvalidReferenceException e2) {
            e2.printStackTrace();
            throw new RuntimeException("Invalid Reference! " + this.referenceURI);
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.referenceURI = dataInputStream.readUTF();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.referenceURI);
    }
}
