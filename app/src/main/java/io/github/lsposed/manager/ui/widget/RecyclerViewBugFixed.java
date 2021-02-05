/*
 * This file is part of LSPosed.
 *
 * LSPosed is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LSPosed is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LSPosed.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2020 EdXposed Contributors
 * Copyright (C) 2021 LSPosed Contributors
 */

package io.github.lsposed.manager.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import me.zhanghai.android.fastscroll.FixItemDecorationRecyclerView;

public class RecyclerViewBugFixed extends FixItemDecorationRecyclerView {


    public RecyclerViewBugFixed(@NonNull Context context) {
        super(context);
        setEdgeEffectFactory(getClipToPadding() ? new EdgeEffectFactory() : new AlwaysClipToPaddingEdgeEffectFactory());
    }

    public RecyclerViewBugFixed(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setEdgeEffectFactory(getClipToPadding() ? new EdgeEffectFactory() : new AlwaysClipToPaddingEdgeEffectFactory());
    }

    public RecyclerViewBugFixed(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setEdgeEffectFactory(getClipToPadding() ? new EdgeEffectFactory() : new AlwaysClipToPaddingEdgeEffectFactory());
    }

    public static class AlwaysClipToPaddingEdgeEffectFactory extends RecyclerView.EdgeEffectFactory {

        @NonNull
        @Override
        protected EdgeEffect createEdgeEffect(@NonNull RecyclerView view, int direction) {
            return new EdgeEffect(view.getContext()) {
                private boolean ensureSize = false;

                private void ensureSize() {
                    if (ensureSize) return;
                    ensureSize = true;
                    switch (direction) {
                        case DIRECTION_LEFT:
                        case DIRECTION_RIGHT:
                            setSize(view.getMeasuredHeight() - view.getPaddingTop() - view.getPaddingBottom(),
                                    view.getMeasuredWidth() - view.getPaddingLeft() - view.getPaddingRight());
                            break;
                        case DIRECTION_TOP:
                        case DIRECTION_BOTTOM:
                            setSize(view.getMeasuredWidth() - view.getPaddingLeft() - view.getPaddingRight(),
                                    view.getMeasuredHeight() - view.getPaddingTop() - view.getPaddingBottom());
                            break;
                    }
                }

                @Override
                public boolean draw(Canvas c) {
                    ensureSize();

                    int restore = c.save();
                    switch (direction) {
                        case DIRECTION_LEFT:
                            c.translate(view.getPaddingBottom(), 0f);
                            break;
                        case DIRECTION_TOP:
                            c.translate(view.getPaddingLeft(), view.getPaddingTop());
                            break;
                        case DIRECTION_RIGHT:
                            c.translate(-view.getPaddingTop(), 0f);
                            break;
                        case DIRECTION_BOTTOM:
                            c.translate(view.getPaddingRight(), view.getPaddingBottom());
                            break;
                    }
                    boolean res = super.draw(c);
                    c.restoreToCount(restore);
                    return res;
                }
            };
        }
    }
}
