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
package net.blimster.gwt.threejs.core;

import com.google.gwt.core.client.JavaScriptObject;
import net.blimster.gwt.threejs.core.Vector4;
import net.blimster.gwt.threejs.core.Quaternion;
import net.blimster.gwt.threejs.core.Matrix4;
import net.blimster.gwt.threejs.core.Vector3;

/**
 * This file is generated, do not edit.
 */
public final class Quaternion extends JavaScriptObject
{
	
	protected Quaternion()
	{
		super();
	}
	
	
	public static native Quaternion create()
	/*-{
		
		return new $wnd.THREE.Quaternion();
		
	}-*/;
	
	
	
	public static native Quaternion create(double x, double y, double z, double w)
	/*-{
		
		return new $wnd.THREE.Quaternion(x, y, z, w);
		
	}-*/;
	
	
	public final native void setX(double x)
	/*-{
		
		this.x = x;
		
	}-*/;
	
	public final native double getX()
	/*-{
		
		return this.x;
		
	}-*/;
	
	public final native void setY(double y)
	/*-{
		
		this.y = y;
		
	}-*/;
	
	public final native double getY()
	/*-{
		
		return this.y;
		
	}-*/;
	
	public final native void setZ(double z)
	/*-{
		
		this.z = z;
		
	}-*/;
	
	public final native double getZ()
	/*-{
		
		return this.z;
		
	}-*/;
	
	public final native void setW(double w)
	/*-{
		
		this.w = w;
		
	}-*/;
	
	public final native double getW()
	/*-{
		
		return this.w;
		
	}-*/;
	
	
	public final native Quaternion set(double x, double y, double z, double w)
	/*-{
		
		return this.set(x, y, z, w);
		
	}-*/;
	
	public final native Quaternion copy(Quaternion q)
	/*-{
		
		return this.copy(q);
		
	}-*/;
	
	public final native Quaternion clone()
	/*-{
		
		return this.clone();
		
	}-*/;
	
	public final native Quaternion setFromEuler(Vector3 vector)
	/*-{
		
		return this.setFromEuler(vector);
		
	}-*/;
	
	public final native Quaternion setFromAxisAngle(Vector3 axis, double angle)
	/*-{
		
		return this.setFromAxisAngle(axis, angle);
		
	}-*/;
	
	public final native Quaternion setFromRotationMatrix(Matrix4 m)
	/*-{
		
		return this.setFromRotationMatrix(m);
		
	}-*/;
	
	public final native Quaternion calculateW()
	/*-{
		
		return this.calculateW();
		
	}-*/;
	
	public final native Quaternion inverse()
	/*-{
		
		return this.inverse();
		
	}-*/;
	
	public final native double length()
	/*-{
		
		return this.length();
		
	}-*/;
	
	public final native Quaternion normalize()
	/*-{
		
		return this.normalize();
		
	}-*/;
	
	public final native Quaternion multiply(Quaternion a, Quaternion b)
	/*-{
		
		return this.multiply(a, b);
		
	}-*/;
	
	public final native Quaternion multiplySelf(Quaternion b)
	/*-{
		
		return this.multiplySelf(b);
		
	}-*/;
	
	public final native Quaternion multiplyVector3(Vector3 vector, Vector3 dest)
	/*-{
		
		return this.multiplyVector3(vector, dest);
		
	}-*/;
	
	public final native Quaternion slerpSelf(Vector4 qb, double t)
	/*-{
		
		return this.slerpSelf(qb, t);
		
	}-*/;
	
	
}
