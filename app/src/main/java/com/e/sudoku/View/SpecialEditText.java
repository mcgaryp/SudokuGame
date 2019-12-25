package com.e.sudoku.View;

import android.content.Context;
import android.util.AttributeSet;

public class SpecialEditText  extends androidx.appcompat.widget.AppCompatEditText {
    // Variables
    private boolean editable;

    // Constructors
    public SpecialEditText(Context context) { super(context); }
    public SpecialEditText(Context context, AttributeSet attrs) { super(context, attrs); }
    public SpecialEditText(Context context, AttributeSet attrs, int defStyleAttr) { super(context, attrs, defStyleAttr); }

    // Setters
    public void setEditable(boolean editable) { this.editable = editable; }
    public void setEnable()                   { setEnable();              }
    public void setDisable()                  { setDisable();             }

    // Getters
    public boolean isEditable() { return editable; }
}
