public class tablica22 extends tablica21 {
    void tablica22() {
        switch (sseks) {
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
        if(dseks==1&&seks==1) {
            System.out.print("jedenaście sekstylionów ");
        } else if(dseks==1&&seks==2) {
            System.out.print("dwanaście sekstylionów ");
        } else if(dseks==1&&seks==3) {
            System.out.print("trzynaście sekstylionów ");
        } else if(dseks==1&&seks==4) {
            System.out.print("czternaście sekstylionów ");
        } else if(dseks==1&&seks==5) {
            System.out.print("piętnaście sekstylionów ");
        } else if(dseks==1&&seks==6) {
            System.out.print("szesnaście sekstylionów ");
        } else if(dseks==1&&seks==7) {
            System.out.print("siedemnaście sekstylionów ");
        } else if(dseks==1&&seks==8) {
            System.out.print("osiemmnaście sekstylionów ");
        } else if(dseks==1&&seks==9) {
            System.out.print("dziewiętnaście sekstylionów ");
        } else {
            switch (dseks) {
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
            switch (seks) {
                case 0:
                    if(dseks>0||sseks>0) {
                        System.out.print("sekstylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sseks>0||dseks>0||seks>1){
                        System.out.print("jeden sekstylionów ");}
                    else {
                        System.out.print("sekstylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa sekstyliony ");
                    break;
                case 3:
                    System.out.print("trzy sekstyliony ");
                    break;
                case 4:
                    System.out.print("cztery sekstyliony ");
                    break;
                case 5:
                    System.out.print("pięć sekstylionów ");
                    break;
                case 6:
                    System.out.print("sześć sekstylionów ");
                    break;
                case 7:
                    System.out.print("siedem sekstylionów ");
                    break;
                case 8:
                    System.out.print("osiem sekstylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć sekstylionów ");
                    break;
            }
        }
    }
}



