package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;
/* loaded from: classes.dex */
public abstract class MapperBuilder<M extends ObjectMapper, B extends MapperBuilder<M, B>> {
    protected final M _mapper;

    public MapperBuilder(M m10) {
        this._mapper = m10;
    }

    protected final B _this() {
        return this;
    }

    public B addModule(Module module) {
        this._mapper.registerModule(module);
        return _this();
    }

    public M build() {
        return this._mapper;
    }
}
