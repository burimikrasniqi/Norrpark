package com.norrpark.user.norrpark.Utils;


import android.content.Context;
import android.graphics.Typeface;

public class Font {
	public static final int HEEBO_BOLD = 1;
	public static final int HEEBO_MEDIUM = 2;
	public static final int HEEBO_REGULAR = 3;

	private static Typeface boldTypeFace;
	private static Typeface mediumTypeFace;
	private static Typeface regularTypeFace;

	public static void init(Context context) {
		boldTypeFace = Typeface.createFromAsset(context.getAssets(), getTypeFaceName(HEEBO_BOLD));
		mediumTypeFace = Typeface.createFromAsset(context.getAssets(), getTypeFaceName(HEEBO_MEDIUM));
		regularTypeFace = Typeface.createFromAsset(context.getAssets(), getTypeFaceName(HEEBO_REGULAR));
	}


	public static Typeface getTypeFace(int fontType) {
		switch (fontType) {
			case HEEBO_BOLD:
				return boldTypeFace;
			case HEEBO_MEDIUM:
				return mediumTypeFace;
			case HEEBO_REGULAR:
				return regularTypeFace;
			default:
				return regularTypeFace;
		}
	}

	private static String getTypeFaceName(int fontType) {
		String typeFaceName = "";
		switch (fontType) {
			case HEEBO_BOLD:
				typeFaceName = "Heebo-Bold.ttf";
				break;
			case HEEBO_MEDIUM:
				typeFaceName = "Heebo-Medium.ttf";
				break;
			case HEEBO_REGULAR:
				typeFaceName = "Heebo-Regular.ttf";
				break;
			default:
				typeFaceName = "Heebo-Regular.ttf";
				break;
		}
		return typeFaceName;
	}
}