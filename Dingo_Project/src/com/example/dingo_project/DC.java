package com.example.dingo_project;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.os.Build;
import java.util.Random;

public class DC extends ActionBarActivity {

	MediaPlayer media;
	MediaPlayer mediaAux;
	static boolean tocar = true;
	static volatile Thread background;
	static boolean jaExiste = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dc);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);



		Intent i = getIntent();
		final int positionMusica = i.getIntExtra("PosicaoMusica", -1);
		final int positionJogador = i.getIntExtra("PosicaoJogador", -1);


		Log.i("posicao musica : ",positionMusica+"");
		Log.i("posicao numero jogadores : ",positionJogador+"");

		String var = "";
		switch (positionMusica){
		case 1:
			var = R.raw.atireiopaunogato+"";
			break;

		case 2:
			var = R.raw.caicaibalao+"";
			break;

		case 3:
			var = R.raw.escravosdejo+"";
			break;

		case 4:
			var = R.raw.festajunina+"";
			break;

		case 5:
			var = R.raw.ilarie+"";
			break;

		case 6:
			var = R.raw.luadecristal+"";
			break;

		case 7:
			var = R.raw.plunctplactzum+"";
			break;

		case 8:
			var = R.raw.superfantastico+"";
			break;

		case 9:
			var = R.raw.tindolele+"";
			break;

		case 10:
			var = R.raw.unidunite+"";
			break;

		default:
			var = R.raw.atireiopaunogato+"";
			break;
		}



		Uri path = Uri.parse("android.resource://" + getPackageName() + "/" + var);
		media = MediaPlayer.create(DC.this, path);
		//media.start();

		Uri path2= Uri.parse("android.resource://" + getPackageName()+ "/"+ R.raw.r2d2);
		mediaAux = MediaPlayer.create(DC.this, path2);


		ImageButton pp = (ImageButton) findViewById(R.id.buton_pp2);

		pp.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// play ou pause na musica

				if(media.isPlaying()){
					media.pause();	
					Log.i("tempo ms : ",media.getCurrentPosition()+"");
				}else{
					if(!mediaAux.isPlaying()){
						media.start();
					}
				}



			}

		});


		ImageButton bw = (ImageButton) findViewById(R.id.button_bw2);

		bw.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if(media !=null){
					media.stop();
					media.release();
					media =  null;

				}

				if(mediaAux !=null){
					mediaAux.stop();
					mediaAux.release();
					mediaAux =  null;

				}

				if(background.isAlive()){
					background.destroy();
				} 

				Intent i = new Intent (getApplicationContext(),DCInstrucoes.class);
				i.putExtra("PosicaoMusica", positionMusica);
				i.putExtra("PosicaoJogador", positionJogador);
				startActivity(i);

			}

		});


		ImageButton x = (ImageButton) findViewById(R.id.button_X3);

		x.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(media !=null && media.isPlaying()){
					media.stop();
					media.release();
					media =  null;
				}

				if(mediaAux !=null){
					mediaAux.stop();
					mediaAux.release();
					mediaAux =  null;

				}

				if(background.isAlive()){
					background.destroy();
				}
				Intent i = new Intent (getApplicationContext(),MainActivity.class);
				startActivity(i);

			}

		});


		background = new Thread(new Runnable(){



			public void run() {
				if(jaExiste == false){
					jaExiste = true;
					for(int i=positionJogador;i>1;i--){
						Log.i("qnt jogafores ", i+"");
						int mst = media.getDuration();
						int msc = media.getCurrentPosition();
						Random random =  new Random();
						int qntTocar = (int) (mst*(0.08)+ random.nextInt((int) (mst*0.12)));
						int positionf = msc + qntTocar;


						media.start();

						Log.i("MSC1 : " ,msc+"");
						Log.i("GCP1 : " ,media.getCurrentPosition()+"");
						while(media.getCurrentPosition()<positionf){


							//while(media.getCurrentPosition()<msc+5000){

						}
						Log.i("MSC2 : " ,msc+"");
						Log.i("GCP2 : " ,media.getCurrentPosition()+"");

						media.pause();

						if(i!=2){
							mediaAux.start();
						}

						while(mediaAux.isPlaying()){

						}
						mediaAux.seekTo(0);
						mediaAux.pause();



						Log.i("heyyyyyyyyyyyyyyyy", media.getCurrentPosition()+"");



					}
					background.destroy();
					

				}
			}
		});
		background.start();	



	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dc, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_dc, container,
					false);
			return rootView;
		}
	}

}