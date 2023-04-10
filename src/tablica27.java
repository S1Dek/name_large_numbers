public class tablica27 extends tablica26 {
    void tablica27() {
        switch (stryld) {
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
        if(dtryld==1&&tryld==1) {
            System.out.print("jedenaście tryliardów ");
        } else if(dtryld==1&&tryld==2) {
            System.out.print("dwanaście tryliardów ");
        } else if(dtryld==1&&tryld==3) {
            System.out.print("trzynaście tryliardów ");
        } else if(dtryld==1&&tryld==4) {
            System.out.print("czternaście tryliardów ");
        } else if(dtryld==1&&tryld==5) {
            System.out.print("piętnaście tryliardów ");
        } else if(dtryld==1&&tryld==6) {
            System.out.print("szesnaście tryliardów ");
        } else if(dtryld==1&&tryld==7) {
            System.out.print("siedemnaście tryliardów ");
        } else if(dtryld==1&&tryld==8) {
            System.out.print("osiemmnaście tryliardów ");
        } else if(dtryld==1&&tryld==9) {
            System.out.print("dziewiętnaście tryliardów ");
        } else {
            switch (dtryld) {
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
            switch (tryld) {
                case 0:
                    if(dtryld>0||stryld>0) {
                        System.out.print("tryliardów ");}
                    else {
                        System.out.print("");
                    }
                    break;
                case 1:
                    if(stryld>0||dtryld>0||tryld>1){
                        System.out.print("jeden tryliardów ");}
                    else {
                        System.out.print("tryliard ");
                    }
                    break;
                case 2:
                    System.out.print("dwa tryliardy ");
                    break;
                case 3:
                    System.out.print("trzy tryliardy ");
                    break;
                case 4:
                    System.out.print("cztery tryliardy ");
                    break;
                case 5:
                    System.out.print("pięć tryliardów ");
                    break;
                case 6:
                    System.out.print("sześć tryliardów ");
                    break;
                case 7:
                    System.out.print("siedem tryliardów ");
                    break;
                case 8:
                    System.out.print("osiem tryliardów ");
                    break;
                case 9:
                    System.out.print("dziewięć tryliardów ");
                    break;
            }
        }
    }
}



