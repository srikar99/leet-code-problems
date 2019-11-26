package com.srikar.leetcode.imp;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;

public class LRUCache {

	Map<Integer, Integer> cacheMap;
	Deque<Integer> lruQueue;
	int capacity;

	public LRUCache(int capacity) {
		cacheMap = new HashMap<>();
		lruQueue = new LinkedBlockingDeque<>();
		this.capacity = capacity;
	}

	public int get(int key) {
		if (cacheMap.containsKey(key)) {

			lruQueue.remove(key);
			lruQueue.addFirst(key);
			int last = lruQueue.removeLast();
			lruQueue.addLast(last);

			return cacheMap.get(key);
		}

		return -1;
	}

	public void put(int key, int value) {
		if (!cacheMap.containsKey(key)) {
			if (cacheMap.size() < capacity) {
				cacheMap.put(key, value);
				lruQueue.addFirst(key);
			} else {
				int removedKey = lruQueue.removeLast();
				cacheMap.remove(removedKey);
				cacheMap.put(key, value);
				lruQueue.addFirst(key);
			}
		} else {
			cacheMap.put(key, value);
			lruQueue.addFirst(key);
			lruQueue.removeLast();
		}
	}

	public static void main(String[] args) {
		LRUCache lruCache = new LRUCache(5);
		lruCache.put(1, 1);
		lruCache.put(1, 1);
		lruCache.put(1, 1);
		lruCache.put(1, 1);
		
		lruCache.get(1);
	}
}
