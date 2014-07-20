package com.example.dingo_project;



import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.content.pm.ActivityInfo;

import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

import android.widget.ImageButton;
import android.widget.MediaController;

import android.widget.VideoView;


public class DCInstrucoes extends ActionBarActivity {

	static int cont = 0;
	VideoView videoV = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dcinstrucoes);
		
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		

		Intent i = getIntent();
		final int positionMusica = i.getIntExtra("PosicaoMusica", -1);
		final int positionJogador = i.getIntExtra("PosicaoJogador", -1);
		
		
		//Log.i("posicao musica : ",positionMusica+"");
		 //Log.i("posicao numero jogadores : ",positionJogador+"");
		
		videoV = (VideoView) findViewById(R.id.videoView1);
		MediaController mediaController = new MediaController(this);
		
		
		mediaController.setAnchorView(videoV);
		
		
		Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.eu);
		videoV.setVideoURI(video);
		videoV.setMediaController(mediaController);
		videoV.start();
		
		
		
		ImageButton bw = (ImageButton) findViewById(R.id.button_bw4);

		 	bw.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					
					if(videoV !=null && videoV.isPlaying()){
				    	 videoV.suspend();
				    	 videoV =  null;
				     }
					
					Intent i = new Intent (getApplicationContext(),SelecionarNumeroJogadores.class);
					i.putExtra("PosicaoMusica", positionMusica);
					i.putExtra("PosicaoJogador", positionJogador);
					startActivity(i);					
				}
		 	
		 	});
		
		 	
		 	
		 	
		
		ImageButton fw = (ImageButton) findViewById(R.id.button_fw4);
		
		 fw.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(videoV !=null && videoV.isPlaying()){
			    	 videoV.suspend();
			    	 videoV =  null;
			     }
				
				Intent i = new Intent (getApplicationContext(),DC.class);
				 i.putExtra("PosicaoMusica", positionMusica);
     			 i.putExtra("PosicaoJogador", positionJogador);
				startActivity(i);
				
				
			}
			 
		 });
		 
		 
		 
		 
		 

		ImageButton pp = (ImageButton) findViewById(R.id.button_pp);
		
		pp.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if(cont ==0){
					videoV.pause();
					cont =1;
				}else{
					videoV.start();
					cont=0;
				}
				

				// pausar e dar play na animação
			}

		});
		
	}

	

	 
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dcinstrucoes, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_dcinstrucoes,
					container, false);
			return rootView;
		}
	}

}



