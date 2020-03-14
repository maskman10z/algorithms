package com.maskman.algorithms.search;

import com.maskman.algorithms.datastructures.Node;

public class DepthFirstSearch<T> {
	
	
	public T find(Node<T> root, T value) {
		if(root.getValue() == value) {
			return value;
		} else if(root.getChildren().isEmpty()) {
			return null;
		} else {
			T val = null;
			for(Node<T> child : root.getChildren()) {
				val = find(child, value);
				if(val != null)
					break;
			}
			return val;
		}
	}
}
