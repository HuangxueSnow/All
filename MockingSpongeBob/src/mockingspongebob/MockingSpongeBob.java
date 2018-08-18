    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package mockingspongebob;

    import java.util.Scanner;

    /**
     *
     * @author Administrator
     */
    public class MockingSpongeBob {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            /*
            String s="abcdef";
             char c=s.charAt(0);
             c=s.charAt(2);
             s.length();
             char c1=Character.toUpperCase(c);
             char c2=Character.toLowerCase(c);
             String s1=s.toUpperCase(s);
            Character.isAlphabetic(c);
            Character.isDigit(c);
             */
            Scanner reader = new Scanner(System.in);
            int n = reader.nextInt();
            reader.nextLine();
            String s;

            for (int i = 0; i < n; i++) {

                s = reader.nextLine();
                s = processOneLIne(s);
                System.out.println(s);
            }
        }

        private static String processOneLIne(String s) {
            boolean lower=true;
            String sRet=""; 
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isAlphabetic(c)) {
                    if (lower) {
                        sRet+=Character.toLowerCase(c);
                    } else  {
                        sRet+=Character.toUpperCase(c);
                    }
                    lower=!lower;
                } else {
                    sRet+=c;
                }
            }
            return sRet;
        }

    }
