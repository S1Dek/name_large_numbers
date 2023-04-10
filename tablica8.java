public class tablica8 extends tablica7 {
    void tablica8()
    {
        switch (stridec) {
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
        if(dtridec==1&& tridec==1) {
            System.out.print("jedenaście tridecylionów ");
        } else if(dtridec==1&& tridec==2) {
            System.out.print("dwanaście tridecylionów ");
        } else if(dtridec==1&& tridec==3) {
            System.out.print("trzynaście tridecylionów ");
        } else if(dtridec==1&& tridec==4) {
            System.out.print("czternaście tridecylionów ");
        } else if(dtridec==1&& tridec==5) {
            System.out.print("piętnaście tridecylionów ");
        } else if(dtridec==1&& tridec==6) {
            System.out.print("szesnaście tridecylionów ");
        } else if(dtridec==1&& tridec==7) {
            System.out.print("siedemnaście tridecylionów ");
        } else if(dtridec==1&& tridec==8) {
            System.out.print("osiemmnaście tridecylionów ");
        } else if(dtridec==1&& tridec==9) {
            System.out.print("dziewiętnaście tridecylionów ");
        } else {
            switch (dtridec) {
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
            switch (tridec) {
                case 0:
                    if(dtridec>0||stridec>0) {
                        System.out.print("tridecylionów");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(stridec>0||dtridec>0||tridec>1){
                        System.out.print("jeden tridecylionów  ");}
                    else {
                        System.out.print("tridecylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa tridecyliony ");
                    break;
                case 3:
                    System.out.print("trzy tridecyliony ");
                    break;
                case 4:
                    System.out.print("cztery tridecyliony ");
                    break;
                case 5:
                    System.out.print("pięć tridecylionów ");
                    break;
                case 6:
                    System.out.print("sześć tridecylionów ");
                    break;
                case 7:
                    System.out.print("siedem tridecylionów ");
                    break;
                case 8:
                    System.out.print("osiem tridecylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć tridecylionów ");
                    break;
            }
        }
    }
}



