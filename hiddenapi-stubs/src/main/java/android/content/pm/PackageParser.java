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

package android.content.pm;

import java.io.File;

public class PackageParser {
	public static class PackageLite {
		public final String packageName = null;
	}

	/** Before SDK21 */
	public static PackageLite parsePackageLite(String packageFile, int flags) {
		throw new UnsupportedOperationException("STUB");
	}

	/** Since SDK21 */
	public static PackageLite parsePackageLite(File packageFile, int flags) throws PackageParserException {
		throw new UnsupportedOperationException("STUB");
	}

	/** Since SDK21 */
	@SuppressWarnings("serial")
	public static class PackageParserException extends Exception {
	}
}
