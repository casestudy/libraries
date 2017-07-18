package com.femencha.sorting;

import java.util.*;
import com.femencha.exception.ParameterException ;

public class Insertion {
	
	public static List <Integer> ascending (List <Integer> data) throws ParameterException {
		
		if (data.isEmpty()) {
			throw new ParameterException("An empty list cannot be used");
		} 

		for (int next = 1; next < data.size(); next++) {

			int insert = data.get(next) ; //Value we are inserting
			int moveItem = next ; //Position we are inserting to

			while (moveItem > 0 && data.get(moveItem - 1) > insert) {
				data.set(moveItem, data.get(moveItem - 1)) ;
				moveItem--;
			}

			data.set(moveItem, insert) ;
		}

		return data ;
	}
}