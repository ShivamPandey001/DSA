import java.util.*;

public class ArrayCC{
    public static void printSubArray(int num[]){
        for(int i=0;i<num.length();i++){
            int start=i;
            for(int j=i;j<num.length();j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print(num[k]+' ');
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]{
        int num[]={1,2,3,45,66,7,8};
        printSubArray(num);
    })
} 



Complexity-->n3;
Space-O(1);