package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class CanDepalletiser2 implements INode, ISimpleNode {
//    Can Depalletiser-2
//    Hệ thông khí nén, van điều khiến, piston
//    Hệ thống bơm mỡ tự động
//    Hệ thống băng tải đầu vào (con lăn, động cơ, hộp số)
//    Băng tải bàn xoay (động cơ, hộp số)
//    Cụm nâng hạ trung tâm
//    Cụm nâng hạ carton
//    Cụm nâng hạ frame
//    Cụm nâng hạ pallet nhựa
//    Cụm băng tải đầu ra (con lăn, động cơ, hộp số)
//    Cụm tay gắp pallet nhựa (pallet magazine)
//    Hệ thống điều khiển và các thiết bị điện
//    Các thiết bị an toàn

    @Override
    public String getName() {
        return "Can Depalletiser-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Can Depalletiser-2");
        list.add("Hệ thông khí nén, van điều khiến, piston");
        list.add("Hệ thống bơm mỡ tự động");
        list.add("Hệ thống băng tải đầu vào (con lăn, động cơ, hộp số)");
        list.add("Băng tải bàn xoay (động cơ, hộp số)");
        list.add("Cụm nâng hạ trung tâm");
        list.add("Cụm nâng hạ carton");
        list.add("Cụm nâng hạ frame");
        list.add("Cụm nâng hạ pallet nhựa");
        list.add("Cụm băng tải đầu ra (con lăn, động cơ, hộp số)");
        list.add("Cụm tay gắp pallet nhựa (pallet magazine)");
        list.add("Hệ thống điều khiển và các thiết bị điện");
        list.add("Các thiết bị an toàn");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}