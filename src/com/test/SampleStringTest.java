package com.test;

import java.util.Locale;

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
	public void testCharAt1(){
		String str = "abc12$%";
		assertEquals("testCharAt1", 'a', str.charAt(0));
	}
	
	/*��Чֵmax*/
	public void testCharAt2(){
		String str = "abc12$%";
		assertEquals("testCharAt2", '%', str.charAt(str.length()-1));
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
	public void testCodePointAt1(){
		String str = "abc12$%";
		assertEquals("testCodePointAt1", 97, str.codePointAt(0));
	}
	
	/*��Чֵmax*/
	public void testCodePointAt2(){
		String str = "abc12$%";
		assertEquals("testCodePointAt2", 37, str.codePointAt(str.length()-1));
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
	public void testCodePointBefore1(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointAt2", 97, str.codePointBefore(1));
	}
	
	/*��Чֵmax*/
	public void testCodePointBefore2(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointAt2", 37, str.codePointBefore(str.length()));
	}
	
	/*��Чֵlesser*/
	public void testInvalidCodePointBefore1(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointBefore1", 0, str.codePointBefore(0));
	}
	
	/*��Чֵmore*/
	public void testInvalidCodePointBefore2(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointBefore2", 0, str.codePointBefore(str.length()+1));
	}
	
	/*��Чֵ*/
	public void testCodePointCount(){
		String str = "abc12$%";
		assertEquals("testCodePointCount", 7, str.codePointCount(0,str.length()));
	}
	
	/*��Чֵ,��ʼΪ��*/
	public void testInvalidCodePointCount1(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointCount1", 0, str.codePointCount(-1,2));
	}
	
	/*��Чֵ,countΪ��*/
	public void testInvalidCodePointCount2(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointCount2", 0, str.codePointCount(0,-1));
	}
	
	/*��Чֵ*/
	public void testCompareTo(){
		String str1 = "hello";
		String str2 = "hello";
		assertEquals("testCompareTo", 0, str1.compareTo(str2));
	}
	
	/*��Чֵ*/
	public void testInvalidCompareTo(){
		String str = "hello";
		assertEquals("testInvalidCompareTo", 0, str.compareTo(null));
	}
	
	/*��Чֵ*/
	public void testCompareToIgnoreCase(){
		String str1 = "hello";
		String str2 = "HELlo";
		assertEquals("testCompareToIgnoreCase", 0, str1.compareToIgnoreCase(str2));
	}
	
	/*��Чֵ*/
	public void testInvalidCompareToIgnoreCase(){
		String str = "hello";
		assertEquals("testInvalidCompareToIgnoreCase", 0, str.compareToIgnoreCase(null));
	}
	
	/*��Чֵ*/
	public void testConcat(){
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
	public void testContains(){
		String str1 = "hello";
		String str2 = "el";
		assertTrue("testContains", str1.contains(str2));
	}
	
	/*��Чֵ*/
	public void testInvalidContains(){
		String str = "hello";
		assertTrue("testInvalidContains", str.contains(null));
	}
	
	/*��Чֵ1*/
	public void testContentEquals1(){
		String str1 = "hello";
		String str2 = "hello";
		assertTrue("testContentEquals1", str1.contentEquals(str2));
	}
	
	/*��Чֵ2*/
	public void testContentEquals2(){
		String str1 = "hello";
		StringBuffer str2 = new StringBuffer("hello");
		assertTrue("testContentEquals2", str1.contentEquals(str2));
	}
	
	/*��Чֵ*/
	public void testInvalidContentEquals(){
		String str1 = "hello";
		assertTrue("testInvalidContentEquals", str1.contentEquals(null));
	}
	
	/*��Чֵ1*/
	public void testCopyValueOf1(){
		char[] data = {'a','b','c','d'};
		assertEquals("testCopyValueOf1", "abcd", String.copyValueOf(data));
	}

	/*��Чֵ2*/
	public void testCopyValueOf2(){
		char[] data = {'a','b','c','d'};
		assertEquals("testCopyValueOf2", "c", String.copyValueOf(data, 2, 1));
	}
	
	/*��Чֵ1*/
	public void testInvalidCopyValueOf1(){
		assertEquals("testInvalidCopyValueOf1", "abcd", String.copyValueOf(null));
	}
	
	/*��Чֵ2*/
	public void testInvalidCopyValueOf2(){
		char[] data = {'a','b','c','d'};
		assertEquals("testInvalidCopyValueOf2", "abcd", String.copyValueOf(data, 2, 3));
	}
	
	/*��Чֵ1*/
	public void testEndsWith1(){
		String str = "hello";
        String s = "lo";
        assertTrue("testEndsWith1", str.endsWith(s));
	}

	/*��Чֵ2*/
	public void testEndsWith2(){
		String str = "hello";
		String s = "";
		assertTrue("testEndsWith2", str.endsWith(s));
	}
	
	/*��Чֵ*/
	public void testInvalidEndsWith(){
		String str = "hello";
		String s = null;
		assertTrue("testInvalidEndsWith", str.endsWith(s));
	}
	
	/*��Чֵ*/
	public void testEquals(){
		String a = "string";
        String b = "string";
        assertTrue("testEquals", a.equals(b));
	}
	
	/*��Чֵ*/
	public void testInvalidEquals(){
		String a = "String";
		String b = null;
		assertTrue("testInvalidEquals", a.equals(b));
	}
	
	/*��Чֵ*/
	public void testEqualsIgnoreCase(){
		String a = "String";
		String b = "STRING";
		assertTrue("testEqualsIgnoreCase", a.equalsIgnoreCase(b));
	}
	
	/*��Чֵ*/
	public void testInvalidEqualsIgnoreCase(){
		String a = "String";
		String b = null;
		assertTrue("testInvalidEqualsIgnoreCase", a.equalsIgnoreCase(b));
	}
	
	/*��Чֵ*/
	public void testFormat(){
		
	}
	
	/*��Чֵ*/
	public void testInvalidFormat(){
		
	}
	
	/*��Чֵ*/
	public void testGetBytes(){
		
	}
	
	/*��Чֵ*/
	public void testInvalidGetBytes(){
		
	}
	
	/*��Чֵ*/
	public void testGetChars(){
		String str = "Str";
		char[] ch = {'a','b','c'};
		str.getChars(0, str.length(), ch, 0);
		System.out.println(ch);
	}
	
	/*��Чֵ,srcBegin Ϊ��*/
	public void testInvalidGetChars1(){
		String str = "Str";
		char[] ch = {'a','b','c'};
		str.getChars(-1, 2, ch, 0);
		System.out.println(ch);
	}
	
	/*��Чֵ,srcBegin ���� srcEnd*/
	public void testInvalidGetChars2(){
		String str = "Str";
		char[] ch = {'a','b','c'};
		str.getChars(2, 1, ch, 0);
		System.out.println(ch);
	}
	
	/*��Чֵ,srcEnd ���ڴ��ַ����ĳ���*/
	public void testInvalidGetChars3(){
		String str = "Str";
		char[] ch = {'a','b','c'};
		str.getChars(0, str.length()+1, ch, 0);
		System.out.println(ch);
	}
	
	/*��Чֵ,dstBegin Ϊ��*/
	public void testInvalidGetChars4(){
		String str = "Str";
		char[] ch = {'a','b','c'};
		str.getChars(0, str.length(), ch, -1);
		System.out.println(ch);
	}
	
	/*��Чֵ,dstBegin+(srcEnd-srcBegin) ���� dst.length*/
	public void testInvalidGetChars5(){
		String str = "Stri";
		char[] ch = {'a','b','c'};
		str.getChars(0, str.length(), ch, 0);
		System.out.println(ch);
	}
	
	/*�õ���ϣֵ*/
	public void testHashCode(){
		String str = "String";
		assertEquals("testHashCode", -1808118735 , str.hashCode());
	}
	
	/*��Чֵ1*/
	public void testIndexOf1(){
		String str = "String";
		assertEquals("testIndexOf1", 3, str.indexOf("i"));
	}
	
	/*��Чֵ�������ڵ�����Ϊ-1*/
	public void testIndexOf2(){
		String str = "S";
		assertEquals("testIndexOf2", -1, str.indexOf("i"));
	}
	
	/*��Чֵ,""������Ϊ0*/
	public void testIndexOf3(){
		String str = "String";
		assertEquals("testIndexOf2", 0, str.indexOf(""));
	}
	
	/*��Чֵ*/
	public void testInvalidIndexOf(){
		String str = "String";
		assertEquals("testInvalidIndexOf", 3, str.indexOf(null));
	}
	
	/*�淶����ʾ��ʽ*/
	public void testIntern(){
		String str = "String";
		assertSame("testIntern", str, str.intern());
		assertSame("testIntern", "String", str.intern());
	}
	
	/*�Ƿ�Ϊ��*/
	public void testIsEmpty(){
		String str = "";
		assertTrue("testIsEmpty", str.isEmpty());
	}
	
	/*��Чֵ*/
	public void testLastIndexOf1(){
		String str = "Stiring";
		assertEquals("testLastIndexOf1", 4, str.lastIndexOf("i"));
	}
	
	/*��Чֵ��""������Ϊstr.length()*/
	public void testLastIndexOf2(){
		String str = "Stiring";
		assertEquals("testLastIndexOf2", str.length(), str.lastIndexOf(""));
	}
	
	/*��Чֵ*/
	public void testInvalidLastIndexOf(){
		String str = "Stiring";
		assertEquals("testInvalidLastIndexOf", 4, str.lastIndexOf(null));
	}
	
	/*�õ�����*/
	public void testlength(){
		String str = "String";
		assertEquals("testlength", 6, str.length());
	}
	
	public void testmatches(){
		
	}

	/*��Чֵ1*/
	public void testOffsetByCodePoints1(){
		String str = "abc12$%";
		assertEquals("testOffsetByCodePoints1", 2, str.offsetByCodePoints(0,2));
	}
	
	/*��Чֵ2*/
	public void testOffsetByCodePoints2(){
		String str = "abc12$%";
		System.out.println(str.length());
		assertEquals("testOffsetByCodePoints2", 5, str.offsetByCodePoints(str.length(),-2));
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
	
	/*��Чֵ*/
	public void testRegionMatches(){
		String str1 = "String";
		String str2 = "javaString";
		assertTrue("testRegionMatches", str1.regionMatches(0, str2, 4, str1.length()));
	}
	
	/*��Чֵ��thisStartΪ��*/
	public void testInvalidRegionMatches1(){
		String str1 = "String";
		String str2 = "javaString";
		assertTrue("testInvalidRegionMatches1", str1.regionMatches(-1, str2, 4, str1.length()));
	}
	
	/*��Чֵ��startΪ��*/
	public void testInvalidRegionMatches2(){
		String str1 = "String";
		String str2 = "javaString";
		assertTrue("testInvalidRegionMatches2", str1.regionMatches(0, str2, -1, str1.length()));
	}
	
	/*��Чֵ��thisStart+lengrh ���ڴ� str1 ����ĳ���*/
	public void testInvalidRegionMatches3(){
		String str1 = "String";
		String str2 = "javaString";
		assertTrue("testInvalidRegionMatches3", str1.regionMatches(2, str2, 4, str1.length()));
	}
	
	/*��Чֵ��start+lengrh ���ڴ� str2����ĳ���*/
	public void testInvalidRegionMatches4(){
		String str1 = "String";
		String str2 = "javaString";
		assertTrue("testInvalidRegionMatches4", str1.regionMatches(0, str2, 5, str1.length()));
	}
	
	/*��Чֵ1*/
	public void testReplace1(){
		String str1 = "abfddddddd";
        String str2 = "ccc";
        assertEquals("testReplace1", "abfccccccd", str1.replace("ddd",str2));
	}
	
	/*��Чֵ2*/
	public void testReplace2(){
		String str1 = "abd";
		String str2 = "ccc";
		assertEquals("testReplace2", "cccacccbcccdccc", str1.replace("",str2));
	}
	
	/*��Чֵ*/
	public void testInvalidReplace(){
		String str1 = "abd";
		String str2 = "ccc";
		assertEquals("testInvalidReplace", "cccacccbcccdccc", str1.replace(null,str2));
	}
	
	/*��֧��������ʽ*/
	public void testReplaceAll(){
		String str = "a.b123456";   
		assertEquals("testReplaceAll", "a.b12*456", str.replaceAll("3", "*"));
		assertEquals("testReplaceAll", "a.b******", str.replaceAll("\\d", "*"));
	}
	
	/*�滻��һ��*/
	public void testReplaceFirst(){
		 String str = "a.b?c,?d%g.d'fd";   
         String str1 = str.replaceFirst("\\?","jun");
         String str2 = str.replaceFirst("\\.","jun");
         assertEquals("testReplaceFirst", "a.bjunc,?d%g.d'fd", str1);
         assertEquals("testReplaceFirst", "ajunb?c,?d%g.d'fd", str2);
	}
	
	/** δʹ�ö���,console��� */
	/*��Чֵ1*/
	public void testSplit1(){
		String str = "a:b:c:d:e:F";
        String[]str1 = str.split(":");
        for(int i=0;i<str1.length;i++){
            System.out.println(str1[i]);
        }
	}
	
	/** δʹ�ö���,console��� */
	/*��Чֵ2*/
	public void testSplit2(){
		String str = "boo:and:foo";
		String[]str1 = str.split(":",2);
		System.out.println(str1[0]);
		System.out.println(str1[1]);
	}
	
	/*��Чֵ1*/
	public void testStartsWith1(){
		String str = "hello";
        String s = "he";
        assertTrue("testStartsWith1", str.startsWith(s));
	}

	/*��Чֵ2*/
	public void testStartsWith2(){
		String str = "hello";
		String s = "";
		assertTrue("testStartsWith2", str.startsWith(s));
	}
	
	/*��Чֵ*/
	public void testInvalidStartsWith2(){
		String str = "hello";
		String s = null;
		assertTrue("testInvalidEndsWith", str.startsWith(s));
	}
	
	/*��Чֵ,һ������*/
	public void testSubstring1(){
		String str="hellochinese";
        assertEquals(
        		"testSubstring1", 
        		"lochinese", 
        		str.substring(3));
	}
	
	/*��Чֵ����������*/
	public void testSubstring2(){
		String str="hellochinese";
		assertEquals(
				"testSubstring2", 
				"hel", 
				str.substring(0,3));
	}

	/*��Чֵ,һ������*/
	public void testInvalidSubstring(){
		String str="hell";
		assertEquals(
				"testInvalidSubstring", 
				"lochinese", 
				str.substring(9));
	}
	
	/*��Чֵ,beginIndexΪ��*/
	public void testInvalidSubstring1(){
		String str="hellochinese";
		assertEquals(
				"testInvalidSubstring1",
				"hell",
				str.substring(-1,3));
	}
	
	/*��Чֵ,endIndex Ϊ��*/
	public void testInvalidSubstring2(){
		String str="hellochinese";
		assertEquals(
				"testInvalidSubstring2",
				"hell",
				str.substring(0,-1));
	}
	
	/*��Чֵ,endIndex ���� length()*/
	public void testInvalidSubstring3(){
		String str="hellochinese";
		assertEquals(
				"testInvalidSubstring3",
				"hell",
				str.substring(0,str.length()+1));
	}
	
	/*��Чֵ, beginIndex ���� endIndex*/
	public void testInvalidSubstring4(){
		String str="hellochinese";
		assertEquals(
				"testInvalidSubstring4",
				"hell",
				str.substring(2,1));
	}
	
	
	/** δʹ�ö���,console��� */
	public void testToCharArray(){
		 String str = "Hello";
         char[] new_str = str.toCharArray();
         for(int i = 0 ; i < new_str.length ; i++){
        	 System.out.println(new_str[i]);
         }
	}
	
	/*תΪСд*/
	public void testToLowerCase(){
		String str="ABdFGjke123";
        assertEquals("testToLowerCase", "abdfgjke123", str.toLowerCase(Locale.CHINESE));
	}
	
	/*תΪ��д*/
	public void testToUpperCase(){
		String str="ABdFGjke123";
        assertEquals("testToUpperCase", "ABDFGJKE123", str.toUpperCase(Locale.CHINESE));
	}
	
	/*ȥ��ͷβ�ո�*/
	public void testTrim(){
		String str="            hi   hi   hi            ";   
        assertEquals("testTrim", "hi   hi   hi", str.trim());
	}
	
	/*boolean*/
	public void testValueOfBoolean(){
		assertEquals(
				"testValueOfBoolean", 
				"true", 
				String.valueOf(true));
	}
	
	/*char*/
	public void testValueOfChar(){
		assertEquals(
				"testValueOfChar", 
				"a", 
				String.valueOf('a'));
	}
	
	/*char[]*/
	public void testValueOfCharArray1(){
		char[] charArray = {'a','b','c'};
		assertEquals(
				"testValueOfCharArray1", 
				"abc", 
				String.valueOf(charArray));
	}
	
	/*valueOf(char[] data, int offset, int count)*/
	public void testValueOfCharArray2(){
		char[] charArray = {'a','b','c','d','e','f'};
		assertEquals(
				"testValueOfCharArray2", 
				"ab", 
				String.valueOf(charArray, 0, 2));
	}
	
	/*double*/
	public void testValueOfDouble(){
		double num = 12.512;
		assertEquals(
				"testValueOfDouble", 
				"12.512", 
				String.valueOf(num));
	}
	
	/*float*/
	public void testValueOfFloat(){
		float num = 12.512f;
		assertEquals(
				"testValueOfFloat", 
				"12.512", 
				String.valueOf(num));
	}
	
	/*int*/
	public void testValueOfInt(){
		int num = 12;
		assertEquals(
				"testValueOfInt", 
				"12", 
				String.valueOf(num));
	}
	
	/*long*/
	public void testValueOfLong(){
		long num = 12123;
		assertEquals(
				"testValueOfLong", 
				"12123", 
				String.valueOf(num));
	}
	
	/*Object*/
	public void testValueOfObject(){
		Integer num = 12345;
		assertEquals(
				"testValueOfObject", 
				"12345", 
				String.valueOf(num));
	}
	
	/*��Чֵ*/
	public void testInvalidValueOfBoolean(){
		assertEquals(
				"testInvalidValueOfBoolean", 
				"true", 
				String.valueOf(null));
	}
	
	//========================combination==========================
	
	public void testCombineCodePointAt$indexOf(){
		String str = "abc12$%";
		assertEquals("testCompareTo", 97, str.codePointAt(str.indexOf("a")));
	}
	
	public void testCombineSubstring$indexOf(){
		String str = "SampleStringTest.java";
		String subStr = str.substring(0, str.indexOf("ing"));
		assertEquals("", "SampleStr", subStr);
	}
}

