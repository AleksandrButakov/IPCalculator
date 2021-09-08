package ipcalcul;
import java.lang.String;
import javax.swing.JOptionPane;

public class IP_per_byte {
    
    // зададим public переменные
    public String sByte3, sByte2, sByte1, sByte0;
    public int iByte3, iByte2, iByte1, iByte0;
    public boolean ErrorIP=false;
    public boolean ErrorByte3=false;
    public boolean ErrorByte2=false;
    public boolean ErrorByte1=false;
    public boolean ErrorByte0=false;
    public boolean ErrorSymbol=false;
    public boolean[] CorrectlyIP = new boolean[] {false,false,false,false};
    public boolean TwoPoints = false;
    
    public IP_per_byte (String sIP){
    char Simbol;
    char nullSimbol = 0;
    String s;   // вспомогательная переменная s
    int counter=3;
    sByte3=""; sByte2=""; sByte1=""; sByte0="";
    iByte3=0; iByte2=0; iByte1=0; iByte0=0;
    
    // проверили, что 0 символ в IP адресе является числом
    Simbol=sIP.charAt(0);
    if (Simbol=='1' || Simbol=='2' || Simbol=='3' || Simbol=='4' || Simbol=='5' ||
            Simbol=='6' || Simbol=='7' || Simbol=='8' || Simbol=='9'){
        sByte3=String.valueOf(Simbol);
    } else {
      ErrorIP=true;
      return;
    }
        
    // заполняем данные Byte
    int Length;
    Length=sIP.length();
    for (int i=1; i<Length; i++){
        Simbol=sIP.charAt(i);
       
        first:{
            // проверим что не введены две точки подряд
            if (Simbol=='.') {
                if (nullSimbol=='.') {
                    // вторая точка подряд
                    TwoPoints=true;
                    return;
                }
                nullSimbol=0;
            }
            // предыдущий символ точка, текущий нет. необходимо обнулить nullSimbol
            if (Simbol!='.' && nullSimbol=='.') {
                nullSimbol=0;
            }
            
            if (Simbol=='.') {
                if (counter!=0) {
                    counter--;
                    nullSimbol='.';
                    break first;
                } else {
                    // счетчик достиг нуля и адрес окончен точкой
                }
            }
            
            second:{
                if (Simbol=='1' || Simbol=='2' || Simbol=='3' || Simbol=='4' || Simbol=='5' ||
                    Simbol=='6' || Simbol=='7' || Simbol=='8' || Simbol=='9' || Simbol=='0') {
                    switch (counter){
                        case 3:{
                            s=String.valueOf(Simbol);
                            sByte3 = sByte3 + s;
                            ErrorByte3=Correct_sByte3(sByte3);
                            if (ErrorByte3==true)
                                return;
                            CorrectlyIP[3] = true;
                            break;
                        }
                        case 2:{
                            s=String.valueOf(Simbol);
                            sByte2 = sByte2 + s;
                            ErrorByte2=Correct_sByte2(sByte2);
                            if (ErrorByte2==true)
                                return;
                            CorrectlyIP[2] = true;
                            break;
                        }
                        case 1:{
                            s=String.valueOf(Simbol);
                            sByte1 = sByte1 + s;
                            ErrorByte1=Correct_sByte1(sByte1);
                            if (ErrorByte1==true)
                                return;
                            CorrectlyIP[1] = true;
                            break;
                        }
                        case 0:{
                            s=String.valueOf(Simbol);
                            sByte0 = sByte0 + s;
                            ErrorByte0=Correct_sByte0(sByte0);
                            if (ErrorByte0==true)
                                return;
                            CorrectlyIP[0] = true;
                            break;
                        }
                    }
                } else {
                    // символ не равен точке, числу или запятой
                    ErrorSymbol=true;
                        return;     
                }
            }
        }
    }
    
    }
    
    // функция проверки корректности байта 3
    public static boolean Correct_sByte3 (String sByte3) {
        int iByte3 = Integer.parseInt(sByte3);
        if (iByte3 < 1 || iByte3 > 255) {
            return true;
        }
        return false;
    }
    // функция проверки корректности байта 2
    public static boolean Correct_sByte2 (String sByte2) {
        int iByte2 = Integer.parseInt(sByte2);
        if (iByte2 < 0 || iByte2 > 255) {
            return true;
        }
        return false;        
    }
    // функция проверки корректности байта 1
    public static boolean Correct_sByte1 (String sByte1) {
        int iByte1 = Integer.parseInt(sByte1);
        if (iByte1 < 0 || iByte1 > 255) {
            return true;
        }
        return false;        
    }
    // функция проверки корректности байта 0
    public static boolean Correct_sByte0 (String sByte0) {
        int iByte0 = Integer.parseInt(sByte0);
        if (iByte0 < 1 || iByte0 > 254) {
            return true;
        }
        return false;        
    }    
    
}
