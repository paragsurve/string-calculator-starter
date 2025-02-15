package calculator;

import java.util.Arrays;
import java.util.Stack;

class StringCalculator {

    public int add(String input) throws NegativeNotAllowedException {
    	int result=0;
    	String del=null;
    	if(input.length()==0)
    		return 0;
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
    	Stack<Integer> stk=new Stack<Integer>();
    	for(int i=0;i<arr.length;i++) {
			if(Integer.parseInt(arr[i])<0) {
				stk.push(Integer.parseInt(arr[i]));
			}
			if(Integer.parseInt(arr[i])>1000)
				arr[i]="0";
		}
    	if(!stk.isEmpty())
    		throw new NegativeNotAllowedException("Negative Not Allowed "+stk.toString());
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