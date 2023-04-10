import java.util.Scanner;

public class dzialanie {
    int dlugosc;
    String liczba;
    int jednosci=0, dziesiatki=0, setki=0, tysiace=0, dziesiatkitysiecy=0, setkitysiecy=0, miliony=0, dmil=0, smil=0, mild=0, dmild=0, smild=0, bil=0, dbil=0, sbil=0, bild=0, dbild=0, sbild=0, tryl=0, dtryl=0, stryl=0, tryld=0, dtryld=0, stryld=0, kwad=0, dkwad=0, skwad=0, kwadd=0, dkwadd=0, skwadd=0, kwi=0, dkwi=0, skwi=0, kwid=0, dkwid=0, skwid=0, seks=0, dseks=0, sseks=0, seksd=0, dseksd=0, sseksd=0, sep=0, dsep=0, ssep=0, sepd=0, dsepd=0, ssepd=0, ok=0, dok=0, sok=0, okd=0, dokd=0, sokd=0, no=0, dno=0, sno=0, nod=0, dnod=0, snod=0, dec=0, ddec=0, sdec=0, decd=0, ddecd=0, sdecd=0, un=0, dun=0, sun=0, und=0, dund=0, sund=0, dod=0, ddod=0, sdod=0, dodd=0, ddodd=0, sdodd=0, tridec=0, dtridec=0, stridec=0, tridecd=0, dtridecd=0, stridecd=0, kwadecylion=0, dkwadecylion=0, skwadecylion=0, kwadecyliard=0, dkwadecyliard=0, skwadecyliard=0, kwidecylion=0, dkwidecylion=0, skwidecylion=0, kwindecyliard=0, dkwindecyliard=0, skwindecyliard=0, seksdecylion=0, dseksdecylion=0, sseksdecylion=0, seksdecyliard=0, dseksdecyliard=0, sseksdecyliard=0;
    protected void dzialanie() {
        System.out.print("Wypisz liczbę: ");
        Scanner a = new Scanner(System.in);
        liczba = a.next();
        dlugosc = liczba.length();
        int dlugosczminusem=dlugosc;
        if(liczba.charAt(0)=='-')
        {
            System.out.print("minus ");
            dlugosczminusem--;
        }
        else
        {
            System.out.print("");
        }
        switch (dlugosczminusem)
        {
            case 102:
                sseksdecyliard = liczba.charAt(dlugosc - 102) - 48;
            case 101:
                dseksdecyliard = liczba.charAt(dlugosc - 101) - 48; // dseksdecyliard = gugol
            case 100:
                seksdecyliard = liczba.charAt(dlugosc - 100) - 48; // seksdecyliard 1
            case 99:
                sseksdecylion = liczba.charAt(dlugosc - 99) - 48;
            case 98:
                dseksdecylion = liczba.charAt(dlugosc - 98) - 48;
            case 97:
                seksdecylion = liczba.charAt(dlugosc - 97) - 48; // seksdecylion 2
            case 96:
                skwindecyliard = liczba.charAt(dlugosc - 96) - 48;
            case 95:
                dkwindecyliard = liczba.charAt(dlugosc - 95) - 48;
            case 94:
                kwindecyliard = liczba.charAt(dlugosc - 94) - 48; // kwindecyliard 3
            case 93:
                skwidecylion = liczba.charAt(dlugosc - 93) - 48;
            case 92:
                dkwidecylion = liczba.charAt(dlugosc - 92) - 48;
            case 91:
                kwidecylion = liczba.charAt(dlugosc - 91) - 48; // kwindecylion 4
            case 90:
                skwadecyliard = liczba.charAt(dlugosc - 90) - 48;
            case 89:
                dkwadecyliard = liczba.charAt(dlugosc - 89) - 48;
            case 88:
                kwadecyliard = liczba.charAt(dlugosc - 88) - 48; // kwatourdecyliard 5
            case 87:
                skwadecylion = liczba.charAt(dlugosc - 87) - 48;
            case 86:
                dkwadecylion = liczba.charAt(dlugosc - 86) - 48;
            case 85:
                kwadecylion = liczba.charAt(dlugosc - 85) - 48; // kwatourdecylion 6
            case 84:
                stridecd = liczba.charAt(dlugosc - 84) - 48;
            case 83:
                dtridecd = liczba.charAt(dlugosc - 83) - 48;
            case 82:
                tridecd = liczba.charAt(dlugosc - 82) - 48; // tridecyliard 7
            case 81:
                stridec = liczba.charAt(dlugosc - 81) - 48;
            case 80:
                dtridec = liczba.charAt(dlugosc - 80) - 48;
            case 79:
                tridec = liczba.charAt(dlugosc - 79) - 48; // tridecylion 8
            case 78:
                sdodd = liczba.charAt(dlugosc - 78) - 48;
            case 77:
                ddodd = liczba.charAt(dlugosc - 77) - 48;
            case 76:
                dodd = liczba.charAt(dlugosc - 76) - 48; // dodecyliard 9
            case 75:
                sdod = liczba.charAt(dlugosc - 75) - 48;
            case 74:
                ddod = liczba.charAt(dlugosc - 74) - 48;
            case 73:
                dod = liczba.charAt(dlugosc - 73) - 48; // dodecylion 10
            case 72:
                sund = liczba.charAt(dlugosc - 72) - 48;
            case 71:
                dund = liczba.charAt(dlugosc - 71) - 48;
            case 70:
                und = liczba.charAt(dlugosc - 70) - 48; // undecyliard 11
            case 69:
                sun = liczba.charAt(dlugosc - 69) - 48;
            case 68:
                dun = liczba.charAt(dlugosc - 68) - 48;
            case 67:
                un = liczba.charAt(dlugosc - 67) - 48; // undecylion 12
            case 66:
                sdecd = liczba.charAt(dlugosc - 66) - 48;
            case 65:
                ddecd = liczba.charAt(dlugosc - 65) - 48;
            case 64:
                decd = liczba.charAt(dlugosc - 64) - 48; // decyliard 13
            case 63:
                sdec = liczba.charAt(dlugosc - 63) - 48;
            case 62:
                ddec = liczba.charAt(dlugosc - 62) - 48;
            case 61:
                dec = liczba.charAt(dlugosc - 61) - 48; // decylion 14
            case 60:
                snod = liczba.charAt(dlugosc - 60) - 48;
            case 59:
                dnod = liczba.charAt(dlugosc - 59) - 48;
            case 58:
                nod = liczba.charAt(dlugosc - 58) - 48; // noniliard 15
            case 57:
                sno = liczba.charAt(dlugosc - 57) - 48;
            case 56:
                dno = liczba.charAt(dlugosc - 56) - 48;
            case 55:
                no = liczba.charAt(dlugosc - 55) - 48; // nonilion 16
            case 54:
                sokd = liczba.charAt(dlugosc - 54) - 48;
            case 53:
                dokd = liczba.charAt(dlugosc - 53) - 48;
            case 52:
                okd = liczba.charAt(dlugosc - 52) - 48; // oktyliard 17
            case 51:
                sok = liczba.charAt(dlugosc - 51) - 48;
            case 50:
                dok = liczba.charAt(dlugosc - 50) - 48;
            case 49:
                ok = liczba.charAt(dlugosc - 49) - 48; // oktylion 18
            case 48:
                ssepd = liczba.charAt(dlugosc - 48) - 48;
            case 47:
                dsepd = liczba.charAt(dlugosc - 47) - 48;
            case 46:
                sepd = liczba.charAt(dlugosc - 46) - 48; // septyliard 19
            case 45:
                ssep = liczba.charAt(dlugosc - 45) - 48;
            case 44:
                dsep = liczba.charAt(dlugosc - 44) - 48;
            case 43:
                sep = liczba.charAt(dlugosc - 43) - 48; // septylion 20
            case 42:
                sseksd = liczba.charAt(dlugosc - 42) - 48;
            case 41:
                dseksd = liczba.charAt(dlugosc - 41) - 48;
            case 40:
                seksd = liczba.charAt(dlugosc - 40) - 48; // sekstyliard 21
            case 39:
                sseks = liczba.charAt(dlugosc - 39) - 48;
            case 38:
                dseks = liczba.charAt(dlugosc - 38) - 48;
            case 37:
                seks = liczba.charAt(dlugosc - 37) - 48; // sekstylion 22
            case 36:
                skwid = liczba.charAt(dlugosc - 36) - 48;
            case 35:
                dkwid = liczba.charAt(dlugosc - 35) - 48;
            case 34:
                kwid = liczba.charAt(dlugosc - 34) - 48; // kwintyliard 23
            case 33:
                skwi = liczba.charAt(dlugosc - 33) - 48;
            case 32:
                dkwi = liczba.charAt(dlugosc - 32) - 48;
            case 31:
                kwi = liczba.charAt(dlugosc - 31) - 48; // kwintylion 24
            case 30:
                skwadd = liczba.charAt(dlugosc - 30) - 48;
            case 29:
                dkwadd = liczba.charAt(dlugosc - 29) - 48;
            case 28:
                kwadd = liczba.charAt(dlugosc - 28) - 48; // kwadryliardy 25
            case 27:
                skwad = liczba.charAt(dlugosc - 27) - 48;
            case 26:
                dkwad = liczba.charAt(dlugosc - 26) - 48;
            case 25:
                kwad = liczba.charAt(dlugosc - 25) - 48;  // kwadryliony 26
            case 24:
                stryld = liczba.charAt(dlugosc - 24) - 48;
            case 23:
                dtryld = liczba.charAt(dlugosc - 23) - 48;
            case 22:
                tryld = liczba.charAt(dlugosc - 22) - 48; // tryliardy 27
            case 21:
                stryl = liczba.charAt(dlugosc - 21) - 48;
            case 20:
                dtryl = liczba.charAt(dlugosc - 20) - 48;
            case 19:
                tryl = liczba.charAt(dlugosc - 19) - 48; // tryliony 28
            case 18:
                sbild = liczba.charAt(dlugosc - 18) - 48;
            case 17:
                dbild = liczba.charAt(dlugosc - 17) - 48;
            case 16:
                bild = liczba.charAt(dlugosc - 16) - 48; // biliardy 29
            case 15:
                sbil = liczba.charAt(dlugosc - 15) - 48;
            case 14:
                dbil = liczba.charAt(dlugosc - 14) - 48;
            case 13:
                bil = liczba.charAt(dlugosc - 13) - 48; // biliony 30
            case 12:
                smild = liczba.charAt(dlugosc - 12) - 48;
            case 11:
                dmild = liczba.charAt(dlugosc - 11) - 48;
            case 10:
                mild = liczba.charAt(dlugosc - 10) - 48; // miliardy 31
            case 9:
                smil = liczba.charAt(dlugosc - 9) - 48;
            case 8:
                dmil = liczba.charAt(dlugosc - 8) - 48;
            case 7:
                miliony = liczba.charAt(dlugosc - 7) - 48; // miliony 32
            case 6:
                setkitysiecy = liczba.charAt(dlugosc - 6) - 48;
            case 5:
                dziesiatkitysiecy = liczba.charAt(dlugosc - 5) - 48;
            case 4:
                tysiace = liczba.charAt(dlugosc - 4) - 48; // tysiące 33
            case 3:
                setki = liczba.charAt(dlugosc - 3) - 48;
            case 2:
                dziesiatki = liczba.charAt(dlugosc - 2) - 48;
            case 1:
                jednosci = liczba.charAt(dlugosc - 1) - 48; // jednosci 34
                break;
            default:
                System.out.println("No takiej dużej liczby to ja nawet nie wiem. Poczekaj na aktualizacje !!!");
                break;
        }
    }
}
