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

import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;

import java.io.InputStream;

public class Resources {
	@SuppressWarnings("serial")
	public static class NotFoundException extends RuntimeException {
		public NotFoundException() {
		}

		public NotFoundException(String name) {
			throw new UnsupportedOperationException("STUB");
		}
	}

	public final class Theme {
	}

	public Resources(AssetManager assets, DisplayMetrics metrics, Configuration config) {
		throw new UnsupportedOperationException("STUB");
	}

	public Resources(ClassLoader classLoader) {
		throw new UnsupportedOperationException("STUB");
	}

	public void setImpl(ResourcesImpl impl) {
		throw new UnsupportedOperationException("STUB");
	}

	public static Resources getSystem() {
		throw new UnsupportedOperationException("STUB");
	}

	public XmlResourceParser getAnimation(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public final AssetManager getAssets() {
		throw new UnsupportedOperationException("STUB");
	}

	public boolean getBoolean(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public int getColor(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public ColorStateList getColorStateList(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public Configuration getConfiguration() {
		throw new UnsupportedOperationException("STUB");
	}

	public float getDimension(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public int getDimensionPixelOffset(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public int getDimensionPixelSize(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public DisplayMetrics getDisplayMetrics() {
		throw new UnsupportedOperationException("STUB");
	}

	public Drawable getDrawable(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	/** Since SDK21 */
	public Drawable getDrawable(int id, Theme theme) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	/** Since SDK21, CM12 */
	public Drawable getDrawable(int id, Theme theme, boolean supportComposedIcons) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public Drawable getDrawableForDensity(int id, int density) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	/** Since SDK21 */
	public Drawable getDrawableForDensity(int id, int density, Theme theme) {
		throw new UnsupportedOperationException("STUB");
	}

	/** Since SDK21, CM12 */
	public Drawable getDrawableForDensity(int id, int density, Theme theme, boolean supportComposedIcons) {
		throw new UnsupportedOperationException("STUB");
	}

	/** Since SDK21 */
	public float getFloat(int id) {
		throw new UnsupportedOperationException("STUB");
	}

	public float getFraction(int id, int base, int pbase) {
		throw new UnsupportedOperationException("STUB");
	}

	public int getIdentifier(String name, String defType, String defPackage) {
		throw new UnsupportedOperationException("STUB");
	}

	public int[] getIntArray(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public int getInteger(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public XmlResourceParser getLayout(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public Movie getMovie(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public String getQuantityString(int id, int quantity) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public String getQuantityString(int id, int quantity, Object... formatArgs) {
		throw new UnsupportedOperationException("STUB");
	}

	public CharSequence getQuantityText(int id, int quantity) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public String getResourceEntryName(int resid) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public String getResourceName(int resid) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public String getResourcePackageName(int resid) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public String getResourceTypeName(int resid) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public String getString(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public String getString(int id, Object... formatArgs) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public String[] getStringArray(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public CharSequence getText(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public CharSequence getText(int id, CharSequence def) {
		throw new UnsupportedOperationException("STUB");
	}

	public CharSequence[] getTextArray(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public void getValue(int id, TypedValue outValue, boolean resolveRefs) {
		throw new UnsupportedOperationException("STUB");
	}

	public XmlResourceParser getXml(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public InputStream openRawResource(int id) throws NotFoundException {
		throw new UnsupportedOperationException("STUB");
	}

	public TypedArray obtainTypedArray (int id) {
		throw new UnsupportedOperationException("STUB");
	}
}
