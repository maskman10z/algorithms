package com.maskman.algorithms.search;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

import com.maskman.algorithms.datastructures.Node;

//@SpringBootTest
public class DepthFirstSearchTest {

	static Node<Integer> rootNode;
	
	@BeforeAll
	public static void setup() {
		List<Node<Integer>> nodes = new ArrayList<Node<Integer>>();
		for(int i = 20; i <= 30; i++) {
			nodes.add(new Node<Integer>(i));
		}
		nodes.get(0).getChildren().add(nodes.get(1));
		nodes.get(0).getChildren().add(nodes.get(2));
		nodes.get(1).getChildren().add(nodes.get(3));
		nodes.get(2).getChildren().add(nodes.get(4));
		nodes.get(3).getChildren().add(nodes.get(5));
		nodes.get(3).getChildren().add(nodes.get(6));
		nodes.get(3).getChildren().add(nodes.get(7));
		nodes.get(4).getChildren().add(nodes.get(8));
		nodes.get(8).getChildren().add(nodes.get(9));
		nodes.get(6).getChildren().add(nodes.get(10));
		rootNode = nodes.get(0);
	}
	
	@Test
	public void dfsFind() {
		DepthFirstSearch<Integer> dfs = new DepthFirstSearch<Integer>();
		
		Integer actual = dfs.find(rootNode, 25);
		assertEquals(25, actual);
		
		actual = dfs.find(rootNode, 26);
		assertEquals(26, actual);
		
		actual = dfs.find(rootNode, 20);
		assertEquals(20, actual);
		
		actual = dfs.find(rootNode, 30);
		assertEquals(30, actual);
		
		actual = dfs.find(rootNode, 21);
		assertEquals(21, actual);
	}
	
	@Test
	public void dfsFindNull() {
		DepthFirstSearch<Integer> dfs = new DepthFirstSearch<Integer>();
		
		Integer actual = dfs.find(rootNode, 19);
		assertNull(actual);
		
		actual = dfs.find(rootNode, 18);
		assertNull(actual);
		
		actual = dfs.find(rootNode, -1);
		assertNull(actual);
		
		actual = dfs.find(rootNode, 32);
		assertNull(actual);
		
		actual = dfs.find(rootNode, -22);
		assertNull(actual);
		
		actual = dfs.find(rootNode, 34);
		assertNull(actual);
	}
}
