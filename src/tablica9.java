public class tablica9 extends tablica8 {
    void tablica9() {
        switch (sdodd) {
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
        if(ddodd==1&&dodd==1) {
            System.out.print("jedenaście dodecyliardów ");
        } else if(ddodd==1&&dodd==2) {
            System.out.print("dwanaście dodecyliardów ");
        } else if(ddodd==1&&dodd==3) {
            System.out.print("trzynaście dodecyliardów ");
        } else if(ddodd==1&&dodd==4) {
            System.out.print("czternaście dodecyliardów ");
        } else if(ddodd==1&&dodd==5) {
            System.out.print("piętnaście dodecyliardów ");
        } else if(ddodd==1&&dodd==6) {
            System.out.print("szesnaście dodecyliardów ");
        } else if(ddodd==1&&dodd==7) {
            System.out.print("siedemnaście dodecyliardów ");
        } else if(ddodd==1&&dodd==8) {
            System.out.print("osiemmnaście dodecyliardów ");
        } else if(ddodd==1&&dodd==9) {
            System.out.print("dziewiętnaście dodecyliardów ");
        } else {
            switch (ddodd) {
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
            switch (dodd) {
                case 0:
                    if(ddodd>0||sdodd>0) {
                        System.out.print("dodecyliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sdodd>0||ddodd>0||dodd>1){
                        System.out.print("jeden dodecyliardów ");}
                    else {
                        System.out.print("dodecyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa dodecyliardy ");
                    break;
                case 3:
                    System.out.print("trzy dodecyliardy ");
                    break;
                case 4:
                    System.out.print("cztery dodecyliardy ");
                    break;
                case 5:
                    System.out.print("pięć dodecyliardów ");
                    break;
                case 6:
                    System.out.print("sześć dodecyliardów ");
                    break;
                case 7:
                    System.out.print("siedem dodecyliardów ");
                    break;
                case 8:
                    System.out.print("osiem dodecyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć dodecyliardów ");
                    break;
            }
        }
    }
}



