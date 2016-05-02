package com.saroj.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LRUCache<Key,Value> {
	private int size;
	private ConcurrentHashMap<Key, Value> map;
	private ConcurrentLinkedQueue<Key> queue;
	
	public LRUCache(int maxSize){
		this.size=maxSize;
		map = new ConcurrentHashMap<Key, Value>();
		queue = new ConcurrentLinkedQueue<Key>();
	}
	
	public void put(final Key key, final Value value){
		if(map.containsKey(key)){
			queue.add(key);
		}
		while(queue.size() >=size){
			Key oldestKey = queue.poll();
			if(null !=oldestKey){
				map.remove(oldestKey);
			}
		}
		queue.add(key);
		map.put(key, value);
	}
	
	public Value get(final Key key){
		return map.get(key);
	}
}
