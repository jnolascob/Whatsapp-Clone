package com.jnolascob.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signin extends Activity{
	private TextView user;
	private TextView pass;
	private TextView datasignin;
	
	private EditText username;
	private EditText password;
	
	private Button signin;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signin_layout);
		
		user = (TextView)findViewById(R.id.userText);
		pass = (TextView)findViewById(R.id.passText);
		datasignin = (TextView)findViewById(R.id.dataSignin);
		
		username = (EditText)findViewById(R.id.username);
		password = (EditText)findViewById(R.id.password);
		
		signin = (Button)findViewById(R.id.signinButton);
		
		//evento de boton
		signin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				final String user_ = username.getText().toString();
				final String pass_ = password.getText().toString();
				
				datasignin.setText(user_+"-"+pass_);
			}
		});
		
	}
	

}
