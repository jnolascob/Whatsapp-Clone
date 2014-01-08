package com.jnolascob.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends Activity{
	private TextView txt_resultado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result_layout);
		
		txt_resultado = (TextView)findViewById(R.id.resultado);
		String result_ = getIntent().getStringExtra("mensaje");
		
		txt_resultado.setText(result_);
		
	}
}
