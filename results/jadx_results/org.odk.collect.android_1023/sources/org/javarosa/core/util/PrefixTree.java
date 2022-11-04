package org.javarosa.core.util;

import java.util.Enumeration;
import java.util.Vector;
/* loaded from: classes.dex */
public class PrefixTree {
    private PrefixTreeNode root = new PrefixTreeNode("");

    public static int sharedPrefixLength(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < str2.length() && str.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return i;
    }

    public void addString(String str) {
        PrefixTreeNode prefixTreeNode;
        int i;
        int i2;
        PrefixTreeNode prefixTreeNode2 = this.root;
        while (true) {
            PrefixTreeNode prefixTreeNode3 = prefixTreeNode2;
            if (str.length() > 0) {
                if (prefixTreeNode3.children != null) {
                    Enumeration elements = prefixTreeNode3.children.elements();
                    int i3 = 0;
                    while (true) {
                        if (!elements.hasMoreElements()) {
                            prefixTreeNode = null;
                            i = i3;
                            break;
                        }
                        PrefixTreeNode prefixTreeNode4 = (PrefixTreeNode) elements.nextElement();
                        int sharedPrefixLength = sharedPrefixLength(str, prefixTreeNode4.prefix);
                        if (sharedPrefixLength > 0) {
                            i = sharedPrefixLength;
                            prefixTreeNode = prefixTreeNode4;
                            break;
                        }
                        i3 = sharedPrefixLength;
                    }
                } else {
                    prefixTreeNode = null;
                    i = 0;
                }
                if (prefixTreeNode == null) {
                    prefixTreeNode2 = new PrefixTreeNode(str);
                    int length = str.length();
                    if (prefixTreeNode3.children == null) {
                        prefixTreeNode3.children = new Vector();
                    }
                    prefixTreeNode3.children.addElement(prefixTreeNode2);
                    i2 = length;
                } else if (i < prefixTreeNode.prefix.length()) {
                    prefixTreeNode2 = new PrefixTreeNode(str.substring(0, i));
                    prefixTreeNode3.children.removeElement(prefixTreeNode);
                    prefixTreeNode.prefix = prefixTreeNode.prefix.substring(i);
                    prefixTreeNode3.children.addElement(prefixTreeNode2);
                    prefixTreeNode2.children = new Vector();
                    prefixTreeNode2.children.addElement(prefixTreeNode);
                    i2 = i;
                } else {
                    prefixTreeNode2 = prefixTreeNode;
                    i2 = i;
                }
                str = str.substring(i2);
            } else {
                prefixTreeNode3.terminal = true;
                return;
            }
        }
    }

    public Vector getStrings() {
        Vector vector = new Vector();
        this.root.decompose(vector, "");
        return vector;
    }

    public String toString() {
        return this.root.toString();
    }
}
