package com.jnolascob.main;

import java.util.Set;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends Activity {

	private EditText name;
	private EditText lastname;
	private EditText nickname;
	
	private Button cancel;
	private Button send;
	private Button show;
	private Button signin;
	
	private TextView result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		name = (EditText)findViewById(R.id.nameText);
		lastname = (EditText)findViewById(R.id.lastnameText);
		nickname = (EditText)findViewById(R.id.nicknameText);
		
		cancel = (Button)findViewById(R.id.cancel);
		send = (Button)findViewById(R.id.send);
		show = (Button)findViewById(R.id.show);
		signin = (Button)findViewById(R.id.showSignin);
		
		result = (TextView)findViewById(R.id.result);
		

		
		show.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {		
				final String nombre = name.getText().toString();
				final String apellido = lastname.getText().toString();
				final String apodo = nickname.getText().toString();
				
				result.setText(nombre+"-"+apellido+"-"+apodo);
			}
		});
		
		
		cancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				name.setText("");
				lastname.setText("");
				nickname.setText("");
				
				result.setText("");
				
			}
		});
		
		send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				final String mensaje_ = result.getText().toString();
				Intent intento = new Intent(Main.this, Resultado.class);
				intento.putExtra("mensaje", mensaje_);
				startActivity(intento);
				
			}
		});
		
		//evento para mostrar el SIGNIN
		signin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent signinIntent = new Intent(Main.this, Signin.class);
				startActivity(signinIntent);				
			}
		});
	}
}
