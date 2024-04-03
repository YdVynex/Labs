package h13;

import h789tienelf.model.Human;

public class Main {
    public static void main(String[] args) {
        House lien = new House();
        Human zh = new Human("Zh");
        Human yd = new Human("Yd");
        lien.familie.add(yd);
        lien.familie.add(zh);
        lien.toString();
    }
}
