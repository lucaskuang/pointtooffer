package com.ibm.test;


public class TrimStringTest {
	
	public static int replaceBlank(char[] a,int usedLength) {
		if (a == null) {
			return -1;
		}
		
		int blankCount = 0;
		//遍历字符数组，计算空格的数量
		for(int i=0;i<usedLength;i++) {
			if(a[i]==' ') {
				blankCount++;
			}
		}
		
		//计算替换之后的长度
		int targetLength = blankCount*2 + usedLength;
		int temp = targetLength;
		
		//如果替换后的长度大于字符数组的最大长度，返回-1
		if(targetLength > a.length) {
			return -1;
		}
		
//		targetLength--;
//		usedLength--;
		//替换
		while(usedLength < targetLength && usedLength >=0) {
			
			if(a[usedLength] == ' ') {//如果为空格，则替换
				a[targetLength--] = '0';
				a[targetLength--] = '2';
				a[targetLength--] = '%';
				
			}else {//否则则移动位置
				a[targetLength--] = a[usedLength];
			}
			usedLength--;
		}
		
		return temp;
	}
	
	
	public static int replaceBlank1(char[] string, int usedLength) {  
        // 判断输入是否合法  
        if (string == null || string.length < usedLength) {  
            return -1;  
        }  
  
        // 统计字符数组中的空白字符数  
        int whiteCount = 0;  
        for (int i = 0; i < usedLength; i++) {  
            if (string[i] == ' ') {  
                whiteCount++;  
            }  
        }  
  
        // 计算转换后的字符长度是多少  
        int targetLength = whiteCount * 2 + usedLength;  
        int tmp = targetLength; // 保存长度结果用于返回  
        if (targetLength > string.length) { // 如果转换后的长度大于数组的最大长度，直接返回失败  
            return -1;  
        }  
  
        // 如果没有空白字符就不用处理  
        if (whiteCount == 0) {  
            return usedLength;  
        }  
  
        usedLength--; // 从后向前，第一个开始处理的字符  
        targetLength--; // 处理后的字符放置的位置  
  
        // 字符中有空白字符，一直处理到所有的空白字符处理完  
        while (usedLength >= 0 && usedLength < targetLength) {  
            // 如是当前字符是空白字符，进行"%20"替换  
            if (string[usedLength] == ' ') {  
                string[targetLength--] = '0';  
                string[targetLength--] = '2';  
                string[targetLength--] = '%';  
            } else { // 否则移动字符  
                string[targetLength--] = string[usedLength];  
            }  
            usedLength--;  
        }  
  
        return tmp; 
	}
	
	public static void main(String[] args) {
		char[] a = new char[50];
		a[0]=' ';
		a[1]='h';
		a[2]='e';
		a[3]=' ';
		a[4]='l';
		a[5]=' ';
		int b = replaceBlank(a, 6);
		System.out.println(new String(a,0,b));
		
	}
}
