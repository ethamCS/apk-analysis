package me.regexp;

import org.apache.james.mime4j.field.datetime.parser.DateTimeParserConstants;
import org.kxml2.wap.Wbxml;
/* loaded from: classes.dex */
public class REProgram {
    static final int OPT_HASBACKREFS = 1;
    static final int OPT_HASBOL = 2;
    int flags;
    char[] instruction;
    int lenInstruction;
    int maxParens;
    char[] prefix;

    public REProgram(char[] instruction) {
        this(instruction, instruction.length);
    }

    public REProgram(int parens, char[] instruction) {
        this(instruction, instruction.length);
        this.maxParens = parens;
    }

    public REProgram(char[] instruction, int lenInstruction) {
        this.maxParens = -1;
        setInstructions(instruction, lenInstruction);
    }

    public char[] getInstructions() {
        if (this.lenInstruction != 0) {
            char[] ret = new char[this.lenInstruction];
            System.arraycopy(this.instruction, 0, ret, 0, this.lenInstruction);
            return ret;
        }
        return null;
    }

    public void setInstructions(char[] instruction, int lenInstruction) {
        this.instruction = instruction;
        this.lenInstruction = lenInstruction;
        this.flags = 0;
        this.prefix = null;
        if (instruction != null && lenInstruction != 0) {
            if (lenInstruction >= 3 && instruction[0] == '|') {
                int next = (short) instruction[2];
                if (instruction[next + 0] == 'E' && lenInstruction >= 6) {
                    char nextOp = instruction[3];
                    if (nextOp == 'A') {
                        char c = instruction[4];
                        this.prefix = new char[c];
                        System.arraycopy(instruction, 6, this.prefix, 0, c);
                    } else if (nextOp == '^') {
                        this.flags |= 2;
                    }
                }
            }
            int i = 0;
            while (i < lenInstruction) {
                switch (instruction[i + 0]) {
                    case DateTimeParserConstants.MILITARY_ZONE /* 35 */:
                        this.flags |= 1;
                        return;
                    case Wbxml.EXT_I_1 /* 65 */:
                        i += instruction[i + 1];
                        break;
                    case '[':
                        i += instruction[i + 1] * 2;
                        break;
                }
                i += 3;
            }
        }
    }

    public char[] getPrefix() {
        if (this.prefix != null) {
            char[] ret = new char[this.prefix.length];
            System.arraycopy(this.prefix, 0, ret, 0, this.prefix.length);
            return ret;
        }
        return null;
    }
}
