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

package xposed.dummy;

import android.content.res.Resources;

/**
 * This class is used as super class of XResources.
 *
 * This implementation isn't included in the .dex file. Instead, it's created on the device.
 * Usually, it will extend Resources, but some ROMs use their own Resources subclass.
 * In that case, XResourcesSuperClass will extend the ROM's subclass in an attempt to increase
 * compatibility.
 */
public class XResourcesSuperClass extends Resources {
	/** Dummy, will never be called (objects are transferred to this class only). */
	protected XResourcesSuperClass() {
		super(null, null, null);
		throw new UnsupportedOperationException();
	}

	protected XResourcesSuperClass(ClassLoader classLoader) {
		super(classLoader);
		throw new UnsupportedOperationException();
	}
}
