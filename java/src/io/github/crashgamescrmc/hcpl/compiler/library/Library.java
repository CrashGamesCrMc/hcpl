package io.github.crashgamescrmc.hcpl.compiler.library;

import java.util.List;

public class Library {

	public Library(String name, String path, List<String> methods, List<HCPL_Class> classes) {
		this.name = name;
		this.path = path;
		this.methods = methods;
		this.classes = classes;
	}

	private String name;
	private String path;
	private List<String> methods;
	private List<HCPL_Class> classes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<String> getMethods() {
		return methods;
	}

	public void setMethods(List<String> methods) {
		this.methods = methods;
	}

	public List<HCPL_Class> getClasses() {
		return classes;
	}

	public void setClasses(List<HCPL_Class> classes) {
		this.classes = classes;
	}

	public String getVariables() {
		return variables;
	}

	public void setVariables(String variables) {
		this.variables = variables;
	}

	private String variables;
}
