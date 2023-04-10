public class tablica24 extends tablica23 {
    void tablica24() {
        switch (skwi) {
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
        if(dkwi==1&&kwi==1) {
            System.out.print("jedenaście kwintylionów ");
        } else if(dkwi==1&&kwi==2) {
            System.out.print("dwanaście kwintylionów ");
        } else if(dkwi==1&&kwi==3) {
            System.out.print("trzynaście kwintylionów ");
        } else if(dkwi==1&&kwi==4) {
            System.out.print("czternaście kwintylionów ");
        } else if(dkwi==1&&kwi==5) {
            System.out.print("piętnaście kwintylionów ");
        } else if(dkwi==1&&kwi==6) {
            System.out.print("szesnaście kwintylionów ");
        } else if(dkwi==1&&kwi==7) {
            System.out.print("siedemnaście kwintylionów ");
        } else if(dkwi==1&&kwi==8) {
            System.out.print("osiemmnaście kwintylionów ");
        } else if(dkwi==1&&kwi==9) {
            System.out.print("dziewiętnaście kwintylionów ");
        } else {
            switch (dkwi) {
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
            switch (kwi) {
                case 0:
                    if(dkwi>0||skwi>0) {
                        System.out.print("kwintylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(skwi>0||dkwi>0||kwi>1){
                        System.out.print("jeden kwintylionów ");}
                    else {
                        System.out.print("kwintylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa kwintyliony ");
                    break;
                case 3:
                    System.out.print("trzy kwintyliony ");
                    break;
                case 4:
                    System.out.print("cztery kwintyliony ");
                    break;
                case 5:
                    System.out.print("pięć kwintylionów ");
                    break;
                case 6:
                    System.out.print("sześć kwintylionów ");
                    break;
                case 7:
                    System.out.print("siedem kwintylionów ");
                    break;
                case 8:
                    System.out.print("osiem kwintylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć kwintylionów ");
                    break;
            }
        }
    }
}



