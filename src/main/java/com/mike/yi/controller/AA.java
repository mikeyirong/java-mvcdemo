package com.mike.yi.controller;

import java.math.BigDecimal;

public class AA {

	public static void main(String[] args) {
		String a = "10.12";
		String rs = new BigDecimal(a).add(new BigDecimal("100.35")).toString();
		System.out.println(rs);
	}

}
