
package com.pdfviewer.listener;

import android.graphics.Canvas;


public interface OnDrawListener {

    
    void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage);
}
