package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Listmapping {
	
	
	public static void main(String[] args) {
		List<String> st = Arrays.asList("tanuj_23","utkarsh_12","tanuj_25","tanuj_24","utkarsh_14");
		/*Map<String, String> valueMap = st.stream().collect(Collectors.toMap(pt -> pt.split("_")[0], pt-> pt, 
				(oldValue, newValue) -> compare(oldValue,newValue)));*/
		
		Map<String, Optional<String>> valueMap = st.stream().collect(Collectors.groupingBy(pt -> pt.split("_")[0], 
				Collectors.maxBy(Comparator.comparing(value -> value.split("_")[1]))));
		System.out.println(valueMap);
	}

	private static String compare(String oldValue, String newValue) {
		
		return (Integer.parseInt(oldValue.split("_")[1]) > Integer.parseInt(newValue.split("_")[1])) ? oldValue : newValue;
	}
}
