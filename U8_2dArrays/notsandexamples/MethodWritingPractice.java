package U8_2dArrays.notsandexamples;

public class MethodWritingPractice {
    public static void main(String[] args) {
        //instantiate a 2D array
        int[][] myNums = {{9,7,25,3},
                        {29,8,22,10},
                         {19,16,9,1}};

        //output the array in normal form
        showArray(myNums);

        //output the average of all of the numbers in myNums
        double avg = getAvg(myNums);
        System.out.println(avg);

        //find the number of rows that contain at least 1 even number
        int evenCount = getEvenRowCount(myNums);
        System.out.println("# rows with an even number in them: " + evenCount);

        //find if a column has an even number
        int evenCountCol = getEvenColCount(myNums);
        System.out.println("# columns with an even number in them: " + evenCountCol);
    }


    public static void showArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    //returns the average of all the numbers in an arr
    public static double getAvg(int[][] arr){
        int valSum = 0;
        int totalNum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[0].length; j++){
                valSum += arr[i][j];

            }
        }

        return (double)valSum/(arr.length*arr[0].length);
    }

    public static int getEvenRowCount(int[][] arr){
        int evenRowCount = 0;
        for(int[] row: arr){
            for(int col: row){
                if(col % 2 == 0){
                    evenRowCount++;
                    break;
                }
            }
        }
        return evenRowCount;
    }

    public static int getEvenColCount(int[][] arr){
        int evenColCount = 0;
        for(int col = 0; col < arr[0].length; col++){
            boolean ifEven = false;
           for(int row  = 0;row < arr.length; row++){
               if(arr[row][col] % 2 == 0){
                   ifEven = true;
               }
           }
            if(ifEven){
                evenColCount++;
            }
        }
        return evenColCount;
    }
}


