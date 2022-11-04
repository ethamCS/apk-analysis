package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: KeyMapping.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000ø\u0001\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    public static final KeyMapping commonKeyMapping(final Function1<? super KeyEvent, Boolean> shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo732mapZmokQxo(android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (shortcutModifier.invoke(KeyEvent.m2921boximpl(event)).booleanValue() && KeyEvent_androidKt.m2944isShiftPressedZmokQxo(event)) {
                    if (!Key.m2343equalsimpl0(KeyEvent_androidKt.m2938getKeyZmokQxo(event), MappedKeys.INSTANCE.m765getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.REDO;
                } else if (shortcutModifier.invoke(KeyEvent.m2921boximpl(event)).booleanValue()) {
                    long m2938getKeyZmokQxo = KeyEvent_androidKt.m2938getKeyZmokQxo(event);
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo, MappedKeys.INSTANCE.m747getCEK5gGoQ()) ? true : Key.m2343equalsimpl0(m2938getKeyZmokQxo, MappedKeys.INSTANCE.m756getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo, MappedKeys.INSTANCE.m763getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo, MappedKeys.INSTANCE.m764getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo, MappedKeys.INSTANCE.m744getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (!Key.m2343equalsimpl0(m2938getKeyZmokQxo, MappedKeys.INSTANCE.m765getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.UNDO;
                } else if (KeyEvent_androidKt.m2942isCtrlPressedZmokQxo(event)) {
                    return null;
                } else {
                    if (KeyEvent_androidKt.m2944isShiftPressedZmokQxo(event)) {
                        long m2938getKeyZmokQxo2 = KeyEvent_androidKt.m2938getKeyZmokQxo(event);
                        if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m751getDirectionLeftEK5gGoQ())) {
                            return KeyCommand.SELECT_LEFT_CHAR;
                        }
                        if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m752getDirectionRightEK5gGoQ())) {
                            return KeyCommand.SELECT_RIGHT_CHAR;
                        }
                        if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m753getDirectionUpEK5gGoQ())) {
                            return KeyCommand.SELECT_UP;
                        }
                        if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m750getDirectionDownEK5gGoQ())) {
                            return KeyCommand.SELECT_DOWN;
                        }
                        if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m760getPageUpEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_UP;
                        }
                        if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m759getPageDownEK5gGoQ())) {
                            return KeyCommand.SELECT_PAGE_DOWN;
                        }
                        if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m758getMoveHomeEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_START;
                        }
                        if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m757getMoveEndEK5gGoQ())) {
                            return KeyCommand.SELECT_LINE_END;
                        }
                        if (!Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m756getInsertEK5gGoQ())) {
                            return null;
                        }
                        return KeyCommand.PASTE;
                    }
                    long m2938getKeyZmokQxo3 = KeyEvent_androidKt.m2938getKeyZmokQxo(event);
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m751getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.LEFT_CHAR;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m752getDirectionRightEK5gGoQ())) {
                        return KeyCommand.RIGHT_CHAR;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m753getDirectionUpEK5gGoQ())) {
                        return KeyCommand.UP;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m750getDirectionDownEK5gGoQ())) {
                        return KeyCommand.DOWN;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m760getPageUpEK5gGoQ())) {
                        return KeyCommand.PAGE_UP;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m759getPageDownEK5gGoQ())) {
                        return KeyCommand.PAGE_DOWN;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m758getMoveHomeEK5gGoQ())) {
                        return KeyCommand.LINE_START;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m757getMoveEndEK5gGoQ())) {
                        return KeyCommand.LINE_END;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m754getEnterEK5gGoQ())) {
                        return KeyCommand.NEW_LINE;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m746getBackspaceEK5gGoQ())) {
                        return KeyCommand.DELETE_PREV_CHAR;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m749getDeleteEK5gGoQ())) {
                        return KeyCommand.DELETE_NEXT_CHAR;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m761getPasteEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m748getCutEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (!Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m762getTabEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.TAB;
                }
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(KeyMappingKt$defaultKeyMapping$1.INSTANCE);
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo732mapZmokQxo(android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m2944isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m2942isCtrlPressedZmokQxo(event)) {
                    long m2938getKeyZmokQxo = KeyEvent_androidKt.m2938getKeyZmokQxo(event);
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo, MappedKeys.INSTANCE.m751getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo, MappedKeys.INSTANCE.m752getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo, MappedKeys.INSTANCE.m753getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo, MappedKeys.INSTANCE.m750getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m2942isCtrlPressedZmokQxo(event)) {
                    long m2938getKeyZmokQxo2 = KeyEvent_androidKt.m2938getKeyZmokQxo(event);
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m751getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m752getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m753getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m750getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m755getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m749getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m746getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo2, MappedKeys.INSTANCE.m745getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m2944isShiftPressedZmokQxo(event)) {
                    long m2938getKeyZmokQxo3 = KeyEvent_androidKt.m2938getKeyZmokQxo(event);
                    if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m758getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_HOME;
                    } else if (Key.m2343equalsimpl0(m2938getKeyZmokQxo3, MappedKeys.INSTANCE.m757getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                }
                return keyCommand == null ? KeyMapping.this.mo732mapZmokQxo(event) : keyCommand;
            }
        };
    }
}
