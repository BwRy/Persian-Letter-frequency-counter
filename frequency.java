
package frequency;

/**
 *
 * @Author Farzin Enddo
 * @Email  farzin.redhat@gmail.com
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


public class Frequency {

    private static char[] myarry;
    private static int[] count = new int[26];
    private static double[] precntage=new double[26];
    private static double totCount=0;


    public static void main(String[] args) throws FileNotFoundException, IOException {

        String ss = new Frequency().readFile("file.txt");//path of the text file
        
       

        myarry = ss.toCharArray(); 

        for (int i = 0; i < myarry.length; i++) {
            if (myarry[i] == 'پ') {
                count[0] = count[0] + 1;
            } else if (myarry[i] == 'ض') {
                count[1] = count[1] + 1;
            } else if (myarry[i] == 'ص') {
                count[2] = count[2] + 1;
            } else if (myarry[i] == 'ث') {
                count[3] = count[3] + 1;
            } else if (myarry[i] == 'ق') {
                count[4] = count[4] + 1;
            } else if (myarry[i] == 'ق') {
                count[5] = count[5] + 1;
            } else if (myarry[i] == 'ف') {
                count[6] = count[6] + 1;
            } else if (myarry[i] == 'غ') {
                count[7] = count[7] + 1;
            } else if (myarry[i] == 'ع') {
                count[8] = count[8] + 1;
            } else if (myarry[i] == 'ه') {
                count[9] = count[9] + 1;
            } else if (myarry[i] == 'خ') {
                count[10] = count[10] + 1;
            } else if (myarry[i] == 'خ') {
                count[11] = count[11] + 1;
            } else if (myarry[i] == 'ح') {
                count[12] = count[12] + 1;
            } else if (myarry[i] == 'ج') {
                count[13] = count[13] + 1;
            } else if (myarry[i] == 'چ') {
                count[14] = count[14] + 1;
            } else if (myarry[i] == 'ژ') {
                count[15] = count[15] + 1;
            } else if (myarry[i] == 'ش') {
                count[16] = count[16] + 1;
            } else if (myarry[i] == 'س') {
                count[17] = count[17] + 1;
            } else if (myarry[i] == 'ی') {
                count[18] = count[18] + 1;
            } else if (myarry[i] == 'ب') {
                count[19] = count[19] + 1;
            } else if (myarry[i] == 'ل') {
                count[20] = count[20] + 1;
            } else if (myarry[i] == 'ا') {
                count[21] = count[21] + 1;
            } else if (myarry[i] == 'ت') {
                count[22] = count[22] + 1;
            } else if (myarry[i] == 'م') {
                count[23] = count[23] + 1;
            } else if (myarry[i] == 'ک') {
                count[24] = count[24] + 1;
            } else if (myarry[i] == 'گ') {
                count[25] = count[25] + 1;
            } else if (myarry[i] == 'ظ') {
                count[26] = count[26] + 1;
            } else if (myarry[i] == 'ط') {
                count[27] = count[27] + 1;
            } else if (myarry[i] == 'ز') {
                count[28] = count[28] + 1;
            } else if (myarry[i] == 'ر') {
                count[29] = count[29] + 1;
            } else if (myarry[i] == 'ذ') {
                count[30] = count[30] + 1;
            } else if (myarry[i] == 'د') {
                count[31] = count[31] + 1;
            } else if (myarry[i] == 'و') {
                count[32] = count[32] + 1;
            }

        }



        for (int i = 0; i <count.length; i++) {
            totCount+=count[i];
        }

        System.out.println("tot "+ totCount);


       // calculate presentage
        for (int i = 0; i <count.length; i++) {
               precntage[i]=((count[i]/totCount)*100);
               precntage[i]=Math.round(precntage[i]);
        }




        String s1 = "پضصثقفغعهخحجچژشسیبلاتنمکگظطزرذدو";
        System.out.println("Letter\tPrecentage\tFrequency");
        for (int i = 0; i < count.length; i++) {
            String gs=Character.toString(s1.charAt(i));
            System.out.println(gs+"\t"+precntage[i]+"%"+"\t\t"+count[i]);
        }


    }

    String readFile(String fileName) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"UTF-16"));
        try {
            StringBuilder sb = new StringBuilder();
            String l = buff.readLine();
            
            while (l != null) {
                sb.append(l);
                sb.append("\n");
                l = buff.readLine();
            }
            return sb.toString();
        } finally {
            buff.close();
        }
    }

}
