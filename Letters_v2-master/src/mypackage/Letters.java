package mypackage;

/**
 * Created by qwerty on 11-Nov-17.
 */
public class Letters {  //klaza przechowująca wszystkie litery oraz przewidywany wynik poszczegolnych obszarow
    //tablice liter
    private int[] a;    //tablica male a
    private int[] aa;   //tablica duże A
    private int[] b;
    private int[] bb;
    private int[] c;
    private int[] cc;
    private int[] d;
    private int[] dd;
    private int[] e;
    private int[] ee;
    private int[] f;
    private int[] ff;
    private int[] g;
    private int[] gg;
    private int[] h;
    private int[] hh;
    private int[] i;
    private int[] ii;
    private int[] j;
    private int[] jj;
    private int[][] tab;

    //tablice wynikow
    private int[] a_result;
    private int[] aa_result;
    private int[] b_result;
    private int[] bb_result;
    private int[] c_result;
    private int[] cc_result;
    private int[] d_result;
    private int[] dd_result;
    private int[] e_result;
    private int[] ee_result;
    private int[] f_result;
    private int[] ff_result;
    private int[] g_result;
    private int[] gg_result;
    private int[] h_result;
    private int[] hh_result;
    private int[] i_result;
    private int[] ii_result;
    private int[] j_result;
    private int[] jj_result;
    private int[][] tab_result;

    public int[] getA_result() {
        return a_result;
    }

    public int[] getAa_result() {
        return aa_result;
    }

    public int[] getB_result() {
        return b_result;
    }

    public int[] getBb_result() {
        return bb_result;
    }

    public int[] getC_result() {
        return c_result;
    }

    public int[] getCc_result() {
        return cc_result;
    }

    public int[] getD_result() {
        return d_result;
    }

    public int[] getDd_result() {
        return dd_result;
    }

    public int[] getE_result() {
        return e_result;
    }

    public int[] getEe_result() {
        return ee_result;
    }

    public int[] getF_result() {
        return f_result;
    }

    public int[] getFf_result() {
        return ff_result;
    }

    public int[] getG_result() {
        return g_result;
    }

    public int[] getGg_result() {
        return gg_result;
    }

    public int[] getH_result() {
        return h_result;
    }

    public int[] getHh_result() {
        return hh_result;
    }

    public int[] getI_result() {
        return i_result;
    }

    public int[] getIi_result() {
        return ii_result;
    }

    public int[] getJ_result() {
        return j_result;
    }

    public int[] getJj_result() {
        return jj_result;
    }

    public int[][] getTab_result() {
        return tab_result;
    }

    public int[] getA() {
        return a;
    }

    public int[] getAa() {
        return aa;
    }

    public int[] getB() {
        return b;
    }

    public int[] getBb() {
        return bb;
    }

    public int[] getC() {
        return c;
    }

    public int[] getCc() {
        return cc;
    }

    public int[] getD() {
        return d;
    }

    public int[] getDd() {
        return dd;
    }

    public int[] getE() {
        return e;
    }

    public int[] getEe() {
        return ee;
    }

    public int[] getF() {
        return f;
    }

    public int[] getFf() {
        return ff;
    }

    public int[] getG() {
        return g;
    }

    public int[] getGg() {
        return gg;
    }

    public int[] getH() {
        return h;
    }

    public int[] getHh() {
        return hh;
    }

    public int[] getI() {
        return i;
    }

    public int[] getIi() {
        return ii;
    }

    public int[] getJ() {
        return j;
    }

    public int[] getJj() {
        return jj;
    }

    public int[][] getTab() {
        return tab;
    }

    Letters()   //kolejnosc obszarow lewa gora, prawa gora,lewy dowl,prawy dol,lewo,prawo,gora,dol,srodek
    {

        aa = new int[] {
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1};

        aa_result=new int[]{
                1,1,1,1,1,1,0,0,1
        };

        bb = new int[] {
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0};

        bb_result=new int[]{
                1,1,1,1,1,1,0,0,1
        };

        cc = new int[] {
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,1,
                0,1,1,1,0
        };

        cc_result=new int[]{
                1,0,1,0,1,0,0,0,0
        };

        dd = new int[]{
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
        };

        dd_result=new int[]{
                1,1,1,1,1,1,0,0,0
        };

        ee = new int[]{
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,1
        };

        ee_result=new int[]{
                1,0,1,0,1,1,0,0,1
        };

        ff = new int[]{
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0
        };

        ff_result=new int[]{
                1,0,1,0,1,1,0,0,1
        };

        gg = new int[]{
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,0,
                1,0,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0
        };

        gg_result=new int[]{
                1,0,1,1,1,1,0,0,1
        };

        hh = new int[]{
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1
        };

        hh_result=new int[]{
                1,1,1,1,1,1,0,0,1
        };

        ii = new int[]{
                0,1,1,1,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,1,1,1,0
        };

        ii_result=new int[]{
                0,0,0,0,0,0,1,1,1
        };

        jj= new int[]{
                1,1,1,1,1,
                0,0,0,0,1,
                0,0,0,0,1,
                0,0,0,0,1,
                0,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0
        };

        jj_result=new int[]{
                0,1,0,1,0,1,0,0,0
        };

        a = new int[]  {
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,1,1,1
        };

        a_result=new int[]{
                0,0,1,1,0,0,0,1,0
        };

        b= new int[]  {
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,0,1,0,
                0,1,1,1,0
        };

        b_result=new int[]{
                1,0,1,1,1,1,0,0,1
        };

        c= new int[]  {

                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,1,1,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,0,1,1,0
        };

        c_result=new int[]{
                0,0,0,0,0,1,0,0,1
        };


        d = new int[]{
                0,0,0,1,0,
                0,0,0,1,0,
                0,0,0,1,0,
                0,0,0,1,0,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,1,1,0
        };

        d_result=new int[]{
                0,1,1,1,0,1,0,1,0
        };

        e = new int[]  {
                0,0,0,0,0,
                0,0,0,0,0,
                0,1,1,1,0,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,0,
                0,1,1,1,0
        };

        e_result=new int[]{
                0,0,1,1,1,1,0,1,0
        };

        f= new int[]  {
                0,0,1,1,0,
                0,0,1,0,0,
                0,1,1,1,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0
        };

        f_result=new int[]{
                1,0,1,0,0,0,0,0,0
        };

        g= new int[] {
                0,0,0,0,0,
                0,0,1,0,0,
                0,1,1,1,1,
                0,1,0,1,0,
                0,1,1,1,0,
                0,0,0,1,0,
                0,0,1,1,0
        };

        g_result=new int[]{
                0,0,0,1,1,1,1,1,0
        };

        h= new int[] {
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,1,0,0,
                0,1,0,1,0,
                0,1,0,1,0,
                0,1,0,1,0
        };

        h_result=new int[]{
                1,0,1,1,1,0,0,0,1
        };

        i =  new int[]{
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,1,0,0,
                0,0,0,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0
        };

        i_result=new int[]{
                0,0,0,0,0,0,0,1,0
        };

        j= new int[] {
                0,0,0,1,0,
                0,0,0,0,0,
                0,0,0,1,0,
                0,0,0,1,1,
                0,0,1,1,0,
                0,1,0,1,0,
                0,0,1,0,0
        };

        j_result=new int[]{
                0,0,0,0,0,1,0,1,0
        };

        tab=new int[][]{a,aa,b,bb,c,cc,d,dd,e,ee,f,ff,g,gg,h,hh,i,ii,j,jj}; //zapakowanie tablic do jednej zmiennej dla wygody dostępu
        tab_result=new int[][]{a_result,aa_result,b_result,bb_result,c_result,cc_result,d_result,dd_result,e_result,ee_result,f_result,ff_result,g_result,gg_result,h_result,hh_result,i_result,ii_result,j_result,jj_result}; //to samo co wyzej
    }

}
