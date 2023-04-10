public class tablica14 extends tablica13 {
    void tablica14() {
        switch (sdec) {
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
        if(ddec==1&&dec==1) {
            System.out.print("jedenaście decylionów ");
        } else if(ddec==1&&dec==2) {
            System.out.print("dwanaście decylionów ");
        } else if(ddec==1&&dec==3) {
            System.out.print("trzynaście decylionów ");
        } else if(ddec==1&&dec==4) {
            System.out.print("czternaście decylionów ");
        } else if(ddec==1&&dec==5) {
            System.out.print("piętnaście decylionów ");
        } else if(ddec==1&&dec==6) {
            System.out.print("szesnaście decylionów ");
        } else if(ddec==1&&dec==7) {
            System.out.print("siedemnaście decylionów ");
        } else if(ddec==1&&dec==8) {
            System.out.print("osiemmnaście decylionów ");
        } else if(ddec==1&&dec==9) {
            System.out.print("dziewiętnaście decylionów ");
        } else {
            switch (ddec) {
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
            switch (dec) {
                case 0:
                    if(ddec>0||sdec>0) {
                        System.out.print("decylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sdec>0||ddec>0||dec>1){
                        System.out.print("jeden decylionów ");}
                    else {
                        System.out.print("decylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa decyliony ");
                    break;
                case 3:
                    System.out.print("trzy decyliony ");
                    break;
                case 4:
                    System.out.print("cztery decyliony ");
                    break;
                case 5:
                    System.out.print("pięć decylionów ");
                    break;
                case 6:
                    System.out.print("sześć decylionów ");
                    break;
                case 7:
                    System.out.print("siedem decylionów ");
                    break;
                case 8:
                    System.out.print("osiem decylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć decylionów ");
                    break;
            }
        }
    }
}



