package no.oslomet.cs.algdat.Oblig1;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Oblig1TestRotasjon {

    @Test
    void rotasjon() {
        char [] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char[] d0 = {'J', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        Oblig1.rotasjon(a);

        assertEquals(Arrays.toString(d0), Arrays.toString(a));


    }

    @Test
    void testRotasjon() {
        char [] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        Oblig1.rotasjon(b, 3);

        assertEquals(Arrays.toString(new char[]{'H', 'I', 'J', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}), Arrays.toString(b));

        Oblig1.rotasjon(b, -2);
        assertEquals(Arrays.toString(new char[]{'J','A', 'B', 'C', 'D', 'E', 'F', 'G','H', 'I'}), Arrays.toString(b));
    }

    @Test
    void tredjeMin() {
        int [] a = {4, 7, 8, 9};
        int [] expected = {1,2,3};
         assertEquals(Arrays.toString(expected), Arrays.toString( Oblig1.tredjeMin(a)));


    }
}