package org.junit.internal;

import java.io.Serializable;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
/* loaded from: classes2.dex */
class SerializableMatcherDescription<T> extends BaseMatcher<T> implements Serializable {
    private final String matcherDescription;

    private SerializableMatcherDescription(Matcher<T> matcher) {
        this.matcherDescription = StringDescription.asString(matcher);
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        throw new UnsupportedOperationException("This Matcher implementation only captures the description");
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText(this.matcherDescription);
    }

    public static <T> Matcher<T> asSerializableMatcher(Matcher<T> matcher) {
        return (matcher == null || (matcher instanceof Serializable)) ? matcher : new SerializableMatcherDescription(matcher);
    }
}
