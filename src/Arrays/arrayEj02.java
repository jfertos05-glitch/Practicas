package Arrays;
import java.util.Arrays;

public class arrayEj02 {
    public static void main(String[] args) {

        char[] arrayPrueba = new char[12];

        arrayPrueba[0] = 'a';
        arrayPrueba[1] = 'x';
        arrayPrueba[4] = '@';
        arrayPrueba[6] = ' ';
        arrayPrueba[7] = '+';
        arrayPrueba[8] = 'Q';

        System.out.println(Arrays.toString(arrayPrueba));
    }
}
