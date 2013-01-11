package net.blimster.gwt.threejs.extras.geometries;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import net.blimster.gwt.threejs.core.Geometry;
import net.blimster.gwt.threejs.extras.core.CurvePath;
import net.blimster.gwt.threejs.extras.core.Shape;

/**
 * @author Yona Appletree (yona@concentricsky.com)
 */
public class ExtrudeGeometry extends Geometry {
	protected ExtrudeGeometry() {
	}

	public static native ExtrudeGeometry create(JsArray<Shape> shapes, ExtrudeOptions options)/*-{
		return new THREE.create(shapes, options);
	}-*/;

	public final native void addShapeList(JsArray<Shape> shapes, ExtrudeOptions options)/*-{
		this.addShapeList(shapes, options);
	}-*/;

	public final native void addShape(Shape shape, ExtrudeOptions options)/*-{
		this.addShapeList(shape, options);
	}-*/;

	public static class ExtrudeOptions extends JavaScriptObject {
		protected ExtrudeOptions() {}

		public static native ExtrudeOptions create()/*-{
			return {};
		}-*/;

		public final native double getSize()/*-{
			return this.size;
		}-*/;

		public final native ExtrudeOptions setSize(double size)/*-{
			this.size = size;
			return this;
		}-*/;

		public final native double getHeight()/*-{
			return this.height;
		}-*/;

		public final native ExtrudeOptions setHeight(double height)/*-{
			this.height = height;
			return this;
		}-*/;

		public final native int getCurveSegments()/*-{
			return this.curveSegments;
		}-*/;

		public final native ExtrudeOptions setCurveSegments(int curveSegments)/*-{
			this.curveSegments = curveSegments;
			return this;
		}-*/;

		public final native int getSteps()/*-{
			return this.steps;
		}-*/;

		public final native ExtrudeOptions setSteps(int steps)/*-{
			this.steps = steps;
			return this;
		}-*/;

		public final native double getAmount()/*-{
			return this.amount;
		}-*/;

		/**
		 * The height of the extrusion.
		 *
		 * @param amount
		 * @return
		 */
		public final native ExtrudeOptions setAmount(double amount)/*-{
			this.amount = amount;
			return this;
		}-*/;


		public final native boolean getBevelEnabled()/*-{
			return this.bevelEnabled;
		}-*/;

		public final native ExtrudeOptions setBevelEnabled(boolean bevelEnabled)/*-{
			this.bevelEnabled = bevelEnabled;
			return this;
		}-*/;

		public final native double getBevelThickness()/*-{
			return this.bevelThickness;
		}-*/;

		public final native ExtrudeOptions setBevelThickness(double bevelThickness)/*-{
			this.bevelThickness = bevelThickness;
			return this;
		}-*/;

		public final native double getBevelSize()/*-{
			return this.bevelSize;
		}-*/;

		public final native ExtrudeOptions setBevelSize(double bevelSize)/*-{
			this.bevelSize = bevelSize;
			return this;
		}-*/;

		public final native int getBevelSegments()/*-{
			return this.bevelSegments;
		}-*/;

		public final native ExtrudeOptions setBevelSegments(int bevelSegments)/*-{
			this.bevelSegments = bevelSegments;
			return this;
		}-*/;


		public final native boolean getExtrudePath()/*-{
			return this.extrudePath;
		}-*/;

		public final native ExtrudeOptions setExtrudePath(CurvePath extrudePath)/*-{
			this.extrudePath = extrudePath;
			return this;
		}-*/;

		/*
		public final native THREE.TubeGeometry.FrenetFrames getframes()/*-{
			return this.frames;
		}-*;*/

		/*
		public final native ExtrudeOptions setframes(THREE.TubeGeometry.FrenetFrames frames)/*-{
			this.frames = frames;
		}-*;*/


		public final native int getMaterial()/*-{
			return this.material;
		}-*/;

		public final native ExtrudeOptions setMaterial(int material)/*-{
			this.material = material;
			return this;
		}-*/;

		public final native int getExtrudeMaterial()/*-{
			return this.extrudeMaterial;
		}-*/;

		public final native ExtrudeOptions setExtrudeMaterial(int extrudeMaterial)/*-{
			this.extrudeMaterial = extrudeMaterial;
			return this;
		}-*/;

		public final native JavaScriptObject getUVGenerator()/*-{
			return this.uvGenerator;
		}-*/;

		public final native ExtrudeOptions setUVGenerator(JavaScriptObject uvGenerator)/*-{
			this.uvGenerator = uvGenerator;
			return this;
		}-*/;
	}
}
