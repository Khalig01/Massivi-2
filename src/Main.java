public class Main {
    public static void task1(){
        int[] arr = generateRandomArray();
        int salary=0 ;
                for (int element: arr){
                    salary+= element
                }
        System.out.println("Сумма трат за месяц составила "+salary "рублей");


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;











}
}