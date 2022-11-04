package io.noties.markwon;

import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.core.CorePlugin;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public class RegistryImpl implements MarkwonPlugin.Registry {
    private final List<MarkwonPlugin> origin;
    private final Set<MarkwonPlugin> pending = new HashSet(3);
    private final List<MarkwonPlugin> plugins;

    public RegistryImpl(List<MarkwonPlugin> list) {
        this.origin = list;
        this.plugins = new ArrayList(list.size());
    }

    @Override // io.noties.markwon.MarkwonPlugin.Registry
    public <P extends MarkwonPlugin> P require(Class<P> cls) {
        return (P) get(cls);
    }

    @Override // io.noties.markwon.MarkwonPlugin.Registry
    public <P extends MarkwonPlugin> void require(Class<P> cls, MarkwonPlugin.Action<? super P> action) {
        action.apply(get(cls));
    }

    public List<MarkwonPlugin> process() {
        for (MarkwonPlugin markwonPlugin : this.origin) {
            configure(markwonPlugin);
        }
        return this.plugins;
    }

    private void configure(MarkwonPlugin markwonPlugin) {
        if (!this.plugins.contains(markwonPlugin)) {
            if (this.pending.contains(markwonPlugin)) {
                throw new IllegalStateException("Cyclic dependency chain found: " + this.pending);
            }
            this.pending.add(markwonPlugin);
            markwonPlugin.configure(this);
            this.pending.remove(markwonPlugin);
            if (this.plugins.contains(markwonPlugin)) {
                return;
            }
            if (CorePlugin.class.isAssignableFrom(markwonPlugin.getClass())) {
                this.plugins.add(0, markwonPlugin);
            } else {
                this.plugins.add(markwonPlugin);
            }
        }
    }

    private <P extends MarkwonPlugin> P get(Class<P> cls) {
        P p = (P) find(this.plugins, cls);
        if (p == null) {
            p = (P) find(this.origin, cls);
            if (p == null) {
                throw new IllegalStateException("Requested plugin is not added: " + cls.getName() + ", plugins: " + this.origin);
            }
            configure(p);
        }
        return p;
    }

    private static <P extends MarkwonPlugin> P find(List<MarkwonPlugin> list, Class<P> cls) {
        Iterator<MarkwonPlugin> it = list.iterator();
        while (it.hasNext()) {
            P p = (P) it.next();
            if (cls.isAssignableFrom(p.getClass())) {
                return p;
            }
        }
        return null;
    }
}
