package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class BottleConveyorGroup implements INode, ISimpleNode {
    BottleConveyorGroupChild bottleConveyorGroup = new BottleConveyorGroupChild();
    BangTaiBanChai bangTaiBanChai = new BangTaiBanChai();
    BangTaiCrate bangTaiCrate = new BangTaiCrate();
    BangTaiConLan bangTaiConLan = new BangTaiConLan();
    CumDisplate cumDisplate = new CumDisplate();
    HeThongBoiTronBangTai heThongBoiTronBangTai = new HeThongBoiTronBangTai();
    HeThongDienVaDieuKhien heThongDienVaDieuKhien = new HeThongDienVaDieuKhien();
    CacDongCơHopSo cacDongCơHopSo = new CacDongCơHopSo();
    HeThongSensorBangTai heThongSensorBangTai = new HeThongSensorBangTai();

    @Override
    public String getName() {
        return "Bottle Conveyor Group";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add(bottleConveyorGroup.getName());
        list.add(bangTaiBanChai.getName());
        list.add(bangTaiCrate.getName());
        list.add(bangTaiConLan.getName());
        list.add(cumDisplate.getName());
        list.add(heThongBoiTronBangTai.getName());
        list.add(heThongDienVaDieuKhien.getName());
        list.add(cacDongCơHopSo.getName());
        list.add(heThongSensorBangTai.getName());
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList list = new ArrayList<>();
        list.add(bottleConveyorGroup);
        list.add(bangTaiBanChai);
        list.add(bangTaiCrate);
        list.add(bangTaiConLan);
        list.add(cumDisplate);
        list.add(heThongBoiTronBangTai);
        list.add(heThongDienVaDieuKhien);
        list.add(cacDongCơHopSo);
        list.add(heThongSensorBangTai);
        return list;
    }
    public class BottleConveyorGroupChild implements INode, ISimpleNode {

        @Override
        public String getName() {
            return "Bottle Conveyor Group";
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }

        @Override
        public ArrayList<INode> getChilds() {
            return null;
        }

    }
    public static class BangTaiBanChai implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Băng tải bàn chai";
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }

        @Override
        public ArrayList<INode> getChilds() {
            return null;
        }
    }

    public static class BangTaiCrate implements ISimpleNode {
        @Override
        public String getName() {
            return "Băng tải crate";
        }
    }

    public static class BangTaiConLan implements ISimpleNode {
        @Override
        public String getName() {
            return "Băng tải con lăn";
        }
    }

    public static class CumDisplate implements ISimpleNode {
        @Override
        public String getName() {
            return "Cụm displate";
        }
    }

    public static class HeThongBoiTronBangTai implements ISimpleNode {
        @Override
        public String getName() {
            return "Hệ thống bôi trơn băng tải";
        }
    }

    public static class HeThongDienVaDieuKhien implements ISimpleNode {
        @Override
        public String getName() {
            return "Hệ thống điện và điều khiển";
        }
    }

    public static class CacDongCơHopSo implements ISimpleNode {
        @Override
        public String getName() {
            return "Các động cơ, hộp số";
        }
    }

    public static class HeThongSensorBangTai implements ISimpleNode {
        @Override
        public String getName() {
            return "Hệ thống sensor băng tải";
        }
    }
}