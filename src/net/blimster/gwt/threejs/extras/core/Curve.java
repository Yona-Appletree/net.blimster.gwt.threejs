package net.blimster.gwt.threejs.extras.core;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import net.blimster.gwt.threejs.core.Vector2;

/**
 * From https://github.com/mrdoob/$wnd.THREE.js/blob/master/src/extras/core/Curve.js
 *
 * @author Yona Appletree (yona@concentricsky.com)
 */
public class Curve extends JavaScriptObject {
	protected Curve() {
	}

	public native static Curve createCurve()/*-{
		return new $wnd.THREE.Curve();
	}-*/;

	public final native Vector2 getPoint( double t )/*-{
		return this.getPoint( t );
	}-*/;


	/**
	 * Get point at relative position in curve according to arc length
	 *
	 * @param u [0 .. 1]
	 * @return
	 */
	public final native Vector2 getPointAt( double u )/*-{
		return this.getPointAt( u );
}-*/;

	/**
	 * Get sequence of points using getPoint( t )
	 *
	 * @param divisions
	 */
	public final native JsArray<Vector2> getPoints( int divisions )/*-{
		return this.getPoints( divisions );
}-*/;

	/**
	 * Get sequence of points using getPointAt( u )
	 *
	 * @param divisions
	 */
	public final native JsArray<Vector2> getSpacedPoints( int divisions )/*-{
		return this.getSpacedPoints( divisions );
}-*/;

	/**
	 * Get total curve arc length
	 */
	public final native double getLength()/*-{
		return this.getLength();
}-*/;

	/**
	 * Get list of cumulative segment lengths
	 *
	 * @param divisions
	 */
	public final native JsArrayNumber getLengths( double divisions )/*-{
		return this.getLengths( divisions );
}-*/;


	public final native void updateArcLengths()/*-{
		return this.updateArcLengths();
}-*/;

	/**
	 * Given u ( 0 .. 1 ), get a t to find p. This gives you points which are equi distance
	 *
	 * @param u
	 * @param distance
	 */
	public final native JsArray<Vector2> getUtoTmapping( double u, double distance )/*-{
		return this.getUtoTmapping( u, distance );
}-*/;

	/**
	 * Returns a unit vector tangent at t
	 * In case any sub curve does not implement its tangent derivation,
	 * 2 points a small delta apart will be used to find its gradient
	 * which seems to give a reasonable approximation
	 */
	public final native Vector2 getTangent( double t )/*-{
		return this.getTangent( t );
}-*/;


	public final native Vector2 getTangentAt( double u )/*-{
		return this.getTangentAt( u );
}-*/;
}
