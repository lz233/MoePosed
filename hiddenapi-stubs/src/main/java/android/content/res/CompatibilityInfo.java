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

package android.content.res;

import android.os.Parcel;
import android.os.Parcelable;

public class CompatibilityInfo implements Parcelable {
	@Override
	public int describeContents() {
		throw new UnsupportedOperationException("STUB");
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		throw new UnsupportedOperationException("STUB");
	}

	public static final Parcelable.Creator<CompatibilityInfo> CREATOR = null;
}
