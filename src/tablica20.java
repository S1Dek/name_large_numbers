public class tablica20 extends tablica19 {
    void tablica20() {
        switch (ssep) {
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
        if(dsep==1&&sep==1) {
            System.out.print("jedenaście septylionów ");
        } else if(dsep==1&&sep==2) {
            System.out.print("dwanaście septylionów ");
        } else if(dsep==1&&sep==3) {
            System.out.print("trzynaście septylionów ");
        } else if(dsep==1&&sep==4) {
            System.out.print("czternaście septylionów ");
        } else if(dsep==1&&sep==5) {
            System.out.print("piętnaście septylionów ");
        } else if(dsep==1&&sep==6) {
            System.out.print("szesnaście septylionów ");
        } else if(dsep==1&&sep==7) {
            System.out.print("siedemnaście septylionów ");
        } else if(dsep==1&&sep==8) {
            System.out.print("osiemmnaście septylionów ");
        } else if(dsep==1&&sep==9) {
            System.out.print("dziewiętnaście septylionów ");
        } else {
            switch (dsep) {
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
            switch (sep) {
                case 0:
                    if(dsep>0||ssep>0) {
                        System.out.print("septylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(ssep>0||dsep>0||sep>1){
                        System.out.print("jeden septylionów ");}
                    else {
                        System.out.print("septylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa septyliony ");
                    break;
                case 3:
                    System.out.print("trzy septyliony ");
                    break;
                case 4:
                    System.out.print("cztery septyliony ");
                    break;
                case 5:
                    System.out.print("pięć septylionów ");
                    break;
                case 6:
                    System.out.print("sześć septylionów ");
                    break;
                case 7:
                    System.out.print("siedem septylionów ");
                    break;
                case 8:
                    System.out.print("osiem septylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć septylionów ");
                    break;
            }
        }
    }
}



