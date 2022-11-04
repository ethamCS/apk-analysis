package ba;

import bf.y;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.p;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a(\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a \u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0002\u001a(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a(\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a \u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0016\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¨\u0006\u001e"}, d2 = {"Lcom/fasterxml/jackson/databind/JsonNode;", "args", "data", "i", "guard", "then", "else_", "d", BuildConfig.FLAVOR, "operator", "Lcom/fasterxml/jackson/databind/node/ArrayNode;", "e", "operandExpr", "f", "unit", BuildConfig.FLAVOR, "j", "dateOperand", "amount", "Lba/c;", "g", "operand", "lambda", "initial", "h", "index", "c", "b", "expr", "a", "certlogic-kotlin"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class a {

    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/fasterxml/jackson/databind/JsonNode;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ba.a$a */
    /* loaded from: classes.dex */
    public static final class C0077a extends v implements gc.a<JsonNode> {

        /* renamed from: c */
        final /* synthetic */ JsonNode f5761c;

        /* renamed from: d */
        final /* synthetic */ JsonNode f5762d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0077a(JsonNode jsonNode, JsonNode jsonNode2) {
            super(0);
            this.f5761c = jsonNode;
            this.f5762d = jsonNode2;
        }

        /* renamed from: b */
        public final JsonNode invoke() {
            return a.a(this.f5761c, this.f5762d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if (r0.equals("not-before") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if (r0.equals("not-after") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
        if (r0.equals("after") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
        if (r0.equals("and") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if (r0.equals("===") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ed, code lost:
        if (r0.equals("in") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011a, code lost:
        if (r0.equals(">=") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
        if (r0.equals("<=") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012e, code lost:
        if (r0.equals(">") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
        if (r0.equals("<") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
        if (r0.equals("+") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0194, code lost:
        if (r0.equals("before") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0196, code lost:
        hc.t.d(r0, "operator");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
        return e(r0, (com.fasterxml.jackson.databind.node.ArrayNode) r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.fasterxml.jackson.databind.JsonNode a(com.fasterxml.jackson.databind.JsonNode r8, com.fasterxml.jackson.databind.JsonNode r9) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a.a(com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.databind.JsonNode):com.fasterxml.jackson.databind.JsonNode");
    }

    public static final JsonNode b(JsonNode jsonNode, JsonNode jsonNode2) {
        t.e(jsonNode, "operand");
        t.e(jsonNode2, "data");
        JsonNode a10 = a(jsonNode, jsonNode2);
        if (a10 instanceof TextNode) {
            c r10 = c.r(a10.asText());
            t.d(r10, "dccDateOfBirth(evalOperand.asText())");
            return r10;
        }
        throw new RuntimeException("operand of \"dccDateOfBirth\" must be a string");
    }

    public static final JsonNode c(JsonNode jsonNode, JsonNode jsonNode2, JsonNode jsonNode3) {
        String str;
        JsonNode jsonNode4;
        t.e(jsonNode, "operand");
        t.e(jsonNode2, "index");
        t.e(jsonNode3, "data");
        JsonNode a10 = a(jsonNode, jsonNode3);
        if ((a10 instanceof NullNode) || (a10 instanceof TextNode)) {
            if (!(jsonNode2 instanceof IntNode)) {
                throw new RuntimeException("\"index\" argument (#2) of \"extractFromUVCI\" must be an integer");
            }
            String d10 = b.d(a10 instanceof TextNode ? a10.asText() : null, jsonNode2.intValue());
            if (d10 == null) {
                jsonNode4 = NullNode.instance;
                str = "instance";
            } else {
                jsonNode4 = TextNode.valueOf(d10);
                str = "valueOf(result)";
            }
            t.d(jsonNode4, str);
            return jsonNode4;
        }
        throw new RuntimeException("\"UVCI\" argument (#1) of \"extractFromUVCI\" must be either a string or null");
    }

    public static final JsonNode d(JsonNode jsonNode, JsonNode jsonNode2, JsonNode jsonNode3, JsonNode jsonNode4) {
        t.e(jsonNode, "guard");
        t.e(jsonNode2, "then");
        t.e(jsonNode3, "else_");
        t.e(jsonNode4, "data");
        JsonNode a10 = a(jsonNode, jsonNode4);
        Boolean a11 = b.a(a10);
        if (t.a(a11, Boolean.TRUE)) {
            return a(jsonNode2, jsonNode4);
        }
        if (t.a(a11, Boolean.FALSE)) {
            return a(jsonNode3, jsonNode4);
        }
        if (a11 != null) {
            throw new p();
        }
        throw new RuntimeException(t.l("if-guard evaluates to something neither truthy, nor falsy: ", a10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0252, code lost:
        if (r12.equals("before") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0258, code lost:
        if (r0.isEmpty() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025a, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x025c, code lost:
        r13 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0264, code lost:
        if (r13.hasNext() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026e, code lost:
        if ((((com.fasterxml.jackson.databind.JsonNode) r13.next()) instanceof ba.c) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0270, code lost:
        if (r14 == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0272, code lost:
        r12 = ba.b.c(r12);
        r14 = ub.v.s(r0, 10);
        r13 = new java.util.ArrayList(r14);
        r14 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0287, code lost:
        if (r14.hasNext() == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0289, code lost:
        r13.add(((ba.c) ((com.fasterxml.jackson.databind.JsonNode) r14.next())).V());
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0299, code lost:
        r12 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf(ba.b.b(r12, r13));
        r13 = "{\n            if (!evalArgs.all { it is JsonDateTime }) {\n                throw RuntimeException(\"all operands of a date-time comparsion must be date-times\")\n            }\n            BooleanNode.valueOf(\n                compare(comparisonOperatorForDateTimeComparison(operator), evalArgs.map { (it as JsonDateTime).temporalValue() })\n           )\n        }";
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ad, code lost:
        throw new java.lang.RuntimeException("all operands of a date-time comparsion must be date-times");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r12.equals(">=") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r12.equals("<=") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        if (r12.equals(">") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r12.equals("<") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r12.equals("before") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (r13.size() < 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
        if (r13.size() > 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
        throw new java.lang.RuntimeException("an operation with operator \"" + r12 + "\" must have 2 or 3 operands");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r12.equals("not-before") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013d, code lost:
        if (r12.equals("not-before") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0145, code lost:
        if (r12.equals("not-after") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
        if (r12.equals("after") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019d, code lost:
        if (r12.equals(">=") != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a4, code lost:
        if (r12.equals("<=") != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (r12.equals("not-after") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ab, code lost:
        if (r12.equals(">") != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b2, code lost:
        if (r12.equals("<") != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b8, code lost:
        if (r0.isEmpty() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ba, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bc, code lost:
        r13 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
        if (r13.hasNext() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ce, code lost:
        if ((((com.fasterxml.jackson.databind.JsonNode) r13.next()) instanceof com.fasterxml.jackson.databind.node.IntNode) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d0, code lost:
        if (r14 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d2, code lost:
        r14 = ub.v.s(r0, 10);
        r13 = new java.util.ArrayList(r14);
        r14 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
        if (r14.hasNext() == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e5, code lost:
        r13.add(java.lang.Integer.valueOf(((com.fasterxml.jackson.databind.node.IntNode) ((com.fasterxml.jackson.databind.JsonNode) r14.next())).intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f9, code lost:
        r12 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf(ba.b.b(r12, r13));
        r13 = "{\n            if (!evalArgs.all { it is IntNode }) {\n                throw RuntimeException(\"all operands of a comparison operator must be of integer type\")\n            }\n            BooleanNode.valueOf(\n                compare(operator, evalArgs.map { (it as IntNode).intValue() })\n            )\n        }";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020c, code lost:
        throw new java.lang.RuntimeException("all operands of a comparison operator must be of integer type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r12.equals("after") == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.fasterxml.jackson.databind.JsonNode e(java.lang.String r12, com.fasterxml.jackson.databind.node.ArrayNode r13, com.fasterxml.jackson.databind.JsonNode r14) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a.e(java.lang.String, com.fasterxml.jackson.databind.node.ArrayNode, com.fasterxml.jackson.databind.JsonNode):com.fasterxml.jackson.databind.JsonNode");
    }

    public static final JsonNode f(JsonNode jsonNode, JsonNode jsonNode2) {
        BooleanNode booleanNode;
        String str;
        t.e(jsonNode, "operandExpr");
        t.e(jsonNode2, "data");
        JsonNode a10 = a(jsonNode, jsonNode2);
        Boolean a11 = b.a(a10);
        if (t.a(a11, Boolean.FALSE)) {
            booleanNode = BooleanNode.TRUE;
            str = "TRUE";
        } else if (!t.a(a11, Boolean.TRUE)) {
            if (a11 != null) {
                throw new p();
            }
            throw new RuntimeException(t.l("operand of ! evaluates to something neither truthy, nor falsy: ", a10));
        } else {
            booleanNode = BooleanNode.FALSE;
            str = "FALSE";
        }
        t.d(booleanNode, str);
        return booleanNode;
    }

    public static final c g(JsonNode jsonNode, JsonNode jsonNode2, JsonNode jsonNode3, JsonNode jsonNode4) {
        t.e(jsonNode, "dateOperand");
        t.e(jsonNode2, "amount");
        t.e(jsonNode3, "unit");
        t.e(jsonNode4, "data");
        if (jsonNode2 instanceof IntNode) {
            if (!j(jsonNode3)) {
                d[] values = d.values();
                ArrayList arrayList = new ArrayList(values.length);
                for (d dVar : values) {
                    arrayList.add(dVar.toString());
                }
                throw new RuntimeException(t.l("\"unit\" argument (#3) of \"plusTime\" must be a string with one of the time units: ", arrayList));
            }
            String textValue = jsonNode3.textValue();
            t.d(textValue, "unit.textValue()");
            d valueOf = d.valueOf(textValue);
            JsonNode a10 = a(jsonNode, jsonNode4);
            if (!(a10 instanceof TextNode)) {
                throw new RuntimeException("date argument (#1) of \"plusTime\" must be a string");
            }
            c M = c.s(a10.asText()).M(jsonNode2.intValue(), valueOf);
            t.d(M, "fromString(dateTimeStr.asText()).plusTime(amount.intValue(), timeUnit)");
            return M;
        }
        throw new RuntimeException("\"amount\" argument (#2) of \"plusTime\" must be an integer");
    }

    public static final JsonNode h(JsonNode jsonNode, JsonNode jsonNode2, JsonNode jsonNode3, JsonNode jsonNode4) {
        t.e(jsonNode, "operand");
        t.e(jsonNode2, "lambda");
        t.e(jsonNode3, "initial");
        t.e(jsonNode4, "data");
        JsonNode<JsonNode> a10 = a(jsonNode, jsonNode4);
        C0077a c0077a = new C0077a(jsonNode3, jsonNode4);
        if (t.a(a10, NullNode.instance)) {
            return c0077a.invoke();
        }
        if (!(a10 instanceof ArrayNode)) {
            throw new RuntimeException("operand of reduce evaluated to a non-null non-array");
        }
        JsonNode invoke = c0077a.invoke();
        for (JsonNode jsonNode5 : a10) {
            JsonNode jsonNode6 = ((ObjectNode) JsonNodeFactory.instance.objectNode().set("accumulator", invoke)).set("current", jsonNode5);
            t.d(jsonNode6, "instance.objectNode()\n                .set<ObjectNode>(\"accumulator\", accumulator)\n                .set<ObjectNode>(\"current\", current)");
            invoke = a(jsonNode2, jsonNode6);
        }
        return invoke;
    }

    public static final JsonNode i(JsonNode jsonNode, JsonNode jsonNode2) {
        List<String> y02;
        t.e(jsonNode, "args");
        t.e(jsonNode2, "data");
        if (jsonNode instanceof TextNode) {
            String asText = jsonNode.asText();
            if (t.a(asText, BuildConfig.FLAVOR)) {
                return jsonNode2;
            }
            t.d(asText, "path");
            y02 = y.y0(asText, new String[]{"."}, false, 0, 6, null);
            for (String str : y02) {
                if (!(jsonNode2 instanceof NullNode)) {
                    JsonNode jsonNode3 = null;
                    try {
                        int parseInt = Integer.parseInt(str, 10);
                        if (jsonNode2 instanceof ArrayNode) {
                            jsonNode3 = jsonNode2.get(parseInt);
                        }
                    } catch (NumberFormatException unused) {
                        if (jsonNode2 instanceof ObjectNode) {
                            jsonNode3 = jsonNode2.get(str);
                        }
                    }
                    if (jsonNode3 == null) {
                        jsonNode3 = NullNode.instance;
                    }
                    t.d(jsonNode3, "{\n            try {\n                val index = Integer.parseInt(fragment, 10)\n                if (acc is ArrayNode) acc[index] else null\n            } catch (e: NumberFormatException) {\n                if (acc is ObjectNode) acc[fragment] else null\n            } ?: NullNode.instance\n        }");
                    jsonNode2 = jsonNode3;
                }
            }
            return jsonNode2;
        }
        throw new RuntimeException("not of the form { \"var\": \"<path>\" }");
    }

    private static final boolean j(JsonNode jsonNode) {
        if (!(jsonNode instanceof TextNode)) {
            return false;
        }
        try {
            String textValue = jsonNode.textValue();
            t.d(textValue, "unit.textValue()");
            d.valueOf(textValue);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
