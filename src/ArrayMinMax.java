public class ArrayMinMax {
    static void main(String[] args) {
        int[] numbers ={10,2,89,34,23};
        int min =numbers[0];
        int max=numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Minimum Number: "+min);
        System.out.println("Maximum Number: "+max);
    }
}
