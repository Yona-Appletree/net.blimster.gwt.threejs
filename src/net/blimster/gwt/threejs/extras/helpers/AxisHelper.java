package net.blimster.gwt.threejs.extras.helpers;

import net.blimster.gwt.threejs.core.Object3D;

/**
 * @author Yona Appletree (yona@concentricsky.com)
 */
public class AxisHelper extends Object3D {
	protected AxisHelper() {
	}

	public static native AxisHelper create(int size)/*-{
		return new $wnd.THREE.AxisHelper(size);
	}-*/;

	public static native AxisHelper create()/*-{
		return new $wnd.THREE.AxisHelper();
	}-*/;
}
