package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class FullCartonDivider2 implements INode, ISimpleNode {
//    Full Carton Divider-2
//    Băng tải, động cơ, hộp số
//    Hệ thống điều khiển và thiết bị điện
//    Các thiết bị an toàn

    @Override
    public String getName() {
        return "Full Carton Divider-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Full Carton Divider-2");
        list.add("Băng tải, động cơ, hộp số");
        list.add("Hệ thống điều khiển và thiết bị điện");
        list.add("Các thiết bị an toàn");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}
