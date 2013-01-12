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
package net.blimster.gwt.threejs.materials;

import net.blimster.gwt.threejs.core.Color;
import net.blimster.gwt.threejs.textures.Texture;

/**
 * This file is generated, do not edit.
 */
public final class MeshPhongMaterial extends Material {

	protected MeshPhongMaterial() {}

	public static native MeshPhongMaterial create()
	/*-{
		return new $wnd.THREE.MeshPhongMaterial();
	}-*/;

	public static native MeshPhongMaterial create(int _color)
	/*-{
		return new $wnd.THREE.MeshPhongMaterial({ color: _color });
	}-*/;

	public static native MeshPhongMaterial create(int _color, int _shininess)
	/*-{
		return new $wnd.THREE.MeshPhongMaterial({
			color: _color,
			shininess: _shininess
		});
	}-*/;

	public static native MeshPhongMaterial create(Texture _map)
	/*-{
		return new $wnd.THREE.MeshPhongMaterial({ map: _map });
	}-*/;


	public final native MeshPhongMaterial setAmbient(Color ambient)/*-{
		this.ambient = ambient;
		return this;
	}-*/;

	public final native Color getAmbient()/*-{
		return this.ambient;
	}-*/;

	public final native MeshPhongMaterial setEmissive(Color emissive)/*-{
		this.emissive = emissive;
		return this;
	}-*/;

	public final native Color getEmissive()/*-{
		return this.emissive;
	}-*/;

	public final native MeshPhongMaterial setSpecular(Color specular)/*-{
		this.specular = specular;
		return this;
	}-*/;

	public final native Color getSpecular()/*-{
		return this.specular;
	}-*/;

	public final native MeshPhongMaterial setShininess(double shininess)/*-{
		this.shininess = shininess;
		return this;
	}-*/;

	public final native double getShininess()/*-{
		return this.shininess;
	}-*/;

	public final native MeshPhongMaterial setReflectivity(double reflectivity)/*-{
		this.reflectivity = reflectivity;
		return this;
	}-*/;

	public final native double getReflectivity()/*-{
		return this.reflectivity;
	}-*/;

	public final native MeshPhongMaterial setMetal(boolean metal)/*-{
		this.metal = metal;
		return this;
	}-*/;

	public final native boolean getMetal()/*-{
		return this.metal;
	}-*/;


}
