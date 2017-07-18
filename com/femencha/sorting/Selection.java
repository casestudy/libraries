package com.femencha.sorting;

import java.util.*;
import com.femencha.exception.ParameterException ;
import com.femencha.utility.*;

public class Selection {

	public static List <Integer> ascending (List <Integer> data) throws ParameterException {

		if (data.isEmpty()) {
			throw new ParameterException("An empty list cannot be used");
		}

		Basic basic = new Basic() ;

		for (int i = 0; i < data.size(); i++) {
			int m = i ; //First element is assumed to be the smallest element

			for (int j = i + 1; j < data.size(); j++) {
				if (data.get(j) < data.get(m)) {
					m = j ; //New smallest element index
				}
			}

			basic.swap(data, i, m);

		}

		return data ;
	}
}