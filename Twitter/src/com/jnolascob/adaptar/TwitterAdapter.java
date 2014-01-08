package com.jnolascob.adaptar;

import java.util.ArrayList;

import com.jnolascob.bean.Mensaje;
import com.jnolascob.twitter.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TwitterAdapter extends BaseAdapter{
	
	private Context context;
	private ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
	
	public TwitterAdapter(Context context, ArrayList<Mensaje> mensajes) {
		this.context = context;
		this.mensajes = mensajes;
	}
	
	@Override
	public int getCount() {
		return mensajes.size();
	}

	@Override
	public Object getItem(int arg0) {
		return mensajes.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int posicion, View arg1, ViewGroup arg2) {
		
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.list_item,arg2,false);
		
		Mensaje mensaje = mensajes.get(posicion);
		
		ImageView profile = (ImageView)view.findViewById(R.id.imageProfile);
		TextView detail = (TextView)view.findViewById(R.id.detailMessage);
		TextView content = (TextView)view.findViewById(R.id.contentMessage);
		
		profile.setImageResource(R.drawable.ic_launcher);
		detail.setText(mensaje.getDetalle());
		content.setText(mensaje.getContenido());
		
		return view;
	}

}
