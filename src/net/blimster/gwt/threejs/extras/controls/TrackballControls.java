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
import com.google.gwt.core.client.JsArrayInteger;
import net.blimster.gwt.threejs.core.Object3D;
import net.blimster.gwt.threejs.extras.controls.Screen;
import net.blimster.gwt.threejs.other.Element;

/**
 * This file is generated, do not edit.
 */
public final class TrackballControls extends JavaScriptObject
{
	
	protected TrackballControls()
	{
		super();
	}
	
	
	
	
	
	public static native TrackballControls create(Object3D _target, Element _domElement)
	/*-{
		
		return new $wnd.THREE.TrackballControls({ target : _target, domElement : _domElement });
		
	}-*/;
	
	
	public final native void setEnabled(boolean enabled)
	/*-{
		
		this.enabled = enabled;
		
	}-*/;
	
	public final native boolean getEnabled()
	/*-{
		
		return this.enabled;
		
	}-*/;
	
	public final native void setRadius(int radius)
	/*-{
		
		this.radius = radius;
		
	}-*/;
	
	public final native int getRadius()
	/*-{
		
		return this.radius;
		
	}-*/;
	
	public final native void setRotateSpeed(double rotateSpeed)
	/*-{
		
		this.rotateSpeed = rotateSpeed;
		
	}-*/;
	
	public final native double getRotateSpeed()
	/*-{
		
		return this.rotateSpeed;
		
	}-*/;
	
	public final native void setZoomSpeed(double zoomSpeed)
	/*-{
		
		this.zoomSpeed = zoomSpeed;
		
	}-*/;
	
	public final native double getZoomSpeed()
	/*-{
		
		return this.zoomSpeed;
		
	}-*/;
	
	public final native void setPanSpeed(double panSpeed)
	/*-{
		
		this.panSpeed = panSpeed;
		
	}-*/;
	
	public final native double getPanSpeed()
	/*-{
		
		return this.panSpeed;
		
	}-*/;
	
	public final native void setTarget(Object3D target)
	/*-{
		
		this.target = target;
		
	}-*/;
	
	public final native Object3D getTarget()
	/*-{
		
		return this.target;
		
	}-*/;
	
	public final native void setNoRotate(boolean noRotate)
	/*-{
		
		this.noRotate = noRotate;
		
	}-*/;
	
	public final native boolean getNoRotate()
	/*-{
		
		return this.noRotate;
		
	}-*/;
	
	public final native void setNoZoom(boolean noZoom)
	/*-{
		
		this.noZoom = noZoom;
		
	}-*/;
	
	public final native boolean getNoZoom()
	/*-{
		
		return this.noZoom;
		
	}-*/;
	
	public final native void setNoPan(boolean noPan)
	/*-{
		
		this.noPan = noPan;
		
	}-*/;
	
	public final native boolean getNoPan()
	/*-{
		
		return this.noPan;
		
	}-*/;
	
	public final native void setStaticMoving(boolean staticMoving)
	/*-{
		
		this.staticMoving = staticMoving;
		
	}-*/;
	
	public final native boolean getStaticMoving()
	/*-{
		
		return this.staticMoving;
		
	}-*/;
	
	public final native void setDynamicDampingFactor(double dynamicDampingFactor)
	/*-{
		
		this.dynamicDampingFactor = dynamicDampingFactor;
		
	}-*/;
	
	public final native double getDynamicDampingFactor()
	/*-{
		
		return this.dynamicDampingFactor;
		
	}-*/;
	
	public final native void setMinDistance(double minDistance)
	/*-{
		
		this.minDistance = minDistance;
		
	}-*/;
	
	public final native double getMinDistance()
	/*-{
		
		return this.minDistance;
		
	}-*/;
	
	public final native void setMaxDistance(double maxDistance)
	/*-{
		
		this.maxDistance = maxDistance;
		
	}-*/;
	
	public final native double getMaxDistance()
	/*-{
		
		return this.maxDistance;
		
	}-*/;
	
	public final native void setScreen(Screen screen)
	/*-{
		
		this.screen = screen;
		
	}-*/;
	
	public final native Screen getScreen()
	/*-{
		
		return this.screen;
		
	}-*/;
	
	public final native void setKeys(JsArrayInteger keys)
	/*-{
		
		this.keys = keys;
		
	}-*/;
	
	public final native JsArrayInteger getKeys()
	/*-{
		
		return this.keys;
		
	}-*/;
	
	
	public final native void update()
	/*-{
		
		this.update();
		
	}-*/;
	
	
}
