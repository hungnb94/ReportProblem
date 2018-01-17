package example.com.hb.reportproblem.model;

import java.util.ArrayList;

/**
 * Created by hung on 1/12/2018.
 */

public class DangNguyHiem implements INode, ISimpleNode {
    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Unsafe Condition");
        list.add("Unsafe Action");
        list.add("Nearmiss personel");
        list.add("Nearmiss contractor");
        list.add("Không Có Nguy Cơ");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }

    @Override
    public String getName() {
        return "Dạng Nguy Hiểm";
    }
}
