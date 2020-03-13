package com.maskman.algorithms.datastructures;

import java.util.ArrayList;
import java.util.Collection;

public class Node<T> {
	private T value;
	private Collection<Node<T>> children;
	
	
	public Node(T value) {
		this.value = value;
		children = new ArrayList<Node<T>>();
	}
	
	public T getValue() {
		return value;
	}
	
	public Collection<Node<T>> getChildren() {
		return children;
	}
	
}