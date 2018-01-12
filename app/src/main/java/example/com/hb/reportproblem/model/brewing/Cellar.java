package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class Cellar implements INode, ISimpleNode {
    HorapTanks horapTanks = new HorapTanks();
    FST fst = new FST();
    YSTAndYPT ystAndYPT = new YSTAndYPT();
    WortLine wortLine = new WortLine();
    YeastTransferLine yeastTransferLine = new YeastTransferLine();
    GBTransferLine gbTransferLine = new GBTransferLine();

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

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList<INode> list = new ArrayList();
        list.add(horapTanks);
        list.add(fst);
        list.add(ystAndYPT);
        list.add(wortLine);
        list.add(yeastTransferLine);
        list.add(gbTransferLine);
        return list;
    }

    public class HorapTanks implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Horap tanks";
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

    public class FST implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "FST";
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

    public class YSTAndYPT implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "YST, YPT";
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

    public class WortLine implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Wort line";
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

    public class YeastTransferLine implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Yeast transfer line";
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

    public class GBTransferLine implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "GB transfer line";
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
}
