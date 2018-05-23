package com.newbie.eanjuman.util;

import java.sql.Timestamp;
import java.text.ParseException;

public class Test {

	public static void main(String[] args) throws ParseException {
		Timestamp setDateAndTime = DateUtil.setDateAndTime("13-May-2018");
		System.out.println(setDateAndTime);

	}

}
