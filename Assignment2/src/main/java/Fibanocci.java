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
            int fibanocciNum;
            fibanocciNum=fibanocciNumber(number-1)+fibanocciNumber(number-2);
            FibanocciNumberStorage[number]=fibanocciNum;
            return fibanocciNum;
        }
    }

    public static int[] fibanocciSeries(int number) {
        int[] FibanocciSeries = new int[number];
        for (int i=1;i<=number;i++){
            FibanocciSeries[i-1]=fibanocciNumber(i);
        }
        return FibanocciSeries;
    }
}
