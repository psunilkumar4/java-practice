public class ArraySearch {
    static void main(String[] args) {
        int[] listOfNumbers={1,2,3,4,5,6};
        int target = 5;
        boolean found = false;

        for(int number :listOfNumbers){
            if (number==target){
                found=true;
                break;
            }
        }
        System.out.println("Found: "+found);
    }
}
