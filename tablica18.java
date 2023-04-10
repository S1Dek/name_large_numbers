public class tablica18 extends tablica17 {
    void tablica18() {
        switch (sok) {
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
        if(dok==1&&ok==1) {
            System.out.print("jedenaście oktylionów ");
        } else if(dok==1&&ok==2) {
            System.out.print("dwanaście oktylionów ");
        } else if(dok==1&&ok==3) {
            System.out.print("trzynaście oktylionów ");
        } else if(dok==1&&ok==4) {
            System.out.print("czternaście oktylionów ");
        } else if(dok==1&&ok==5) {
            System.out.print("piętnaście oktylionów ");
        } else if(dok==1&&ok==6) {
            System.out.print("szesnaście oktylionów ");
        } else if(dok==1&&ok==7) {
            System.out.print("siedemnaście oktylionów ");
        } else if(dok==1&&ok==8) {
            System.out.print("osiemmnaście oktylionów ");
        } else if(dok==1&&ok==9) {
            System.out.print("dziewiętnaście oktylionów ");
        } else {
            switch (dok) {
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
            switch (ok) {
                case 0:
                    if(dok>0||sok>0) {
                        System.out.print("oktylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sok>0||dok>0||ok>1){
                        System.out.print("jeden oktylionów ");}
                    else {
                        System.out.print("oktylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa oktyliony ");
                    break;
                case 3:
                    System.out.print("trzy oktyliony ");
                    break;
                case 4:
                    System.out.print("cztery oktyliony ");
                    break;
                case 5:
                    System.out.print("pięć oktylionów ");
                    break;
                case 6:
                    System.out.print("sześć oktylionów ");
                    break;
                case 7:
                    System.out.print("siedem oktylionów ");
                    break;
                case 8:
                    System.out.print("osiem oktylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć oktylionów ");
                    break;
            }
        }
    }
}



