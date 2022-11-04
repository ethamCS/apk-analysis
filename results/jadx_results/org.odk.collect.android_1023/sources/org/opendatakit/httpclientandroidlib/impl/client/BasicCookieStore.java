package org.opendatakit.httpclientandroidlib.impl.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.opendatakit.httpclientandroidlib.annotation.GuardedBy;
import org.opendatakit.httpclientandroidlib.annotation.ThreadSafe;
import org.opendatakit.httpclientandroidlib.client.CookieStore;
import org.opendatakit.httpclientandroidlib.cookie.Cookie;
import org.opendatakit.httpclientandroidlib.cookie.CookieIdentityComparator;
@ThreadSafe
/* loaded from: classes.dex */
public class BasicCookieStore implements CookieStore, Serializable {
    private static final long serialVersionUID = -7581093305228232025L;
    @GuardedBy("this")
    private final TreeSet<Cookie> cookies = new TreeSet<>(new CookieIdentityComparator());

    @Override // org.opendatakit.httpclientandroidlib.client.CookieStore
    public synchronized void addCookie(Cookie cookie) {
        if (cookie != null) {
            this.cookies.remove(cookie);
            if (!cookie.isExpired(new Date())) {
                this.cookies.add(cookie);
            }
        }
    }

    public synchronized void addCookies(Cookie[] cookies) {
        if (cookies != null) {
            for (Cookie cooky : cookies) {
                addCookie(cooky);
            }
        }
    }

    @Override // org.opendatakit.httpclientandroidlib.client.CookieStore
    public synchronized List<Cookie> getCookies() {
        return new ArrayList(this.cookies);
    }

    @Override // org.opendatakit.httpclientandroidlib.client.CookieStore
    public synchronized boolean clearExpired(Date date) {
        boolean removed;
        if (date == null) {
            removed = false;
        } else {
            removed = false;
            Iterator<Cookie> it = this.cookies.iterator();
            while (it.hasNext()) {
                if (it.next().isExpired(date)) {
                    it.remove();
                    removed = true;
                }
            }
        }
        return removed;
    }

    @Override // org.opendatakit.httpclientandroidlib.client.CookieStore
    public synchronized void clear() {
        this.cookies.clear();
    }

    public synchronized String toString() {
        return this.cookies.toString();
    }
}
