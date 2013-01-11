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
package net.blimster.gwt.threejs.cameras;

import net.blimster.gwt.threejs.cameras.Camera;

/**
 * This file is generated, do not edit.
 */
public final class PerspectiveCamera extends Camera
{
	
	protected PerspectiveCamera()
	{
		super();
	}
	
	
	
	
	
	public static native PerspectiveCamera create(double fov, double aspect, double near, double far)
	/*-{
		
		return new $wnd.THREE.PerspectiveCamera(fov, aspect, near, far);
		
	}-*/;
	
	
	public final native void setFov(double fov)
	/*-{
		
		this.fov = fov;
		
	}-*/;
	
	public final native double getFov()
	/*-{
		
		return this.fov;
		
	}-*/;
	
	public final native void setAspect(double aspect)
	/*-{
		
		this.aspect = aspect;
		
	}-*/;
	
	public final native double getAspect()
	/*-{
		
		return this.aspect;
		
	}-*/;
	
	public final native void setNear(double near)
	/*-{
		
		this.near = near;
		
	}-*/;
	
	public final native double getNear()
	/*-{
		
		return this.near;
		
	}-*/;
	
	public final native void setFar(double far)
	/*-{
		
		this.far = far;
		
	}-*/;
	
	public final native double getFar()
	/*-{
		
		return this.far;
		
	}-*/;
	
	
	public final native void setLens(double focalLength, double frameSize)
	/*-{
		
		this.setLens(focalLength, frameSize);
		
	}-*/;
	
	public final native void setViewOffset(double fullWidth, double fullHeight, double x, double y, double width, double height)
	/*-{
		
		this.setViewOffset(fullWidth, fullHeight, x, y, width, height);
		
	}-*/;
	
	public final native void updateProjectionMatrix()
	/*-{
		
		this.updateProjectionMatrix();
		
	}-*/;
	
	
}
