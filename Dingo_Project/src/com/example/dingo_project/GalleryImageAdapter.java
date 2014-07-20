package com.example.dingo_project;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;


@SuppressLint("NewApi") public class GalleryImageAdapter extends BaseAdapter 
{
	private Context mContext;

	private Integer[] mImageIds = {
			R.drawable.dc,
			R.drawable.amarelinha,
			R.drawable.bdg,
			R.drawable.bola,
			R.drawable.corda,
			R.drawable.corre,
			R.drawable.piao,
			R.drawable.pipa,
			R.drawable.cs,
			R.drawable.peteca,
			R.drawable.corridasaco,
			R.drawable.ee,
			R.drawable.tsf
			
			
	};

	public GalleryImageAdapter(Context context) 
	{
		mContext = context;
	}

	public int getCount() {
		return mImageIds.length;
	}

	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}


	// Override this method according to your need
	@SuppressLint("NewApi") public View getView(int index, View view, ViewGroup viewGroup) 
	{
		// TODO Auto-generated method stub
		ImageView i = new ImageView(mContext);

		i.setImageResource(mImageIds[index]);
		i.setLayoutParams(new Gallery.LayoutParams(440, 495));
		i.setScaleType(ImageView.ScaleType.FIT_XY);
		i.setScrollX(10);

		return i;
	}
}



