package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        throw new UnsupportedOperationException();
       /* for(int i = 1; i < a.length; i++ ){


        }*/
    }

    public static int ombyttinger(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        int teller=0;
        for(int i=0; i<a.length; ++i){
            boolean uniktTall=false;

            for(int j=0; j<i; j++){
                if(a[i]==a[j]){
                    uniktTall=true;
                    break;
                }
            }
            if(!uniktTall){
                teller++;
            }
        }
        System.out.println("Det er "+teller+" forskjellige verdier i tabellen");
        return teller;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        int ptall = a.length - 1; int otall = 0;

        while (true) {
            while(ptall>=0 && a[ptall]%2==0) {
                ptall--;
            }
            while(otall<a.length && a[otall]%2!=0) {
                otall++;
            }
            if(ptall>otall) {
               Oblig1Test.bytt(a, otall, ptall);
            } else {
                break;
            }
        }
        Arrays.sort(a, 0, otall);
        Arrays.sort(a, otall, a.length);
    }

    //Oppgave 5
    public static void rotasjon(char[] a) {
        int n = a.length;
        if(n < 2) return;   //er tom eller er det et element i tabellen
            char temp = a[n- 1];
            for (int i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
    }

    //Oppgave 6
    public static void rotasjon(char[] a, int k) {
        int n = a.length;
        if(n < 2) {
            return;
        }
        if((k % n) < 0) {
            k += n;
        }
        char [] d = Arrays.copyOfRange(a, n - k, n);
        for (int i = n - 1; i >= k;  i--) {
            a[i] = a[i - k];
        }
        System.arraycopy(d,0, a, 0, k);
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 ////////////////////////////////////// ?????
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();

    }

    public static boolean inneholdt(String a, String b) {
        int[] a1 = new int[256];
        int[] b1 = new int[256];
        int n = a1.length;

        for(char c : a.toCharArray()){
            a1[c]++;
        }
        for(char c : b.toCharArray()){
            b1[c]++;
        }
        for(int i=0; i<n; i++){
            if (a1[i]>0 && a1[i]>b1[i]){
                    return false;
            }
        }
        return true;
    }

}  // Oblig1
