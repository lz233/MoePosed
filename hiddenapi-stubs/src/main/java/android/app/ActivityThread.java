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

package android.app;

import android.content.pm.ApplicationInfo;
import android.content.res.CompatibilityInfo;

public final class ActivityThread {
	public static ActivityThread currentActivityThread() {
		throw new UnsupportedOperationException("STUB");
	}

	public static Application currentApplication() {
		throw new UnsupportedOperationException("STUB");
	}

	public static String currentPackageName() {
		throw new UnsupportedOperationException("STUB");
	}

	public final LoadedApk getPackageInfoNoCheck(ApplicationInfo ai, CompatibilityInfo compatInfo) {
		throw new UnsupportedOperationException("STUB");
	}
	public ContextImpl getSystemContext() {
		throw new UnsupportedOperationException("STUB");
	}
}
