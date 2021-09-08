package ipcalcul;

public class BinToDec {
public int AxiliaryDecByte0=0;
    // полученный двумерный массив переведем в десятичный вид
    public BinToDec (boolean[] Arr) {
        boolean[] BitOrder = new boolean[8];
        int[] Degree = new int[]{1,2,4,8,16,32,64,128};
        for (int i=7; i>=0; i--) {
            if (Arr[i]==true) {
                AxiliaryDecByte0 += Degree[i];
            }
        }
    }
    
}
