package Recursion;

public class RecursiveFunctionReturn {
    static int count=0;

    void showArray(int[] array){
        System.out.println(array[count]);
        if (count<array.length){
            count++;
            showArray(array);
        }
    }
    static int[] getArray(){
        int[] array={1,2,3,4,5};
        return array;
    }
    public static void main(String[] args) {
        RecursiveFunctionReturn function=new RecursiveFunctionReturn();

        function.showArray(getArray());
    }
}        