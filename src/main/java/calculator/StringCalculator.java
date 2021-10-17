package calculator;

import java.util.Arrays;

class StringCalculator {

    public int add(String input) {
    	int result=0;
    	String del=null;
    	if(input.contains("//")) {
    		del=String.valueOf(input.charAt(2));
    		input=input.substring(3);
    	}
    	else {
    		del=String.valueOf(",");
    	}
    	input=input.replaceAll("/", "");
    	input=input.replaceAll("\n", "");
    	String[] arr=input.split(del);
    	if(input.length()==0)
    		return 0;
    	else if(arr.length==1) {
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