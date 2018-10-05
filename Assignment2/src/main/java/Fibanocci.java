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
}
