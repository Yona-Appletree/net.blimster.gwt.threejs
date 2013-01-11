package net.blimster.gwt.threejs.extras.core;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

/**
 *
 * Curved Path - a curve path is simply a array of connected curves, but retains the api of a curve
 *
 * From https://github.com/mrdoob/three.js/blob/master/src/extras/core/CurvePath.js
 * @author Yona Appletree (yona@concentricsky.com)
 */
public class CurvePath extends Curve {
	protected CurvePath() { }

	public native static CurvePath createCurvePath()/*-{
		return new THREE.CurvePath();
	}-*/;
	
	public final native int add( Curve curve )/*-{
		return this.add( curve );
}-*/;

	public final native boolean checkConnection()/*-{
		return this.checkConnection();
}-*/;

	public final native void closePath()/*-{
		this.closePath();
}-*/;

	/**
	 * Compute lengths and cache them
	 * We cannot overwrite getLengths() because UtoT mapping uses it.
	 * @return
	 */
	public final native JsArrayNumber getCurveLengths()/*-{
		return this.getCurveLengths();
}-*/;

// Returns min and max coordinates, as well as centroid

	public final native BoundingBox getBoundingBox()/*-{
		return this.getBoundingBox();
}-*/;


	public final static class BoundingBox extends JavaScriptObject {
		protected BoundingBox() {}

		public final native double getMinX()/*-{
			return this.minX;
		}-*/;

		public final native double getMinY()/*-{
			return this.minY;
		}-*/;

		public final native double getMaxX()/*-{
			return this.maxX;
		}-*/;

		public final native double getMaxY()/*-{
			return this.maxY;
		}-*/;
	}
}
