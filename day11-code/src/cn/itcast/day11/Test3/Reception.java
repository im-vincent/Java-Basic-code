package cn.itcast.day11.Test3;

public class Reception  {

    Filter f ;

    public Filter getF() {
        return f;
    }

    public void setF(Filter f) {
        this.f = f;
    }

    public void reception(User u) {
        if (u.getType() != null)
            return ;
        if (f != null) {
            f.filterUse(u);
            return ;
        } else {
            u.setType("A");
        }
    }


}
