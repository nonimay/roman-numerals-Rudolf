package com.opencast.romannumerals;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void test1() {
		assertEquals("I", RomanNumerals.convert(1));
	}
	
	@Test
	public void test2() {
		assertEquals("II", RomanNumerals.convert(2));
	}
	
	@Test
	public void test3() {
		assertEquals("III", RomanNumerals.convert(3));
	}
	
	@Test
	public void test5() {
		assertEquals("V", RomanNumerals.convert(5));
	}
	
	@Test
	public void test4() {
		assertEquals("IV", RomanNumerals.convert(4));
	}
	
	@Test
	public void test6() {
		assertEquals("VI", RomanNumerals.convert(6));
	}
	
	@Test
	public void test7() {
		assertEquals("VII", RomanNumerals.convert(7));
	}
	
	@Test
	public void test8() {
		assertEquals("VIII", RomanNumerals.convert(8));
	}
	
	@Test
	public void test9() {
		assertEquals("IX", RomanNumerals.convert(9));
	}
	
	@Test
	public void test10() {
		assertEquals("X", RomanNumerals.convert(10));
	}
	
	@Test
	public void test11() {
		assertEquals("XI", RomanNumerals.convert(11));
	}
	
	@Test
	public void test12() {
		assertEquals("XII", RomanNumerals.convert(12));
	}
	
	@Test
	public void test13() {
		assertEquals("XIII", RomanNumerals.convert(13));
	}
	
	@Test
	public void test14() {
		assertEquals("XIV", RomanNumerals.convert(14));
	}
	
	@Test
	public void test15() {
		assertEquals("XV", RomanNumerals.convert(15));
	}
	
	@Test
	public void test16() {
		assertEquals("XVI", RomanNumerals.convert(16));
	}
	
	@Test
	public void test17() {
		assertEquals("XVII", RomanNumerals.convert(17));
	}
	
	@Test
	public void test50() {
		assertEquals("L", RomanNumerals.convert(50));
	}
	
	@Test
	public void test40() {
		assertEquals("XL", RomanNumerals.convert(40));
	}
	
	@Test
	public void test41() {
		assertEquals("XLI", RomanNumerals.convert(41));
	}
	
	@Test
	public void test18() {
		assertEquals("XVIII", RomanNumerals.convert(18));
	}
	
	@Test
	public void test19() {
		assertEquals("XIX", RomanNumerals.convert(19));
	}
	
	@Test
	public void test20() {
		assertEquals("XX", RomanNumerals.convert(20));
	}
	
	@Test
	public void test21() {
		assertEquals("XXI", RomanNumerals.convert(21));
	}
	
	@Test
	public void test22() {
		assertEquals("XXII", RomanNumerals.convert(22));
	}
	
	@Test
	public void test33() {
		assertEquals("XXXIII", RomanNumerals.convert(33));
	}
	
	@Test
	public void test49() {
		assertEquals("XLIX", RomanNumerals.convert(49));
	}
	
	@Test
	public void test78() {
		assertEquals("LXXVIII", RomanNumerals.convert(78));
	}
	
	@Test
	public void test100() {
		assertEquals("C", RomanNumerals.convert(100));
	}
	
	@Test
	public void test101() {
		assertEquals("CI", RomanNumerals.convert(101));
	}
	
	@Test
	public void test102() {
		assertEquals("CII", RomanNumerals.convert(102));
	}
	
	@Test
	public void test122() {
		assertEquals("CXXII", RomanNumerals.convert(122));
	}
	
	@Test
	public void test189() {
		assertEquals("CLXXXIX", RomanNumerals.convert(189));
	}
	
	@Test
	public void test200() {
		assertEquals("CC", RomanNumerals.convert(200));
	}
	
	@Test
	public void test239() {
		assertEquals("CCXXXIX", RomanNumerals.convert(239));
	}
	
	@Test
	public void test489() {
		assertEquals("CDLXXXIX", RomanNumerals.convert(489));
	}
	
	@Test
	public void test400() {
		assertEquals("CD", RomanNumerals.convert(400));
	}
	
	@Test
	public void test900() {
		assertEquals("CM", RomanNumerals.convert(900));
	}
	
	@Test
	public void test1000() {
		assertEquals("M", RomanNumerals.convert(1000));
	}
	
	
	
	
	
	

	

}