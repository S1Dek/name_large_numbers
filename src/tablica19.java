public class tablica19 extends tablica18 {
    void tablica19() {
        switch (ssepd) {
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
        if(dsepd==1&&sepd==1) {
            System.out.print("jedenaście septyliardów ");
        } else if(dsepd==1&&sepd==2) {
            System.out.print("dwanaście septyliardów ");
        } else if(dsepd==1&&sepd==3) {
            System.out.print("trzynaście septyliardów ");
        } else if(dsepd==1&&sepd==4) {
            System.out.print("czternaście septyliardów ");
        } else if(dsepd==1&&sepd==5) {
            System.out.print("piętnaście septyliardów ");
        } else if(dsepd==1&&sepd==6) {
            System.out.print("szesnaście septyliardów ");
        } else if(dsepd==1&&sepd==7) {
            System.out.print("siedemnaście septyliardów ");
        } else if(dsepd==1&&sepd==8) {
            System.out.print("osiemmnaście septyliardów ");
        } else if(dsepd==1&&sepd==9) {
            System.out.print("dziewiętnaście septyliardów ");
        } else {
            switch (dsepd) {
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
            switch (sepd) {
                case 0:
                    if(dsepd>0||ssepd>0) {
                        System.out.print("septyliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(ssepd>0||dsepd>0||sepd>1){
                        System.out.print("jeden septyliardów ");}
                    else {
                        System.out.print("septyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa septyliardy ");
                    break;
                case 3:
                    System.out.print("trzy septyliardy ");
                    break;
                case 4:
                    System.out.print("cztery septyliardy ");
                    break;
                case 5:
                    System.out.print("pięć septyliardów ");
                    break;
                case 6:
                    System.out.print("sześć septyliardów ");
                    break;
                case 7:
                    System.out.print("siedem septyliardów ");
                    break;
                case 8:
                    System.out.print("osiem septyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć septyliardów ");
                    break;
            }
        }
    }
}



