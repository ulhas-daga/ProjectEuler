public class problem2 {
    public static void main(String[] args) {
        int i1 = 1, i2 = 2;
        int i3 = i1 + i2;
        int sum = 2;
        while(i2 < 4000000){
            if(i3 % 2 == 0)
            sum += i3;
            i1 = i2;
            i2 = i3;
            i3 = i1 + i2;
        }
        System.out.println(sum);
    }
}
