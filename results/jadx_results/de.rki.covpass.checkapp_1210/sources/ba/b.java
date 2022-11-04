package ba;

import bf.k;
import bf.x;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import hc.t;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a \u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000\u001a.\u0010\u0011\u001a\u00020\u0002\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\tH\u0000¨\u0006\u0016"}, d2 = {"Lcom/fasterxml/jackson/databind/JsonNode;", "value", BuildConfig.FLAVOR, "f", "g", "a", "(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/Boolean;", BuildConfig.FLAVOR, "operator", BuildConfig.FLAVOR, "l", "r", "e", BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "args", "b", "c", "uvci", "index", "d", "certlogic-kotlin"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class b {
    public static final Boolean a(JsonNode jsonNode) {
        t.e(jsonNode, "value");
        if (f(jsonNode)) {
            return Boolean.FALSE;
        }
        if (!g(jsonNode)) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static final <T extends Comparable<? super T>> boolean b(String str, List<? extends T> list) {
        t.e(str, "operator");
        t.e(list, "args");
        int size = list.size();
        if (size != 2) {
            if (size == 3) {
                return e(str, list.get(0).compareTo(list.get(1)), 0) && e(str, list.get(1).compareTo(list.get(2)), 0);
            }
            throw new RuntimeException("invalid number of operands to a \"" + str + "\" operation");
        }
        return e(str, list.get(0).compareTo(list.get(1)), 0);
    }

    public static final String c(String str) {
        t.e(str, "operator");
        switch (str.hashCode()) {
            case -1392885889:
                if (str.equals("before")) {
                    return "<";
                }
                break;
            case 92734940:
                if (str.equals("after")) {
                    return ">";
                }
                break;
            case 179182178:
                if (str.equals("not-after")) {
                    return "<=";
                }
                break;
            case 1286978489:
                if (str.equals("not-before")) {
                    return ">=";
                }
                break;
        }
        throw new RuntimeException("unhandled date-time comparison operator \"" + str + '\"');
    }

    public static final String d(String str, int i10) {
        boolean I;
        if (str == null || i10 < 0) {
            return null;
        }
        I = x.I(str, "URN:UVCI:", false, 2, null);
        if (I) {
            str = str.substring(9);
            t.d(str, "(this as java.lang.String).substring(startIndex)");
        }
        List<String> k10 = new k("[/#:]").k(str, 0);
        if (i10 >= k10.size()) {
            return null;
        }
        return k10.get(i10);
    }

    public static final boolean e(String str, int i10, int i11) {
        t.e(str, "operator");
        int hashCode = str.hashCode();
        if (hashCode == 60) {
            if (str.equals("<")) {
                if (i10 < i11) {
                    return true;
                }
                return false;
            }
            throw new RuntimeException("unhandled comparison operator \"" + str + '\"');
        } else if (hashCode == 62) {
            if (str.equals(">")) {
                if (i10 > i11) {
                    return true;
                }
                return false;
            }
            throw new RuntimeException("unhandled comparison operator \"" + str + '\"');
        } else if (hashCode == 1921) {
            if (str.equals("<=")) {
                if (i10 <= i11) {
                    return true;
                }
                return false;
            }
            throw new RuntimeException("unhandled comparison operator \"" + str + '\"');
        } else {
            if (hashCode == 1983 && str.equals(">=")) {
                if (i10 >= i11) {
                    return true;
                }
                return false;
            }
            throw new RuntimeException("unhandled comparison operator \"" + str + '\"');
        }
    }

    public static final boolean f(JsonNode jsonNode) {
        t.e(jsonNode, "value");
        if (jsonNode instanceof BooleanNode) {
            return t.a(jsonNode, BooleanNode.FALSE);
        }
        if (!(jsonNode instanceof NullNode)) {
            if (jsonNode instanceof TextNode) {
                String textValue = jsonNode.textValue();
                t.d(textValue, "value.textValue()");
                if (textValue.length() != 0) {
                    return false;
                }
            } else if (jsonNode instanceof IntNode) {
                if (jsonNode.intValue() != 0) {
                    return false;
                }
            } else if (jsonNode instanceof ArrayNode) {
                if (jsonNode.size() != 0) {
                    return false;
                }
            } else if (!(jsonNode instanceof ObjectNode) || jsonNode.size() != 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean g(JsonNode jsonNode) {
        t.e(jsonNode, "value");
        if (jsonNode instanceof BooleanNode) {
            return t.a(jsonNode, BooleanNode.TRUE);
        }
        if (jsonNode instanceof TextNode) {
            String textValue = jsonNode.textValue();
            t.d(textValue, "value.textValue()");
            if (textValue.length() > 0) {
                return true;
            }
        } else if (jsonNode instanceof IntNode) {
            if (jsonNode.intValue() != 0) {
                return true;
            }
        } else if (jsonNode instanceof ArrayNode) {
            if (jsonNode.size() > 0) {
                return true;
            }
        } else if ((jsonNode instanceof ObjectNode) && jsonNode.size() > 0) {
            return true;
        }
        return false;
    }
}
