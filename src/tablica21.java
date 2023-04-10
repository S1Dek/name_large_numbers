public class tablica21 extends tablica20 {
    void tablica21() {
        switch (sseksd) {
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
        if(dseksd==1&&seksd==1) {
            System.out.print("jedenaście sekstyliardów ");
        } else if(dseksd==1&&seksd==2) {
            System.out.print("dwanaście sekstyliardów ");
        } else if(dseksd==1&&seksd==3) {
            System.out.print("trzynaście sekstyliardów ");
        } else if(dseksd==1&&seksd==4) {
            System.out.print("czternaście sekstyliardów ");
        } else if(dseksd==1&&seksd==5) {
            System.out.print("piętnaście sekstyliardów ");
        } else if(dseksd==1&&seksd==6) {
            System.out.print("szesnaście sekstyliardów ");
        } else if(dseksd==1&&seksd==7) {
            System.out.print("siedemnaście sekstyliardów ");
        } else if(dseksd==1&&seksd==8) {
            System.out.print("osiemmnaście sekstyliardów ");
        } else if(dseksd==1&&seksd==9) {
            System.out.print("dziewiętnaście sekstyliardów ");
        } else {
            switch (dseksd) {
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
            switch (seksd) {
                case 0:
                    if(dseksd>0||sseksd>0) {
                        System.out.print("sekstyliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sseksd>0||dseksd>0||seksd>1){
                        System.out.print("jeden sekstyliardów ");}
                    else {
                        System.out.print("sekstyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa sekstyliardy ");
                    break;
                case 3:
                    System.out.print("trzy sekstyliardy ");
                    break;
                case 4:
                    System.out.print("cztery sekstyliardy ");
                    break;
                case 5:
                    System.out.print("pięć sekstyliardów ");
                    break;
                case 6:
                    System.out.print("sześć sekstyliardów ");
                    break;
                case 7:
                    System.out.print("siedem sekstyliardów ");
                    break;
                case 8:
                    System.out.print("osiem sekstyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć sekstyliardów ");
                    break;
            }
        }
    }
}



