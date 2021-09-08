package ipcalcul;

// получим двоичный массив BitOrder байта DD0
public class DecToBin {
    public boolean[] BitOrder = new boolean[8];
    public int[] Degree = new int[]{1,2,4,8,16,32,64,128};
    public DecToBin (int iByte0) {
        float Residue;
        for (int i=7; i>=0; i--){
            Residue = (float) (iByte0/Degree[i]);
            if (Residue>=1){
                BitOrder[i]=true;
                iByte0-=Degree[i];
            } else {
                BitOrder[i]=false;
            }
        }
    }
}
