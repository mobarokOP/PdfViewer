
package com.pdfviewer.model;

import android.graphics.Bitmap;
import android.graphics.RectF;

public class PagePart {

    private final int page;

    private final Bitmap renderedBitmap;

    private final RectF pageRelativeBounds;

    private final boolean thumbnail;

    private int cacheOrder;

    public PagePart(int page, Bitmap renderedBitmap, RectF pageRelativeBounds, boolean thumbnail, int cacheOrder) {
        super();
        this.page = page;
        this.renderedBitmap = renderedBitmap;
        this.pageRelativeBounds = pageRelativeBounds;
        this.thumbnail = thumbnail;
        this.cacheOrder = cacheOrder;
    }

    public int getCacheOrder() {
        return cacheOrder;
    }

    public int getPage() {
        return page;
    }

    public Bitmap getRenderedBitmap() {
        return renderedBitmap;
    }

    public RectF getPageRelativeBounds() {
        return pageRelativeBounds;
    }

    public boolean isThumbnail() {
        return thumbnail;
    }

    public void setCacheOrder(int cacheOrder) {
        this.cacheOrder = cacheOrder;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PagePart)) {
            return false;
        }

        PagePart part = (PagePart) obj;
        return part.getPage() == page
                && part.getPageRelativeBounds().left == pageRelativeBounds.left
                && part.getPageRelativeBounds().right == pageRelativeBounds.right
                && part.getPageRelativeBounds().top == pageRelativeBounds.top
                && part.getPageRelativeBounds().bottom == pageRelativeBounds.bottom;
    }

}
