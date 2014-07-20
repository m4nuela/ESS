package com.example.dingo_project;




import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	final Context context = this;
	private static final String DEBUG_TAG= "MySimpleAppLoggi";
	
	
	//ImageView selectedImage;  
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
	
	
	
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		
        
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        
        
        
        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        gallery.setSpacing(1);
        gallery.setAdapter(new GalleryImageAdapter(this));

         // clicklistener for Gallery
        gallery.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Log.i(DEBUG_TAG,position+"");
            	//Toast.makeText(MainActivity.this, "Your selected position = " + position, Toast.LENGTH_SHORT).show();  massaaaa!!!
                // show the selected Image
                //selectedImage.setImageResource(mImageIds[position]);
            	
            	switch(position){
            		case 0:  // dança das cadeiras
            			//Intent i = new Intent (getApplicationContext(),DCInstrucoes.class);
    					//startActivity(i);
            			
            			Intent i = new Intent (getApplicationContext(),SelecionarMusica.class);
        				startActivity(i);
        				
    					break;
            		case 1: //Amarelinha
            			
            			// ERRO
            			
            			AlertDialog.Builder alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				AlertDialog alertaND = alertND.create();
        				alertaND.show();	
        				
        				
        					
            			
            			
            			break;
            			
            		case 2: //bdg
            			
// ERRO
            			//ERRO
            			 alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				alertaND = alertND.create();
        				alertaND.show();	
            			
            			break;
            			
            		case 3: //Queimado
            			

            			//ERRO
            			alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				 alertaND = alertND.create();
        				alertaND.show();	
            			
            			break;
            			
            			
            		case 4: //corda
            			
            			//ERRO
            			alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				 alertaND = alertND.create();
        				alertaND.show();
	
            			break;
	
            		case 5: // pega-pega
            			
            			//ERRO
            			alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				 alertaND = alertND.create();
        				alertaND.show();
	
            			break;
            			
            		case 6: //piao
            			
            			//ERRO
            			alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				 alertaND = alertND.create();
        				alertaND.show();
            			
            			break;
            			
            		case 7: //pipa
            			
            			//ERRO
            			alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				 alertaND = alertND.create();
        				alertaND.show();
            			
            			break;
            			
            		case 8://Cabra-cega
            			
            			//ERRO
            			alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				 alertaND = alertND.create();
        				alertaND.show();
            			
            			break;
            			
            			
            		case 9: //peteca
            			
            			//ERRO
            			alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				 alertaND = alertND.create();
        				alertaND.show();
	
            			break;
	
            		case 10: //corrida de saco
            			
            			//ERRO
            			alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				 alertaND = alertND.create();
        				alertaND.show();
	
            			break;
            			
            		case 11: //Esconde-Esconde
            			
            			//ERRO
            			alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				 alertaND = alertND.create();
        				alertaND.show();
            			
            			break;
	
            		case 12: //Telefone sem fio
            			
            			//ERRO
            			alertND = new AlertDialog.Builder(context);
        				alertND.setTitle(" ");
        				
        				alertND.setMessage("Brincadeira não disponível");
        				alertND.setIcon(R.drawable.triste);
        				alertND.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
        					
        					@Override
        					public void onClick(DialogInterface dialog, int which) {
        						// TODO Auto-generated method stub
        						dialog.cancel();
        					}
        				});
        				 alertaND = alertND.create();
        				alertaND.show();
	
            			break;
	
            			
            		
            	}
            }
        });
        
        
        
        
        
        
        
        final EditText txt = (EditText) findViewById(R.id.tx_busca);
        
        final ImageButton buscar = (ImageButton) findViewById(R.id.button_buscar);
        
        
        
        buscar.setOnClickListener(new OnClickListener() {
        	 
        	
			public void onClick(View v) {
				
				 Log.v("EditText value=", txt.getText().toString());
				
				 
		    
				if(txt.getText().toString().equalsIgnoreCase("dança das cadeiras")
						|| txt.getText().toString().equalsIgnoreCase("danca das cadeiras")){
					
					//Log.i ("MANUELA", "entrou no if");
					
					Intent i = new Intent (getApplicationContext(),SelecionarMusica.class);
					startActivity(i);
					
					
				}else { // nao tem essa brincadeira, lançar alert...
					
						//Log.i(DEBUG_TAG, "entrou no else");
					
					
				AlertDialog.Builder alertTriste = new AlertDialog.Builder(context);
				alertTriste.setTitle(" ");
				
				alertTriste.setMessage("Brincadeira não encontrada");
				alertTriste.setIcon(R.drawable.triste);
				alertTriste.setNeutralButton("Voltar", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						dialog.cancel();
					}
				});
				AlertDialog alerta = alertTriste.create();
				alerta.show();	
				
				
				}	
				
				
			}
		 
		});
		
        
       // setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE );
       
        
       
        
    }
    
    
   
   
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
