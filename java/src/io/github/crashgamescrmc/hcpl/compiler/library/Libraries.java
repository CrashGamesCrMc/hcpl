package io.github.crashgamescrmc.hcpl.compiler.library;

import java.util.ArrayList;
import java.util.List;

public class Libraries extends ArrayList<Library> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Library LibraryGetName(String name) {
		for (Library lib : this) {
			if (lib.getName().equals(name)) {
				return lib;
			}
		}
		return null;
	}

}
