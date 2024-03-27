package h6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;
        System.out.println(row[2]);
        //copy en row referencen naar dezelfde object,
        //dus als je bij eentje iets wijzigt zal het ook veranderen bij de andere.

        //row[4] bestaat niet (gaat maar tot 3).

        long[] vraag3 = {1,2,3,4};
        ArrayEditor editableArray = new ArrayEditor(vraag3);
        editableArray.increase();

        long[] vraag4 = {1,2,3,4};
        ArrayEditor newArray = new ArrayEditor(vraag4);
        newArray.multiply(3);
    }
}
