package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class Cellar implements INode, ISimpleNode {
    HorapTanks horapTanks;
    FST fst;
    YSTAndYPT ystAndYPT;
    WortLine wortLine;
    YeastTransferLine yeastTransferLine;
    GBTransferLine gbTransferLine;

    @Override
    public String getName() {
        return "Cellar";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        list.add(horapTanks.getName());
        list.add(fst.getName());
        list.add(ystAndYPT.getName());
        list.add(wortLine.getName());
        list.add(yeastTransferLine.getName());
        list.add(gbTransferLine.getName());
        return list;
    }

    public class HorapTanks implements ISimpleNode {
        @Override
        public String getName() {
            return "Horap tanks";
        }
    }

    public class FST implements ISimpleNode {
        @Override
        public String getName() {
            return "FST";
        }
    }

    public class YSTAndYPT implements ISimpleNode {
        @Override
        public String getName() {
            return "YST, YPT";
        }
    }

    public class WortLine implements ISimpleNode {
        @Override
        public String getName() {
            return "Wort line";
        }
    }

    public class YeastTransferLine implements ISimpleNode {
        @Override
        public String getName() {
            return "Yeast transfer line";
        }
    }

    public class GBTransferLine implements ISimpleNode {
        @Override
        public String getName() {
            return "GB transfer line";
        }
    }
}
