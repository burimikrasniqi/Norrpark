package com.norrpark.user.norrpark.customViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;

import com.norrpark.user.norrpark.R;
import com.norrpark.user.norrpark.Utils.Font;


public class FontTextView extends TextView {

	public FontTextView(Context context) {
		super(context);
		if (!isInEditMode()) {
			setFont(Font.HEEBO_REGULAR);
		}
	}

	public FontTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		if (!isInEditMode()) {
			setFontFromAttributes(context, attrs);
		}
	}

	public FontTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		if (!isInEditMode()) {
			setFontFromAttributes(context, attrs);
		}
	}

	private void setFontFromAttributes(Context context, AttributeSet attrs) {
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomFont);
		setFont(a.getInt(R.styleable.CustomFont_font_type, Font.HEEBO_REGULAR));
		a.recycle();
	}

	public void setFont(int fontType) {
		Typeface tf = Font.getTypeFace(fontType);
		if (tf != null) {
			setTypeface(tf);
		}
		setLineSpacing(0.0f, 1.0f);
	}
}
