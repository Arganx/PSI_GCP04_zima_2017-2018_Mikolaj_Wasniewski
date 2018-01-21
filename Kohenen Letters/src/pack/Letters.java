package pack;

/**
 * Created by qwerty on 11-Nov-17.
 */
public class Letters {
    private int[] aa;
    private int[] bb;
    private int[] cc;
    private int[] dd;
    private int[] ee;
    private int[] ff;
    private int[] gg;
    private int[] hh;
    private int[] ii;
    private int[] jj;
    private int[] kk;
    private int[] ll;
    private int[] mm;
    private int[] nn;
    private int[] oo;
    private int[] pp;
    private int[] qq;
    private int[] rr;
    private int[] ss;
    private int[] tt;
    private int[][] tab;


    public int[] getAa() {
        return aa;
    }


    public int[] getBb() {
        return bb;
    }


    public int[] getCc() {
        return cc;
    }


    public int[] getDd() {
        return dd;
    }

    public int[] getEe() {
        return ee;
    }


    public int[] getFf() {
        return ff;
    }


    public int[] getGg() {
        return gg;
    }


    public int[] getHh() {
        return hh;
    }


    public int[] getIi() {
        return ii;
    }


    public int[] getJj() {
        return jj;
    }

    public int[] getKk() {
        return kk;
    }

    public int[] getLl() {
        return ll;
    }

    public int[] getMm() {
        return mm;
    }

    public int[] getNn() {
        return nn;
    }

    public int[] getOo() {
        return oo;
    }

    public int[] getPp() {
        return pp;
    }

    public int[] getQq() {
        return qq;
    }

    public int[] getRr() {
        return rr;
    }

    public int[] getSs() {
        return ss;
    }

    public int[] getTt() {
        return tt;
    }

    public int[][] getTab() {
        return tab;
    }

    Letters()
    {
        aa = new int[] {
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1};

        bb = new int[] {
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0};

        cc = new int[] {
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,1,
                0,1,1,1,0
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

        ee = new int[]{
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,1
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

        gg = new int[]{
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,0,
                1,0,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0
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

        ii = new int[]{
                0,1,1,1,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,1,1,1,0
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

        kk = new int[]{
                1,0,0,0,1,
                1,0,0,1,0,
                1,0,1,0,0,
                1,1,0,0,0,
                1,0,1,0,0,
                1,0,0,1,0,
                1,0,0,0,1,
        };

        ll = new int[]{
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,1
        };

        mm = new int[]{
                1,0,0,0,1,
                1,1,0,1,1,
                1,0,1,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1
        };

        nn = new int[]{
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,0,0,1,
                1,0,1,0,1,
                1,0,0,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
        };

        oo = new int[]{
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0,
        };

        pp = new int[]{
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0,
        };

        qq= new int[]{
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,1,0,1,
                1,0,0,1,0,
                0,1,1,0,1
        };

        rr = new int[]{
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
                1,0,1,0,0,
                1,0,0,1,0,
                1,0,0,0,1
        };

        ss = new int[]{
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,0,
                0,1,1,1,0,
                0,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0
        };

        tt = new int[]{
                1,1,1,1,1,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0
        };

        tab=new int[][]{aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo,pp,qq,rr,ss,tt};
    }

}
