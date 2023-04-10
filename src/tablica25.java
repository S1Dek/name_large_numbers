public class tablica25 extends tablica24 {
    void tablica25() {
        switch (skwadd) {
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
        if(dkwadd==1&&kwadd==1) {
            System.out.print("jedenaście kwadryliardów ");
        } else if(dkwadd==1&&kwadd==2) {
            System.out.print("dwanaście kwadryliardów ");
        } else if(dkwadd==1&&kwadd==3) {
            System.out.print("trzynaście kwadryliardów ");
        } else if(dkwadd==1&&kwadd==4) {
            System.out.print("czternaście kwadryliardów ");
        } else if(dkwadd==1&&kwadd==5) {
            System.out.print("piętnaście kwadryliardów ");
        } else if(dkwadd==1&&kwadd==6) {
            System.out.print("szesnaście kwadryliardów ");
        } else if(dkwadd==1&&kwadd==7) {
            System.out.print("siedemnaście kwadryliardów ");
        } else if(dkwadd==1&&kwadd==8) {
            System.out.print("osiemmnaście kwadryliardów ");
        } else if(dkwadd==1&&kwadd==9) {
            System.out.print("dziewiętnaście kwadryliardów ");
        } else {
            switch (dkwadd) {
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
            switch (kwadd) {
                case 0:
                    if(dkwadd>0||skwadd>0) {
                        System.out.print("kwadryliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(skwadd>0||dkwadd>0||kwadd>1){
                        System.out.print("jeden kwadryliardów ");}
                    else {
                        System.out.print("kwadryliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa kwadryliardy ");
                    break;
                case 3:
                    System.out.print("trzy kwadryliardy ");
                    break;
                case 4:
                    System.out.print("cztery kwadryliardy ");
                    break;
                case 5:
                    System.out.print("pięć kwadryliardów ");
                    break;
                case 6:
                    System.out.print("sześć kwadryliardów ");
                    break;
                case 7:
                    System.out.print("siedem kwadryliardów ");
                    break;
                case 8:
                    System.out.print("osiem kwadryliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć kwadryliardów ");
                    break;
            }
        }
    }
}



