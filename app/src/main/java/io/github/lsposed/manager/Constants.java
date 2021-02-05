/*
 * This file is part of LSPosed.
 *
 * LSPosed is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LSPosed is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LSPosed.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2020 EdXposed Contributors
 * Copyright (C) 2021 LSPosed Contributors
 */

package io.github.lsposed.manager;

import android.util.Log;
import android.widget.Toast;

public class Constants {
    public static int getXposedApiVersion() {
        Log.e(App.TAG, "getXposedApiVersion: Xposed is not active");
        return -1;
    }

    public static String getXposedVersion() {
        Log.e(App.TAG, "getXposedVersion: Xposed is not active");
        return null;
    }

    public static int getXposedVersionCode() {
        Log.e(App.TAG, "getXposedVersionCode: Xposed is not active");
        return -1;
    }

    public static String getXposedVariant() {
        Log.e(App.TAG, "getXposedVariant: Xposed is not active");
        return null;
    }

    public static String getEnabledModulesListFile() {
        return getBaseDir() + "conf/enabled_modules.list";
    }

    public static String getModulesListFile() {
        return getBaseDir() + "conf/modules.list";
    }

    public static String getConfDir() {
        return getBaseDir() + "conf/";
    }

    public static String getBaseDir() {
        return App.getInstance().getApplicationInfo().deviceProtectedDataDir + "/";
    }

    public static boolean isPermissive() {
        return true;
    }

    public static void showErrorToast(int type) {
        Toast.makeText(App.getInstance(), R.string.app_destroyed, Toast.LENGTH_LONG).show();
    }
}
