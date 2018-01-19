package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class CrateWasher implements INode, ISimpleNode {
//    Crate Washer Machine Group
//    Băng tải đầu vào
//    Băng tải đầu ra
//    Băng tải trung tâm
//    Thành máy, tủ điện
//    Hệ thống điện và điều khiển
//    Động cơ, bơm tuần hoàn nước
//    Băng tải crate lên dốc
//    Hệ thống giàn phun, van
//    Hệ thống bôi trơn băng tải
//    Các thiết bị an toàn của máy
//    Hệ thống đảo crate

    @Override
    public String getName() {
        return "Crate Washer";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Crate Washer Machine Group");
        list.add("Băng tải đầu vào");
        list.add("Băng tải đầu ra");
        list.add("Băng tải trung tâm");
        list.add("Thành máy, tủ điện");
        list.add("Hệ thống điện và điều khiển");
        list.add("Động cơ, bơm tuần hoàn nước");
        list.add("Băng tải crate lên dốc");
        list.add("Hệ thống giàn phun, van");
        list.add("Hệ thống bôi trơn băng tải");
        list.add("Các thiết bị an toàn của máy");
        list.add("Hệ thống đảo crate");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}