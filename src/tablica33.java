public class tablica33 extends tablica32 {
    void tablica33() {
        switch (setkitysiecy) {
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
        if (dziesiatkitysiecy == 1 && tysiace == 1) {
            System.out.print("jedenaście tysięcy ");
        } else if (dziesiatkitysiecy == 1 && tysiace == 2) {
            System.out.print("dwanaście tysięcy ");
        } else if (dziesiatkitysiecy == 1 && tysiace == 3) {
            System.out.print("trzynaście tysięcy ");
        } else if (dziesiatkitysiecy == 1 && tysiace == 4) {
            System.out.print("czternaście tysięcy ");
        } else if (dziesiatkitysiecy == 1 && tysiace == 5) {
            System.out.print("piętnaście tysięcy ");
        } else if (dziesiatkitysiecy == 1 && tysiace == 6) {
            System.out.print("szesnaście tysięcy ");
        } else if (dziesiatkitysiecy == 1 && tysiace == 7) {
            System.out.print("siedemnaście tysięcy ");
        } else if (dziesiatkitysiecy == 1 && tysiace == 8) {
            System.out.print("osiemmnaście tysięcy ");
        } else if (dziesiatkitysiecy == 1 && tysiace == 9) {
            System.out.print("dziewiętnaście tysięcy ");
        } else {
            switch (dziesiatkitysiecy) {
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
            switch (tysiace) {
                case 0:
                    if (dziesiatkitysiecy > 0 || setkitysiecy > 0) {
                        System.out.print("tysięcy ");
                    } else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if (setkitysiecy>0||dziesiatkitysiecy > 0 || tysiace > 1) {
                        System.out.print("jeden tysięcy ");
                    } else {
                        System.out.print("tysiąc ");
                    }
                    break;
                case 2:
                    System.out.print("dwa tysiące ");
                    break;
                case 3:
                    System.out.print("trzy tysiące ");
                    break;
                case 4:
                    System.out.print("cztery tysiące ");
                    break;
                case 5:
                    System.out.print("pięć tysiący ");
                    break;
                case 6:
                    System.out.print("sześć tysiący ");
                    break;
                case 7:
                    System.out.print("siedem tysiący ");
                    break;
                case 8:
                    System.out.print("osiem tysiący ");
                    break;
                case 9:
                    System.out.print("dziewięć tysiący ");
                    break;
            }
        }
    }
}

