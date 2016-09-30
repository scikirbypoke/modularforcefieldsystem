/*  
    Copyright (C) 2012 Thunderdark

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
    Contributors:
    Thunderdark - initial implementation
 */

package com.nekokittygames.mffs.common.item;


import com.nekokittygames.mffs.libs.LibItemNames;
import com.nekokittygames.mffs.libs.LibMisc;

public class ItemForcicium extends ItemMFFSBase {
	public ItemForcicium() {
		super();
		setMaxStackSize(64);
		setUnlocalizedName(LibMisc.UNLOCALIZED_PREFIX+ LibItemNames.FORCICIUM);
		setRegistryName(LibItemNames.FORCICIUM);
	}

	@Override
	public boolean isRepairable() {
		return false;
	}
}