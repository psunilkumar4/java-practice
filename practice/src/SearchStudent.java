public class SearchStudent {
    public void search(){
        int[] numbers = {10, 25, 40, 55};
        int target = 40;
        boolean found = false;

        for (int number:numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }


}

class MainStudent {
    static void main() {
        SearchStudent ss = new SearchStudent();
        ss.search();
    }
}
