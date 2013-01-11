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
package net.blimster.gwt.threejs.extras;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import net.blimster.gwt.threejs.core.Geometry;
import net.blimster.gwt.threejs.core.Object3D;
import net.blimster.gwt.threejs.scenes.Scene;
import net.blimster.gwt.threejs.objects.Particle;
import com.google.gwt.core.client.JsArray;import net.blimster.gwt.threejs.objects.Mesh;
import net.blimster.gwt.threejs.objects.Line;
import net.blimster.gwt.threejs.materials.Material;

/**
 * This file is generated, do not edit.
 */
public final class SceneUtils extends JavaScriptObject
{
	
	protected SceneUtils()
	{
		super();
	}
	
		
	
	public final native void showHierarchy(Object3D root, boolean visible)
	/*-{
		
		this.showHierarchy(root, visible);
		
	}-*/;
	
	public final native Object3D createMultiMaterialObject(Geometry geometry, JsArray<Material> materials)
	/*-{
		
		return this.createMultiMaterialObject(geometry, materials);
		
	}-*/;
	
	public final native void attach(Object3D child, Scene scene, Object3D parent)
	/*-{
		
		this.attach(child, scene, parent);
		
	}-*/;
	
	public final native void detach(Object3D child, Object3D parent, Scene scene)
	/*-{
		
		this.detach(child, parent, scene);
		
	}-*/;
	
	public final native Mesh cloneObject(Mesh source)
	/*-{
		
		return this.cloneObject(source);
		
	}-*/;
	
	public final native Line cloneObject(Line source)
	/*-{
		
		return this.cloneObject(source);
		
	}-*/;
	
	public final native Particle cloneObject(Particle source)
	/*-{
		
		return this.cloneObject(source);
		
	}-*/;
	
	public final native Object3D cloneObject(Object3D source)
	/*-{
		
		return this.cloneObject(source);
		
	}-*/;
	
	
}
