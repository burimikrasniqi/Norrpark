package com.norrpark.user.norrpark.customViews;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.widget.EditText;


import com.norrpark.user.norrpark.R;
import com.norrpark.user.norrpark.Utils.Font;


public class FontEditText extends AppCompatEditText {

	public FontEditText(Context context) {
		super(context);
		setFont(Font.HEEBO_REGULAR);
	}

	public FontEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		setFontFromAttributes(context, attrs);
	}

	public FontEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setFontFromAttributes(context, attrs);
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
		setIncludeFontPadding(false);
	}
}