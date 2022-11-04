package io.noties.markwon.movement;

import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.widget.TextView;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.core.CorePlugin;
/* loaded from: classes2.dex */
public class MovementMethodPlugin extends AbstractMarkwonPlugin {
    private final MovementMethod movementMethod;

    @Deprecated
    public static MovementMethodPlugin create() {
        return create(LinkMovementMethod.getInstance());
    }

    public static MovementMethodPlugin link() {
        return create(LinkMovementMethod.getInstance());
    }

    public static MovementMethodPlugin none() {
        return new MovementMethodPlugin(null);
    }

    public static MovementMethodPlugin create(MovementMethod movementMethod) {
        return new MovementMethodPlugin(movementMethod);
    }

    MovementMethodPlugin(MovementMethod movementMethod) {
        this.movementMethod = movementMethod;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configure(MarkwonPlugin.Registry registry) {
        ((CorePlugin) registry.require(CorePlugin.class)).hasExplicitMovementMethod(true);
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void beforeSetText(TextView textView, Spanned spanned) {
        MovementMethod movementMethod = textView.getMovementMethod();
        MovementMethod movementMethod2 = this.movementMethod;
        if (movementMethod != movementMethod2) {
            textView.setMovementMethod(movementMethod2);
        }
    }
}
