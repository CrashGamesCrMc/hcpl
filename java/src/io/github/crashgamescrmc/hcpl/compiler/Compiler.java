package io.github.crashgamescrmc.hcpl.compiler;

import java.util.ArrayList;

import io.github.crashgamescrmc.hcpl.compiler.library.HCPL_Class;
import io.github.crashgamescrmc.hcpl.compiler.library.Libraries;
import io.github.crashgamescrmc.hcpl.compiler.library.Library;

public class Compiler {

	public Libraries libraries = new Libraries();

	public static final int MAIN = 0;

	public Compiler(String filepath) {
		libraries.add(new Library("", filepath, new ArrayList<String>(), new ArrayList<HCPL_Class>()));
	}

	public void AnalyseStatement(String statement) {
		
	}

}
