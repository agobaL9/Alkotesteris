package com.agobal.alkotesteris;

import android.content.Context;
import android.content.SharedPreferences;

class PrefManager {

        private SharedPreferences pref;
        private SharedPreferences.Editor editor;

        private static final String PREF_NAME = "androidhive-welcome";
        private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

        PrefManager(Context context) {
            int PRIVATE_MODE = 0;
            pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
            editor = pref.edit();
            editor.apply();
        }

        void setFirstTimeLaunch() {
            editor.putBoolean(IS_FIRST_TIME_LAUNCH, false);
            editor.commit();
        }

        boolean isFirstTimeLaunch() {
            return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
        }

    }

