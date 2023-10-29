public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

public static void task1() {
        int[] arr = generateRandomArray();
        int salary=0 ;
        for (int element: arr){
            salary+= element;
        }
        System.out.println("Сумма трат за месяц составила "+salary+ "рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int max=arr[0];
        int min= arr[0];
        for (int i=0; i< arr.length; i ++){
            if(arr[i]>max){
                max= arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила"+min+ "рублей ."+
                "Максимальная сумма трат за день составила"+max+ "рублей!");
    }
    public static void task3() {
int [] arr= generateRandomArray();
        int sum=0;
        for (int cons: arr){
            sum+= cons;
        }
            double cons= (double) sum/ arr.length;
            System.out.println("Сумма трат за месяц составила "+ cons +  "рублей");

    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }



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












