public class tablica23 extends tablica22 {
    void tablica23() {
        switch (skwid) {
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
        if(dkwid==1&&kwid==1) {
            System.out.print("jedenaście kwintyliardów ");
        } else if(dkwid==1&&kwid==2) {
            System.out.print("dwanaście kwintyliardów ");
        } else if(dkwid==1&&kwid==3) {
            System.out.print("trzynaście kwintyliardów ");
        } else if(dkwid==1&&kwid==4) {
            System.out.print("czternaście kwintyliardów ");
        } else if(dkwid==1&&kwid==5) {
            System.out.print("piętnaście kwintyliardów ");
        } else if(dkwid==1&&kwid==6) {
            System.out.print("szesnaście kwintyliardów ");
        } else if(dkwid==1&&kwid==7) {
            System.out.print("siedemnaście kwintyliardów ");
        } else if(dkwid==1&&kwid==8) {
            System.out.print("osiemmnaście kwintyliardów ");
        } else if(dkwid==1&&kwid==9) {
            System.out.print("dziewiętnaście kwintyliardów ");
        } else {
            switch (dkwid) {
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
            switch (kwid) {
                case 0:
                    if(dkwid>0||skwid>0) {
                        System.out.print("kwintyliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(skwid>0||dkwid>0||kwid>1){
                        System.out.print("jeden kwintyliardów ");}
                    else {
                        System.out.print("kwintyliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa kwintyliardy ");
                    break;
                case 3:
                    System.out.print("trzy kwintyliardy ");
                    break;
                case 4:
                    System.out.print("cztery kwintyliardy ");
                    break;
                case 5:
                    System.out.print("pięć kwintyliardów ");
                    break;
                case 6:
                    System.out.print("sześć kwintyliardów ");
                    break;
                case 7:
                    System.out.print("siedem kwintyliardów ");
                    break;
                case 8:
                    System.out.print("osiem kwintyliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć kwintyliardów ");
                    break;
            }
        }
    }
}



