package com.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFirst2CharsTest {

	/*  TODO LIST
	 * 1. 2 chars AB=>B
	 * 2. 2 chars AA=>""
	 * 3. 4 chars ABCD=>BCD
	 * 4. n chars ABCXERGBNMKIUYTFAQWEDF=>BCXERGBNMKIUYTFAQWEDF
	 * 5. 1 char A=>""
	 * 6.Empty char:""=>""
	 */
	RemoveAFirst2Chars removeAFirst2Chars;
	
	@BeforeEach
	void setUp() {
		removeAFirst2Chars=new RemoveAFirst2Chars();
	}
	
	@Test
	
	void test0Char() {
		assertEquals("",removeAFirst2Chars.removeA(""));
	}
	
	@Test
	void test1Char() {
		assertEquals("",removeAFirst2Chars.removeA("A"));
	}
	
	@Test
	void test2Chars() {
		assertEquals("B",removeAFirst2Chars.removeA("AB"));
	}
	@Test
	void test4Chars() {
		assertEquals("BCD",removeAFirst2Chars.removeA("ABCD"));
	}
	@Test
	void testNChars() {
		assertEquals("BCDEFGHIJKLMN",removeAFirst2Chars.removeA("ABCDEFGHIJKLMN"));
	}

}
