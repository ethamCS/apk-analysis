package org.bouncycastle.jce.provider;

import fh.c;
import gg.d0;
import hh.e0;
import hh.i0;
import hh.w;
import hh.y;
/* loaded from: classes3.dex */
public class PKIXNameConstraintValidator {
    i0 validator = new i0();

    public void addExcludedSubtree(y yVar) {
        this.validator.a(yVar);
    }

    public void checkExcluded(w wVar) {
        try {
            this.validator.c(wVar);
        } catch (e0 e10) {
            throw new PKIXNameConstraintValidatorException(e10.getMessage(), e10);
        }
    }

    public void checkExcludedDN(d0 d0Var) {
        try {
            this.validator.d(c.n(d0Var));
        } catch (e0 e10) {
            throw new PKIXNameConstraintValidatorException(e10.getMessage(), e10);
        }
    }

    public void checkPermitted(w wVar) {
        try {
            this.validator.k(wVar);
        } catch (e0 e10) {
            throw new PKIXNameConstraintValidatorException(e10.getMessage(), e10);
        }
    }

    public void checkPermittedDN(d0 d0Var) {
        try {
            this.validator.l(c.n(d0Var));
        } catch (e0 e10) {
            throw new PKIXNameConstraintValidatorException(e10.getMessage(), e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PKIXNameConstraintValidator)) {
            return false;
        }
        return this.validator.equals(((PKIXNameConstraintValidator) obj).validator);
    }

    public int hashCode() {
        return this.validator.hashCode();
    }

    public void intersectEmptyPermittedSubtree(int i10) {
        this.validator.E(i10);
    }

    public void intersectPermittedSubtree(y yVar) {
        this.validator.J(yVar);
    }

    public void intersectPermittedSubtree(y[] yVarArr) {
        this.validator.K(yVarArr);
    }

    public String toString() {
        return this.validator.toString();
    }
}
