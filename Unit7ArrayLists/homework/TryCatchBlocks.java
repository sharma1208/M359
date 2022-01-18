package Unit7ArrayLists.homework;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class TryCatchBlocks {
    public static void main(String[] args) {
        try{
           // int x = 5/0;
            int[] myNums = {1,2,3};
            System.out.println(myNums[7]);
        }
        catch (ArithmeticException e){
            System.out.println("dont divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }
        catch (Exception e){
            System.out.println("something went wrong exception");
        }

    }
}
