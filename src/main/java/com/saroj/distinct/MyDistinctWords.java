/**
 * 
 */
package com.saroj.distinct;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author sarojrout
 *
 */
public class MyDistinctWords {
	
	private Set<String> findDistinct(String fileName){
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		Set<String> mySet = new HashSet<String>();
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while((line = br.readLine()) != null){
				StringTokenizer tokens = new StringTokenizer(line, "");
				String temp = tokens.nextToken();
				mySet.add(temp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				if(br !=null){
					br.close();
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		return mySet;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDistinctWords myWords = new MyDistinctWords();
		Set<String> set = myWords.findDistinct("/Users/sarojrout/myFile.txt");
		
		List<String> myList = new ArrayList<String>(set);
		Collections.sort(myList, new Comparator<String>() {

			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.toString().compareTo(o2.toString());
			}

			
		});
		
		System.out.println(myList);
	}

}
