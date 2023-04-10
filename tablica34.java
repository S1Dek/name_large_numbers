public class tablica34 extends tablica33 {
    void tablica34() {
        if (dlugosc == 1 && jednosci == 0 || dlugosc == 0) {
            System.out.print("zero"); }
        else {
            switch (setki) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("sto ");
                    break;
                case 2:
                    System.out.print("dwieście ");
                    break;
                case 3:
                    System.out.print("trzysta ");
                    break;
                case 4:
                    System.out.print("czterysta ");
                    break;
                case 5:
                    System.out.print("pięćset ");
                    break;
                case 6:
                    System.out.print("sześćset ");
                    break;
                case 7:
                    System.out.print("siedemset ");
                    break;
                case 8:
                    System.out.print("osiemset ");
                    break;
                case 9:
                    System.out.print("dziewięćset ");
                    break;
            }
        }
        if (dziesiatki == 1 && jednosci == 1) {
            System.out.print("jedenaście");
        } else if (dziesiatki == 1 && jednosci == 2) {
            System.out.print("dwanaście");
        } else if (dziesiatki == 1 && jednosci == 3) {
            System.out.print("trzynaście");
        } else if (dziesiatki == 1 && jednosci == 4) {
            System.out.print("czternaście");
        } else if (dziesiatki == 1 && jednosci == 5) {
            System.out.print("piętnaście");
        } else if (dziesiatki == 1 && jednosci == 6) {
            System.out.print("szesnaśćie");
        } else if (dziesiatki == 1 && jednosci == 7) {
            System.out.print("siedemnaście");
        } else if (dziesiatki == 1 && jednosci == 8) {
            System.out.print("osiemmnaście");
        } else if (dziesiatki == 1 && jednosci == 9) {
            System.out.print("dziewiętnaście");
        } else {
            switch (dziesiatki) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("dziesięć ");
                    break;
                case 2:
                    System.out.print("dwadzieścia ");
                    break;
                case 3:
                    System.out.print("trzydzieści ");
                    break;
                case 4:
                    System.out.print("czterydzieści ");
                    break;
                case 5:
                    System.out.print("pięćdziesiąt ");
                    break;
                case 6:
                    System.out.print("sześćdziesiąt ");
                    break;
                case 7:
                    System.out.print("siedemdziesiąt ");
                    break;
                case 8:
                    System.out.print("osiemdziesiąt ");
                    break;
                case 9:
                    System.out.print("dziewięćdziesiąt ");
                    break;
            }
            switch (jednosci) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("jeden");
                    break;
                case 2:
                    System.out.print("dwa");
                    break;
                case 3:
                    System.out.print("trzy");
                    break;
                case 4:
                    System.out.print("cztery");
                    break;
                case 5:
                    System.out.print("pięć");
                    break;
                case 6:
                    System.out.print("sześć");
                    break;
                case 7:
                    System.out.print("siedem");
                    break;
                case 8:
                    System.out.print("osiem");
                    break;
                case 9:
                    System.out.print("dziewięć");
                    break;
            }
        }
    }
}

