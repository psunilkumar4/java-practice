public class ArrayCreateAndUpdate {

    static void main() {
        String[] names= new String[3];
        names[0]="lailu";
        names[1]="swathi";
        names[2]="harrier";

        names[0]="sonu";

        for (String name:names){
            System.out.println(name);
        }
    }
}
