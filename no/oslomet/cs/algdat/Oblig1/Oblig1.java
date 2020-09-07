package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
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
    public static String flett(String s, String t){
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0, k = 0;                 // lokkevariabler

        while (i < s.length() - 1 && j < t.length()) {
            sb.append(s.charAt(i++));      // forst en verdi fra s
            sb.append(t.charAt(j++));       // saa en verdi fra t
        }
        // vi maa ta med resten

        if (i < s.length()) sb.append(s.substring(i));
        if (j < t.length()) sb.append(t.substring(j));

        return sb.toString();
    }

    /// 7b)
    public static String flett(String... s){
        StringBuilder sb2 = new StringBuilder();

        boolean done = false;
        int i = 0;
        while (!done) {
            done = true;

            for (int j = 0; j < s.length; j++) {
                if (s[j].length() > i) {
                    sb2.append(s[j].charAt(i));

                    done = false;
                }
            }
            i++;

        }
        return sb2.toString();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {

        int[] index = new int[a.length];
        int t;
        int x;

        for (int i = 0; i < a.length; i++) {
            index[i] = i;
        }


        for (int i = 1; i < a.length; i++) {
            for (t = index[i], x = i - 1; x >= 0 && a[t] < a[index[x]]; x--) {

                index[x + 1] = index[x];
            }
            index[x + 1] = t;
        }
        return index;
    }


    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
