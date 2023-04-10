public class tablica31 extends tablica30 {
    void tablica31() {
        switch (smild) {
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
        if(dmild==1&&mild==1) {
            System.out.print("jedenaście milirdów ");
        } else if(dmild==1&&mild==2) {
            System.out.print("dwanaście milirdów ");
        } else if(dmild==1&&mild==3) {
            System.out.print("trzynaście milirdów ");
        } else if(dmild==1&&mild==4) {
            System.out.print("czternaście milirdów ");
        } else if(dmild==1&&mild==5) {
            System.out.print("piętnaście milirdów ");
        } else if(dmild==1&&mild==6) {
            System.out.print("szesnaście milirdów ");
        } else if(dmild==1&&mild==7) {
            System.out.print("siedemnaście milirdów ");
        } else if(dmild==1&&mild==8) {
            System.out.print("osiemmnaście milirdów ");
        } else if(dmild==1&&mild==9) {
            System.out.print("dziewiętnaście milirdów ");
        } else {
            switch (dmild) {
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
            switch (mild) {
                case 0:
                    if(dmild>0||smild>0) {
                        System.out.print("milidardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(smild>0||dmild>0||mild>1){
                        System.out.print("jeden milidardów ");}
                    else {
                        System.out.print("milidard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa milidardy ");
                    break;
                case 3:
                    System.out.print("trzy milidardy ");
                    break;
                case 4:
                    System.out.print("cztery milidardy ");
                    break;
                case 5:
                    System.out.print("pięć milidardów ");
                    break;
                case 6:
                    System.out.print("sześć milidardów ");
                    break;
                case 7:
                    System.out.print("siedem milidardów ");
                    break;
                case 8:
                    System.out.print("osiem milidardów ");
                    break;
                case 9:
                    System.out.print("dziewięć milidardów ");
                    break;
            }
        }
    }
}

