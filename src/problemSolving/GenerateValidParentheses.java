package problemSolving;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by arunvyasnarayanan on 2/22/20.
 */
public class GenerateValidParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<String>();
        generateParenthesisUtil(n, n, "", result);
        return result;
    }

    public static void generateParenthesisUtil(int numLeft, int numRight,
                                        String progress, List<String> result){

        if((numLeft==0)&&(numRight==0)){
            result.add(progress);
            return;
        }
        if(numLeft>0){
            generateParenthesisUtil(numLeft-1, numRight, progress+"(", result);
        }
        if(numRight>numLeft){
            generateParenthesisUtil(numLeft, numRight-1, progress+")", result);
        }
    }

    public static void main(String args[]){
        List<String> result = generateParenthesis(3);
        for (int i=0; i<result.size(); i++){
            System.out.print(result.get(i));
        }
    }

}
