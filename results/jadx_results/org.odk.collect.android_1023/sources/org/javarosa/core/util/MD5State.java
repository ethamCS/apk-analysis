package org.javarosa.core.util;
/* loaded from: classes.dex */
class MD5State {
    byte[] buffer;
    long count;
    int[] state;

    public MD5State() {
        this.buffer = new byte[64];
        this.count = 0L;
        this.state = new int[4];
        this.state[0] = 1732584193;
        this.state[1] = -271733879;
        this.state[2] = -1732584194;
        this.state[3] = 271733878;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MD5State(MD5State mD5State) {
        this();
        for (int i = 0; i < this.buffer.length; i++) {
            this.buffer[i] = mD5State.buffer[i];
        }
        for (int i2 = 0; i2 < this.state.length; i2++) {
            this.state[i2] = mD5State.state[i2];
        }
        this.count = mD5State.count;
    }
}
