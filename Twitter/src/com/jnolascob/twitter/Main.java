package com.jnolascob.twitter;

import java.util.ArrayList;

import com.jnolascob.adaptar.TwitterAdapter;
import com.jnolascob.bean.Mensaje;
import com.jnolascob.database.TwitterDB;
import com.jnolascob.database.TwitterSqlite;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class Main extends Activity {
	
	private ListView list;
	private EditText message;
	private Button send;
	
	private ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//TwitterSqlite db = new TwitterSqlite(this);
		
		//enlazamos layout con main
		list = (ListView)findViewById(R.id.listMessage);
		list.setAdapter(new TwitterAdapter(this,mensajes));
		
		message = (EditText)findViewById(R.id.editMessage);
		send = (Button)findViewById(R.id.sendMessage);
		
		
		
		//creamos el evento del boton enviar
		send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Mensaje mensaje = new Mensaje(message.getText().toString(),
						"AA",
						R.drawable.ic_launcher);
				mensajes.add(mensaje);
				list.setAdapter(new TwitterAdapter(Main.this,mensajes));
			}
		});
	}

	

}
