package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Object[] stack = new Object[]{"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        Haystack haystack = new Haystack();

        haystack.findNeedle(stack);
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
        System.out.println(solution.highAndLow("8 9 2 43 3 1 4 5"));
        System.out.println(solution.timeConversion("07:24:53AM"));
        System.out.println(solution.timeConversion("07:24:53PM"));
        System.out.println(solution.timeConversion("9:24:53AM"));
        System.out.println(solution.timeConversion("10:24:53AM"));
        System.out.println(solution.timeConversion("11:24:53PM"));

    }
}
