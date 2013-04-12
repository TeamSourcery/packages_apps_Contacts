package com.android.contacts;

import net.margaritov.preference.colorpicker.ColorPickerPreference;
import com.android.contacts.R;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ColorOptionsPreference extends PreferenceActivity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference_dialpad_options);
        
        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(this);
        
        ((ColorPickerPreference)findPreference("dialpad_color")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorOptionsPreference.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColor", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color")).setAlphaSliderEnabled(false);
        
    }
    public static String convertToARGB(int color) {
        String alpha = Integer.toHexString(Color.alpha(color));
        String red = Integer.toHexString(Color.red(color));
        String green = Integer.toHexString(Color.green(color));
        String blue = Integer.toHexString(Color.blue(color));

        if (alpha.length() == 1) {
            alpha = "0" + alpha;
        }

        if (red.length() == 1) {
            red = "0" + red;
        }

        if (green.length() == 1) {
            green = "0" + green;
        }

        if (blue.length() == 1) {
            blue = "0" + blue;
        }

        return "#" + alpha + red + green + blue;
    }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.color_options_prefs, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.reset:
			SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
			SharedPreferences.Editor editor = preferences.edit();
			editor.clear();
			editor.commit();
			reload();
			break;
		}
		
		return true;
	}
	
	public void reload() {

	    Intent intent = getIntent();
	    overridePendingTransition(0, 0);
	    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
	    finish();

	    overridePendingTransition(0, 0);
	    startActivity(intent);
	}
}