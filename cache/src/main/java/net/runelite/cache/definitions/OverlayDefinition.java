/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.runelite.cache.definitions;

public class OverlayDefinition
{
	private int id;
	private int rgbColor = 0;
	private int texture = -1;
	private int secondaryRgbColor = -1;
	private boolean hideUnderlay = true;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getRgbColor()
	{
		return rgbColor;
	}

	public void setRgbColor(int rgbColor)
	{
		this.rgbColor = rgbColor;
	}

	public int getTexture()
	{
		return texture;
	}

	public void setTexture(int texture)
	{
		this.texture = texture;
	}

	public int getSecondaryRgbColor()
	{
		return secondaryRgbColor;
	}

	public void setSecondaryRgbColor(int secondaryRgbColor)
	{
		this.secondaryRgbColor = secondaryRgbColor;
	}

	public boolean isHideUnderlay()
	{
		return hideUnderlay;
	}

	public void setHideUnderlay(boolean hideUnderlay)
	{
		this.hideUnderlay = hideUnderlay;
	}
}
