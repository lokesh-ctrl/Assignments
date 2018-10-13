public class Fibanocci {
    public static int fibanocciNumber(int number) {
        int[] FibanocciNumberStorage = new int[number+1];
        if (number==1 || number==2) {
            return 1;
        }
        else if (FibanocciNumberStorage[number] != 0){
            return FibanocciNumberStorage[number];
        }
        else {
            FibanocciNumberStorage[number]=fibanocciNumber(number-1)+fibanocciNumber(number-2);
            return FibanocciNumberStorage[number];
        }
    }
    public static int[] fibanocciSeries(int number) {
        int[] FibanocciSeries = new int[number];
        for (int iterator=1;iterator<=number;iterator++){
            FibanocciSeries[iterator-1]=fibanocciNumber(iterator);
        }
        return FibanocciSeries;
    }
}
