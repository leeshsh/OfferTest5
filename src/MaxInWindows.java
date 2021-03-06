/**
 * Created by toryang on 16/3/15.
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 题目描述:
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class MaxInWindows {
    
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(size == 0){
            return list;
        }
        for (int i = 0;i<num.length-size+1;i++){
            int[] array = new int[size];
            for (int j=0;j<size;j++){
                array[j] = num[i+j];
            }
            list.add(getMax(array));
        }

        return list;
    }

    public int getMax(int[] arrays){
        Arrays.sort(arrays);
        return arrays[arrays.length-1];

    }

    public static void main(String[] args) {
        int[] array = {2,3,4,2,6,2,5,1};
        for (int i:new MaxInWindows().maxInWindows(array,3)){
            System.out.print(i);
        }
    }

}
