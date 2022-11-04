package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ModifierLocalManager.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u0015\u001a\u00020\u0012J*\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00172\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u001b\u001a\u00020\u0012J\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tR$\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "owner", "Landroidx/compose/ui/node/Owner;", "(Landroidx/compose/ui/node/Owner;)V", "inserted", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Pair;", "Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/modifier/ModifierLocal;", "invalidated", "", "getOwner", "()Landroidx/compose/ui/node/Owner;", "removed", "Landroidx/compose/ui/node/LayoutNode;", "updated", "insertedProvider", "", "node", "key", "invalidate", "invalidateConsumersOfNodeForKey", "Landroidx/compose/ui/Modifier$Node;", "set", "", "removedProvider", "triggerUpdates", "updatedProvider", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ModifierLocalManager {
    private boolean invalidated;
    private final Owner owner;
    private final MutableVector<Pair<BackwardsCompatNode, ModifierLocal<?>>> inserted = new MutableVector<>(new Pair[16], 0);
    private final MutableVector<Pair<BackwardsCompatNode, ModifierLocal<?>>> updated = new MutableVector<>(new Pair[16], 0);
    private final MutableVector<Pair<LayoutNode, ModifierLocal<?>>> removed = new MutableVector<>(new Pair[16], 0);

    public ModifierLocalManager(Owner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final void invalidate() {
        if (!this.invalidated) {
            this.invalidated = true;
            this.owner.registerOnEndApplyChangesListener(new ModifierLocalManager$invalidate$1(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[LOOP:3: B:27:0x00ba->B:29:0x00c0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void triggerUpdates() {
        /*
            r9 = this;
            r0 = 0
            r9.invalidated = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            androidx.compose.runtime.collection.MutableVector<kotlin.Pair<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.modifier.ModifierLocal<?>>> r2 = r9.removed
            int r3 = r2.getSize()
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            if (r3 <= 0) goto L42
            java.lang.Object[] r2 = r2.getContent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            r5 = 0
        L1a:
            r6 = r2[r5]
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r7 = r6.component1()
            androidx.compose.ui.node.LayoutNode r7 = (androidx.compose.ui.node.LayoutNode) r7
            java.lang.Object r6 = r6.component2()
            androidx.compose.ui.modifier.ModifierLocal r6 = (androidx.compose.ui.modifier.ModifierLocal) r6
            boolean r8 = r7.isAttached()
            if (r8 == 0) goto L3e
            androidx.compose.ui.node.NodeChain r7 = r7.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r7 = r7.getHead$ui_release()
            r8 = r1
            java.util.Set r8 = (java.util.Set) r8
            r9.invalidateConsumersOfNodeForKey(r7, r6, r8)
        L3e:
            int r5 = r5 + 1
            if (r5 < r3) goto L1a
        L42:
            androidx.compose.runtime.collection.MutableVector<kotlin.Pair<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.modifier.ModifierLocal<?>>> r2 = r9.removed
            r2.clear()
            androidx.compose.runtime.collection.MutableVector<kotlin.Pair<androidx.compose.ui.node.BackwardsCompatNode, androidx.compose.ui.modifier.ModifierLocal<?>>> r2 = r9.inserted
            int r3 = r2.getSize()
            if (r3 <= 0) goto L79
            java.lang.Object[] r2 = r2.getContent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            r5 = 0
        L57:
            r6 = r2[r5]
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r7 = r6.component1()
            androidx.compose.ui.node.BackwardsCompatNode r7 = (androidx.compose.ui.node.BackwardsCompatNode) r7
            java.lang.Object r6 = r6.component2()
            androidx.compose.ui.modifier.ModifierLocal r6 = (androidx.compose.ui.modifier.ModifierLocal) r6
            boolean r8 = r7.isAttached()
            if (r8 == 0) goto L75
            androidx.compose.ui.Modifier$Node r7 = (androidx.compose.ui.Modifier.Node) r7
            r8 = r1
            java.util.Set r8 = (java.util.Set) r8
            r9.invalidateConsumersOfNodeForKey(r7, r6, r8)
        L75:
            int r5 = r5 + 1
            if (r5 < r3) goto L57
        L79:
            androidx.compose.runtime.collection.MutableVector<kotlin.Pair<androidx.compose.ui.node.BackwardsCompatNode, androidx.compose.ui.modifier.ModifierLocal<?>>> r2 = r9.inserted
            r2.clear()
            androidx.compose.runtime.collection.MutableVector<kotlin.Pair<androidx.compose.ui.node.BackwardsCompatNode, androidx.compose.ui.modifier.ModifierLocal<?>>> r2 = r9.updated
            int r3 = r2.getSize()
            if (r3 <= 0) goto Laf
            java.lang.Object[] r2 = r2.getContent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
        L8d:
            r4 = r2[r0]
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            androidx.compose.ui.node.BackwardsCompatNode r5 = (androidx.compose.ui.node.BackwardsCompatNode) r5
            java.lang.Object r4 = r4.component2()
            androidx.compose.ui.modifier.ModifierLocal r4 = (androidx.compose.ui.modifier.ModifierLocal) r4
            boolean r6 = r5.isAttached()
            if (r6 == 0) goto Lab
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            r6 = r1
            java.util.Set r6 = (java.util.Set) r6
            r9.invalidateConsumersOfNodeForKey(r5, r4, r6)
        Lab:
            int r0 = r0 + 1
            if (r0 < r3) goto L8d
        Laf:
            androidx.compose.runtime.collection.MutableVector<kotlin.Pair<androidx.compose.ui.node.BackwardsCompatNode, androidx.compose.ui.modifier.ModifierLocal<?>>> r0 = r9.updated
            r0.clear()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        Lba:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r0.next()
            androidx.compose.ui.node.BackwardsCompatNode r1 = (androidx.compose.ui.node.BackwardsCompatNode) r1
            r1.updateModifierLocalConsumer()
            goto Lba
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.modifier.ModifierLocalManager.triggerUpdates():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void invalidateConsumersOfNodeForKey(androidx.compose.ui.Modifier.Node r9, androidx.compose.ui.modifier.ModifierLocal<?> r10, java.util.Set<androidx.compose.ui.node.BackwardsCompatNode> r11) {
        /*
            r8 = this;
            androidx.compose.ui.node.DelegatableNode r9 = (androidx.compose.ui.node.DelegatableNode) r9
            androidx.compose.ui.node.Nodes r0 = androidx.compose.ui.node.Nodes.INSTANCE
            int r0 = r0.m3421getLocalsOLwlOKw()
            androidx.compose.ui.Modifier$Node r1 = r9.getNode()
            boolean r1 = r1.isAttached()
            if (r1 == 0) goto L91
            r1 = 16
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r1 = new androidx.compose.ui.Modifier.Node[r1]
            r3 = 0
            r2.<init>(r1, r3)
            androidx.compose.ui.Modifier$Node r1 = r9.getNode()
            androidx.compose.ui.Modifier$Node r1 = r1.getChild$ui_release()
            if (r1 != 0) goto L2e
            androidx.compose.ui.Modifier$Node r9 = r9.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r9)
            goto L31
        L2e:
            r2.add(r1)
        L31:
            boolean r9 = r2.isNotEmpty()
            if (r9 == 0) goto L90
            int r9 = r2.getSize()
            r1 = 1
            int r9 = r9 - r1
            java.lang.Object r9 = r2.removeAt(r9)
            androidx.compose.ui.Modifier$Node r9 = (androidx.compose.ui.Modifier.Node) r9
            int r4 = r9.getAggregateChildKindSet$ui_release()
            r4 = r4 & r0
            if (r4 == 0) goto L8c
            r4 = r9
        L4b:
            if (r4 == 0) goto L8c
            int r5 = r4.getKindSet$ui_release()
            r5 = r5 & r0
            if (r5 == 0) goto L87
            boolean r5 = r4 instanceof androidx.compose.ui.modifier.ModifierLocalNode
            if (r5 == 0) goto L84
            r5 = r4
            androidx.compose.ui.modifier.ModifierLocalNode r5 = (androidx.compose.ui.modifier.ModifierLocalNode) r5
            boolean r6 = r5 instanceof androidx.compose.ui.node.BackwardsCompatNode
            if (r6 == 0) goto L77
            r6 = r5
            androidx.compose.ui.node.BackwardsCompatNode r6 = (androidx.compose.ui.node.BackwardsCompatNode) r6
            androidx.compose.ui.Modifier$Element r7 = r6.getElement()
            boolean r7 = r7 instanceof androidx.compose.ui.modifier.ModifierLocalConsumer
            if (r7 == 0) goto L77
            java.util.HashSet r6 = r6.getReadValues()
            boolean r6 = r6.contains(r10)
            if (r6 == 0) goto L77
            r11.add(r5)
        L77:
            androidx.compose.ui.modifier.ModifierLocalMap r5 = r5.getProvidedValues()
            boolean r5 = r5.contains$ui_release(r10)
            if (r5 != 0) goto L82
            goto L84
        L82:
            r5 = 0
            goto L85
        L84:
            r5 = 1
        L85:
            if (r5 == 0) goto L31
        L87:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            goto L4b
        L8c:
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r9)
            goto L31
        L90:
            return
        L91:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.modifier.ModifierLocalManager.invalidateConsumersOfNodeForKey(androidx.compose.ui.Modifier$Node, androidx.compose.ui.modifier.ModifierLocal, java.util.Set):void");
    }

    public final void updatedProvider(BackwardsCompatNode node, ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.updated.add(TuplesKt.to(node, key));
        invalidate();
    }

    public final void insertedProvider(BackwardsCompatNode node, ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.inserted.add(TuplesKt.to(node, key));
        invalidate();
    }

    public final void removedProvider(BackwardsCompatNode node, ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.removed.add(TuplesKt.to(DelegatableNodeKt.requireLayoutNode(node), key));
        invalidate();
    }
}
