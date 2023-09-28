package Week2;

public class AvarageOfHarmonic {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+= 1.0/numbers[i];             // harmonik seri bulma formülü
        }

        System.out.println(sum / numbers.length);          //harmonik ortalama bulma
    }
}
