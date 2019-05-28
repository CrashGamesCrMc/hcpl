package io.github.crashgamescrmc.hcpl.compiler.library;

import java.util.List;

public class NativeLibrary extends Library {

	public NativeLibrary(String name, String path, List<String> methods, List<HCPL_Class> classes) {
		super(name, path, methods, classes);
	}

}
