public class tablica10 extends tablica9 {
    void tablica10() {
        switch (sdod) {
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
        if(ddod==1&&dod==1) {
            System.out.print("jedenaście dodecylionów ");
        } else if(ddod==1&&dod==2) {
            System.out.print("dwanaście dodecylionów ");
        } else if(ddod==1&&dod==3) {
            System.out.print("trzynaście dodecylionów ");
        } else if(ddod==1&&dod==4) {
            System.out.print("czternaście dodecylionów ");
        } else if(ddod==1&&dod==5) {
            System.out.print("piętnaście dodecylionów ");
        } else if(ddod==1&&dod==6) {
            System.out.print("szesnaście dodecylionów ");
        } else if(ddod==1&&dod==7) {
            System.out.print("siedemnaście dodecylionów ");
        } else if(ddod==1&&dod==8) {
            System.out.print("osiemmnaście dodecylionów ");
        } else if(ddod==1&&dod==9) {
            System.out.print("dziewiętnaście dodecylionów ");
        } else {
            switch (ddod) {
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
            switch (dod) {
                case 0:
                    if(ddod>0||sdod>0) {
                        System.out.print("dodecylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sdod>0||ddod>0||dod>1){
                        System.out.print("jeden dodecylionów ");}
                    else {
                        System.out.print("dodecylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa dodecyliony ");
                    break;
                case 3:
                    System.out.print("trzy dodecyliony ");
                    break;
                case 4:
                    System.out.print("cztery dodecyliony ");
                    break;
                case 5:
                    System.out.print("pięć dodecylionów ");
                    break;
                case 6:
                    System.out.print("sześć dodecylionów ");
                    break;
                case 7:
                    System.out.print("siedem dodecylionów ");
                    break;
                case 8:
                    System.out.print("osiem dodecylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć dodecylionów ");
                    break;
            }
        }
    }
}



