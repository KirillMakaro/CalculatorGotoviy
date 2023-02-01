import java.util.List;
import java.util.Scanner;

class Main {
    public static String calc(String input) throws Exception {
        int chislo1, chislo2;
        String result = "";
        String inputBezProbelov = input.trim();
        String[] inputSort = inputBezProbelov.split(" ");
        String var1 = String.valueOf(inputSort[0]);
        String operaciya = String.valueOf(inputSort[1]);
        String var2 = String.valueOf(inputSort[2]);

        if (inputSort.length > 3) throw new Exception("Должны быть две переменные и один оператор");

        List<String> rim = List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
        List<String> arab = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        if (arab.contains(var1) && arab.contains(var2)) {
            chislo1 = arab.indexOf(var1);
            chislo2 = arab.indexOf(var2);
            int a=Vychislenie.schetArab(chislo1, chislo2, operaciya);
            result = Integer.toString(a);
        } else if (rim.contains(var1) && rim.contains(var2)) {
            chislo1 = rim.indexOf(var1) + 1;
            chislo2 = rim.indexOf(var2) + 1;
            int a = Vychislenie.schetArab(chislo1, chislo2, operaciya);
            if (a > 0) {
                result = ArabToRoman.arabToRoman(a);
            } else {
                throw new Exception("Должны быть только положительные значения для римских чисел");
            }
        } else if (arab.contains(var1) & (rim.contains(var2)) | (rim.contains(var1) & arab.contains(var2))) {
            throw new Exception("Должны быть либо только арабские, либо только римские числа");
        } else {
            throw new Exception("Неподходящие числа");
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s=calc(input);
        System.out.println(s);
    }
}