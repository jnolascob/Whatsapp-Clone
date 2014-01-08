package com.jnolascob.twitter;

import android.app.ActionBar;
import android.content.Intent;
import android.drm.DrmStore.Action;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.MenuItem;

public class FavoritosActivity extends SherlockListActivity{
	private static final int NUM_FAVORITOS = 30;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		//ActionBar ab = getSupportActionBar();
		com.actionbarsherlock.app.ActionBar ab = getSupportActionBar();
		ab.setDisplayOptions(ActionBar.DISPLAY_SHOW_TITLE|ActionBar.DISPLAY_SHOW_HOME|ActionBar.DISPLAY_HOME_AS_UP);
        ab.setTitle(getString(R.string.favoritos));
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, valores());
        setListAdapter(adapter);
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(this, ViewDatabase.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return true;
        }
        return true;
    }
 
    private String[] valores() {
        String[] valores = new String[NUM_FAVORITOS];
        for (int i = 1 ; i <= NUM_FAVORITOS ; i++) {
            valores[i-1] = "Favorito " + i;
        }
        return valores;
    }
}
