public class ForLoopDemo {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1 ; i <= 20; i++){
            if(i % 3 != 0 && i % 5 != 0) {
                System.out.println(number + " x " + i + " = " + number * i);
            }
        }
    }
    // 2 x 1 = 2
}
