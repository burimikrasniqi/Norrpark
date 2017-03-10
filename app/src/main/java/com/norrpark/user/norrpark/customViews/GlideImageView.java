package com.norrpark.user.norrpark.customViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.norrpark.user.norrpark.R;

import java.io.File;

public class GlideImageView extends AppCompatImageView {

	private float viewAspectRatio;
	private int placeHolder;

	public GlideImageView(Context context) {
		super(context);
	}

	public GlideImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray array = context.getTheme().obtainStyledAttributes(
				attrs,
				R.styleable.Glide,
				0, 0);

		try {
			viewAspectRatio = array.getFloat(R.styleable.Glide_viewAspectRatio, 0);
			placeHolder = array.getResourceId(R.styleable.Glide_placeholderImage, 0);
		} finally {
			array.recycle();
		}
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		if (viewAspectRatio != 0) {
			int width = getMeasuredWidth();
			setMeasuredDimension(width, (int) (width * viewAspectRatio));
		}
	}

	public void setImageURI(String uri) {
		DrawableRequestBuilder requestBuilder = Glide.with(getContext()).load(uri).centerCrop();
		if (placeHolder != 0) {
			requestBuilder.placeholder(placeHolder);
		}
		requestBuilder.into(this);
	}

	public void setLocalImage(String path) {
		DrawableRequestBuilder requestBuilder;
		if (path == null) {
			requestBuilder = Glide.with(getContext()).load(path);
		} else {
			requestBuilder = Glide.with(getContext()).load(new File(path));
		}
		requestBuilder.centerCrop();
		if (placeHolder != 0) {
			requestBuilder.placeholder(placeHolder);
		}
		requestBuilder.into(this);
	}


	public void setImageURI(int resId) {
		DrawableRequestBuilder requestBuilder;
		if (resId == 0) {
			requestBuilder = Glide.with(getContext()).load((String) null);
		} else {
			requestBuilder = Glide.with(getContext()).load(resId);
		}
		requestBuilder.centerCrop();
		if (placeHolder != 0) {
			requestBuilder.placeholder(placeHolder);
		}
		requestBuilder.into(this);
	}

	public void setImageURI(String uri, Transformation transformation) {
		DrawableRequestBuilder requestBuilder = Glide.with(getContext()).load(uri).centerCrop()
				.bitmapTransform(transformation);
		if (placeHolder != 0) {
			requestBuilder.placeholder(placeHolder);
		}
		requestBuilder.into(this);
	}
}
