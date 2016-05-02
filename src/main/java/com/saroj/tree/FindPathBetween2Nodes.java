package com.saroj.tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class FindPathBetween2Nodes<T> {
	private final Map<T,Set<T>> myMap = new HashMap<T, Set<T>>();
	
	private Iterable<T> getNeighbors(T src){
		Set<T> myNeighbors = myMap.get(src);
		if(myNeighbors == null){
			myMap.put(src, myNeighbors = new HashSet<T>());
		}else{
			myNeighbors.add(src);
		}
		return myNeighbors;
	}
	
	private boolean Search(T src, T end, Set<T> visisted){
		Queue<T> queue = new LinkedList<T>();
		queue.add(src);
		while(!queue.isEmpty()){
			src =  queue.remove();
			for(T neighbor:getNeighbors(src)){
				if(!visisted.contains(neighbor)){
					if(neighbor == end){
						return true;
					}
				}else{
					visisted.add(neighbor);
					queue.add(neighbor);
				}
			}
		}
		return false;
	}

}
