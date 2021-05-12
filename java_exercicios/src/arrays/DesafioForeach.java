package arrays;

import java.util.LinkedList;

public class DesafioForeach {
	
	public static void main(String[] args){
        int number = 12223;

        LinkedList<Integer> stack = new LinkedList<Integer>();
        while(number > 0){
            stack.push(number % 10);
            number = number / 10;
        }
        while ((!stack.isEmpty())){
            System.out.println(stack.pop());
        }
    }

}


