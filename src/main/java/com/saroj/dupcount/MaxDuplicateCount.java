/**
 * 
 */
package com.saroj.dupcount;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Map.Entry;

/**
 * @author sarojrout
 *
 */
public class MaxDuplicateCount {
	
	private Map<String, Integer> duplicateData(String fileName){
		Map<String,Integer> wordMap = new HashMap<String, Integer>();
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while((line = br.readLine()) !=null){
				StringTokenizer tokens = new StringTokenizer(line, " ");
				String temp = tokens.nextToken();
				if(wordMap.containsKey(temp)){
					wordMap.put(temp, wordMap.get(temp)+1);
				}else{
					wordMap.put(temp, 1);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				try {
					if(br!=null){
					br.close();
				} 
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		return wordMap;
	}

	private List<Entry<String, Integer>> sortByValue(Map<String,Integer> map){
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list, new Comparator<Entry<String, Integer>>(){

			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return (o1.getKey()).compareTo(o2.getKey());
			}
		
		});
		return list;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaxDuplicateCount dupCount = new MaxDuplicateCount();
		Map<String, Integer> wordCount = dupCount.duplicateData("/Users/sarojrout/myFile.txt");
		for(Map.Entry<String,Integer> map:dupCount.sortByValue(wordCount)){
			System.out.println(map.getKey()+"==="+map.getValue());
		}
	//	System.out.println(dupCount.sortByValue(wordCount));

	}

}
