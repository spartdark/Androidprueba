package com.jc.androidprueba;

import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class LeerPrueba extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_leer_prueba);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.leer_prueba, menu);
		return true;
	}
	
	
	public void ver(View v){
		TextView resultado= (TextView)findViewById((R.id.resultado));
		resultado.setText(leerJSON());
	}
	
	
	
	
	
	public String leerJSON() {
	    final  StringBuilder builder = new StringBuilder();
	    HttpClient client = new DefaultHttpClient();




	    HttpGet httpGet = new HttpGet("http://mexico-movil.com/maven/inicio/libro");
	    try {
	        HttpResponse response = client.execute(httpGet);
	        StatusLine statusLine = response.getStatusLine();
	        int statusCode = statusLine.getStatusCode();
	        if (statusCode == 200) {
	            HttpEntity entity = response.getEntity();
	            InputStream content = entity.getContent();
	            // BufferedReader reader = new BufferedReader(new InputStreamReader(content));
	            int ch;
	            String line;
	            while ((ch=content.read())!=-1) {
	                builder.append((char)ch);
	            }


	            content.close();
	        } else {

	        }
	    } catch (ClientProtocolException e) {
	        e.printStackTrace();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return builder.toString();
	}


}
