package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length < 1)
        throw new UnsupportedOperationException("Tabell mangler innhold");

        int max = 0;
        for(int i = 1; i < a.length; i++ ){

            if(a[i] > a[i+1]){
                max = a[i];
                a[i] = a[i +1];
                a[i + 1] = max;

            }

            return a[a.length];


        }
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

        if((k %= n) < 0) {
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
        int n = a.length;
        //Kaster NoSuchElementException hvis det er mindre enn 3 elementer i arrayet
        if(n < 3){
            throw new NoSuchElementException("a.lenght("+ n +") < 3!");

        }
        //Sorterer de første verdiene i tabellen ved hjelp av oppagave 8
        int [] sorter = {a[0], a[1], a[2]};
        int [] indekssorter = indekssortering(sorter);

        int min = indekssorter[0];
        int nestmin = indekssorter[1];
        int tredjemin = indekssorter[2];

        int minVerdi = a[min];
        int nestminVerdi = a[nestmin];
        int tredjeminVerdi = a[tredjemin];

        for (int i = 3; i < n; i++){

            if(a[i] < tredjeminVerdi) {

                if (a[i] < nestminVerdi) {

                    if (a[i] < minVerdi) {

                        tredjemin = nestmin;
                        tredjeminVerdi = nestminVerdi;

                        nestmin = min;
                        nestminVerdi = minVerdi;

                        min = i;
                        minVerdi = a[i];
                    } else {
                        tredjemin = nestmin;
                        tredjeminVerdi = nestminVerdi;

                        nestmin = i;
                        nestminVerdi = a[i];
                }
            }
                else {
                    tredjemin = i;
                    tredjeminVerdi = a[i];
                }
            }
        }

        return new int[] {min, nestmin, tredjemin};

    }

    // Oppgave 10
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
