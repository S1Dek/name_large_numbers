public class tablica12 extends tablica11 {
    void tablica12() {
        switch (sun) {
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
        if(dun==1&&un==1) {
            System.out.print("jedenaście undecylionów ");
        } else if(dun==1&&un==2) {
            System.out.print("dwanaście undecylionów ");
        } else if(dun==1&&un==3) {
            System.out.print("trzynaście undecylionów ");
        } else if(dun==1&&un==4) {
            System.out.print("czternaście undecylionów ");
        } else if(dun==1&&un==5) {
            System.out.print("piętnaście undecylionów ");
        } else if(dun==1&&un==6) {
            System.out.print("szesnaście undecylionów ");
        } else if(dun==1&&un==7) {
            System.out.print("siedemnaście undecylionów ");
        } else if(dun==1&&un==8) {
            System.out.print("osiemmnaście undecylionów ");
        } else if(dun==1&&un==9) {
            System.out.print("dziewiętnaście undecylionów ");
        } else {
            switch (dun) {
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
            switch (un) {
                case 0:
                    if(dun>0||sun>0) {
                        System.out.print("undecylionów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(sun>0||dun>0||un>1){
                        System.out.print("jeden undecylionów ");}
                    else {
                        System.out.print("undecylion ");
                    }
                    break;
                case 2:
                    System.out.print("dwa undecyliony ");
                    break;
                case 3:
                    System.out.print("trzy undecyliony ");
                    break;
                case 4:
                    System.out.print("cztery undecyliony ");
                    break;
                case 5:
                    System.out.print("pięć undecylionów ");
                    break;
                case 6:
                    System.out.print("sześć undecylionów ");
                    break;
                case 7:
                    System.out.print("siedem undecylionów ");
                    break;
                case 8:
                    System.out.print("osiem undecylionów ");
                    break;
                case 9:
                    System.out.print("dziewięć undecylionów ");
                    break;
            }
        }
    }
}



