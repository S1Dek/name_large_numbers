public class tablica32 extends tablica31 {
    void tablica32() {
        switch (smil) {
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
        if(dmil==1&&miliony==1) {
            System.out.print("jedenaście milionów ");
        } else if(dmil==1&&miliony==2) {
            System.out.print("dwanaście milionów ");
        } else if(dmil==1&&miliony==3) {
            System.out.print("trzynaście milionów ");
        } else if(dmil==1&&miliony==4) {
            System.out.print("czternaście milionów ");
        } else if(dmil==1&&miliony==5) {
            System.out.print("piętnaście milionów ");
        } else if(dmil==1&&miliony==6) {
            System.out.print("szesnaście milionów ");
        } else if(dmil==1&&miliony==7) {
            System.out.print("siedemnaście milionów ");
        } else if(dmil==1&&miliony==8) {
            System.out.print("osiemmnaście milionów ");
        } else if(dmil==1&&miliony==9) {
            System.out.print("dziewiętnaście milionów ");
        } else {
            switch (dmil) {
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
            switch (miliony) {
                case 0:
                    if(dmil>0||smil>0) {
                        System.out.print("milionów");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(smil>0||dmil>0||miliony>1){
                        System.out.print("jeden milionów");}
                    else {
                        System.out.print("milion");
                    }
                    break;
                case 2:
                    System.out.print("dwa miliony ");
                    break;
                case 3:
                    System.out.print("trzy miliony ");
                    break;
                case 4:
                    System.out.print("cztery miliony ");
                    break;
                case 5:
                    System.out.print("pięć milionów ");
                    break;
                case 6:
                    System.out.print("sześć milionów ");
                    break;
                case 7:
                    System.out.print("siedem milionów ");
                    break;
                case 8:
                    System.out.print("osiem milionów ");
                    break;
                case 9:
                    System.out.print("dziewięć milionów ");
                    break;
            }
        }
    }
}

