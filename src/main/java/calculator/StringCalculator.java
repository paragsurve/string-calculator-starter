package calculator;

import java.util.Arrays;

class StringCalculator {

    public int add(String input) {
    	int result=0;
    	String[] arr=input.split(",");
    	if(input=="")
    		return 0;
    	if(arr.length==1) {
    		result=Integer.parseInt(arr[0]);
    		return result;
    	}
    	else if(arr.length==2) {
    		result=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
    		return result;
    	}
    	else if(arr.length>2) {
    		for(String str : arr) {
    			result=result+Integer.parseInt(str);
    		}
    		return result;
    	}
		 return 0;
    }

}