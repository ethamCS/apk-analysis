package me.regexp;

import java.io.PrintStream;
import java.util.Hashtable;
/* loaded from: classes.dex */
public class REDebugCompiler extends RECompiler {
    static Hashtable hashOpcode = new Hashtable();

    static {
        hashOpcode.put(new Integer(56), "OP_RELUCTANTSTAR");
        hashOpcode.put(new Integer(61), "OP_RELUCTANTPLUS");
        hashOpcode.put(new Integer(47), "OP_RELUCTANTMAYBE");
        hashOpcode.put(new Integer(69), "OP_END");
        hashOpcode.put(new Integer(94), "OP_BOL");
        hashOpcode.put(new Integer(36), "OP_EOL");
        hashOpcode.put(new Integer(46), "OP_ANY");
        hashOpcode.put(new Integer(91), "OP_ANYOF");
        hashOpcode.put(new Integer(124), "OP_BRANCH");
        hashOpcode.put(new Integer(65), "OP_ATOM");
        hashOpcode.put(new Integer(42), "OP_STAR");
        hashOpcode.put(new Integer(43), "OP_PLUS");
        hashOpcode.put(new Integer(63), "OP_MAYBE");
        hashOpcode.put(new Integer(78), "OP_NOTHING");
        hashOpcode.put(new Integer(71), "OP_GOTO");
        hashOpcode.put(new Integer(67), "OP_CONTINUE");
        hashOpcode.put(new Integer(92), "OP_ESCAPE");
        hashOpcode.put(new Integer(40), "OP_OPEN");
        hashOpcode.put(new Integer(41), "OP_CLOSE");
        hashOpcode.put(new Integer(35), "OP_BACKREF");
        hashOpcode.put(new Integer(80), "OP_POSIXCLASS");
        hashOpcode.put(new Integer(60), "OP_OPEN_CLUSTER");
        hashOpcode.put(new Integer(62), "OP_CLOSE_CLUSTER");
    }

    String opcodeToString(char opcode) {
        String ret = (String) hashOpcode.get(new Integer(opcode));
        if (ret == null) {
            return "OP_????";
        }
        return ret;
    }

    String charToString(char c) {
        return (c < ' ' || c > 127) ? new StringBuffer().append("\\").append((int) c).toString() : String.valueOf(c);
    }

    String nodeToString(int node) {
        char opcode = this.instruction[node];
        return new StringBuffer().append(opcodeToString(opcode)).append(", opdata = ").append((int) this.instruction[node + 1]).toString();
    }

    public void dumpProgram(PrintStream p) {
        int i;
        int i2 = 0;
        while (i2 < this.lenInstruction) {
            char opcode = this.instruction[i2];
            char opdata = this.instruction[i2 + 1];
            int next = (short) this.instruction[i2 + 2];
            p.print(new StringBuffer().append(i2).append(". ").append(nodeToString(i2)).append(", next = ").toString());
            if (next == 0) {
                p.print("none");
            } else {
                p.print(i2 + next);
            }
            i2 += 3;
            if (opcode == '[') {
                p.print(", [");
                int i3 = i2;
                for (int r = 0; r < opdata; r++) {
                    int i4 = i3 + 1;
                    char charFirst = this.instruction[i3];
                    i3 = i4 + 1;
                    char charLast = this.instruction[i4];
                    if (charFirst == charLast) {
                        p.print(charToString(charFirst));
                    } else {
                        p.print(new StringBuffer().append(charToString(charFirst)).append("-").append(charToString(charLast)).toString());
                    }
                }
                p.print("]");
                i2 = i3;
            }
            if (opcode == 'A') {
                p.print(", \"");
                int len = opdata;
                while (true) {
                    int len2 = len;
                    i = i2;
                    len = len2 - 1;
                    if (len2 == 0) {
                        break;
                    }
                    i2 = i + 1;
                    p.print(charToString(this.instruction[i]));
                }
                p.print("\"");
                i2 = i;
            }
            p.println("");
        }
    }

    public void dumpProgram() {
        PrintStream w = new PrintStream(System.out);
        dumpProgram(w);
        w.flush();
    }
}
