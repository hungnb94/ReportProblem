package example.com.hb.reportproblem.model.packaging;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public class KeggingLine implements INode, ISimpleNode {
    KegCIPGroup kegCIPGroup;
    KegWasherFiller kegWasherFiller;
    KegFlashPasteurizer kegFlashPasteurizer;
    KegWeigherGroup kegWeigherGroup;
    KegChainConveyor kegChainConveyor;
    KegRollerConveyor kegRollerConveyor;
    KegInjetCoder kegInjetCoder;

    @Override
    public String getName() {
        return "Kegging Line";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        list.add(kegCIPGroup.getName());
        list.add(kegWasherFiller.getName());
        list.add(kegFlashPasteurizer.getName());
        list.add(kegWeigherGroup.getName());
        list.add(kegChainConveyor.getName());
        list.add(kegRollerConveyor.getName());
        list.add(kegInjetCoder.getName());
        return list;
    }

    public class KegCIPGroup implements ISimpleNode {
        @Override
        public String getName() {
            return "Keg CIP Group";
        }
    }

    public class KegWasherFiller implements ISimpleNode {
        @Override
        public String getName() {
            return "Keg - Washer/Filler";
        }
    }

    public class KegFlashPasteurizer implements ISimpleNode {
        @Override
        public String getName() {
            return "Keg - Flash Pasteurizer";
        }
    }

    public class KegWeigherGroup implements ISimpleNode {
        @Override
        public String getName() {
            return "Keg - Weigher Group";
        }
    }

    public class KegChainConveyor implements ISimpleNode {
        @Override
        public String getName() {
            return "Keg - Chain Conveyor (Empty Keg)";
        }
    }

    public class KegRollerConveyor implements ISimpleNode {
        @Override
        public String getName() {
            return "Keg - Roller Conveyor (Full Keg)";
        }
    }

    public class KegInjetCoder implements ISimpleNode {
        @Override
        public String getName() {
            return "Keg - Injet Coder";
        }
    }
}
