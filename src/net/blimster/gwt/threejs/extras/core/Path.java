package net.blimster.gwt.threejs.extras.core;

import com.google.gwt.core.client.JsArray;
import net.blimster.gwt.threejs.core.Vector2;

/**
 * Creates free form 2d path using series of points, lines or curves.
 * <p/>
 * From https://github.com/mrdoob/three.js/blob/master/src/extras/core/Path.js
 *
 * @author Yona Appletree (yona@concentricsky.com)
 */
public class Path extends CurvePath {
	protected Path() {
	}

	public native static Path createPath()/*-{
		return new $wnd.THREE.Path();
	}-*/;


	public final native Path fromPoints(JsArray<? extends Vector2> vectors)/*-{
		this.fromPoints(vectors);
		return this;
	}-*/;

	public final native Path moveTo(double x, double y)/*-{
		return this.moveTo(x, y);
		return this;
	}-*/;

	public final native Path lineTo(double x, double y)/*-{
		this.lineTo(x, y);
		return this;
	}-*/;

	public final native Path quadraticCurveTo(double aCPx, double aCPy, double aX, double aY)/*-{
		this.quadraticCurveTo(aCPx, aCPy, aX, aY);
		return this;
	}-*/;

	public final native Path bezierCurveTo(
		double aCP1x, double aCP1y,
		double aCP2x, double aCP2y,
		double aX, double aY
	)/*-{
		this.bezierCurveTo(aCP1x, aCP1y,
			aCP2x, aCP2y,
			aX, aY);
		return this;
	}-*/;

	public final native Path splineThru(JsArray<? extends Vector2> pts /*Array of Vector*/)/*-{
		this.splineThru(pts);
		return this;
	}-*/;

// FUTURE: Change the API or follow canvas API?

	public final native Path arc(
		double aX, double aY, double aRadius,
		double aStartAngle, double aEndAngle, boolean aClockwise
	)/*-{
		this.arc(aX, aY, aRadius,
			aStartAngle, aEndAngle, aClockwise);

		return this;
	}-*/;

	public final native Path absarc(
		double aX, double aY, double aRadius,
		double aStartAngle, double aEndAngle, boolean aClockwise
	)/*-{
		this.absarc(aX, aY, aRadius,
			aStartAngle, aEndAngle, aClockwise);
		return this;
	}-*/;

	public final native Path ellipse(
		double aX, double aY, double xRadius, double yRadius,
		double aStartAngle, double aEndAngle, boolean aClockwise
	)/*-{
		this.ellipse(aX, aY, xRadius, yRadius,
			aStartAngle, aEndAngle, aClockwise);
		return this;
	}-*/;


	public final native Path absellipse(
		double aX, double aY, double xRadius, double yRadius,
		double aStartAngle, double aEndAngle, boolean aClockwise
	)/*-{
		this.absellipse(aX, aY, xRadius, yRadius,
			aStartAngle, aEndAngle, aClockwise);

		return this;
	}-*/;

/* Return an array of vectors based on contour of the path */

	public final native JsArray<Vector2> getPoints(int divisions, boolean closedPath)/*-{
		return this.getPoints(divisions, closedPath);
	}-*/;

// Breaks path into shapes

	public final native JsArray<Shape> toShapes()/*-{
		return this.toShapes();
	}-*/;
}
