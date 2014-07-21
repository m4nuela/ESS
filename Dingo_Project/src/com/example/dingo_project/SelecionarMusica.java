package com.example.dingo_project;

import com.example.dingo_project.SelecionarNumeroJogadores.PlaceholderFragment;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.os.Build;

public class SelecionarMusica extends ActionBarActivity {

	
	
	static int posicao;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selecionar_musica);

		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
			
		

		ImageButton bw = (ImageButton) findViewById(R.id.button_bw3);

		bw.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				//Intent i = new Intent (getApplicationContext(),MainActivity.class);
				//startActivity(i);
				finish();

			}

		});




		ImageButton fw = (ImageButton) findViewById(R.id.button_fw3);

		fw.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// vai para a tela de selecionar numero de participantes]
				
				Intent i = new Intent (getApplicationContext(),SelecionarNumeroJogadores.class);
    			 i.putExtra("valorPosicao", -1);
			     startActivity(i);


			}

		});


		final ListView list = (ListView) findViewById(R.id.list);

		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
			     
			     //Log.v("posicao musica 1  : ", position+"");
			     
			     Intent i = new Intent (getApplicationContext(),SelecionarNumeroJogadores.class);
     			 posicao = position+1;
			     i.putExtra("valorPosicao", position+1);
			     startActivity(i);

				// vai para tela de selecionar numero de participantes



			}

		});



	}
	
	public void onRestoreInstanceState(Bundle savedInstanceState) 
	{
	super.onRestoreInstanceState(savedInstanceState);
	//---retrieve the information persisted earlier---
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.selecionar_musica, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_selecionar_musica, container, false);
			return rootView;
		}
	}

}
