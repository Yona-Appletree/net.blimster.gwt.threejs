/*
 *
 * This file is part of three4g.
 *
 * three4g is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesse General Public License as 
 * published by the Free Software Foundation, either version 3 of 
 * the License, or (at your option) any later version.
 *
 * three4g is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public 
 * License along with three4g. If not, see <http://www.gnu.org/licenses/>.
 *
 * (c) 2012 by Oliver Damm, Am Wasserberg 8, 22869 Schenefeld
 *
 * mail: oliver [dot] damm [at] gmx [dot] de
 * web: http://www.blimster.net 
 */
package net.blimster.gwt.threejs.extras.controls;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This file is generated, do not edit.
 */
public final class Screen extends JavaScriptObject
{
	
	protected Screen()
	{
		super();
	}
	
	
	public static native Screen create()
	/*-{
		
		return new $wnd.THREE.Screen();
		
	}-*/;
	
	
	
		
	public final native void setWidth(double width)
	/*-{
		
		this.width = width;
		
	}-*/;
	
	public final native double getWidth()
	/*-{
		
		return this.width;
		
	}-*/;
	
	public final native void setHeight(double height)
	/*-{
		
		this.height = height;
		
	}-*/;
	
	public final native double getHeight()
	/*-{
		
		return this.height;
		
	}-*/;
	
	
	
}
