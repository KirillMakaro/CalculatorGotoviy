class Vychislenie {
    public static int schetArab(int chislo1, int chislo2, String operaciya) throws Exception {
        int result = 0;
        switch (operaciya) {
            case "+":
                result = chislo1 + chislo2;
                break;
            case "-":
                result = chislo1 - chislo2;
                break;
            case "*":
                result = chislo1 * chislo2;
                break;
            case "/":
                result = chislo1 / chislo2;
                break;
            default:
                throw new Exception("Необходимо ввести операцию: +,-,*,/");
        }
        return result;
    }
}
