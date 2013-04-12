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

public class DialpadPreferenceActivity extends PreferenceActivity {

    private static final String PREF_COLOR_OPTIONS = "pref_choose_colors";
    private Preference mColorOptions;

    public static final String DIRECT_CALL_PREF = "direct_call_pref";
    private CheckBoxPreference mDirectCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preference_dialpad_options);
        mDirectCall = (CheckBoxPreference) findPreference("direct_call_pref");

	PreferenceScreen prefSet = getPreferenceScreen();

        mColorOptions = (Preference) findPreference("pref_choose_colors");
 		mColorOptions.setIntent(new Intent(getApplicationContext(), ColorPreferenceActivity.class));
        
    }

    //@Override
    //public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        //boolean value;

        //if (preference == mColorOptions) {
	    //Preference  prefereces=findPreference("pref_choose_colors");
 		//prefereces.setIntent(new Intent(getApplicationContext(), ColorPreferenceActivity.class));
            //startColorPreferenceActivity();
            //return true;
        //}
        //return super.onPreferenceTreeClick(preferenceScreen, preference);
    //}

    //private void startColorPreferenceActivity() {
        //StartActivity(new Intent(this, ColorPreferenceActivity.class));
    //}

}
