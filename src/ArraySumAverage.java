public class ArraySumAverage {
    static void main(String[] args) {
        int[] numbers = {3,6,8,9,8,9,6,7,9};
        int sum=0;

        for(int number :numbers){
            sum =sum+number;
        }
        double avg=(double) sum/numbers.length;
        System.out.println(avg);
    }
}
