package com.test;

import junit.framework.TestCase;

/**
 * 
 * @author royleexh
 */
public class SampleStringTest extends TestCase{
	
	
	protected void setUp() throws Exception {
		
	}

	protected void tearDown(){
		
	}
	
	/*��Чֵmin*/
	public void testValidCharAt1(){
		String str = "abc12$%";
		assertEquals("testValidCharAt1", 'a', str.charAt(0));
	}
	
	/*��Чֵmax*/
	public void testValidCharAt2(){
		String str = "abc12$%";
		assertEquals("testValidCharAt2", '%', str.charAt(str.length()-1));
	}
	
	/*��Чֵlesser*/
	public void testInvalidCharAt1(){
		String str = "abc12$%";
		assertEquals("testInvalidCharAt1", 'b', str.charAt(-1));
	}
	
	/*��Чֵmore*/
	public void testInvalidCharAt2(){
		String str = "abc12$%";
		assertEquals("testInvalidCharAt2", 'b', str.charAt(str.length()));
	}
	
	/*��Чֵmin*/
	public void testValidCodePointAt1(){
		String str = "abc12$%";
		assertEquals("testValidCodePointAt1", 97, str.codePointAt(0));
	}
	
	/*��Чֵmax*/
	public void testValidCodePointAt2(){
		String str = "abc12$%";
		assertEquals("testValidCodePointAt2", 37, str.codePointAt(str.length()-1));
	}
	
	/*��Чֵlesser*/
	public void testInvalidCodePointAt1(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointAt1", 0, str.codePointAt(-1));
	}
	
	/*��Чֵmore*/
	public void testInvalidCodePointAt2(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointAt2", 0, str.codePointAt(str.length()));
	}
	
	/*��Чֵmin*/
	public void testValidCodePointBefore1(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointAt2", 97, str.codePointBefore(1));
	}
	
	/*��Чֵmax*/
	public void testValidCodePointBefore2(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointAt2", 37, str.codePointBefore(str.length()));
	}
	
	/*��Чֵlesser*/
	public void testInvalidCodePointBefore1(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointBefore1", 0, str.codePointBefore(0));
	}
	
	/*��Чֵmore*/
	public void testinValidCodePointBefore2(){
		String str = "abc12$%";
		assertEquals("testinValidCodePointBefore2", 0, str.codePointBefore(str.length()+1));
	}
	
	/*��Чֵ*/
	public void testValidCodePointCount(){
		String str = "abc12$%";
		assertEquals("testValidCodePointCount", 7, str.codePointCount(0,str.length()));
	}
	
	/*��Чֵ*/
	public void testInvalidCodePointCount(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointCount", 0, str.codePointCount(-1,2));
	}
	
	/*��Чֵ*/
	public void testValidCompareTo(){
		String str1 = "hello";
		String str2 = "hellp";
		assertEquals("testValidCompareTo", 0, str1.compareTo(str2));
	}
	
	/*��Чֵ*/
	public void testInvalidCompareTo(){
		String str = "hello";
		assertEquals("testInvalidCompareTo", 0, str.compareTo(null));
	}
	
	/*��Чֵ*/
	public void testValidCompareToIgnoreCase(){
		String str1 = "hello";
		String str2 = "HELlo";
		assertEquals("testValidCompareToIgnoreCase", 0, str1.compareToIgnoreCase(str2));
	}
	
	/*��Чֵ*/
	public void testInvalidCompareToIgnoreCase(){
		String str = "hello";
		assertEquals("testInvalidCompareToIgnoreCase", 0, str.compareToIgnoreCase(null));
	}
	
	/*��Чֵ*/
	public void testValidConcat(){
		String str1 = "Hello";
		String str2 = "java";
        assertEquals("testConcat", "Hellojava", str1.concat(str2));
	}
	
	/*��Чֵ*/
	public void testInvalidConcat(){
		String str1 = "Hello";
		assertEquals("testInvalidConcat", "Hellojava", str1.concat(null));
	}
	
	/*��Чֵ*/
	public void testValidContains(){
		String str1 = "hello";
		String str2 = "el";
		assertTrue("testValidContains", str1.contains(str2));
	}
	
	/*��Чֵ*/
	public void testInvalidContains(){
		String str = "hello";
		assertTrue("testInvalidContains", str.contains(null));
	}
	
	/*��Чֵ*/
	public void testValidContentEquals(){
		String str1 = "hello";
		String str2 = "el";
		assertTrue("testValidContentEquals", str1.contentEquals(str2));
	}
	
	/*��Чֵ*/
	public void testInvalidContentEquals(){
		String str1 = "hello";
		assertTrue("testInvalidContentEquals", str1.contentEquals(null));
	}
	
	public void testEndsWith(){
		String str = "hello";
        String s = "lo";
        assertTrue("testEndsWith", str.endsWith(s));
	}
	
	public void testEquals(){
		String a = "String";
        String b = "string";
        assertTrue("testEquals", a.equals(b));
	}
	
	public void testEqualsIgnoreCase(){
		String a = "String";
		String b = "STRING";
		assertTrue("testEqualsIgnoreCase", a.equalsIgnoreCase(b));
	}
	
	public void testHashCode(){
		String str = "String";
		assertEquals("testHashCode", 123 , str.hashCode());
	}
	
	public void testIndexOf(){
		String str = "String";
		assertEquals("testIndexOf",3 , str.indexOf("i"));
	}
	
	public void testLastIndexOf(){
		String str = "Stiring";
		assertEquals("testLastIndexOf", 4 , str.lastIndexOf("i"));
	}
	
	public void testIsEmpty(){
		String str = "String";
		assertTrue("testIsEmpty", str.isEmpty());
	}
	
	public void testlength(){
		String str = "String";
		assertEquals("testlength", 6, str.length());
	}

	/*��Чֵ1*/
	public void testValidOffsetByCodePoints1(){
		String str = "abc12$%";
		assertEquals("testValidOffsetByCodePoints1", 2, str.offsetByCodePoints(0,2));
	}
	
	/*��Чֵ2*/
	public void testValidOffsetByCodePoints2(){
		String str = "abc12$%";
		System.out.println(str.length());
		assertEquals("testValidOffsetByCodePoints2", 5, str.offsetByCodePoints(str.length(),-2));
	}
	
	/*��Чֵ,index Ϊ��*/
	public void testInvalidOffsetByCodePoints1(){
		String str = "abc12$%";
		assertEquals("testInvalidOffsetByCodePoints1", 0, str.offsetByCodePoints(-1,2));
	}
	
	/*��Чֵ,���ڴ� String �ĳ���*/
	public void testInvalidOffsetByCodePoints2(){
		String str = "abc12$%";
		assertEquals("testInvalidOffsetByCodePoints2", 0, str.offsetByCodePoints(str.length()+1,-3));
	}
	
	/*��Чֵ,codePointOffset Ϊ��*/
	public void testInvalidOffsetByCodePoints3(){
		String str = "abc12$%";
		assertEquals("testInvalidOffsetByCodePoints3", 0, str.offsetByCodePoints(str.length(),3));
	}
	
	/*��Чֵ,codePointOffset Ϊ��*/
	public void testInvalidOffsetByCodePoints4(){
		String str = "abc12$%";
		assertEquals("testInvalidOffsetByCodePoints4", 0, str.offsetByCodePoints(0,-3));
	}
	
	public void testReplace(){
		String str1="abfddddddd";
        String str2="ccc";
        String str=str1.replace("ddd",str2);
        assertEquals("testReplace", "abfccccccd", str);
	}

	public void testReplaceFirst(){
		 String str="a.b?c,d%gd'fd";   
         String str1=str.replaceFirst("\\?","jun");
         String str2=str.replaceFirst("\\.","jun");
         assertEquals("testReplaceFirst", "a.bjunc,d%gd'fd", str1);
         assertEquals("testReplaceFirst", "ajunb?c,d%gd'fd", str2);
	}
	
	public void testSplit(){
		String str="a:b:c:d:e:F";
        String[]str1=str.split(":");
        for(int i=0;i<str1.length;i++){
            System.out.print(str1[i]);
        }
	}
	
	public void teststartsWith(){
		String str = "String";
		assertTrue("teststartsWith", str.startsWith("abc"));
	}
	
	public void testSubstring(){
		String str="hellochinese";
        String s=str.substring(0,3);
        assertEquals("hell", s);
	}
	
	public void testToCharArray(){
		 String str = "Hello";
         char[] A = new char[5];
         A = str.toCharArray();
         for(int i = 0 ; i < A.length ; i++){
        	 System.out.println(A[i]);
         }
	}

	public void testToLowerCase(){
		String s="ABdFGjke123";
        String A=s.toLowerCase();
        assertEquals("testToLowerCase", "abdfgjke123", A);
	}
	
	public void testToUpperCase(){
		String s="ABdFGjke123";
        String A=s.toUpperCase();
        assertEquals("testToUpperCase", "ABDFGJKE123", A);
	}
	
	public void testTrim(){
		String str="            hi   hi   hi            ";   
        String str1=str.trim();
        assertEquals("testTrim", "hi   hi   hi", str1);
	}
	
	//========================combination==========================
	
	public void testCombineCodePointAt$indexOf(){
		String str = "abc12$%";
		assertEquals("testCompareTo", 97, str.codePointAt(str.indexOf("a")));
	}
	
	public void testCombination1(){
		String str = "SampleStringTest.java";
		String subStr = str.substring(0, str.indexOf("ing"));
		assertEquals("", "SampleStr", subStr);
	}
}
