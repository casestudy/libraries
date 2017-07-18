package com.femencha.utility;

import java.util.*;
import com.femencha.exception.ParameterException ;

public class Basic {

	public static void swap (List <Integer> d, int i, int j) throws ParameterException {
		if (d.isEmpty()) {
			throw new ParameterException("An empty list cannot be used");
		}

		int tmp = d.get(i);
		d.set(i, d.get(j));
		d.set(j, tmp);
	}
	
}