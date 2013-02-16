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
	
	/*有效值min*/
	public void testCharAt1(){
		String str = "abc12$%";
		assertEquals("testCharAt1", 'a', str.charAt(0));
	}
	
	/*有效值max*/
	public void testCharAt2(){
		String str = "abc12$%";
		assertEquals("testCharAt2", '%', str.charAt(str.length()-1));
	}
	
	/*无效值lesser*/
	public void testInvalidCharAt1(){
		String str = "abc12$%";
		assertEquals("testInvalidCharAt1", 'b', str.charAt(-1));
	}
	
	/*无效值more*/
	public void testInvalidCharAt2(){
		String str = "abc12$%";
		assertEquals("testInvalidCharAt2", 'b', str.charAt(str.length()));
	}
	
	/*有效值min*/
	public void testCodePointAt1(){
		String str = "abc12$%";
		assertEquals("testCodePointAt1", 97, str.codePointAt(0));
	}
	
	/*有效值max*/
	public void testCodePointAt2(){
		String str = "abc12$%";
		assertEquals("testCodePointAt2", 37, str.codePointAt(str.length()-1));
	}
	
	/*无效值lesser*/
	public void testInvalidCodePointAt1(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointAt1", 0, str.codePointAt(-1));
	}
	
	/*无效值more*/
	public void testInvalidCodePointAt2(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointAt2", 0, str.codePointAt(str.length()));
	}
	
	/*有效值min*/
	public void testCodePointBefore1(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointAt2", 97, str.codePointBefore(1));
	}
	
	/*有效值max*/
	public void testCodePointBefore2(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointAt2", 37, str.codePointBefore(str.length()));
	}
	
	/*无效值lesser*/
	public void testInvalidCodePointBefore1(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointBefore1", 0, str.codePointBefore(0));
	}
	
	/*无效值more*/
	public void testInvalidCodePointBefore2(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointBefore2", 0, str.codePointBefore(str.length()+1));
	}
	
	/*有效值*/
	public void testCodePointCount(){
		String str = "abc12$%";
		assertEquals("testCodePointCount", 7, str.codePointCount(0,str.length()));
	}
	
	/*无效值,开始为负*/
	public void testInvalidCodePointCount1(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointCount1", 0, str.codePointCount(-1,2));
	}
	
	/*无效值,count为负*/
	public void testInvalidCodePointCount2(){
		String str = "abc12$%";
		assertEquals("testInvalidCodePointCount2", 0, str.codePointCount(0,-1));
	}
	
	/*有效值*/
	public void testCompareTo(){
		String str1 = "hello";
		String str2 = "hello";
		assertEquals("testCompareTo", 0, str1.compareTo(str2));
	}
	
	/*无效值*/
	public void testInvalidCompareTo(){
		String str = "hello";
		assertEquals("testInvalidCompareTo", 0, str.compareTo(null));
	}
	
	/*有效值*/
	public void testCompareToIgnoreCase(){
		String str1 = "hello";
		String str2 = "HELlo";
		assertEquals("testCompareToIgnoreCase", 0, str1.compareToIgnoreCase(str2));
	}
	
	/*无效值*/
	public void testInvalidCompareToIgnoreCase(){
		String str = "hello";
		assertEquals("testInvalidCompareToIgnoreCase", 0, str.compareToIgnoreCase(null));
	}
	
	/*有效值*/
	public void testConcat(){
		String str1 = "Hello";
		String str2 = "java";
        assertEquals("testConcat", "Hellojava", str1.concat(str2));
	}
	
	/*无效值*/
	public void testInvalidConcat(){
		String str1 = "Hello";
		assertEquals("testInvalidConcat", "Hellojava", str1.concat(null));
	}
	
	/*有效值*/
	public void testContains(){
		String str1 = "hello";
		String str2 = "el";
		assertTrue("testContains", str1.contains(str2));
	}
	
	/*无效值*/
	public void testInvalidContains(){
		String str = "hello";
		assertTrue("testInvalidContains", str.contains(null));
	}
	
	/*有效值1*/
	public void testContentEquals1(){
		String str1 = "hello";
		String str2 = "hello";
		assertTrue("testContentEquals1", str1.contentEquals(str2));
	}
	
	/*有效值2*/
	public void testContentEquals2(){
		String str1 = "hello";
		StringBuffer str2 = new StringBuffer("hello");
		assertTrue("testContentEquals2", str1.contentEquals(str2));
	}
	
	/*无效值*/
	public void testInvalidContentEquals(){
		String str1 = "hello";
		assertTrue("testInvalidContentEquals", str1.contentEquals(null));
	}
	
	/*有效值1*/
	public void testCopyValueOf1(){
		char[] data = {'a','b','c','d'};
		assertEquals("testCopyValueOf1", "abcd", String.copyValueOf(data));
	}

	/*有效值2*/
	public void testCopyValueOf2(){
		char[] data = {'a','b','c','d'};
		assertEquals("testCopyValueOf2", "c", String.copyValueOf(data, 2, 1));
	}
	
	/*无效值1*/
	public void testInvalidCopyValueOf1(){
		assertEquals("testInvalidCopyValueOf1", "abcd", String.copyValueOf(null));
	}
	
	/*无效值2*/
	public void testInvalidCopyValueOf2(){
		char[] data = {'a','b','c','d'};
		assertEquals("testInvalidCopyValueOf2", "abcd", String.copyValueOf(data, 2, 3));
	}
	
	/*有效值1*/
	public void testEndsWith1(){
		String str = "hello";
        String s = "lo";
        assertTrue("testEndsWith1", str.endsWith(s));
	}

	/*有效值2*/
	public void testEndsWith2(){
		String str = "hello";
		String s = "";
		assertTrue("testEndsWith2", str.endsWith(s));
	}
	
	/*无效值*/
	public void testInvalidEndsWith(){
		String str = "hello";
		String s = null;
		assertTrue("testInvalidEndsWith", str.endsWith(s));
	}
	
	/*有效值*/
	public void testEquals(){
		String a = "string";
        String b = "string";
        assertTrue("testEquals", a.equals(b));
	}
	
	/*无效值*/
	public void testInvalidEquals(){
		String a = "String";
		String b = null;
		assertTrue("testInvalidEquals", a.equals(b));
	}
	
	/*有效值*/
	public void testEqualsIgnoreCase(){
		String a = "String";
		String b = "STRING";
		assertTrue("testEqualsIgnoreCase", a.equalsIgnoreCase(b));
	}
	
	/*无效值*/
	public void testInvalidEqualsIgnoreCase(){
		String a = "String";
		String b = null;
		assertTrue("testInvalidEqualsIgnoreCase", a.equalsIgnoreCase(b));
	}
	
	/*有效值*/
	public void testFormat(){
		
	}
	
	/*无效值*/
	public void testInvalidFormat(){
		
	}
	
	/*有效值*/
	public void testGetBytes(){
		
	}
	
	/*无效值*/
	public void testInvalidGetBytes(){
		
	}
	
	/*有效值*/
	public void testGetChars(){
		String str = "Str";
		char[] ch = {'a','b','c'};
		str.getChars(0, str.length(), ch, 0);
		System.out.println(ch);
	}
	
	/*无效值,srcBegin 为负*/
	public void testInvalidGetChars1(){
		String str = "Str";
		char[] ch = {'a','b','c'};
		str.getChars(-1, 2, ch, 0);
		System.out.println(ch);
	}
	
	/*无效值,srcBegin 大于 srcEnd*/
	public void testInvalidGetChars2(){
		String str = "Str";
		char[] ch = {'a','b','c'};
		str.getChars(2, 1, ch, 0);
		System.out.println(ch);
	}
	
	/*无效值,srcEnd 大于此字符串的长度*/
	public void testInvalidGetChars3(){
		String str = "Str";
		char[] ch = {'a','b','c'};
		str.getChars(0, str.length()+1, ch, 0);
		System.out.println(ch);
	}
	
	/*无效值,dstBegin 为负*/
	public void testInvalidGetChars4(){
		String str = "Str";
		char[] ch = {'a','b','c'};
		str.getChars(0, str.length(), ch, -1);
		System.out.println(ch);
	}
	
	/*无效值,dstBegin+(srcEnd-srcBegin) 大于 dst.length*/
	public void testInvalidGetChars5(){
		String str = "Stri";
		char[] ch = {'a','b','c'};
		str.getChars(0, str.length(), ch, 0);
		System.out.println(ch);
	}
	
	/*得到哈希值*/
	public void testHashCode(){
		String str = "String";
		assertEquals("testHashCode", -1808118735 , str.hashCode());
	}
	
	/*有效值1*/
	public void testIndexOf1(){
		String str = "String";
		assertEquals("testIndexOf1", 3, str.indexOf("i"));
	}
	
	/*有效值，不存在的索引为-1*/
	public void testIndexOf2(){
		String str = "S";
		assertEquals("testIndexOf2", -1, str.indexOf("i"));
	}
	
	/*有效值,""的索引为0*/
	public void testIndexOf3(){
		String str = "String";
		assertEquals("testIndexOf2", 0, str.indexOf(""));
	}
	
	/*无效值*/
	public void testInvalidIndexOf(){
		String str = "String";
		assertEquals("testInvalidIndexOf", 3, str.indexOf(null));
	}
	
	/*规范化表示形式*/
	public void testIntern(){
		String str = "String";
		assertSame("testIntern", str, str.intern());
		assertSame("testIntern", "String", str.intern());
	}
	
	/*是否为空*/
	public void testIsEmpty(){
		String str = "";
		assertTrue("testIsEmpty", str.isEmpty());
	}
	
	/*有效值*/
	public void testLastIndexOf1(){
		String str = "Stiring";
		assertEquals("testLastIndexOf1", 4, str.lastIndexOf("i"));
	}
	
	/*有效值，""的索引为str.length()*/
	public void testLastIndexOf2(){
		String str = "Stiring";
		assertEquals("testLastIndexOf2", str.length(), str.lastIndexOf(""));
	}
	
	/*无效值*/
	public void testInvalidLastIndexOf(){
		String str = "Stiring";
		assertEquals("testInvalidLastIndexOf", 4, str.lastIndexOf(null));
	}
	
	/*得到长度*/
	public void testlength(){
		String str = "String";
		assertEquals("testlength", 6, str.length());
	}
	
	public void testmatches(){
		
	}

	/*有效值1*/
	public void testOffsetByCodePoints1(){
		String str = "abc12$%";
		assertEquals("testOffsetByCodePoints1", 2, str.offsetByCodePoints(0,2));
	}
	
	/*有效值2*/
	public void testOffsetByCodePoints2(){
		String str = "abc12$%";
		System.out.println(str.length());
		assertEquals("testOffsetByCodePoints2", 5, str.offsetByCodePoints(str.length(),-2));
	}
	
	/*无效值,index 为负*/
	public void testInvalidOffsetByCodePoints1(){
		String str = "abc12$%";
		assertEquals("testInvalidOffsetByCodePoints1", 0, str.offsetByCodePoints(-1,2));
	}
	
	/*无效值,大于此 String 的长度*/
	public void testInvalidOffsetByCodePoints2(){
		String str = "abc12$%";
		assertEquals("testInvalidOffsetByCodePoints2", 0, str.offsetByCodePoints(str.length()+1,-3));
	}
	
	/*无效值,codePointOffset 为正*/
	public void testInvalidOffsetByCodePoints3(){
		String str = "abc12$%";
		assertEquals("testInvalidOffsetByCodePoints3", 0, str.offsetByCodePoints(str.length(),3));
	}
	
	/*无效值,codePointOffset 为负*/
	public void testInvalidOffsetByCodePoints4(){
		String str = "abc12$%";
		assertEquals("testInvalidOffsetByCodePoints4", 0, str.offsetByCodePoints(0,-3));
	}
	
	/*有效值*/
	public void testRegionMatches(){
		String str1 = "String";
		String str2 = "javaString";
		assertTrue("testRegionMatches", str1.regionMatches(0, str2, 4, str1.length()));
	}
	
	/*无效值，thisStart为负*/
	public void testInvalidRegionMatches1(){
		String str1 = "String";
		String str2 = "javaString";
		assertTrue("testInvalidRegionMatches1", str1.regionMatches(-1, str2, 4, str1.length()));
	}
	
	/*无效值，start为负*/
	public void testInvalidRegionMatches2(){
		String str1 = "String";
		String str2 = "javaString";
		assertTrue("testInvalidRegionMatches2", str1.regionMatches(0, str2, -1, str1.length()));
	}
	
	/*无效值，thisStart+lengrh 大于此 str1 对象的长度*/
	public void testInvalidRegionMatches3(){
		String str1 = "String";
		String str2 = "javaString";
		assertTrue("testInvalidRegionMatches3", str1.regionMatches(2, str2, 4, str1.length()));
	}
	
	/*无效值，start+lengrh 大于此 str2对象的长度*/
	public void testInvalidRegionMatches4(){
		String str1 = "String";
		String str2 = "javaString";
		assertTrue("testInvalidRegionMatches4", str1.regionMatches(0, str2, 5, str1.length()));
	}
	
	/*有效值1*/
	public void testReplace1(){
		String str1 = "abfddddddd";
        String str2 = "ccc";
        assertEquals("testReplace1", "abfccccccd", str1.replace("ddd",str2));
	}
	
	/*有效值2*/
	public void testReplace2(){
		String str1 = "abd";
		String str2 = "ccc";
		assertEquals("testReplace2", "cccacccbcccdccc", str1.replace("",str2));
	}
	
	/*无效值*/
	public void testInvalidReplace(){
		String str1 = "abd";
		String str2 = "ccc";
		assertEquals("testInvalidReplace", "cccacccbcccdccc", str1.replace(null,str2));
	}
	
	/*可支持正则表达式*/
	public void testReplaceAll(){
		String str = "a.b123456";   
		assertEquals("testReplaceAll", "a.b12*456", str.replaceAll("3", "*"));
		assertEquals("testReplaceAll", "a.b******", str.replaceAll("\\d", "*"));
	}
	
	/*替换第一个*/
	public void testReplaceFirst(){
		 String str = "a.b?c,?d%g.d'fd";   
         String str1 = str.replaceFirst("\\?","jun");
         String str2 = str.replaceFirst("\\.","jun");
         assertEquals("testReplaceFirst", "a.bjunc,?d%g.d'fd", str1);
         assertEquals("testReplaceFirst", "ajunb?c,?d%g.d'fd", str2);
	}
	
	/** 未使用断言,console输出 */
	/*有效值1*/
	public void testSplit1(){
		String str = "a:b:c:d:e:F";
        String[]str1 = str.split(":");
        for(int i=0;i<str1.length;i++){
            System.out.println(str1[i]);
        }
	}
	
	/** 未使用断言,console输出 */
	/*有效值2*/
	public void testSplit2(){
		String str = "boo:and:foo";
		String[]str1 = str.split(":",2);
		System.out.println(str1[0]);
		System.out.println(str1[1]);
	}
	
	/*有效值1*/
	public void testStartsWith1(){
		String str = "hello";
        String s = "he";
        assertTrue("testStartsWith1", str.startsWith(s));
	}

	/*有效值2*/
	public void testStartsWith2(){
		String str = "hello";
		String s = "";
		assertTrue("testStartsWith2", str.startsWith(s));
	}
	
	/*无效值*/
	public void testInvalidStartsWith2(){
		String str = "hello";
		String s = null;
		assertTrue("testInvalidEndsWith", str.startsWith(s));
	}
	
	/*有效值,一个参数*/
	public void testSubstring1(){
		String str="hellochinese";
        assertEquals(
        		"testSubstring1", 
        		"lochinese", 
        		str.substring(3));
	}
	
	/*有效值，两个参数*/
	public void testSubstring2(){
		String str="hellochinese";
		assertEquals(
				"testSubstring2", 
				"hel", 
				str.substring(0,3));
	}

	/*无效值,一个参数*/
	public void testInvalidSubstring(){
		String str="hell";
		assertEquals(
				"testInvalidSubstring", 
				"lochinese", 
				str.substring(9));
	}
	
	/*无效值,beginIndex为负*/
	public void testInvalidSubstring1(){
		String str="hellochinese";
		assertEquals(
				"testInvalidSubstring1",
				"hell",
				str.substring(-1,3));
	}
	
	/*无效值,endIndex 为负*/
	public void testInvalidSubstring2(){
		String str="hellochinese";
		assertEquals(
				"testInvalidSubstring2",
				"hell",
				str.substring(0,-1));
	}
	
	/*无效值,endIndex 大于 length()*/
	public void testInvalidSubstring3(){
		String str="hellochinese";
		assertEquals(
				"testInvalidSubstring3",
				"hell",
				str.substring(0,str.length()+1));
	}
	
	/*无效值, beginIndex 大于 endIndex*/
	public void testInvalidSubstring4(){
		String str="hellochinese";
		assertEquals(
				"testInvalidSubstring4",
				"hell",
				str.substring(2,1));
	}
	
	
	/** 未使用断言,console输出 */
	public void testToCharArray(){
		 String str = "Hello";
         char[] new_str = str.toCharArray();
         for(int i = 0 ; i < new_str.length ; i++){
        	 System.out.println(new_str[i]);
         }
	}
	
	/*转为小写*/
	public void testToLowerCase(){
		String str="ABdFGjke123";
        assertEquals("testToLowerCase", "abdfgjke123", str.toLowerCase(Locale.CHINESE));
	}
	
	/*转为大写*/
	public void testToUpperCase(){
		String str="ABdFGjke123";
        assertEquals("testToUpperCase", "ABDFGJKE123", str.toUpperCase(Locale.CHINESE));
	}
	
	/*去掉头尾空格*/
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
	
	/*无效值*/
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

