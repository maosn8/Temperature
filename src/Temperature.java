public class Temperature {
    public static void main(String[] args) {
        int [] temp = {55,50,59,69,48,30,48};
        int sum = 0;
        System.out.print("1. number of days with temp above 32: ");
        for (int i : temp){
            if (i > 32){
                sum++;
            }
        }
        System.out.println(sum);
        System.out.println("2. length of the array: " + temp.length);

        System.out.println("3. last value in array: " + temp[(temp.length)-1]);

        System.out.println("4. temp in the middle: " + temp[(temp.length)/2]);

        System.out.print("5. average temperature: ");
        double avg = 0;
        for (int i : temp){
            avg += i;
        }
        System.out.println(avg/2);

    }
}
