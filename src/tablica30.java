public class tablica30 extends tablica29 {
    void tablica30() {
        switch (sbil) {
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
        if(dbil==1&&bil==1) {
            System.out.print("jedenaście bilionów ");
        } else if(dbil==1&&bil==2) {
            System.out.print("dwanaście bilionów ");
        } else if(dbil==1&&bil==3) {
            System.out.print("trzynaście bilionów ");
        } else if(dbil==1&&bil==4) {
            System.out.print("czternaście bilionów ");
        } else if(dbil==1&&bil==5) {
            System.out.print("piętnaście bilionów ");
        } else if(dbil==1&&bil==6) {
            System.out.print("szesnaście bilionów ");
        } else if(dbil==1&&bil==7) {
            System.out.print("siedemnaście bilionów ");
        } else if(dbil==1&&bil==8) {
            System.out.print("osiemmnaście bilionów ");
        } else if(dbil==1&&bil==9) {
            System.out.print("dziewiętnaście bilionów ");
        } else {
            switch (dbil) {
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
            switch (bil) {
                case 0:
                    if(dbil>0||sbil>0) {
                        System.out.print("bilionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sbil>0||dbil>0||bil>1){
                        System.out.print("jeden bilionów");}
                    else {
                        System.out.print("bilion");
                    }
                    break;
                case 2:
                    System.out.print("dwa biliony ");
                    break;
                case 3:
                    System.out.print("trzy biliony ");
                    break;
                case 4:
                    System.out.print("cztery biliony ");
                    break;
                case 5:
                    System.out.print("pięć bilionów ");
                    break;
                case 6:
                    System.out.print("sześć bilionów ");
                    break;
                case 7:
                    System.out.print("siedem bilionów ");
                    break;
                case 8:
                    System.out.print("osiem bilionów ");
                    break;
                case 9:
                    System.out.print("dziewięć bilionów ");
                    break;
            }
        }
    }
}

