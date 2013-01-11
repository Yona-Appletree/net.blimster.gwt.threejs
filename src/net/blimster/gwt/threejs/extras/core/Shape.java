package net.blimster.gwt.threejs.extras.core;

import com.google.gwt.core.client.JsArray;
import net.blimster.gwt.threejs.core.Vector2;
import net.blimster.gwt.threejs.extras.geometries.ExtrudeGeometry;

/**
 * @author Yona Appletree (yona@concentricsky.com)
 */
public class Shape extends Path {
	protected Shape() {
	}

	public native static Shape createShape()/*-{
		return new $wnd.THREE.Shape();
	}-*/;

	public final native ExtrudeGeometry extrude(ExtrudeGeometry.ExtrudeOptions options)/*-{
		return this.extrude(options);
	}-*/;

	/*
	Convenience method to return ShapeGeometry
	 *
	public final native void makeGeometry( ShapeGeometryOptions options )/*-{
		return this.makeGeometry( options );
}-*;*/

	/**
	 * Get points of holes
	 *
	 * @param divisions
	 * @return
	 */
	public final native JsArray<Vector2> getPointsHoles(int divisions)/*-{
		return this.getPointsHoles(divisions);
	}-*/;

// Get points of holes (spaced by regular distance)

	public final native JsArray<Vector2> getSpacedPointsHoles(int divisions)/*-{
		return this.getSpacedPointsHoles(divisions);
	}-*/;


// Get points of shape and holes (keypoints based on segments parameter)
/*
	public final native JsArray<ShapesAndHoles> extractAllPoints( int divisions )/*-{
		return this.extractAllPoints( divisions );
}-*;
 {

		return {

			shape: this.getTransformedPoints( divisions ),
			holes: this.getPointsHoles( divisions )

		};

	};*

	public final native void extractPoints( divisions )/*-{
		return this.extractPoints( divisions );
}-*;
 {

		if (this.useSpacedPoints) {
			return this.extractAllSpacedPoints(divisions);
		}

		return this.extractAllPoints(divisions);

	};*/

	/*
//
// public final native void extractAllPointsWithBend( divisions, bend )/*-{
		return this.extractAllPointsWithBend( divisions, bend );
}-*;
 {
//
// 	return {
//
// 		shape: this.transform( bend, divisions ),
// 		holes: this.getPointsHoles( divisions, bend )
//
// 	};
//
// };

// Get points of shape and holes (spaced by regular distance)

	public final native void extractAllSpacedPoints( divisions )/*-{
		return this.extractAllSpacedPoints( divisions );
}-*;
 {

		return {

			shape: this.getTransformedSpacedPoints( divisions ),
			holes: this.getSpacedPointsHoles( divisions )

		};

	};*/
}
