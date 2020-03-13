package com.maskman.algorithms.search;

import com.maskman.algorithms.datastructures.Node;

public class DepthFirstSearch<T> {
	
	
	public T find(Node<T> node, T value) {
		if(node.getValue() == value) {
			return value;
		} else if(node.getChildren().isEmpty()) {
			return null;
		} else {
			for(Node<T> child : node.getChildren()) {
				T val = find(child, value);
				return val == null ? null : val;
			}
		}
		return null;
	}
}
