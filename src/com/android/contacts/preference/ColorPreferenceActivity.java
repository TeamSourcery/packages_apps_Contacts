/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.contacts.preference;

import net.margaritov.preference.colorpicker.ColorPickerPreference;
import com.android.contacts.R;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceScreen;
import android.content.SharedPreferences;
import android.preference.PreferenceActivity;
import android.os.Process;

public class ColorPreferenceActivity extends PreferenceActivity {

    private static final String PREF_RESTART_CONTACTS = "pref_restart_contacts";
    private Preference mRestartContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preference_color_options);

	PreferenceScreen prefSet = getPreferenceScreen();
    	
	final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(this);

	mRestartContacts = (Preference) findPreference("pref_restart_contacts");
        
        ((ColorPickerPreference)findPreference("dialpad_color_all")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorAll", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_all")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_one")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorOne", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_one")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_two")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorTwo", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_two")).setAlphaSliderEnabled(false);

        ((ColorPickerPreference)findPreference("dialpad_color_three")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorThree", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_three")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_four")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorFour", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_four")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_five")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorFive", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_five")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_six")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorSix", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_six")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_seven")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorSeven", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_seven")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_eight")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorEight", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_eight")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_nine")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorNine", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_nine")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_zero")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorZero", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_zero")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_pound")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorPound", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_pound")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_star")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorStar", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_dialButton")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_dialButton")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorDialButton", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_dialButton")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_deleteButton")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorDeleteButton", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_deleteButton")).setAlphaSliderEnabled(false);

	((ColorPickerPreference)findPreference("dialpad_color_numberText")).setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

			public boolean onPreferenceChange(Preference preference, Object newValue) {
				
				SharedPreferences.Editor editor = app_preferences.edit();
				
				preference.setSummary(ColorPreferenceActivity.convertToARGB(Integer.valueOf(String.valueOf(newValue))));
				
				editor.putString("KeyColorNumberText", preference.getSummary().toString());
				editor.commit();
				
				return true;
			}

        });
        ((ColorPickerPreference)findPreference("dialpad_color_numberText")).setAlphaSliderEnabled(false);
        
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
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        boolean value;

        if (preference == mRestartContacts) {
            Process.killProcess(Process.myPid());
            restartFirstActivity();
            return true;
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }

    private void restartFirstActivity() {
        Intent i = getBaseContext().getPackageManager().getLaunchIntentForPackage(
                getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK );
        startActivity(i);
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
